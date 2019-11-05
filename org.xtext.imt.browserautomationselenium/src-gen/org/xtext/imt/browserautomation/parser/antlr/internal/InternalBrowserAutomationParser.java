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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserAutomationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Test'", "'end'", "'element'", "'='", "'find'", "'{'", "'}'", "'['", "']'", "'openBrowser'", "'openpage'", "'clickOn'", "'verify'", "'insert'", "'uncheck'", "'check'", "'ALL'", "'choosecombo'", "'read'", "'combobox'", "'checkbox'", "'searchfield'", "'text'", "'button'", "'link'", "'image'"
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




    // $ANTLR start "entryRuleTest"
    // InternalBrowserAutomation.g:64:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalBrowserAutomation.g:64:45: (iv_ruleTest= ruleTest EOF )
            // InternalBrowserAutomation.g:65:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalBrowserAutomation.g:71:1: ruleTest returns [EObject current=null] : ( () otherlv_1= 'Test' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= 'end' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_instructions_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:77:2: ( ( () otherlv_1= 'Test' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= 'end' ) )
            // InternalBrowserAutomation.g:78:2: ( () otherlv_1= 'Test' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= 'end' )
            {
            // InternalBrowserAutomation.g:78:2: ( () otherlv_1= 'Test' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= 'end' )
            // InternalBrowserAutomation.g:79:3: () otherlv_1= 'Test' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= 'end'
            {
            // InternalBrowserAutomation.g:79:3: ()
            // InternalBrowserAutomation.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestAccess().getTestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTestAccess().getTestKeyword_1());
            		
            // InternalBrowserAutomation.g:90:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:91:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:91:4: (lv_name_2_0= RULE_STRING )
            // InternalBrowserAutomation.g:92:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTestAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowserAutomation.g:108:3: ( (lv_instructions_3_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=20 && LA1_0<=26)||(LA1_0>=28 && LA1_0<=29)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowserAutomation.g:109:4: (lv_instructions_3_0= ruleInstruction )
            	    {
            	    // InternalBrowserAutomation.g:109:4: (lv_instructions_3_0= ruleInstruction )
            	    // InternalBrowserAutomation.g:110:5: lv_instructions_3_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getInstructionsInstructionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_instructions_3_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_3_0,
            	    						"org.xtext.imt.browserautomation.BrowserAutomation.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTestAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleInstruction"
    // InternalBrowserAutomation.g:135:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalBrowserAutomation.g:135:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalBrowserAutomation.g:136:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalBrowserAutomation.g:142:1: ruleInstruction returns [EObject current=null] : (this_AFFECTATION_0= ruleAFFECTATION | this_OPEN_BROWSER_1= ruleOPEN_BROWSER | this_GO_TO_URL_2= ruleGO_TO_URL | this_CLICK_ON_3= ruleCLICK_ON | this_VERIFY_THAT_4= ruleVERIFY_THAT | this_INSERT_ON_5= ruleINSERT_ON | this_CHECK_BOXE_6= ruleCHECK_BOXE | this_CHOOSE_COMBOBOX_7= ruleCHOOSE_COMBOBOX | this_READ_ON_8= ruleREAD_ON ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_AFFECTATION_0 = null;

        EObject this_OPEN_BROWSER_1 = null;

        EObject this_GO_TO_URL_2 = null;

        EObject this_CLICK_ON_3 = null;

        EObject this_VERIFY_THAT_4 = null;

        EObject this_INSERT_ON_5 = null;

        EObject this_CHECK_BOXE_6 = null;

        EObject this_CHOOSE_COMBOBOX_7 = null;

        EObject this_READ_ON_8 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:148:2: ( (this_AFFECTATION_0= ruleAFFECTATION | this_OPEN_BROWSER_1= ruleOPEN_BROWSER | this_GO_TO_URL_2= ruleGO_TO_URL | this_CLICK_ON_3= ruleCLICK_ON | this_VERIFY_THAT_4= ruleVERIFY_THAT | this_INSERT_ON_5= ruleINSERT_ON | this_CHECK_BOXE_6= ruleCHECK_BOXE | this_CHOOSE_COMBOBOX_7= ruleCHOOSE_COMBOBOX | this_READ_ON_8= ruleREAD_ON ) )
            // InternalBrowserAutomation.g:149:2: (this_AFFECTATION_0= ruleAFFECTATION | this_OPEN_BROWSER_1= ruleOPEN_BROWSER | this_GO_TO_URL_2= ruleGO_TO_URL | this_CLICK_ON_3= ruleCLICK_ON | this_VERIFY_THAT_4= ruleVERIFY_THAT | this_INSERT_ON_5= ruleINSERT_ON | this_CHECK_BOXE_6= ruleCHECK_BOXE | this_CHOOSE_COMBOBOX_7= ruleCHOOSE_COMBOBOX | this_READ_ON_8= ruleREAD_ON )
            {
            // InternalBrowserAutomation.g:149:2: (this_AFFECTATION_0= ruleAFFECTATION | this_OPEN_BROWSER_1= ruleOPEN_BROWSER | this_GO_TO_URL_2= ruleGO_TO_URL | this_CLICK_ON_3= ruleCLICK_ON | this_VERIFY_THAT_4= ruleVERIFY_THAT | this_INSERT_ON_5= ruleINSERT_ON | this_CHECK_BOXE_6= ruleCHECK_BOXE | this_CHOOSE_COMBOBOX_7= ruleCHOOSE_COMBOBOX | this_READ_ON_8= ruleREAD_ON )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 23:
                {
                alt2=5;
                }
                break;
            case 24:
                {
                alt2=6;
                }
                break;
            case 25:
            case 26:
                {
                alt2=7;
                }
                break;
            case 28:
                {
                alt2=8;
                }
                break;
            case 29:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBrowserAutomation.g:150:3: this_AFFECTATION_0= ruleAFFECTATION
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAFFECTATIONParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AFFECTATION_0=ruleAFFECTATION();

                    state._fsp--;


                    			current = this_AFFECTATION_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:159:3: this_OPEN_BROWSER_1= ruleOPEN_BROWSER
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getOPEN_BROWSERParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OPEN_BROWSER_1=ruleOPEN_BROWSER();

                    state._fsp--;


                    			current = this_OPEN_BROWSER_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:168:3: this_GO_TO_URL_2= ruleGO_TO_URL
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getGO_TO_URLParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GO_TO_URL_2=ruleGO_TO_URL();

                    state._fsp--;


                    			current = this_GO_TO_URL_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:177:3: this_CLICK_ON_3= ruleCLICK_ON
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCLICK_ONParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CLICK_ON_3=ruleCLICK_ON();

                    state._fsp--;


                    			current = this_CLICK_ON_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:186:3: this_VERIFY_THAT_4= ruleVERIFY_THAT
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getVERIFY_THATParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_VERIFY_THAT_4=ruleVERIFY_THAT();

                    state._fsp--;


                    			current = this_VERIFY_THAT_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:195:3: this_INSERT_ON_5= ruleINSERT_ON
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getINSERT_ONParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_INSERT_ON_5=ruleINSERT_ON();

                    state._fsp--;


                    			current = this_INSERT_ON_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:204:3: this_CHECK_BOXE_6= ruleCHECK_BOXE
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCHECK_BOXEParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_CHECK_BOXE_6=ruleCHECK_BOXE();

                    state._fsp--;


                    			current = this_CHECK_BOXE_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalBrowserAutomation.g:213:3: this_CHOOSE_COMBOBOX_7= ruleCHOOSE_COMBOBOX
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCHOOSE_COMBOBOXParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_CHOOSE_COMBOBOX_7=ruleCHOOSE_COMBOBOX();

                    state._fsp--;


                    			current = this_CHOOSE_COMBOBOX_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalBrowserAutomation.g:222:3: this_READ_ON_8= ruleREAD_ON
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getREAD_ONParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_READ_ON_8=ruleREAD_ON();

                    state._fsp--;


                    			current = this_READ_ON_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleAFFECTATION"
    // InternalBrowserAutomation.g:234:1: entryRuleAFFECTATION returns [EObject current=null] : iv_ruleAFFECTATION= ruleAFFECTATION EOF ;
    public final EObject entryRuleAFFECTATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAFFECTATION = null;


        try {
            // InternalBrowserAutomation.g:234:52: (iv_ruleAFFECTATION= ruleAFFECTATION EOF )
            // InternalBrowserAutomation.g:235:2: iv_ruleAFFECTATION= ruleAFFECTATION EOF
            {
             newCompositeNode(grammarAccess.getAFFECTATIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAFFECTATION=ruleAFFECTATION();

            state._fsp--;

             current =iv_ruleAFFECTATION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAFFECTATION"


    // $ANTLR start "ruleAFFECTATION"
    // InternalBrowserAutomation.g:241:1: ruleAFFECTATION returns [EObject current=null] : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_selector_3_0= ruleSELECTOR ) ) ) ;
    public final EObject ruleAFFECTATION() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_selector_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:247:2: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_selector_3_0= ruleSELECTOR ) ) ) )
            // InternalBrowserAutomation.g:248:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_selector_3_0= ruleSELECTOR ) ) )
            {
            // InternalBrowserAutomation.g:248:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_selector_3_0= ruleSELECTOR ) ) )
            // InternalBrowserAutomation.g:249:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_selector_3_0= ruleSELECTOR ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAFFECTATIONAccess().getElementKeyword_0());
            		
            // InternalBrowserAutomation.g:253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBrowserAutomation.g:254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:254:4: (lv_name_1_0= RULE_ID )
            // InternalBrowserAutomation.g:255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAFFECTATIONAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAFFECTATIONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAFFECTATIONAccess().getEqualsSignKeyword_2());
            		
            // InternalBrowserAutomation.g:275:3: ( (lv_selector_3_0= ruleSELECTOR ) )
            // InternalBrowserAutomation.g:276:4: (lv_selector_3_0= ruleSELECTOR )
            {
            // InternalBrowserAutomation.g:276:4: (lv_selector_3_0= ruleSELECTOR )
            // InternalBrowserAutomation.g:277:5: lv_selector_3_0= ruleSELECTOR
            {

            					newCompositeNode(grammarAccess.getAFFECTATIONAccess().getSelectorSELECTORParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_selector_3_0=ruleSELECTOR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAFFECTATIONRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_3_0,
            						"org.xtext.imt.browserautomation.BrowserAutomation.SELECTOR");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAFFECTATION"


    // $ANTLR start "entryRuleSELECTOR"
    // InternalBrowserAutomation.g:298:1: entryRuleSELECTOR returns [EObject current=null] : iv_ruleSELECTOR= ruleSELECTOR EOF ;
    public final EObject entryRuleSELECTOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSELECTOR = null;


        try {
            // InternalBrowserAutomation.g:298:49: (iv_ruleSELECTOR= ruleSELECTOR EOF )
            // InternalBrowserAutomation.g:299:2: iv_ruleSELECTOR= ruleSELECTOR EOF
            {
             newCompositeNode(grammarAccess.getSELECTORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSELECTOR=ruleSELECTOR();

            state._fsp--;

             current =iv_ruleSELECTOR; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSELECTOR"


    // $ANTLR start "ruleSELECTOR"
    // InternalBrowserAutomation.g:305:1: ruleSELECTOR returns [EObject current=null] : (otherlv_0= 'find' this_Readable_1= ruleReadable otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) ) otherlv_4= '}' otherlv_5= '[' ( (lv_number_6_0= RULE_INT ) ) otherlv_7= ']' ) ;
    public final EObject ruleSELECTOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_number_6_0=null;
        Token otherlv_7=null;
        EObject this_Readable_1 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:311:2: ( (otherlv_0= 'find' this_Readable_1= ruleReadable otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) ) otherlv_4= '}' otherlv_5= '[' ( (lv_number_6_0= RULE_INT ) ) otherlv_7= ']' ) )
            // InternalBrowserAutomation.g:312:2: (otherlv_0= 'find' this_Readable_1= ruleReadable otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) ) otherlv_4= '}' otherlv_5= '[' ( (lv_number_6_0= RULE_INT ) ) otherlv_7= ']' )
            {
            // InternalBrowserAutomation.g:312:2: (otherlv_0= 'find' this_Readable_1= ruleReadable otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) ) otherlv_4= '}' otherlv_5= '[' ( (lv_number_6_0= RULE_INT ) ) otherlv_7= ']' )
            // InternalBrowserAutomation.g:313:3: otherlv_0= 'find' this_Readable_1= ruleReadable otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) ) otherlv_4= '}' otherlv_5= '[' ( (lv_number_6_0= RULE_INT ) ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSELECTORAccess().getFindKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSELECTORAccess().getReadableParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_Readable_1=ruleReadable();

            state._fsp--;


            			current = this_Readable_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSELECTORAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBrowserAutomation.g:329:3: ( (lv_params_3_0= rulePARAMS ) )
            // InternalBrowserAutomation.g:330:4: (lv_params_3_0= rulePARAMS )
            {
            // InternalBrowserAutomation.g:330:4: (lv_params_3_0= rulePARAMS )
            // InternalBrowserAutomation.g:331:5: lv_params_3_0= rulePARAMS
            {

            					newCompositeNode(grammarAccess.getSELECTORAccess().getParamsPARAMSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_params_3_0=rulePARAMS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSELECTORRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_3_0,
            						"org.xtext.imt.browserautomation.BrowserAutomation.PARAMS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getSELECTORAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getSELECTORAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalBrowserAutomation.g:356:3: ( (lv_number_6_0= RULE_INT ) )
            // InternalBrowserAutomation.g:357:4: (lv_number_6_0= RULE_INT )
            {
            // InternalBrowserAutomation.g:357:4: (lv_number_6_0= RULE_INT )
            // InternalBrowserAutomation.g:358:5: lv_number_6_0= RULE_INT
            {
            lv_number_6_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_number_6_0, grammarAccess.getSELECTORAccess().getNumberINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSELECTORRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSELECTORAccess().getRightSquareBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSELECTOR"


    // $ANTLR start "entryRuleRefElement"
    // InternalBrowserAutomation.g:382:1: entryRuleRefElement returns [EObject current=null] : iv_ruleRefElement= ruleRefElement EOF ;
    public final EObject entryRuleRefElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefElement = null;


        try {
            // InternalBrowserAutomation.g:382:51: (iv_ruleRefElement= ruleRefElement EOF )
            // InternalBrowserAutomation.g:383:2: iv_ruleRefElement= ruleRefElement EOF
            {
             newCompositeNode(grammarAccess.getRefElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefElement=ruleRefElement();

            state._fsp--;

             current =iv_ruleRefElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefElement"


    // $ANTLR start "ruleRefElement"
    // InternalBrowserAutomation.g:389:1: ruleRefElement returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:395:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:396:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:396:2: ( (otherlv_0= RULE_ID ) )
            // InternalBrowserAutomation.g:397:3: (otherlv_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:397:3: (otherlv_0= RULE_ID )
            // InternalBrowserAutomation.g:398:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRefElementRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRefElementAccess().getRefAFFECTATIONCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefElement"


    // $ANTLR start "entryRuleOPEN_BROWSER"
    // InternalBrowserAutomation.g:412:1: entryRuleOPEN_BROWSER returns [EObject current=null] : iv_ruleOPEN_BROWSER= ruleOPEN_BROWSER EOF ;
    public final EObject entryRuleOPEN_BROWSER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOPEN_BROWSER = null;


        try {
            // InternalBrowserAutomation.g:412:53: (iv_ruleOPEN_BROWSER= ruleOPEN_BROWSER EOF )
            // InternalBrowserAutomation.g:413:2: iv_ruleOPEN_BROWSER= ruleOPEN_BROWSER EOF
            {
             newCompositeNode(grammarAccess.getOPEN_BROWSERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOPEN_BROWSER=ruleOPEN_BROWSER();

            state._fsp--;

             current =iv_ruleOPEN_BROWSER; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOPEN_BROWSER"


    // $ANTLR start "ruleOPEN_BROWSER"
    // InternalBrowserAutomation.g:419:1: ruleOPEN_BROWSER returns [EObject current=null] : ( () otherlv_1= 'openBrowser' ) ;
    public final EObject ruleOPEN_BROWSER() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:425:2: ( ( () otherlv_1= 'openBrowser' ) )
            // InternalBrowserAutomation.g:426:2: ( () otherlv_1= 'openBrowser' )
            {
            // InternalBrowserAutomation.g:426:2: ( () otherlv_1= 'openBrowser' )
            // InternalBrowserAutomation.g:427:3: () otherlv_1= 'openBrowser'
            {
            // InternalBrowserAutomation.g:427:3: ()
            // InternalBrowserAutomation.g:428:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOPEN_BROWSERAccess().getOPEN_BROWSERAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getOPEN_BROWSERAccess().getOpenBrowserKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOPEN_BROWSER"


    // $ANTLR start "entryRuleGO_TO_URL"
    // InternalBrowserAutomation.g:442:1: entryRuleGO_TO_URL returns [EObject current=null] : iv_ruleGO_TO_URL= ruleGO_TO_URL EOF ;
    public final EObject entryRuleGO_TO_URL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGO_TO_URL = null;


        try {
            // InternalBrowserAutomation.g:442:50: (iv_ruleGO_TO_URL= ruleGO_TO_URL EOF )
            // InternalBrowserAutomation.g:443:2: iv_ruleGO_TO_URL= ruleGO_TO_URL EOF
            {
             newCompositeNode(grammarAccess.getGO_TO_URLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGO_TO_URL=ruleGO_TO_URL();

            state._fsp--;

             current =iv_ruleGO_TO_URL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGO_TO_URL"


    // $ANTLR start "ruleGO_TO_URL"
    // InternalBrowserAutomation.g:449:1: ruleGO_TO_URL returns [EObject current=null] : (otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGO_TO_URL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:455:2: ( (otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:456:2: (otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:456:2: (otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:457:3: otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGO_TO_URLAccess().getOpenpageKeyword_0());
            		
            // InternalBrowserAutomation.g:461:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:462:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:462:4: (lv_url_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:463:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_url_1_0, grammarAccess.getGO_TO_URLAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGO_TO_URLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGO_TO_URL"


    // $ANTLR start "entryRuleCLICK_ON"
    // InternalBrowserAutomation.g:483:1: entryRuleCLICK_ON returns [EObject current=null] : iv_ruleCLICK_ON= ruleCLICK_ON EOF ;
    public final EObject entryRuleCLICK_ON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCLICK_ON = null;


        try {
            // InternalBrowserAutomation.g:483:49: (iv_ruleCLICK_ON= ruleCLICK_ON EOF )
            // InternalBrowserAutomation.g:484:2: iv_ruleCLICK_ON= ruleCLICK_ON EOF
            {
             newCompositeNode(grammarAccess.getCLICK_ONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCLICK_ON=ruleCLICK_ON();

            state._fsp--;

             current =iv_ruleCLICK_ON; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCLICK_ON"


    // $ANTLR start "ruleCLICK_ON"
    // InternalBrowserAutomation.g:490:1: ruleCLICK_ON returns [EObject current=null] : (otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) ) ) ;
    public final EObject ruleCLICK_ON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:496:2: ( (otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) ) ) )
            // InternalBrowserAutomation.g:497:2: (otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) ) )
            {
            // InternalBrowserAutomation.g:497:2: (otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) ) )
            // InternalBrowserAutomation.g:498:3: otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCLICK_ONAccess().getClickOnKeyword_0());
            		
            // InternalBrowserAutomation.g:502:3: ( (lv_element_1_0= ruleClickable ) )
            // InternalBrowserAutomation.g:503:4: (lv_element_1_0= ruleClickable )
            {
            // InternalBrowserAutomation.g:503:4: (lv_element_1_0= ruleClickable )
            // InternalBrowserAutomation.g:504:5: lv_element_1_0= ruleClickable
            {

            					newCompositeNode(grammarAccess.getCLICK_ONAccess().getElementClickableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_1_0=ruleClickable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCLICK_ONRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_1_0,
            						"org.xtext.imt.browserautomation.BrowserAutomation.Clickable");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCLICK_ON"


    // $ANTLR start "entryRuleVERIFY_THAT"
    // InternalBrowserAutomation.g:525:1: entryRuleVERIFY_THAT returns [EObject current=null] : iv_ruleVERIFY_THAT= ruleVERIFY_THAT EOF ;
    public final EObject entryRuleVERIFY_THAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVERIFY_THAT = null;


        try {
            // InternalBrowserAutomation.g:525:52: (iv_ruleVERIFY_THAT= ruleVERIFY_THAT EOF )
            // InternalBrowserAutomation.g:526:2: iv_ruleVERIFY_THAT= ruleVERIFY_THAT EOF
            {
             newCompositeNode(grammarAccess.getVERIFY_THATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVERIFY_THAT=ruleVERIFY_THAT();

            state._fsp--;

             current =iv_ruleVERIFY_THAT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVERIFY_THAT"


    // $ANTLR start "ruleVERIFY_THAT"
    // InternalBrowserAutomation.g:532:1: ruleVERIFY_THAT returns [EObject current=null] : (otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) ) ) ;
    public final EObject ruleVERIFY_THAT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:538:2: ( (otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) ) ) )
            // InternalBrowserAutomation.g:539:2: (otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) ) )
            {
            // InternalBrowserAutomation.g:539:2: (otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) ) )
            // InternalBrowserAutomation.g:540:3: otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getVERIFY_THATAccess().getVerifyKeyword_0());
            		
            // InternalBrowserAutomation.g:544:3: ( (lv_element_1_0= ruleVerifiable ) )
            // InternalBrowserAutomation.g:545:4: (lv_element_1_0= ruleVerifiable )
            {
            // InternalBrowserAutomation.g:545:4: (lv_element_1_0= ruleVerifiable )
            // InternalBrowserAutomation.g:546:5: lv_element_1_0= ruleVerifiable
            {

            					newCompositeNode(grammarAccess.getVERIFY_THATAccess().getElementVerifiableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_1_0=ruleVerifiable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVERIFY_THATRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_1_0,
            						"org.xtext.imt.browserautomation.BrowserAutomation.Verifiable");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVERIFY_THAT"


    // $ANTLR start "entryRuleINSERT_ON"
    // InternalBrowserAutomation.g:567:1: entryRuleINSERT_ON returns [EObject current=null] : iv_ruleINSERT_ON= ruleINSERT_ON EOF ;
    public final EObject entryRuleINSERT_ON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSERT_ON = null;


        try {
            // InternalBrowserAutomation.g:567:50: (iv_ruleINSERT_ON= ruleINSERT_ON EOF )
            // InternalBrowserAutomation.g:568:2: iv_ruleINSERT_ON= ruleINSERT_ON EOF
            {
             newCompositeNode(grammarAccess.getINSERT_ONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINSERT_ON=ruleINSERT_ON();

            state._fsp--;

             current =iv_ruleINSERT_ON; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINSERT_ON"


    // $ANTLR start "ruleINSERT_ON"
    // InternalBrowserAutomation.g:574:1: ruleINSERT_ON returns [EObject current=null] : (otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) ) ) ) ;
    public final EObject ruleINSERT_ON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_data_2_1=null;
        Token lv_data_2_2=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:580:2: ( (otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) ) ) ) )
            // InternalBrowserAutomation.g:581:2: (otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) ) ) )
            {
            // InternalBrowserAutomation.g:581:2: (otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) ) ) )
            // InternalBrowserAutomation.g:582:3: otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getINSERT_ONAccess().getInsertKeyword_0());
            		
            // InternalBrowserAutomation.g:586:3: ( (lv_element_1_0= ruleInsertable ) )
            // InternalBrowserAutomation.g:587:4: (lv_element_1_0= ruleInsertable )
            {
            // InternalBrowserAutomation.g:587:4: (lv_element_1_0= ruleInsertable )
            // InternalBrowserAutomation.g:588:5: lv_element_1_0= ruleInsertable
            {

            					newCompositeNode(grammarAccess.getINSERT_ONAccess().getElementInsertableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_element_1_0=ruleInsertable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getINSERT_ONRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_1_0,
            						"org.xtext.imt.browserautomation.BrowserAutomation.Insertable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowserAutomation.g:605:3: ( ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) ) )
            // InternalBrowserAutomation.g:606:4: ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:606:4: ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) )
            // InternalBrowserAutomation.g:607:5: (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID )
            {
            // InternalBrowserAutomation.g:607:5: (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID )
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
                    // InternalBrowserAutomation.g:608:6: lv_data_2_1= RULE_STRING
                    {
                    lv_data_2_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_data_2_1, grammarAccess.getINSERT_ONAccess().getDataSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getINSERT_ONRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"data",
                    							lv_data_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:623:6: lv_data_2_2= RULE_ID
                    {
                    lv_data_2_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_data_2_2, grammarAccess.getINSERT_ONAccess().getDataIDTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getINSERT_ONRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"data",
                    							lv_data_2_2,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINSERT_ON"


    // $ANTLR start "entryRuleCHECK_BOXE"
    // InternalBrowserAutomation.g:644:1: entryRuleCHECK_BOXE returns [EObject current=null] : iv_ruleCHECK_BOXE= ruleCHECK_BOXE EOF ;
    public final EObject entryRuleCHECK_BOXE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHECK_BOXE = null;


        try {
            // InternalBrowserAutomation.g:644:51: (iv_ruleCHECK_BOXE= ruleCHECK_BOXE EOF )
            // InternalBrowserAutomation.g:645:2: iv_ruleCHECK_BOXE= ruleCHECK_BOXE EOF
            {
             newCompositeNode(grammarAccess.getCHECK_BOXERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCHECK_BOXE=ruleCHECK_BOXE();

            state._fsp--;

             current =iv_ruleCHECK_BOXE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCHECK_BOXE"


    // $ANTLR start "ruleCHECK_BOXE"
    // InternalBrowserAutomation.g:651:1: ruleCHECK_BOXE returns [EObject current=null] : ( (otherlv_0= 'uncheck' | otherlv_1= 'check' ) ( ( (lv_element_2_0= ruleCHECKBOX ) )* | otherlv_3= 'ALL' ) ) ;
    public final EObject ruleCHECK_BOXE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_element_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:657:2: ( ( (otherlv_0= 'uncheck' | otherlv_1= 'check' ) ( ( (lv_element_2_0= ruleCHECKBOX ) )* | otherlv_3= 'ALL' ) ) )
            // InternalBrowserAutomation.g:658:2: ( (otherlv_0= 'uncheck' | otherlv_1= 'check' ) ( ( (lv_element_2_0= ruleCHECKBOX ) )* | otherlv_3= 'ALL' ) )
            {
            // InternalBrowserAutomation.g:658:2: ( (otherlv_0= 'uncheck' | otherlv_1= 'check' ) ( ( (lv_element_2_0= ruleCHECKBOX ) )* | otherlv_3= 'ALL' ) )
            // InternalBrowserAutomation.g:659:3: (otherlv_0= 'uncheck' | otherlv_1= 'check' ) ( ( (lv_element_2_0= ruleCHECKBOX ) )* | otherlv_3= 'ALL' )
            {
            // InternalBrowserAutomation.g:659:3: (otherlv_0= 'uncheck' | otherlv_1= 'check' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBrowserAutomation.g:660:4: otherlv_0= 'uncheck'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getCHECK_BOXEAccess().getUncheckKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:665:4: otherlv_1= 'check'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getCHECK_BOXEAccess().getCheckKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalBrowserAutomation.g:670:3: ( ( (lv_element_2_0= ruleCHECKBOX ) )* | otherlv_3= 'ALL' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EOF||(LA6_0>=12 && LA6_0<=13)||(LA6_0>=20 && LA6_0<=26)||(LA6_0>=28 && LA6_0<=29)||LA6_0==31) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBrowserAutomation.g:671:4: ( (lv_element_2_0= ruleCHECKBOX ) )*
                    {
                    // InternalBrowserAutomation.g:671:4: ( (lv_element_2_0= ruleCHECKBOX ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==31) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBrowserAutomation.g:672:5: (lv_element_2_0= ruleCHECKBOX )
                    	    {
                    	    // InternalBrowserAutomation.g:672:5: (lv_element_2_0= ruleCHECKBOX )
                    	    // InternalBrowserAutomation.g:673:6: lv_element_2_0= ruleCHECKBOX
                    	    {

                    	    						newCompositeNode(grammarAccess.getCHECK_BOXEAccess().getElementCHECKBOXParserRuleCall_1_0_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_element_2_0=ruleCHECKBOX();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCHECK_BOXERule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"element",
                    	    							lv_element_2_0,
                    	    							"org.xtext.imt.browserautomation.BrowserAutomation.CHECKBOX");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:691:4: otherlv_3= 'ALL'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCHECK_BOXEAccess().getALLKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCHECK_BOXE"


    // $ANTLR start "entryRuleCHOOSE_COMBOBOX"
    // InternalBrowserAutomation.g:700:1: entryRuleCHOOSE_COMBOBOX returns [EObject current=null] : iv_ruleCHOOSE_COMBOBOX= ruleCHOOSE_COMBOBOX EOF ;
    public final EObject entryRuleCHOOSE_COMBOBOX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHOOSE_COMBOBOX = null;


        try {
            // InternalBrowserAutomation.g:700:56: (iv_ruleCHOOSE_COMBOBOX= ruleCHOOSE_COMBOBOX EOF )
            // InternalBrowserAutomation.g:701:2: iv_ruleCHOOSE_COMBOBOX= ruleCHOOSE_COMBOBOX EOF
            {
             newCompositeNode(grammarAccess.getCHOOSE_COMBOBOXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCHOOSE_COMBOBOX=ruleCHOOSE_COMBOBOX();

            state._fsp--;

             current =iv_ruleCHOOSE_COMBOBOX; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCHOOSE_COMBOBOX"


    // $ANTLR start "ruleCHOOSE_COMBOBOX"
    // InternalBrowserAutomation.g:707:1: ruleCHOOSE_COMBOBOX returns [EObject current=null] : (otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleCHOOSE_COMBOBOX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_data_3_0=null;
        Token otherlv_4=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:713:2: ( (otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalBrowserAutomation.g:714:2: (otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalBrowserAutomation.g:714:2: (otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalBrowserAutomation.g:715:3: otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getCHOOSE_COMBOBOXAccess().getChoosecomboKeyword_0());
            		
            // InternalBrowserAutomation.g:719:3: ( (lv_element_1_0= ruleCOMBOBOX ) )
            // InternalBrowserAutomation.g:720:4: (lv_element_1_0= ruleCOMBOBOX )
            {
            // InternalBrowserAutomation.g:720:4: (lv_element_1_0= ruleCOMBOBOX )
            // InternalBrowserAutomation.g:721:5: lv_element_1_0= ruleCOMBOBOX
            {

            					newCompositeNode(grammarAccess.getCHOOSE_COMBOBOXAccess().getElementCOMBOBOXParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_element_1_0=ruleCOMBOBOX();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCHOOSE_COMBOBOXRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_1_0,
            						"org.xtext.imt.browserautomation.BrowserAutomation.COMBOBOX");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCHOOSE_COMBOBOXAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBrowserAutomation.g:742:3: ( (lv_data_3_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:743:4: (lv_data_3_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:743:4: (lv_data_3_0= RULE_STRING )
            // InternalBrowserAutomation.g:744:5: lv_data_3_0= RULE_STRING
            {
            lv_data_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_data_3_0, grammarAccess.getCHOOSE_COMBOBOXAccess().getDataSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCHOOSE_COMBOBOXRule());
            					}
            					setWithLastConsumed(
            						current,
            						"data",
            						lv_data_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCHOOSE_COMBOBOXAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCHOOSE_COMBOBOX"


    // $ANTLR start "entryRuleREAD_ON"
    // InternalBrowserAutomation.g:768:1: entryRuleREAD_ON returns [EObject current=null] : iv_ruleREAD_ON= ruleREAD_ON EOF ;
    public final EObject entryRuleREAD_ON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREAD_ON = null;


        try {
            // InternalBrowserAutomation.g:768:48: (iv_ruleREAD_ON= ruleREAD_ON EOF )
            // InternalBrowserAutomation.g:769:2: iv_ruleREAD_ON= ruleREAD_ON EOF
            {
             newCompositeNode(grammarAccess.getREAD_ONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAD_ON=ruleREAD_ON();

            state._fsp--;

             current =iv_ruleREAD_ON; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREAD_ON"


    // $ANTLR start "ruleREAD_ON"
    // InternalBrowserAutomation.g:775:1: ruleREAD_ON returns [EObject current=null] : (otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) ) ) ;
    public final EObject ruleREAD_ON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:781:2: ( (otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) ) ) )
            // InternalBrowserAutomation.g:782:2: (otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) ) )
            {
            // InternalBrowserAutomation.g:782:2: (otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) ) )
            // InternalBrowserAutomation.g:783:3: otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getREAD_ONAccess().getReadKeyword_0());
            		
            // InternalBrowserAutomation.g:787:3: ( (lv_element_1_0= ruleReadable ) )
            // InternalBrowserAutomation.g:788:4: (lv_element_1_0= ruleReadable )
            {
            // InternalBrowserAutomation.g:788:4: (lv_element_1_0= ruleReadable )
            // InternalBrowserAutomation.g:789:5: lv_element_1_0= ruleReadable
            {

            					newCompositeNode(grammarAccess.getREAD_ONAccess().getElementReadableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_1_0=ruleReadable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getREAD_ONRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_1_0,
            						"org.xtext.imt.browserautomation.BrowserAutomation.Readable");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREAD_ON"


    // $ANTLR start "entryRuleReadable"
    // InternalBrowserAutomation.g:810:1: entryRuleReadable returns [EObject current=null] : iv_ruleReadable= ruleReadable EOF ;
    public final EObject entryRuleReadable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadable = null;


        try {
            // InternalBrowserAutomation.g:810:49: (iv_ruleReadable= ruleReadable EOF )
            // InternalBrowserAutomation.g:811:2: iv_ruleReadable= ruleReadable EOF
            {
             newCompositeNode(grammarAccess.getReadableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadable=ruleReadable();

            state._fsp--;

             current =iv_ruleReadable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadable"


    // $ANTLR start "ruleReadable"
    // InternalBrowserAutomation.g:817:1: ruleReadable returns [EObject current=null] : (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK ) ;
    public final EObject ruleReadable() throws RecognitionException {
        EObject current = null;

        EObject this_TEXT_0 = null;

        EObject this_BUTTON_1 = null;

        EObject this_LINK_2 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:823:2: ( (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK ) )
            // InternalBrowserAutomation.g:824:2: (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK )
            {
            // InternalBrowserAutomation.g:824:2: (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK )
            int alt7=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBrowserAutomation.g:825:3: this_TEXT_0= ruleTEXT
                    {

                    			newCompositeNode(grammarAccess.getReadableAccess().getTEXTParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TEXT_0=ruleTEXT();

                    state._fsp--;


                    			current = this_TEXT_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:834:3: this_BUTTON_1= ruleBUTTON
                    {

                    			newCompositeNode(grammarAccess.getReadableAccess().getBUTTONParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BUTTON_1=ruleBUTTON();

                    state._fsp--;


                    			current = this_BUTTON_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:843:3: this_LINK_2= ruleLINK
                    {

                    			newCompositeNode(grammarAccess.getReadableAccess().getLINKParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LINK_2=ruleLINK();

                    state._fsp--;


                    			current = this_LINK_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReadable"


    // $ANTLR start "entryRuleInsertable"
    // InternalBrowserAutomation.g:855:1: entryRuleInsertable returns [EObject current=null] : iv_ruleInsertable= ruleInsertable EOF ;
    public final EObject entryRuleInsertable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertable = null;


        try {
            // InternalBrowserAutomation.g:855:51: (iv_ruleInsertable= ruleInsertable EOF )
            // InternalBrowserAutomation.g:856:2: iv_ruleInsertable= ruleInsertable EOF
            {
             newCompositeNode(grammarAccess.getInsertableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsertable=ruleInsertable();

            state._fsp--;

             current =iv_ruleInsertable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsertable"


    // $ANTLR start "ruleInsertable"
    // InternalBrowserAutomation.g:862:1: ruleInsertable returns [EObject current=null] : this_SEARCH_FIELD_0= ruleSEARCH_FIELD ;
    public final EObject ruleInsertable() throws RecognitionException {
        EObject current = null;

        EObject this_SEARCH_FIELD_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:868:2: (this_SEARCH_FIELD_0= ruleSEARCH_FIELD )
            // InternalBrowserAutomation.g:869:2: this_SEARCH_FIELD_0= ruleSEARCH_FIELD
            {

            		newCompositeNode(grammarAccess.getInsertableAccess().getSEARCH_FIELDParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SEARCH_FIELD_0=ruleSEARCH_FIELD();

            state._fsp--;


            		current = this_SEARCH_FIELD_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsertable"


    // $ANTLR start "entryRuleVerifiable"
    // InternalBrowserAutomation.g:880:1: entryRuleVerifiable returns [EObject current=null] : iv_ruleVerifiable= ruleVerifiable EOF ;
    public final EObject entryRuleVerifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifiable = null;


        try {
            // InternalBrowserAutomation.g:880:51: (iv_ruleVerifiable= ruleVerifiable EOF )
            // InternalBrowserAutomation.g:881:2: iv_ruleVerifiable= ruleVerifiable EOF
            {
             newCompositeNode(grammarAccess.getVerifiableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerifiable=ruleVerifiable();

            state._fsp--;

             current =iv_ruleVerifiable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerifiable"


    // $ANTLR start "ruleVerifiable"
    // InternalBrowserAutomation.g:887:1: ruleVerifiable returns [EObject current=null] : (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK | this_IMAGE_3= ruleIMAGE | this_RefElement_4= ruleRefElement ) ;
    public final EObject ruleVerifiable() throws RecognitionException {
        EObject current = null;

        EObject this_TEXT_0 = null;

        EObject this_BUTTON_1 = null;

        EObject this_LINK_2 = null;

        EObject this_IMAGE_3 = null;

        EObject this_RefElement_4 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:893:2: ( (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK | this_IMAGE_3= ruleIMAGE | this_RefElement_4= ruleRefElement ) )
            // InternalBrowserAutomation.g:894:2: (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK | this_IMAGE_3= ruleIMAGE | this_RefElement_4= ruleRefElement )
            {
            // InternalBrowserAutomation.g:894:2: (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK | this_IMAGE_3= ruleIMAGE | this_RefElement_4= ruleRefElement )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            case 36:
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
                    // InternalBrowserAutomation.g:895:3: this_TEXT_0= ruleTEXT
                    {

                    			newCompositeNode(grammarAccess.getVerifiableAccess().getTEXTParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TEXT_0=ruleTEXT();

                    state._fsp--;


                    			current = this_TEXT_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:904:3: this_BUTTON_1= ruleBUTTON
                    {

                    			newCompositeNode(grammarAccess.getVerifiableAccess().getBUTTONParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BUTTON_1=ruleBUTTON();

                    state._fsp--;


                    			current = this_BUTTON_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:913:3: this_LINK_2= ruleLINK
                    {

                    			newCompositeNode(grammarAccess.getVerifiableAccess().getLINKParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LINK_2=ruleLINK();

                    state._fsp--;


                    			current = this_LINK_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:922:3: this_IMAGE_3= ruleIMAGE
                    {

                    			newCompositeNode(grammarAccess.getVerifiableAccess().getIMAGEParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IMAGE_3=ruleIMAGE();

                    state._fsp--;


                    			current = this_IMAGE_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:931:3: this_RefElement_4= ruleRefElement
                    {

                    			newCompositeNode(grammarAccess.getVerifiableAccess().getRefElementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefElement_4=ruleRefElement();

                    state._fsp--;


                    			current = this_RefElement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerifiable"


    // $ANTLR start "entryRuleClickable"
    // InternalBrowserAutomation.g:943:1: entryRuleClickable returns [EObject current=null] : iv_ruleClickable= ruleClickable EOF ;
    public final EObject entryRuleClickable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickable = null;


        try {
            // InternalBrowserAutomation.g:943:50: (iv_ruleClickable= ruleClickable EOF )
            // InternalBrowserAutomation.g:944:2: iv_ruleClickable= ruleClickable EOF
            {
             newCompositeNode(grammarAccess.getClickableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickable=ruleClickable();

            state._fsp--;

             current =iv_ruleClickable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClickable"


    // $ANTLR start "ruleClickable"
    // InternalBrowserAutomation.g:950:1: ruleClickable returns [EObject current=null] : (this_BUTTON_0= ruleBUTTON | this_LINK_1= ruleLINK | this_IMAGE_2= ruleIMAGE | this_COMBOBOX_3= ruleCOMBOBOX | this_RefElement_4= ruleRefElement ) ;
    public final EObject ruleClickable() throws RecognitionException {
        EObject current = null;

        EObject this_BUTTON_0 = null;

        EObject this_LINK_1 = null;

        EObject this_IMAGE_2 = null;

        EObject this_COMBOBOX_3 = null;

        EObject this_RefElement_4 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:956:2: ( (this_BUTTON_0= ruleBUTTON | this_LINK_1= ruleLINK | this_IMAGE_2= ruleIMAGE | this_COMBOBOX_3= ruleCOMBOBOX | this_RefElement_4= ruleRefElement ) )
            // InternalBrowserAutomation.g:957:2: (this_BUTTON_0= ruleBUTTON | this_LINK_1= ruleLINK | this_IMAGE_2= ruleIMAGE | this_COMBOBOX_3= ruleCOMBOBOX | this_RefElement_4= ruleRefElement )
            {
            // InternalBrowserAutomation.g:957:2: (this_BUTTON_0= ruleBUTTON | this_LINK_1= ruleLINK | this_IMAGE_2= ruleIMAGE | this_COMBOBOX_3= ruleCOMBOBOX | this_RefElement_4= ruleRefElement )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            case 30:
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
                    // InternalBrowserAutomation.g:958:3: this_BUTTON_0= ruleBUTTON
                    {

                    			newCompositeNode(grammarAccess.getClickableAccess().getBUTTONParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BUTTON_0=ruleBUTTON();

                    state._fsp--;


                    			current = this_BUTTON_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:967:3: this_LINK_1= ruleLINK
                    {

                    			newCompositeNode(grammarAccess.getClickableAccess().getLINKParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LINK_1=ruleLINK();

                    state._fsp--;


                    			current = this_LINK_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:976:3: this_IMAGE_2= ruleIMAGE
                    {

                    			newCompositeNode(grammarAccess.getClickableAccess().getIMAGEParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IMAGE_2=ruleIMAGE();

                    state._fsp--;


                    			current = this_IMAGE_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:985:3: this_COMBOBOX_3= ruleCOMBOBOX
                    {

                    			newCompositeNode(grammarAccess.getClickableAccess().getCOMBOBOXParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_COMBOBOX_3=ruleCOMBOBOX();

                    state._fsp--;


                    			current = this_COMBOBOX_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:994:3: this_RefElement_4= ruleRefElement
                    {

                    			newCompositeNode(grammarAccess.getClickableAccess().getRefElementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefElement_4=ruleRefElement();

                    state._fsp--;


                    			current = this_RefElement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClickable"


    // $ANTLR start "entryRuleCOMBOBOX"
    // InternalBrowserAutomation.g:1006:1: entryRuleCOMBOBOX returns [EObject current=null] : iv_ruleCOMBOBOX= ruleCOMBOBOX EOF ;
    public final EObject entryRuleCOMBOBOX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOMBOBOX = null;


        try {
            // InternalBrowserAutomation.g:1006:49: (iv_ruleCOMBOBOX= ruleCOMBOBOX EOF )
            // InternalBrowserAutomation.g:1007:2: iv_ruleCOMBOBOX= ruleCOMBOBOX EOF
            {
             newCompositeNode(grammarAccess.getCOMBOBOXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOMBOBOX=ruleCOMBOBOX();

            state._fsp--;

             current =iv_ruleCOMBOBOX; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOMBOBOX"


    // $ANTLR start "ruleCOMBOBOX"
    // InternalBrowserAutomation.g:1013:1: ruleCOMBOBOX returns [EObject current=null] : (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCOMBOBOX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1019:2: ( (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1020:2: (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1020:2: (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1021:3: otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCOMBOBOXAccess().getComboboxKeyword_0());
            		
            // InternalBrowserAutomation.g:1025:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1026:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1026:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1027:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCOMBOBOXAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCOMBOBOXRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOMBOBOX"


    // $ANTLR start "entryRuleCHECKBOX"
    // InternalBrowserAutomation.g:1047:1: entryRuleCHECKBOX returns [EObject current=null] : iv_ruleCHECKBOX= ruleCHECKBOX EOF ;
    public final EObject entryRuleCHECKBOX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHECKBOX = null;


        try {
            // InternalBrowserAutomation.g:1047:49: (iv_ruleCHECKBOX= ruleCHECKBOX EOF )
            // InternalBrowserAutomation.g:1048:2: iv_ruleCHECKBOX= ruleCHECKBOX EOF
            {
             newCompositeNode(grammarAccess.getCHECKBOXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCHECKBOX=ruleCHECKBOX();

            state._fsp--;

             current =iv_ruleCHECKBOX; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCHECKBOX"


    // $ANTLR start "ruleCHECKBOX"
    // InternalBrowserAutomation.g:1054:1: ruleCHECKBOX returns [EObject current=null] : (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCHECKBOX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1060:2: ( (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1061:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1061:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1062:3: otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCHECKBOXAccess().getCheckboxKeyword_0());
            		
            // InternalBrowserAutomation.g:1066:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1067:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1067:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1068:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCHECKBOXAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCHECKBOXRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCHECKBOX"


    // $ANTLR start "entryRuleSEARCH_FIELD"
    // InternalBrowserAutomation.g:1088:1: entryRuleSEARCH_FIELD returns [EObject current=null] : iv_ruleSEARCH_FIELD= ruleSEARCH_FIELD EOF ;
    public final EObject entryRuleSEARCH_FIELD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEARCH_FIELD = null;


        try {
            // InternalBrowserAutomation.g:1088:53: (iv_ruleSEARCH_FIELD= ruleSEARCH_FIELD EOF )
            // InternalBrowserAutomation.g:1089:2: iv_ruleSEARCH_FIELD= ruleSEARCH_FIELD EOF
            {
             newCompositeNode(grammarAccess.getSEARCH_FIELDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSEARCH_FIELD=ruleSEARCH_FIELD();

            state._fsp--;

             current =iv_ruleSEARCH_FIELD; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSEARCH_FIELD"


    // $ANTLR start "ruleSEARCH_FIELD"
    // InternalBrowserAutomation.g:1095:1: ruleSEARCH_FIELD returns [EObject current=null] : (otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSEARCH_FIELD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1101:2: ( (otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1102:2: (otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1102:2: (otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1103:3: otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSEARCH_FIELDAccess().getSearchfieldKeyword_0());
            		
            // InternalBrowserAutomation.g:1107:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1108:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1108:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1109:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSEARCH_FIELDAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSEARCH_FIELDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSEARCH_FIELD"


    // $ANTLR start "entryRuleTEXT"
    // InternalBrowserAutomation.g:1129:1: entryRuleTEXT returns [EObject current=null] : iv_ruleTEXT= ruleTEXT EOF ;
    public final EObject entryRuleTEXT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTEXT = null;


        try {
            // InternalBrowserAutomation.g:1129:45: (iv_ruleTEXT= ruleTEXT EOF )
            // InternalBrowserAutomation.g:1130:2: iv_ruleTEXT= ruleTEXT EOF
            {
             newCompositeNode(grammarAccess.getTEXTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTEXT=ruleTEXT();

            state._fsp--;

             current =iv_ruleTEXT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTEXT"


    // $ANTLR start "ruleTEXT"
    // InternalBrowserAutomation.g:1136:1: ruleTEXT returns [EObject current=null] : (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTEXT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1142:2: ( (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1143:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1143:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1144:3: otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTEXTAccess().getTextKeyword_0());
            		
            // InternalBrowserAutomation.g:1148:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1149:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1149:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1150:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTEXTAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTEXTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTEXT"


    // $ANTLR start "entryRuleBUTTON"
    // InternalBrowserAutomation.g:1170:1: entryRuleBUTTON returns [EObject current=null] : iv_ruleBUTTON= ruleBUTTON EOF ;
    public final EObject entryRuleBUTTON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBUTTON = null;


        try {
            // InternalBrowserAutomation.g:1170:47: (iv_ruleBUTTON= ruleBUTTON EOF )
            // InternalBrowserAutomation.g:1171:2: iv_ruleBUTTON= ruleBUTTON EOF
            {
             newCompositeNode(grammarAccess.getBUTTONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBUTTON=ruleBUTTON();

            state._fsp--;

             current =iv_ruleBUTTON; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBUTTON"


    // $ANTLR start "ruleBUTTON"
    // InternalBrowserAutomation.g:1177:1: ruleBUTTON returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBUTTON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1183:2: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1184:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1184:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1185:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBUTTONAccess().getButtonKeyword_0());
            		
            // InternalBrowserAutomation.g:1189:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1190:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1190:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1191:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBUTTONAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBUTTONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBUTTON"


    // $ANTLR start "entryRuleLINK"
    // InternalBrowserAutomation.g:1211:1: entryRuleLINK returns [EObject current=null] : iv_ruleLINK= ruleLINK EOF ;
    public final EObject entryRuleLINK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLINK = null;


        try {
            // InternalBrowserAutomation.g:1211:45: (iv_ruleLINK= ruleLINK EOF )
            // InternalBrowserAutomation.g:1212:2: iv_ruleLINK= ruleLINK EOF
            {
             newCompositeNode(grammarAccess.getLINKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLINK=ruleLINK();

            state._fsp--;

             current =iv_ruleLINK; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLINK"


    // $ANTLR start "ruleLINK"
    // InternalBrowserAutomation.g:1218:1: ruleLINK returns [EObject current=null] : (otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLINK() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1224:2: ( (otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1225:2: (otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1225:2: (otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1226:3: otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLINKAccess().getLinkKeyword_0());
            		
            // InternalBrowserAutomation.g:1230:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1231:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1231:4: (lv_url_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1232:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_url_1_0, grammarAccess.getLINKAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLINKRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLINK"


    // $ANTLR start "entryRuleIMAGE"
    // InternalBrowserAutomation.g:1252:1: entryRuleIMAGE returns [EObject current=null] : iv_ruleIMAGE= ruleIMAGE EOF ;
    public final EObject entryRuleIMAGE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIMAGE = null;


        try {
            // InternalBrowserAutomation.g:1252:46: (iv_ruleIMAGE= ruleIMAGE EOF )
            // InternalBrowserAutomation.g:1253:2: iv_ruleIMAGE= ruleIMAGE EOF
            {
             newCompositeNode(grammarAccess.getIMAGERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIMAGE=ruleIMAGE();

            state._fsp--;

             current =iv_ruleIMAGE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIMAGE"


    // $ANTLR start "ruleIMAGE"
    // InternalBrowserAutomation.g:1259:1: ruleIMAGE returns [EObject current=null] : (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}' )* ) ;
    public final EObject ruleIMAGE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:1265:2: ( (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}' )* ) )
            // InternalBrowserAutomation.g:1266:2: (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}' )* )
            {
            // InternalBrowserAutomation.g:1266:2: (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}' )* )
            // InternalBrowserAutomation.g:1267:3: otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}' )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIMAGEAccess().getImageKeyword_0());
            		
            // InternalBrowserAutomation.g:1271:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1272:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1272:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1273:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIMAGEAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIMAGERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowserAutomation.g:1289:3: (otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBrowserAutomation.g:1290:4: otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}'
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIMAGEAccess().getLeftCurlyBracketKeyword_2_0());
            	    			
            	    // InternalBrowserAutomation.g:1294:4: ( (lv_params_3_0= rulePARAMS ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==RULE_STRING) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalBrowserAutomation.g:1295:5: (lv_params_3_0= rulePARAMS )
            	    	    {
            	    	    // InternalBrowserAutomation.g:1295:5: (lv_params_3_0= rulePARAMS )
            	    	    // InternalBrowserAutomation.g:1296:6: lv_params_3_0= rulePARAMS
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getIMAGEAccess().getParamsPARAMSParserRuleCall_2_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_21);
            	    	    lv_params_3_0=rulePARAMS();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getIMAGERule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"params",
            	    	    							lv_params_3_0,
            	    	    							"org.xtext.imt.browserautomation.BrowserAutomation.PARAMS");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIMAGEAccess().getRightCurlyBracketKeyword_2_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIMAGE"


    // $ANTLR start "entryRulePARAMS"
    // InternalBrowserAutomation.g:1322:1: entryRulePARAMS returns [EObject current=null] : iv_rulePARAMS= rulePARAMS EOF ;
    public final EObject entryRulePARAMS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePARAMS = null;


        try {
            // InternalBrowserAutomation.g:1322:47: (iv_rulePARAMS= rulePARAMS EOF )
            // InternalBrowserAutomation.g:1323:2: iv_rulePARAMS= rulePARAMS EOF
            {
             newCompositeNode(grammarAccess.getPARAMSRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePARAMS=rulePARAMS();

            state._fsp--;

             current =iv_rulePARAMS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePARAMS"


    // $ANTLR start "rulePARAMS"
    // InternalBrowserAutomation.g:1329:1: rulePARAMS returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePARAMS() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1335:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1336:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1336:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1337:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalBrowserAutomation.g:1337:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1338:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1338:4: (lv_key_0_0= RULE_STRING )
            // InternalBrowserAutomation.g:1339:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_key_0_0, grammarAccess.getPARAMSAccess().getKeySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPARAMSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPARAMSAccess().getEqualsSignKeyword_1());
            		
            // InternalBrowserAutomation.g:1359:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1360:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1360:4: (lv_value_2_0= RULE_STRING )
            // InternalBrowserAutomation.g:1361:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getPARAMSAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPARAMSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePARAMS"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000037F03000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001E40000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000088000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020010L});

}