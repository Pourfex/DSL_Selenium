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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Test'", "'('", "'result='", "')'", "'end'", "'element'", "'='", "'find'", "'{'", "'}'", "'['", "']'", "'TRUE'", "'FALSE'", "'openBrowser'", "'openpage'", "'clickOn'", "'verify'", "'insert'", "'uncheck'", "'check'", "'ALL'", "'choosecombo'", "'read'", "'combobox'", "'checkbox'", "'searchfield'", "'text'", "'button'", "'link'", "'image'"
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
    // InternalBrowserAutomation.g:71:1: ruleTest returns [EObject current=null] : ( () otherlv_1= 'Test' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= 'result=' ( (lv_result_5_0= ruleBOOL ) ) otherlv_6= ')' ( (lv_instructions_7_0= ruleInstruction ) )* otherlv_8= 'end' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_result_5_0 = null;

        EObject lv_instructions_7_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:77:2: ( ( () otherlv_1= 'Test' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= 'result=' ( (lv_result_5_0= ruleBOOL ) ) otherlv_6= ')' ( (lv_instructions_7_0= ruleInstruction ) )* otherlv_8= 'end' ) )
            // InternalBrowserAutomation.g:78:2: ( () otherlv_1= 'Test' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= 'result=' ( (lv_result_5_0= ruleBOOL ) ) otherlv_6= ')' ( (lv_instructions_7_0= ruleInstruction ) )* otherlv_8= 'end' )
            {
            // InternalBrowserAutomation.g:78:2: ( () otherlv_1= 'Test' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= 'result=' ( (lv_result_5_0= ruleBOOL ) ) otherlv_6= ')' ( (lv_instructions_7_0= ruleInstruction ) )* otherlv_8= 'end' )
            // InternalBrowserAutomation.g:79:3: () otherlv_1= 'Test' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= 'result=' ( (lv_result_5_0= ruleBOOL ) ) otherlv_6= ')' ( (lv_instructions_7_0= ruleInstruction ) )* otherlv_8= 'end'
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

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTestAccess().getLeftParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getTestAccess().getResultKeyword_4());
            		
            // InternalBrowserAutomation.g:116:3: ( (lv_result_5_0= ruleBOOL ) )
            // InternalBrowserAutomation.g:117:4: (lv_result_5_0= ruleBOOL )
            {
            // InternalBrowserAutomation.g:117:4: (lv_result_5_0= ruleBOOL )
            // InternalBrowserAutomation.g:118:5: lv_result_5_0= ruleBOOL
            {

            					newCompositeNode(grammarAccess.getTestAccess().getResultBOOLParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_result_5_0=ruleBOOL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_5_0,
            						"org.xtext.imt.browserautomation.BrowserAutomation.BOOL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getTestAccess().getRightParenthesisKeyword_6());
            		
            // InternalBrowserAutomation.g:139:3: ( (lv_instructions_7_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||(LA1_0>=25 && LA1_0<=31)||(LA1_0>=33 && LA1_0<=34)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowserAutomation.g:140:4: (lv_instructions_7_0= ruleInstruction )
            	    {
            	    // InternalBrowserAutomation.g:140:4: (lv_instructions_7_0= ruleInstruction )
            	    // InternalBrowserAutomation.g:141:5: lv_instructions_7_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getInstructionsInstructionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_instructions_7_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_7_0,
            	    						"org.xtext.imt.browserautomation.BrowserAutomation.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTestAccess().getEndKeyword_8());
            		

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
    // InternalBrowserAutomation.g:166:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalBrowserAutomation.g:166:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalBrowserAutomation.g:167:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalBrowserAutomation.g:173:1: ruleInstruction returns [EObject current=null] : (this_AFFECTATION_0= ruleAFFECTATION | this_OPEN_BROWSER_1= ruleOPEN_BROWSER | this_GO_TO_URL_2= ruleGO_TO_URL | this_CLICK_ON_3= ruleCLICK_ON | this_VERIFY_THAT_4= ruleVERIFY_THAT | this_INSERT_ON_5= ruleINSERT_ON | this_CHECK_BOXE_6= ruleCHECK_BOXE | this_CHOOSE_COMBOBOX_7= ruleCHOOSE_COMBOBOX | this_READ_ON_8= ruleREAD_ON ) ;
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
            // InternalBrowserAutomation.g:179:2: ( (this_AFFECTATION_0= ruleAFFECTATION | this_OPEN_BROWSER_1= ruleOPEN_BROWSER | this_GO_TO_URL_2= ruleGO_TO_URL | this_CLICK_ON_3= ruleCLICK_ON | this_VERIFY_THAT_4= ruleVERIFY_THAT | this_INSERT_ON_5= ruleINSERT_ON | this_CHECK_BOXE_6= ruleCHECK_BOXE | this_CHOOSE_COMBOBOX_7= ruleCHOOSE_COMBOBOX | this_READ_ON_8= ruleREAD_ON ) )
            // InternalBrowserAutomation.g:180:2: (this_AFFECTATION_0= ruleAFFECTATION | this_OPEN_BROWSER_1= ruleOPEN_BROWSER | this_GO_TO_URL_2= ruleGO_TO_URL | this_CLICK_ON_3= ruleCLICK_ON | this_VERIFY_THAT_4= ruleVERIFY_THAT | this_INSERT_ON_5= ruleINSERT_ON | this_CHECK_BOXE_6= ruleCHECK_BOXE | this_CHOOSE_COMBOBOX_7= ruleCHOOSE_COMBOBOX | this_READ_ON_8= ruleREAD_ON )
            {
            // InternalBrowserAutomation.g:180:2: (this_AFFECTATION_0= ruleAFFECTATION | this_OPEN_BROWSER_1= ruleOPEN_BROWSER | this_GO_TO_URL_2= ruleGO_TO_URL | this_CLICK_ON_3= ruleCLICK_ON | this_VERIFY_THAT_4= ruleVERIFY_THAT | this_INSERT_ON_5= ruleINSERT_ON | this_CHECK_BOXE_6= ruleCHECK_BOXE | this_CHOOSE_COMBOBOX_7= ruleCHOOSE_COMBOBOX | this_READ_ON_8= ruleREAD_ON )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 28:
                {
                alt2=5;
                }
                break;
            case 29:
                {
                alt2=6;
                }
                break;
            case 30:
            case 31:
                {
                alt2=7;
                }
                break;
            case 33:
                {
                alt2=8;
                }
                break;
            case 34:
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
                    // InternalBrowserAutomation.g:181:3: this_AFFECTATION_0= ruleAFFECTATION
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
                    // InternalBrowserAutomation.g:190:3: this_OPEN_BROWSER_1= ruleOPEN_BROWSER
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
                    // InternalBrowserAutomation.g:199:3: this_GO_TO_URL_2= ruleGO_TO_URL
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
                    // InternalBrowserAutomation.g:208:3: this_CLICK_ON_3= ruleCLICK_ON
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
                    // InternalBrowserAutomation.g:217:3: this_VERIFY_THAT_4= ruleVERIFY_THAT
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
                    // InternalBrowserAutomation.g:226:3: this_INSERT_ON_5= ruleINSERT_ON
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
                    // InternalBrowserAutomation.g:235:3: this_CHECK_BOXE_6= ruleCHECK_BOXE
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
                    // InternalBrowserAutomation.g:244:3: this_CHOOSE_COMBOBOX_7= ruleCHOOSE_COMBOBOX
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
                    // InternalBrowserAutomation.g:253:3: this_READ_ON_8= ruleREAD_ON
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
    // InternalBrowserAutomation.g:265:1: entryRuleAFFECTATION returns [EObject current=null] : iv_ruleAFFECTATION= ruleAFFECTATION EOF ;
    public final EObject entryRuleAFFECTATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAFFECTATION = null;


        try {
            // InternalBrowserAutomation.g:265:52: (iv_ruleAFFECTATION= ruleAFFECTATION EOF )
            // InternalBrowserAutomation.g:266:2: iv_ruleAFFECTATION= ruleAFFECTATION EOF
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
    // InternalBrowserAutomation.g:272:1: ruleAFFECTATION returns [EObject current=null] : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_selector_3_0= ruleSELECTOR ) ) ) ;
    public final EObject ruleAFFECTATION() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_selector_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:278:2: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_selector_3_0= ruleSELECTOR ) ) ) )
            // InternalBrowserAutomation.g:279:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_selector_3_0= ruleSELECTOR ) ) )
            {
            // InternalBrowserAutomation.g:279:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_selector_3_0= ruleSELECTOR ) ) )
            // InternalBrowserAutomation.g:280:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_selector_3_0= ruleSELECTOR ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAFFECTATIONAccess().getElementKeyword_0());
            		
            // InternalBrowserAutomation.g:284:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBrowserAutomation.g:285:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:285:4: (lv_name_1_0= RULE_ID )
            // InternalBrowserAutomation.g:286:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAFFECTATIONAccess().getEqualsSignKeyword_2());
            		
            // InternalBrowserAutomation.g:306:3: ( (lv_selector_3_0= ruleSELECTOR ) )
            // InternalBrowserAutomation.g:307:4: (lv_selector_3_0= ruleSELECTOR )
            {
            // InternalBrowserAutomation.g:307:4: (lv_selector_3_0= ruleSELECTOR )
            // InternalBrowserAutomation.g:308:5: lv_selector_3_0= ruleSELECTOR
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
    // InternalBrowserAutomation.g:329:1: entryRuleSELECTOR returns [EObject current=null] : iv_ruleSELECTOR= ruleSELECTOR EOF ;
    public final EObject entryRuleSELECTOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSELECTOR = null;


        try {
            // InternalBrowserAutomation.g:329:49: (iv_ruleSELECTOR= ruleSELECTOR EOF )
            // InternalBrowserAutomation.g:330:2: iv_ruleSELECTOR= ruleSELECTOR EOF
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
    // InternalBrowserAutomation.g:336:1: ruleSELECTOR returns [EObject current=null] : (otherlv_0= 'find' this_Readable_1= ruleReadable otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) ) otherlv_4= '}' otherlv_5= '[' ( (lv_number_6_0= RULE_INT ) ) otherlv_7= ']' ) ;
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
            // InternalBrowserAutomation.g:342:2: ( (otherlv_0= 'find' this_Readable_1= ruleReadable otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) ) otherlv_4= '}' otherlv_5= '[' ( (lv_number_6_0= RULE_INT ) ) otherlv_7= ']' ) )
            // InternalBrowserAutomation.g:343:2: (otherlv_0= 'find' this_Readable_1= ruleReadable otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) ) otherlv_4= '}' otherlv_5= '[' ( (lv_number_6_0= RULE_INT ) ) otherlv_7= ']' )
            {
            // InternalBrowserAutomation.g:343:2: (otherlv_0= 'find' this_Readable_1= ruleReadable otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) ) otherlv_4= '}' otherlv_5= '[' ( (lv_number_6_0= RULE_INT ) ) otherlv_7= ']' )
            // InternalBrowserAutomation.g:344:3: otherlv_0= 'find' this_Readable_1= ruleReadable otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) ) otherlv_4= '}' otherlv_5= '[' ( (lv_number_6_0= RULE_INT ) ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSELECTORAccess().getFindKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSELECTORAccess().getReadableParserRuleCall_1());
            		
            pushFollow(FOLLOW_13);
            this_Readable_1=ruleReadable();

            state._fsp--;


            			current = this_Readable_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSELECTORAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBrowserAutomation.g:360:3: ( (lv_params_3_0= rulePARAMS ) )
            // InternalBrowserAutomation.g:361:4: (lv_params_3_0= rulePARAMS )
            {
            // InternalBrowserAutomation.g:361:4: (lv_params_3_0= rulePARAMS )
            // InternalBrowserAutomation.g:362:5: lv_params_3_0= rulePARAMS
            {

            					newCompositeNode(grammarAccess.getSELECTORAccess().getParamsPARAMSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getSELECTORAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getSELECTORAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalBrowserAutomation.g:387:3: ( (lv_number_6_0= RULE_INT ) )
            // InternalBrowserAutomation.g:388:4: (lv_number_6_0= RULE_INT )
            {
            // InternalBrowserAutomation.g:388:4: (lv_number_6_0= RULE_INT )
            // InternalBrowserAutomation.g:389:5: lv_number_6_0= RULE_INT
            {
            lv_number_6_0=(Token)match(input,RULE_INT,FOLLOW_17); 

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

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:413:1: entryRuleRefElement returns [EObject current=null] : iv_ruleRefElement= ruleRefElement EOF ;
    public final EObject entryRuleRefElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefElement = null;


        try {
            // InternalBrowserAutomation.g:413:51: (iv_ruleRefElement= ruleRefElement EOF )
            // InternalBrowserAutomation.g:414:2: iv_ruleRefElement= ruleRefElement EOF
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
    // InternalBrowserAutomation.g:420:1: ruleRefElement returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:426:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:427:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:427:2: ( (otherlv_0= RULE_ID ) )
            // InternalBrowserAutomation.g:428:3: (otherlv_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:428:3: (otherlv_0= RULE_ID )
            // InternalBrowserAutomation.g:429:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleBOOL"
    // InternalBrowserAutomation.g:443:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // InternalBrowserAutomation.g:443:44: (iv_ruleBOOL= ruleBOOL EOF )
            // InternalBrowserAutomation.g:444:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL.getText(); 
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
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // InternalBrowserAutomation.g:450:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TRUE' | kw= 'FALSE' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:456:2: ( (kw= 'TRUE' | kw= 'FALSE' ) )
            // InternalBrowserAutomation.g:457:2: (kw= 'TRUE' | kw= 'FALSE' )
            {
            // InternalBrowserAutomation.g:457:2: (kw= 'TRUE' | kw= 'FALSE' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBrowserAutomation.g:458:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLAccess().getTRUEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:464:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLAccess().getFALSEKeyword_1());
                    		

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
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRuleOPEN_BROWSER"
    // InternalBrowserAutomation.g:473:1: entryRuleOPEN_BROWSER returns [EObject current=null] : iv_ruleOPEN_BROWSER= ruleOPEN_BROWSER EOF ;
    public final EObject entryRuleOPEN_BROWSER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOPEN_BROWSER = null;


        try {
            // InternalBrowserAutomation.g:473:53: (iv_ruleOPEN_BROWSER= ruleOPEN_BROWSER EOF )
            // InternalBrowserAutomation.g:474:2: iv_ruleOPEN_BROWSER= ruleOPEN_BROWSER EOF
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
    // InternalBrowserAutomation.g:480:1: ruleOPEN_BROWSER returns [EObject current=null] : ( () otherlv_1= 'openBrowser' ) ;
    public final EObject ruleOPEN_BROWSER() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:486:2: ( ( () otherlv_1= 'openBrowser' ) )
            // InternalBrowserAutomation.g:487:2: ( () otherlv_1= 'openBrowser' )
            {
            // InternalBrowserAutomation.g:487:2: ( () otherlv_1= 'openBrowser' )
            // InternalBrowserAutomation.g:488:3: () otherlv_1= 'openBrowser'
            {
            // InternalBrowserAutomation.g:488:3: ()
            // InternalBrowserAutomation.g:489:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOPEN_BROWSERAccess().getOPEN_BROWSERAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:503:1: entryRuleGO_TO_URL returns [EObject current=null] : iv_ruleGO_TO_URL= ruleGO_TO_URL EOF ;
    public final EObject entryRuleGO_TO_URL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGO_TO_URL = null;


        try {
            // InternalBrowserAutomation.g:503:50: (iv_ruleGO_TO_URL= ruleGO_TO_URL EOF )
            // InternalBrowserAutomation.g:504:2: iv_ruleGO_TO_URL= ruleGO_TO_URL EOF
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
    // InternalBrowserAutomation.g:510:1: ruleGO_TO_URL returns [EObject current=null] : (otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGO_TO_URL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:516:2: ( (otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:517:2: (otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:517:2: (otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:518:3: otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGO_TO_URLAccess().getOpenpageKeyword_0());
            		
            // InternalBrowserAutomation.g:522:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:523:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:523:4: (lv_url_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:524:5: lv_url_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:544:1: entryRuleCLICK_ON returns [EObject current=null] : iv_ruleCLICK_ON= ruleCLICK_ON EOF ;
    public final EObject entryRuleCLICK_ON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCLICK_ON = null;


        try {
            // InternalBrowserAutomation.g:544:49: (iv_ruleCLICK_ON= ruleCLICK_ON EOF )
            // InternalBrowserAutomation.g:545:2: iv_ruleCLICK_ON= ruleCLICK_ON EOF
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
    // InternalBrowserAutomation.g:551:1: ruleCLICK_ON returns [EObject current=null] : (otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) ) ) ;
    public final EObject ruleCLICK_ON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:557:2: ( (otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) ) ) )
            // InternalBrowserAutomation.g:558:2: (otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) ) )
            {
            // InternalBrowserAutomation.g:558:2: (otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) ) )
            // InternalBrowserAutomation.g:559:3: otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCLICK_ONAccess().getClickOnKeyword_0());
            		
            // InternalBrowserAutomation.g:563:3: ( (lv_element_1_0= ruleClickable ) )
            // InternalBrowserAutomation.g:564:4: (lv_element_1_0= ruleClickable )
            {
            // InternalBrowserAutomation.g:564:4: (lv_element_1_0= ruleClickable )
            // InternalBrowserAutomation.g:565:5: lv_element_1_0= ruleClickable
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
    // InternalBrowserAutomation.g:586:1: entryRuleVERIFY_THAT returns [EObject current=null] : iv_ruleVERIFY_THAT= ruleVERIFY_THAT EOF ;
    public final EObject entryRuleVERIFY_THAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVERIFY_THAT = null;


        try {
            // InternalBrowserAutomation.g:586:52: (iv_ruleVERIFY_THAT= ruleVERIFY_THAT EOF )
            // InternalBrowserAutomation.g:587:2: iv_ruleVERIFY_THAT= ruleVERIFY_THAT EOF
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
    // InternalBrowserAutomation.g:593:1: ruleVERIFY_THAT returns [EObject current=null] : (otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) ) ) ;
    public final EObject ruleVERIFY_THAT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:599:2: ( (otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) ) ) )
            // InternalBrowserAutomation.g:600:2: (otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) ) )
            {
            // InternalBrowserAutomation.g:600:2: (otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) ) )
            // InternalBrowserAutomation.g:601:3: otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getVERIFY_THATAccess().getVerifyKeyword_0());
            		
            // InternalBrowserAutomation.g:605:3: ( (lv_element_1_0= ruleVerifiable ) )
            // InternalBrowserAutomation.g:606:4: (lv_element_1_0= ruleVerifiable )
            {
            // InternalBrowserAutomation.g:606:4: (lv_element_1_0= ruleVerifiable )
            // InternalBrowserAutomation.g:607:5: lv_element_1_0= ruleVerifiable
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
    // InternalBrowserAutomation.g:628:1: entryRuleINSERT_ON returns [EObject current=null] : iv_ruleINSERT_ON= ruleINSERT_ON EOF ;
    public final EObject entryRuleINSERT_ON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSERT_ON = null;


        try {
            // InternalBrowserAutomation.g:628:50: (iv_ruleINSERT_ON= ruleINSERT_ON EOF )
            // InternalBrowserAutomation.g:629:2: iv_ruleINSERT_ON= ruleINSERT_ON EOF
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
    // InternalBrowserAutomation.g:635:1: ruleINSERT_ON returns [EObject current=null] : (otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) ) ) ) ;
    public final EObject ruleINSERT_ON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_data_2_1=null;
        Token lv_data_2_2=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:641:2: ( (otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) ) ) ) )
            // InternalBrowserAutomation.g:642:2: (otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) ) ) )
            {
            // InternalBrowserAutomation.g:642:2: (otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) ) ) )
            // InternalBrowserAutomation.g:643:3: otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getINSERT_ONAccess().getInsertKeyword_0());
            		
            // InternalBrowserAutomation.g:647:3: ( (lv_element_1_0= ruleInsertable ) )
            // InternalBrowserAutomation.g:648:4: (lv_element_1_0= ruleInsertable )
            {
            // InternalBrowserAutomation.g:648:4: (lv_element_1_0= ruleInsertable )
            // InternalBrowserAutomation.g:649:5: lv_element_1_0= ruleInsertable
            {

            					newCompositeNode(grammarAccess.getINSERT_ONAccess().getElementInsertableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalBrowserAutomation.g:666:3: ( ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) ) )
            // InternalBrowserAutomation.g:667:4: ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:667:4: ( (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID ) )
            // InternalBrowserAutomation.g:668:5: (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID )
            {
            // InternalBrowserAutomation.g:668:5: (lv_data_2_1= RULE_STRING | lv_data_2_2= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBrowserAutomation.g:669:6: lv_data_2_1= RULE_STRING
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
                    // InternalBrowserAutomation.g:684:6: lv_data_2_2= RULE_ID
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
    // InternalBrowserAutomation.g:705:1: entryRuleCHECK_BOXE returns [EObject current=null] : iv_ruleCHECK_BOXE= ruleCHECK_BOXE EOF ;
    public final EObject entryRuleCHECK_BOXE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHECK_BOXE = null;


        try {
            // InternalBrowserAutomation.g:705:51: (iv_ruleCHECK_BOXE= ruleCHECK_BOXE EOF )
            // InternalBrowserAutomation.g:706:2: iv_ruleCHECK_BOXE= ruleCHECK_BOXE EOF
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
    // InternalBrowserAutomation.g:712:1: ruleCHECK_BOXE returns [EObject current=null] : ( (otherlv_0= 'uncheck' | otherlv_1= 'check' ) ( ( (lv_element_2_0= ruleCHECKBOX ) )* | otherlv_3= 'ALL' ) ) ;
    public final EObject ruleCHECK_BOXE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_element_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:718:2: ( ( (otherlv_0= 'uncheck' | otherlv_1= 'check' ) ( ( (lv_element_2_0= ruleCHECKBOX ) )* | otherlv_3= 'ALL' ) ) )
            // InternalBrowserAutomation.g:719:2: ( (otherlv_0= 'uncheck' | otherlv_1= 'check' ) ( ( (lv_element_2_0= ruleCHECKBOX ) )* | otherlv_3= 'ALL' ) )
            {
            // InternalBrowserAutomation.g:719:2: ( (otherlv_0= 'uncheck' | otherlv_1= 'check' ) ( ( (lv_element_2_0= ruleCHECKBOX ) )* | otherlv_3= 'ALL' ) )
            // InternalBrowserAutomation.g:720:3: (otherlv_0= 'uncheck' | otherlv_1= 'check' ) ( ( (lv_element_2_0= ruleCHECKBOX ) )* | otherlv_3= 'ALL' )
            {
            // InternalBrowserAutomation.g:720:3: (otherlv_0= 'uncheck' | otherlv_1= 'check' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBrowserAutomation.g:721:4: otherlv_0= 'uncheck'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getCHECK_BOXEAccess().getUncheckKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:726:4: otherlv_1= 'check'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getCHECK_BOXEAccess().getCheckKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalBrowserAutomation.g:731:3: ( ( (lv_element_2_0= ruleCHECKBOX ) )* | otherlv_3= 'ALL' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOF||(LA7_0>=15 && LA7_0<=16)||(LA7_0>=25 && LA7_0<=31)||(LA7_0>=33 && LA7_0<=34)||LA7_0==36) ) {
                alt7=1;
            }
            else if ( (LA7_0==32) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBrowserAutomation.g:732:4: ( (lv_element_2_0= ruleCHECKBOX ) )*
                    {
                    // InternalBrowserAutomation.g:732:4: ( (lv_element_2_0= ruleCHECKBOX ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==36) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBrowserAutomation.g:733:5: (lv_element_2_0= ruleCHECKBOX )
                    	    {
                    	    // InternalBrowserAutomation.g:733:5: (lv_element_2_0= ruleCHECKBOX )
                    	    // InternalBrowserAutomation.g:734:6: lv_element_2_0= ruleCHECKBOX
                    	    {

                    	    						newCompositeNode(grammarAccess.getCHECK_BOXEAccess().getElementCHECKBOXParserRuleCall_1_0_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:752:4: otherlv_3= 'ALL'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:761:1: entryRuleCHOOSE_COMBOBOX returns [EObject current=null] : iv_ruleCHOOSE_COMBOBOX= ruleCHOOSE_COMBOBOX EOF ;
    public final EObject entryRuleCHOOSE_COMBOBOX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHOOSE_COMBOBOX = null;


        try {
            // InternalBrowserAutomation.g:761:56: (iv_ruleCHOOSE_COMBOBOX= ruleCHOOSE_COMBOBOX EOF )
            // InternalBrowserAutomation.g:762:2: iv_ruleCHOOSE_COMBOBOX= ruleCHOOSE_COMBOBOX EOF
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
    // InternalBrowserAutomation.g:768:1: ruleCHOOSE_COMBOBOX returns [EObject current=null] : (otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleCHOOSE_COMBOBOX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_data_3_0=null;
        Token otherlv_4=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:774:2: ( (otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalBrowserAutomation.g:775:2: (otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalBrowserAutomation.g:775:2: (otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalBrowserAutomation.g:776:3: otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getCHOOSE_COMBOBOXAccess().getChoosecomboKeyword_0());
            		
            // InternalBrowserAutomation.g:780:3: ( (lv_element_1_0= ruleCOMBOBOX ) )
            // InternalBrowserAutomation.g:781:4: (lv_element_1_0= ruleCOMBOBOX )
            {
            // InternalBrowserAutomation.g:781:4: (lv_element_1_0= ruleCOMBOBOX )
            // InternalBrowserAutomation.g:782:5: lv_element_1_0= ruleCOMBOBOX
            {

            					newCompositeNode(grammarAccess.getCHOOSE_COMBOBOXAccess().getElementCOMBOBOXParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCHOOSE_COMBOBOXAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBrowserAutomation.g:803:3: ( (lv_data_3_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:804:4: (lv_data_3_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:804:4: (lv_data_3_0= RULE_STRING )
            // InternalBrowserAutomation.g:805:5: lv_data_3_0= RULE_STRING
            {
            lv_data_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:829:1: entryRuleREAD_ON returns [EObject current=null] : iv_ruleREAD_ON= ruleREAD_ON EOF ;
    public final EObject entryRuleREAD_ON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREAD_ON = null;


        try {
            // InternalBrowserAutomation.g:829:48: (iv_ruleREAD_ON= ruleREAD_ON EOF )
            // InternalBrowserAutomation.g:830:2: iv_ruleREAD_ON= ruleREAD_ON EOF
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
    // InternalBrowserAutomation.g:836:1: ruleREAD_ON returns [EObject current=null] : (otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) ) ) ;
    public final EObject ruleREAD_ON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:842:2: ( (otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) ) ) )
            // InternalBrowserAutomation.g:843:2: (otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) ) )
            {
            // InternalBrowserAutomation.g:843:2: (otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) ) )
            // InternalBrowserAutomation.g:844:3: otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getREAD_ONAccess().getReadKeyword_0());
            		
            // InternalBrowserAutomation.g:848:3: ( (lv_element_1_0= ruleReadable ) )
            // InternalBrowserAutomation.g:849:4: (lv_element_1_0= ruleReadable )
            {
            // InternalBrowserAutomation.g:849:4: (lv_element_1_0= ruleReadable )
            // InternalBrowserAutomation.g:850:5: lv_element_1_0= ruleReadable
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
    // InternalBrowserAutomation.g:871:1: entryRuleReadable returns [EObject current=null] : iv_ruleReadable= ruleReadable EOF ;
    public final EObject entryRuleReadable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadable = null;


        try {
            // InternalBrowserAutomation.g:871:49: (iv_ruleReadable= ruleReadable EOF )
            // InternalBrowserAutomation.g:872:2: iv_ruleReadable= ruleReadable EOF
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
    // InternalBrowserAutomation.g:878:1: ruleReadable returns [EObject current=null] : (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK ) ;
    public final EObject ruleReadable() throws RecognitionException {
        EObject current = null;

        EObject this_TEXT_0 = null;

        EObject this_BUTTON_1 = null;

        EObject this_LINK_2 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:884:2: ( (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK ) )
            // InternalBrowserAutomation.g:885:2: (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK )
            {
            // InternalBrowserAutomation.g:885:2: (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK )
            int alt8=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBrowserAutomation.g:886:3: this_TEXT_0= ruleTEXT
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
                    // InternalBrowserAutomation.g:895:3: this_BUTTON_1= ruleBUTTON
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
                    // InternalBrowserAutomation.g:904:3: this_LINK_2= ruleLINK
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
    // InternalBrowserAutomation.g:916:1: entryRuleInsertable returns [EObject current=null] : iv_ruleInsertable= ruleInsertable EOF ;
    public final EObject entryRuleInsertable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertable = null;


        try {
            // InternalBrowserAutomation.g:916:51: (iv_ruleInsertable= ruleInsertable EOF )
            // InternalBrowserAutomation.g:917:2: iv_ruleInsertable= ruleInsertable EOF
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
    // InternalBrowserAutomation.g:923:1: ruleInsertable returns [EObject current=null] : this_SEARCH_FIELD_0= ruleSEARCH_FIELD ;
    public final EObject ruleInsertable() throws RecognitionException {
        EObject current = null;

        EObject this_SEARCH_FIELD_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:929:2: (this_SEARCH_FIELD_0= ruleSEARCH_FIELD )
            // InternalBrowserAutomation.g:930:2: this_SEARCH_FIELD_0= ruleSEARCH_FIELD
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
    // InternalBrowserAutomation.g:941:1: entryRuleVerifiable returns [EObject current=null] : iv_ruleVerifiable= ruleVerifiable EOF ;
    public final EObject entryRuleVerifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifiable = null;


        try {
            // InternalBrowserAutomation.g:941:51: (iv_ruleVerifiable= ruleVerifiable EOF )
            // InternalBrowserAutomation.g:942:2: iv_ruleVerifiable= ruleVerifiable EOF
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
    // InternalBrowserAutomation.g:948:1: ruleVerifiable returns [EObject current=null] : (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK | this_IMAGE_3= ruleIMAGE | this_RefElement_4= ruleRefElement ) ;
    public final EObject ruleVerifiable() throws RecognitionException {
        EObject current = null;

        EObject this_TEXT_0 = null;

        EObject this_BUTTON_1 = null;

        EObject this_LINK_2 = null;

        EObject this_IMAGE_3 = null;

        EObject this_RefElement_4 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:954:2: ( (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK | this_IMAGE_3= ruleIMAGE | this_RefElement_4= ruleRefElement ) )
            // InternalBrowserAutomation.g:955:2: (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK | this_IMAGE_3= ruleIMAGE | this_RefElement_4= ruleRefElement )
            {
            // InternalBrowserAutomation.g:955:2: (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK | this_IMAGE_3= ruleIMAGE | this_RefElement_4= ruleRefElement )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt9=1;
                }
                break;
            case 39:
                {
                alt9=2;
                }
                break;
            case 40:
                {
                alt9=3;
                }
                break;
            case 41:
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
                    // InternalBrowserAutomation.g:956:3: this_TEXT_0= ruleTEXT
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
                    // InternalBrowserAutomation.g:965:3: this_BUTTON_1= ruleBUTTON
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
                    // InternalBrowserAutomation.g:974:3: this_LINK_2= ruleLINK
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
                    // InternalBrowserAutomation.g:983:3: this_IMAGE_3= ruleIMAGE
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
                    // InternalBrowserAutomation.g:992:3: this_RefElement_4= ruleRefElement
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
    // InternalBrowserAutomation.g:1004:1: entryRuleClickable returns [EObject current=null] : iv_ruleClickable= ruleClickable EOF ;
    public final EObject entryRuleClickable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickable = null;


        try {
            // InternalBrowserAutomation.g:1004:50: (iv_ruleClickable= ruleClickable EOF )
            // InternalBrowserAutomation.g:1005:2: iv_ruleClickable= ruleClickable EOF
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
    // InternalBrowserAutomation.g:1011:1: ruleClickable returns [EObject current=null] : (this_BUTTON_0= ruleBUTTON | this_LINK_1= ruleLINK | this_IMAGE_2= ruleIMAGE | this_COMBOBOX_3= ruleCOMBOBOX | this_RefElement_4= ruleRefElement ) ;
    public final EObject ruleClickable() throws RecognitionException {
        EObject current = null;

        EObject this_BUTTON_0 = null;

        EObject this_LINK_1 = null;

        EObject this_IMAGE_2 = null;

        EObject this_COMBOBOX_3 = null;

        EObject this_RefElement_4 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:1017:2: ( (this_BUTTON_0= ruleBUTTON | this_LINK_1= ruleLINK | this_IMAGE_2= ruleIMAGE | this_COMBOBOX_3= ruleCOMBOBOX | this_RefElement_4= ruleRefElement ) )
            // InternalBrowserAutomation.g:1018:2: (this_BUTTON_0= ruleBUTTON | this_LINK_1= ruleLINK | this_IMAGE_2= ruleIMAGE | this_COMBOBOX_3= ruleCOMBOBOX | this_RefElement_4= ruleRefElement )
            {
            // InternalBrowserAutomation.g:1018:2: (this_BUTTON_0= ruleBUTTON | this_LINK_1= ruleLINK | this_IMAGE_2= ruleIMAGE | this_COMBOBOX_3= ruleCOMBOBOX | this_RefElement_4= ruleRefElement )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt10=1;
                }
                break;
            case 40:
                {
                alt10=2;
                }
                break;
            case 41:
                {
                alt10=3;
                }
                break;
            case 35:
                {
                alt10=4;
                }
                break;
            case RULE_ID:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalBrowserAutomation.g:1019:3: this_BUTTON_0= ruleBUTTON
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
                    // InternalBrowserAutomation.g:1028:3: this_LINK_1= ruleLINK
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
                    // InternalBrowserAutomation.g:1037:3: this_IMAGE_2= ruleIMAGE
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
                    // InternalBrowserAutomation.g:1046:3: this_COMBOBOX_3= ruleCOMBOBOX
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
                    // InternalBrowserAutomation.g:1055:3: this_RefElement_4= ruleRefElement
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
    // InternalBrowserAutomation.g:1067:1: entryRuleCOMBOBOX returns [EObject current=null] : iv_ruleCOMBOBOX= ruleCOMBOBOX EOF ;
    public final EObject entryRuleCOMBOBOX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOMBOBOX = null;


        try {
            // InternalBrowserAutomation.g:1067:49: (iv_ruleCOMBOBOX= ruleCOMBOBOX EOF )
            // InternalBrowserAutomation.g:1068:2: iv_ruleCOMBOBOX= ruleCOMBOBOX EOF
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
    // InternalBrowserAutomation.g:1074:1: ruleCOMBOBOX returns [EObject current=null] : (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCOMBOBOX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1080:2: ( (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1081:2: (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1081:2: (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1082:3: otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCOMBOBOXAccess().getComboboxKeyword_0());
            		
            // InternalBrowserAutomation.g:1086:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1087:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1087:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1088:5: lv_name_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:1108:1: entryRuleCHECKBOX returns [EObject current=null] : iv_ruleCHECKBOX= ruleCHECKBOX EOF ;
    public final EObject entryRuleCHECKBOX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHECKBOX = null;


        try {
            // InternalBrowserAutomation.g:1108:49: (iv_ruleCHECKBOX= ruleCHECKBOX EOF )
            // InternalBrowserAutomation.g:1109:2: iv_ruleCHECKBOX= ruleCHECKBOX EOF
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
    // InternalBrowserAutomation.g:1115:1: ruleCHECKBOX returns [EObject current=null] : (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCHECKBOX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1121:2: ( (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1122:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1122:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1123:3: otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCHECKBOXAccess().getCheckboxKeyword_0());
            		
            // InternalBrowserAutomation.g:1127:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1128:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1128:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1129:5: lv_name_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:1149:1: entryRuleSEARCH_FIELD returns [EObject current=null] : iv_ruleSEARCH_FIELD= ruleSEARCH_FIELD EOF ;
    public final EObject entryRuleSEARCH_FIELD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEARCH_FIELD = null;


        try {
            // InternalBrowserAutomation.g:1149:53: (iv_ruleSEARCH_FIELD= ruleSEARCH_FIELD EOF )
            // InternalBrowserAutomation.g:1150:2: iv_ruleSEARCH_FIELD= ruleSEARCH_FIELD EOF
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
    // InternalBrowserAutomation.g:1156:1: ruleSEARCH_FIELD returns [EObject current=null] : (otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSEARCH_FIELD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1162:2: ( (otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1163:2: (otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1163:2: (otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1164:3: otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSEARCH_FIELDAccess().getSearchfieldKeyword_0());
            		
            // InternalBrowserAutomation.g:1168:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1169:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1169:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1170:5: lv_name_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:1190:1: entryRuleTEXT returns [EObject current=null] : iv_ruleTEXT= ruleTEXT EOF ;
    public final EObject entryRuleTEXT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTEXT = null;


        try {
            // InternalBrowserAutomation.g:1190:45: (iv_ruleTEXT= ruleTEXT EOF )
            // InternalBrowserAutomation.g:1191:2: iv_ruleTEXT= ruleTEXT EOF
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
    // InternalBrowserAutomation.g:1197:1: ruleTEXT returns [EObject current=null] : (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTEXT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1203:2: ( (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1204:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1204:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1205:3: otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTEXTAccess().getTextKeyword_0());
            		
            // InternalBrowserAutomation.g:1209:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1210:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1210:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1211:5: lv_name_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:1231:1: entryRuleBUTTON returns [EObject current=null] : iv_ruleBUTTON= ruleBUTTON EOF ;
    public final EObject entryRuleBUTTON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBUTTON = null;


        try {
            // InternalBrowserAutomation.g:1231:47: (iv_ruleBUTTON= ruleBUTTON EOF )
            // InternalBrowserAutomation.g:1232:2: iv_ruleBUTTON= ruleBUTTON EOF
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
    // InternalBrowserAutomation.g:1238:1: ruleBUTTON returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBUTTON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1244:2: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1245:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1245:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1246:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBUTTONAccess().getButtonKeyword_0());
            		
            // InternalBrowserAutomation.g:1250:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1251:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1251:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1252:5: lv_name_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:1272:1: entryRuleLINK returns [EObject current=null] : iv_ruleLINK= ruleLINK EOF ;
    public final EObject entryRuleLINK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLINK = null;


        try {
            // InternalBrowserAutomation.g:1272:45: (iv_ruleLINK= ruleLINK EOF )
            // InternalBrowserAutomation.g:1273:2: iv_ruleLINK= ruleLINK EOF
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
    // InternalBrowserAutomation.g:1279:1: ruleLINK returns [EObject current=null] : (otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLINK() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1285:2: ( (otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1286:2: (otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1286:2: (otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1287:3: otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLINKAccess().getLinkKeyword_0());
            		
            // InternalBrowserAutomation.g:1291:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1292:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1292:4: (lv_url_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1293:5: lv_url_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:1313:1: entryRuleIMAGE returns [EObject current=null] : iv_ruleIMAGE= ruleIMAGE EOF ;
    public final EObject entryRuleIMAGE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIMAGE = null;


        try {
            // InternalBrowserAutomation.g:1313:46: (iv_ruleIMAGE= ruleIMAGE EOF )
            // InternalBrowserAutomation.g:1314:2: iv_ruleIMAGE= ruleIMAGE EOF
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
    // InternalBrowserAutomation.g:1320:1: ruleIMAGE returns [EObject current=null] : (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}' )* ) ;
    public final EObject ruleIMAGE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:1326:2: ( (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}' )* ) )
            // InternalBrowserAutomation.g:1327:2: (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}' )* )
            {
            // InternalBrowserAutomation.g:1327:2: (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}' )* )
            // InternalBrowserAutomation.g:1328:3: otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}' )*
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIMAGEAccess().getImageKeyword_0());
            		
            // InternalBrowserAutomation.g:1332:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1333:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1333:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1334:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

            // InternalBrowserAutomation.g:1350:3: (otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBrowserAutomation.g:1351:4: otherlv_2= '{' ( (lv_params_3_0= rulePARAMS ) )* otherlv_4= '}'
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIMAGEAccess().getLeftCurlyBracketKeyword_2_0());
            	    			
            	    // InternalBrowserAutomation.g:1355:4: ( (lv_params_3_0= rulePARAMS ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==RULE_STRING) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalBrowserAutomation.g:1356:5: (lv_params_3_0= rulePARAMS )
            	    	    {
            	    	    // InternalBrowserAutomation.g:1356:5: (lv_params_3_0= rulePARAMS )
            	    	    // InternalBrowserAutomation.g:1357:6: lv_params_3_0= rulePARAMS
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getIMAGEAccess().getParamsPARAMSParserRuleCall_2_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_25);
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
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,20,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIMAGEAccess().getRightCurlyBracketKeyword_2_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalBrowserAutomation.g:1383:1: entryRulePARAMS returns [EObject current=null] : iv_rulePARAMS= rulePARAMS EOF ;
    public final EObject entryRulePARAMS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePARAMS = null;


        try {
            // InternalBrowserAutomation.g:1383:47: (iv_rulePARAMS= rulePARAMS EOF )
            // InternalBrowserAutomation.g:1384:2: iv_rulePARAMS= rulePARAMS EOF
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
    // InternalBrowserAutomation.g:1390:1: rulePARAMS returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePARAMS() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1396:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1397:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1397:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1398:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalBrowserAutomation.g:1398:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1399:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1399:4: (lv_key_0_0= RULE_STRING )
            // InternalBrowserAutomation.g:1400:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPARAMSAccess().getEqualsSignKeyword_1());
            		
            // InternalBrowserAutomation.g:1420:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1421:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1421:4: (lv_value_2_0= RULE_STRING )
            // InternalBrowserAutomation.g:1422:5: lv_value_2_0= RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000006FE018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000003C800000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001100000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100010L});

}