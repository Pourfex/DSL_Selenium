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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TestSuites'", "'end'", "'TestSuite'", "'Test'", "'('", "'result='", "')'", "'TRUE'", "'FALSE'", "'openBrowser'", "'openpage'", "'clickOn'", "'verify'", "'insert'", "'check'", "'choosecombo'", "'{'", "'STRING'", "'}'", "'read'", "'combobox'", "'checkbox'", "'searchfield'", "'text'", "'button'", "'link'", "'image'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
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
        	return "TestSuites";
       	}

       	@Override
       	protected BrowserAutomationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTestSuites"
    // InternalBrowserAutomation.g:64:1: entryRuleTestSuites returns [EObject current=null] : iv_ruleTestSuites= ruleTestSuites EOF ;
    public final EObject entryRuleTestSuites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestSuites = null;


        try {
            // InternalBrowserAutomation.g:64:51: (iv_ruleTestSuites= ruleTestSuites EOF )
            // InternalBrowserAutomation.g:65:2: iv_ruleTestSuites= ruleTestSuites EOF
            {
             newCompositeNode(grammarAccess.getTestSuitesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestSuites=ruleTestSuites();

            state._fsp--;

             current =iv_ruleTestSuites; 
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
    // $ANTLR end "entryRuleTestSuites"


    // $ANTLR start "ruleTestSuites"
    // InternalBrowserAutomation.g:71:1: ruleTestSuites returns [EObject current=null] : ( () otherlv_1= 'TestSuites' ( (lv_testsuites_2_0= ruleTestSuite ) )* otherlv_3= 'end' ) ;
    public final EObject ruleTestSuites() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_testsuites_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:77:2: ( ( () otherlv_1= 'TestSuites' ( (lv_testsuites_2_0= ruleTestSuite ) )* otherlv_3= 'end' ) )
            // InternalBrowserAutomation.g:78:2: ( () otherlv_1= 'TestSuites' ( (lv_testsuites_2_0= ruleTestSuite ) )* otherlv_3= 'end' )
            {
            // InternalBrowserAutomation.g:78:2: ( () otherlv_1= 'TestSuites' ( (lv_testsuites_2_0= ruleTestSuite ) )* otherlv_3= 'end' )
            // InternalBrowserAutomation.g:79:3: () otherlv_1= 'TestSuites' ( (lv_testsuites_2_0= ruleTestSuite ) )* otherlv_3= 'end'
            {
            // InternalBrowserAutomation.g:79:3: ()
            // InternalBrowserAutomation.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestSuitesAccess().getTestSuitesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTestSuitesAccess().getTestSuitesKeyword_1());
            		
            // InternalBrowserAutomation.g:90:3: ( (lv_testsuites_2_0= ruleTestSuite ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowserAutomation.g:91:4: (lv_testsuites_2_0= ruleTestSuite )
            	    {
            	    // InternalBrowserAutomation.g:91:4: (lv_testsuites_2_0= ruleTestSuite )
            	    // InternalBrowserAutomation.g:92:5: lv_testsuites_2_0= ruleTestSuite
            	    {

            	    					newCompositeNode(grammarAccess.getTestSuitesAccess().getTestsuitesTestSuiteParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_testsuites_2_0=ruleTestSuite();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestSuitesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"testsuites",
            	    						lv_testsuites_2_0,
            	    						"org.xtext.imt.browserautomation.BrowserAutomation.TestSuite");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTestSuitesAccess().getEndKeyword_3());
            		

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
    // $ANTLR end "ruleTestSuites"


    // $ANTLR start "entryRuleTestSuite"
    // InternalBrowserAutomation.g:117:1: entryRuleTestSuite returns [EObject current=null] : iv_ruleTestSuite= ruleTestSuite EOF ;
    public final EObject entryRuleTestSuite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestSuite = null;


        try {
            // InternalBrowserAutomation.g:117:50: (iv_ruleTestSuite= ruleTestSuite EOF )
            // InternalBrowserAutomation.g:118:2: iv_ruleTestSuite= ruleTestSuite EOF
            {
             newCompositeNode(grammarAccess.getTestSuiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestSuite=ruleTestSuite();

            state._fsp--;

             current =iv_ruleTestSuite; 
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
    // $ANTLR end "entryRuleTestSuite"


    // $ANTLR start "ruleTestSuite"
    // InternalBrowserAutomation.g:124:1: ruleTestSuite returns [EObject current=null] : (otherlv_0= 'TestSuite' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_tests_2_0= ruleTest ) )* otherlv_3= 'end' ) ;
    public final EObject ruleTestSuite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_tests_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:130:2: ( (otherlv_0= 'TestSuite' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_tests_2_0= ruleTest ) )* otherlv_3= 'end' ) )
            // InternalBrowserAutomation.g:131:2: (otherlv_0= 'TestSuite' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_tests_2_0= ruleTest ) )* otherlv_3= 'end' )
            {
            // InternalBrowserAutomation.g:131:2: (otherlv_0= 'TestSuite' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_tests_2_0= ruleTest ) )* otherlv_3= 'end' )
            // InternalBrowserAutomation.g:132:3: otherlv_0= 'TestSuite' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_tests_2_0= ruleTest ) )* otherlv_3= 'end'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestSuiteAccess().getTestSuiteKeyword_0());
            		
            // InternalBrowserAutomation.g:136:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:137:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:137:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:138:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTestSuiteAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestSuiteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowserAutomation.g:154:3: ( (lv_tests_2_0= ruleTest ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBrowserAutomation.g:155:4: (lv_tests_2_0= ruleTest )
            	    {
            	    // InternalBrowserAutomation.g:155:4: (lv_tests_2_0= ruleTest )
            	    // InternalBrowserAutomation.g:156:5: lv_tests_2_0= ruleTest
            	    {

            	    					newCompositeNode(grammarAccess.getTestSuiteAccess().getTestsTestParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_tests_2_0=ruleTest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestSuiteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tests",
            	    						lv_tests_2_0,
            	    						"org.xtext.imt.browserautomation.BrowserAutomation.Test");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTestSuiteAccess().getEndKeyword_3());
            		

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
    // $ANTLR end "ruleTestSuite"


    // $ANTLR start "entryRuleTest"
    // InternalBrowserAutomation.g:181:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalBrowserAutomation.g:181:45: (iv_ruleTest= ruleTest EOF )
            // InternalBrowserAutomation.g:182:2: iv_ruleTest= ruleTest EOF
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
    // InternalBrowserAutomation.g:188:1: ruleTest returns [EObject current=null] : (otherlv_0= 'Test' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'result=' ( (lv_result_4_0= ruleBOOL ) ) otherlv_5= ')' ( (lv_instructions_6_0= ruleInstruction ) )* otherlv_7= 'end' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_result_4_0 = null;

        EObject lv_instructions_6_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:194:2: ( (otherlv_0= 'Test' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'result=' ( (lv_result_4_0= ruleBOOL ) ) otherlv_5= ')' ( (lv_instructions_6_0= ruleInstruction ) )* otherlv_7= 'end' ) )
            // InternalBrowserAutomation.g:195:2: (otherlv_0= 'Test' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'result=' ( (lv_result_4_0= ruleBOOL ) ) otherlv_5= ')' ( (lv_instructions_6_0= ruleInstruction ) )* otherlv_7= 'end' )
            {
            // InternalBrowserAutomation.g:195:2: (otherlv_0= 'Test' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'result=' ( (lv_result_4_0= ruleBOOL ) ) otherlv_5= ')' ( (lv_instructions_6_0= ruleInstruction ) )* otherlv_7= 'end' )
            // InternalBrowserAutomation.g:196:3: otherlv_0= 'Test' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'result=' ( (lv_result_4_0= ruleBOOL ) ) otherlv_5= ')' ( (lv_instructions_6_0= ruleInstruction ) )* otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
            		
            // InternalBrowserAutomation.g:200:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:201:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:201:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:202:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTestAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTestAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getTestAccess().getResultKeyword_3());
            		
            // InternalBrowserAutomation.g:226:3: ( (lv_result_4_0= ruleBOOL ) )
            // InternalBrowserAutomation.g:227:4: (lv_result_4_0= ruleBOOL )
            {
            // InternalBrowserAutomation.g:227:4: (lv_result_4_0= ruleBOOL )
            // InternalBrowserAutomation.g:228:5: lv_result_4_0= ruleBOOL
            {

            					newCompositeNode(grammarAccess.getTestAccess().getResultBOOLParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_result_4_0=ruleBOOL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_4_0,
            						"org.xtext.imt.browserautomation.BrowserAutomation.BOOL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getTestAccess().getRightParenthesisKeyword_5());
            		
            // InternalBrowserAutomation.g:249:3: ( (lv_instructions_6_0= ruleInstruction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=20 && LA3_0<=26)||LA3_0==30) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBrowserAutomation.g:250:4: (lv_instructions_6_0= ruleInstruction )
            	    {
            	    // InternalBrowserAutomation.g:250:4: (lv_instructions_6_0= ruleInstruction )
            	    // InternalBrowserAutomation.g:251:5: lv_instructions_6_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getInstructionsInstructionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_instructions_6_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_6_0,
            	    						"org.xtext.imt.browserautomation.BrowserAutomation.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTestAccess().getEndKeyword_7());
            		

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
    // InternalBrowserAutomation.g:276:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalBrowserAutomation.g:276:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalBrowserAutomation.g:277:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalBrowserAutomation.g:283:1: ruleInstruction returns [EObject current=null] : ( ruleOPEN_BROWSER | this_GO_TO_URL_1= ruleGO_TO_URL | this_CLICK_ON_2= ruleCLICK_ON | this_VERIFY_THAT_3= ruleVERIFY_THAT | this_INSERT_ON_4= ruleINSERT_ON | this_CHECK_BOXE_5= ruleCHECK_BOXE | this_CHOOSE_COMBOBOX_6= ruleCHOOSE_COMBOBOX | this_READ_ON_7= ruleREAD_ON ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_GO_TO_URL_1 = null;

        EObject this_CLICK_ON_2 = null;

        EObject this_VERIFY_THAT_3 = null;

        EObject this_INSERT_ON_4 = null;

        EObject this_CHECK_BOXE_5 = null;

        EObject this_CHOOSE_COMBOBOX_6 = null;

        EObject this_READ_ON_7 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:289:2: ( ( ruleOPEN_BROWSER | this_GO_TO_URL_1= ruleGO_TO_URL | this_CLICK_ON_2= ruleCLICK_ON | this_VERIFY_THAT_3= ruleVERIFY_THAT | this_INSERT_ON_4= ruleINSERT_ON | this_CHECK_BOXE_5= ruleCHECK_BOXE | this_CHOOSE_COMBOBOX_6= ruleCHOOSE_COMBOBOX | this_READ_ON_7= ruleREAD_ON ) )
            // InternalBrowserAutomation.g:290:2: ( ruleOPEN_BROWSER | this_GO_TO_URL_1= ruleGO_TO_URL | this_CLICK_ON_2= ruleCLICK_ON | this_VERIFY_THAT_3= ruleVERIFY_THAT | this_INSERT_ON_4= ruleINSERT_ON | this_CHECK_BOXE_5= ruleCHECK_BOXE | this_CHOOSE_COMBOBOX_6= ruleCHOOSE_COMBOBOX | this_READ_ON_7= ruleREAD_ON )
            {
            // InternalBrowserAutomation.g:290:2: ( ruleOPEN_BROWSER | this_GO_TO_URL_1= ruleGO_TO_URL | this_CLICK_ON_2= ruleCLICK_ON | this_VERIFY_THAT_3= ruleVERIFY_THAT | this_INSERT_ON_4= ruleINSERT_ON | this_CHECK_BOXE_5= ruleCHECK_BOXE | this_CHOOSE_COMBOBOX_6= ruleCHOOSE_COMBOBOX | this_READ_ON_7= ruleREAD_ON )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            case 24:
                {
                alt4=5;
                }
                break;
            case 25:
                {
                alt4=6;
                }
                break;
            case 26:
                {
                alt4=7;
                }
                break;
            case 30:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBrowserAutomation.g:291:3: ruleOPEN_BROWSER
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getOPEN_BROWSERParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    ruleOPEN_BROWSER();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:299:3: this_GO_TO_URL_1= ruleGO_TO_URL
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getGO_TO_URLParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GO_TO_URL_1=ruleGO_TO_URL();

                    state._fsp--;


                    			current = this_GO_TO_URL_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:308:3: this_CLICK_ON_2= ruleCLICK_ON
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCLICK_ONParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CLICK_ON_2=ruleCLICK_ON();

                    state._fsp--;


                    			current = this_CLICK_ON_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:317:3: this_VERIFY_THAT_3= ruleVERIFY_THAT
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getVERIFY_THATParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VERIFY_THAT_3=ruleVERIFY_THAT();

                    state._fsp--;


                    			current = this_VERIFY_THAT_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:326:3: this_INSERT_ON_4= ruleINSERT_ON
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getINSERT_ONParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_INSERT_ON_4=ruleINSERT_ON();

                    state._fsp--;


                    			current = this_INSERT_ON_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:335:3: this_CHECK_BOXE_5= ruleCHECK_BOXE
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCHECK_BOXEParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CHECK_BOXE_5=ruleCHECK_BOXE();

                    state._fsp--;


                    			current = this_CHECK_BOXE_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:344:3: this_CHOOSE_COMBOBOX_6= ruleCHOOSE_COMBOBOX
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCHOOSE_COMBOBOXParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_CHOOSE_COMBOBOX_6=ruleCHOOSE_COMBOBOX();

                    state._fsp--;


                    			current = this_CHOOSE_COMBOBOX_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalBrowserAutomation.g:353:3: this_READ_ON_7= ruleREAD_ON
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getREAD_ONParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_READ_ON_7=ruleREAD_ON();

                    state._fsp--;


                    			current = this_READ_ON_7;
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


    // $ANTLR start "entryRuleBOOL"
    // InternalBrowserAutomation.g:365:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // InternalBrowserAutomation.g:365:44: (iv_ruleBOOL= ruleBOOL EOF )
            // InternalBrowserAutomation.g:366:2: iv_ruleBOOL= ruleBOOL EOF
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
    // InternalBrowserAutomation.g:372:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TRUE' | kw= 'FALSE' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:378:2: ( (kw= 'TRUE' | kw= 'FALSE' ) )
            // InternalBrowserAutomation.g:379:2: (kw= 'TRUE' | kw= 'FALSE' )
            {
            // InternalBrowserAutomation.g:379:2: (kw= 'TRUE' | kw= 'FALSE' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBrowserAutomation.g:380:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLAccess().getTRUEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:386:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:395:1: entryRuleOPEN_BROWSER returns [String current=null] : iv_ruleOPEN_BROWSER= ruleOPEN_BROWSER EOF ;
    public final String entryRuleOPEN_BROWSER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOPEN_BROWSER = null;


        try {
            // InternalBrowserAutomation.g:395:52: (iv_ruleOPEN_BROWSER= ruleOPEN_BROWSER EOF )
            // InternalBrowserAutomation.g:396:2: iv_ruleOPEN_BROWSER= ruleOPEN_BROWSER EOF
            {
             newCompositeNode(grammarAccess.getOPEN_BROWSERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOPEN_BROWSER=ruleOPEN_BROWSER();

            state._fsp--;

             current =iv_ruleOPEN_BROWSER.getText(); 
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
    // InternalBrowserAutomation.g:402:1: ruleOPEN_BROWSER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'openBrowser' ;
    public final AntlrDatatypeRuleToken ruleOPEN_BROWSER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:408:2: (kw= 'openBrowser' )
            // InternalBrowserAutomation.g:409:2: kw= 'openBrowser'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getOPEN_BROWSERAccess().getOpenBrowserKeyword());
            	

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
    // InternalBrowserAutomation.g:417:1: entryRuleGO_TO_URL returns [EObject current=null] : iv_ruleGO_TO_URL= ruleGO_TO_URL EOF ;
    public final EObject entryRuleGO_TO_URL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGO_TO_URL = null;


        try {
            // InternalBrowserAutomation.g:417:50: (iv_ruleGO_TO_URL= ruleGO_TO_URL EOF )
            // InternalBrowserAutomation.g:418:2: iv_ruleGO_TO_URL= ruleGO_TO_URL EOF
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
    // InternalBrowserAutomation.g:424:1: ruleGO_TO_URL returns [EObject current=null] : (otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGO_TO_URL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:430:2: ( (otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:431:2: (otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:431:2: (otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:432:3: otherlv_0= 'openpage' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGO_TO_URLAccess().getOpenpageKeyword_0());
            		
            // InternalBrowserAutomation.g:436:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:437:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:437:4: (lv_url_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:438:5: lv_url_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:458:1: entryRuleCLICK_ON returns [EObject current=null] : iv_ruleCLICK_ON= ruleCLICK_ON EOF ;
    public final EObject entryRuleCLICK_ON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCLICK_ON = null;


        try {
            // InternalBrowserAutomation.g:458:49: (iv_ruleCLICK_ON= ruleCLICK_ON EOF )
            // InternalBrowserAutomation.g:459:2: iv_ruleCLICK_ON= ruleCLICK_ON EOF
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
    // InternalBrowserAutomation.g:465:1: ruleCLICK_ON returns [EObject current=null] : (otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) ) ) ;
    public final EObject ruleCLICK_ON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:471:2: ( (otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) ) ) )
            // InternalBrowserAutomation.g:472:2: (otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) ) )
            {
            // InternalBrowserAutomation.g:472:2: (otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) ) )
            // InternalBrowserAutomation.g:473:3: otherlv_0= 'clickOn' ( (lv_element_1_0= ruleClickable ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCLICK_ONAccess().getClickOnKeyword_0());
            		
            // InternalBrowserAutomation.g:477:3: ( (lv_element_1_0= ruleClickable ) )
            // InternalBrowserAutomation.g:478:4: (lv_element_1_0= ruleClickable )
            {
            // InternalBrowserAutomation.g:478:4: (lv_element_1_0= ruleClickable )
            // InternalBrowserAutomation.g:479:5: lv_element_1_0= ruleClickable
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
    // InternalBrowserAutomation.g:500:1: entryRuleVERIFY_THAT returns [EObject current=null] : iv_ruleVERIFY_THAT= ruleVERIFY_THAT EOF ;
    public final EObject entryRuleVERIFY_THAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVERIFY_THAT = null;


        try {
            // InternalBrowserAutomation.g:500:52: (iv_ruleVERIFY_THAT= ruleVERIFY_THAT EOF )
            // InternalBrowserAutomation.g:501:2: iv_ruleVERIFY_THAT= ruleVERIFY_THAT EOF
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
    // InternalBrowserAutomation.g:507:1: ruleVERIFY_THAT returns [EObject current=null] : (otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) ) ) ;
    public final EObject ruleVERIFY_THAT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:513:2: ( (otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) ) ) )
            // InternalBrowserAutomation.g:514:2: (otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) ) )
            {
            // InternalBrowserAutomation.g:514:2: (otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) ) )
            // InternalBrowserAutomation.g:515:3: otherlv_0= 'verify' ( (lv_element_1_0= ruleVerifiable ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getVERIFY_THATAccess().getVerifyKeyword_0());
            		
            // InternalBrowserAutomation.g:519:3: ( (lv_element_1_0= ruleVerifiable ) )
            // InternalBrowserAutomation.g:520:4: (lv_element_1_0= ruleVerifiable )
            {
            // InternalBrowserAutomation.g:520:4: (lv_element_1_0= ruleVerifiable )
            // InternalBrowserAutomation.g:521:5: lv_element_1_0= ruleVerifiable
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
    // InternalBrowserAutomation.g:542:1: entryRuleINSERT_ON returns [EObject current=null] : iv_ruleINSERT_ON= ruleINSERT_ON EOF ;
    public final EObject entryRuleINSERT_ON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSERT_ON = null;


        try {
            // InternalBrowserAutomation.g:542:50: (iv_ruleINSERT_ON= ruleINSERT_ON EOF )
            // InternalBrowserAutomation.g:543:2: iv_ruleINSERT_ON= ruleINSERT_ON EOF
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
    // InternalBrowserAutomation.g:549:1: ruleINSERT_ON returns [EObject current=null] : (otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( (lv_data_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleINSERT_ON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_data_2_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:555:2: ( (otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( (lv_data_2_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:556:2: (otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( (lv_data_2_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:556:2: (otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( (lv_data_2_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:557:3: otherlv_0= 'insert' ( (lv_element_1_0= ruleInsertable ) ) ( (lv_data_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getINSERT_ONAccess().getInsertKeyword_0());
            		
            // InternalBrowserAutomation.g:561:3: ( (lv_element_1_0= ruleInsertable ) )
            // InternalBrowserAutomation.g:562:4: (lv_element_1_0= ruleInsertable )
            {
            // InternalBrowserAutomation.g:562:4: (lv_element_1_0= ruleInsertable )
            // InternalBrowserAutomation.g:563:5: lv_element_1_0= ruleInsertable
            {

            					newCompositeNode(grammarAccess.getINSERT_ONAccess().getElementInsertableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            // InternalBrowserAutomation.g:580:3: ( (lv_data_2_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:581:4: (lv_data_2_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:581:4: (lv_data_2_0= RULE_STRING )
            // InternalBrowserAutomation.g:582:5: lv_data_2_0= RULE_STRING
            {
            lv_data_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_data_2_0, grammarAccess.getINSERT_ONAccess().getDataSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getINSERT_ONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"data",
            						lv_data_2_0,
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
    // $ANTLR end "ruleINSERT_ON"


    // $ANTLR start "entryRuleCHECK_BOXE"
    // InternalBrowserAutomation.g:602:1: entryRuleCHECK_BOXE returns [EObject current=null] : iv_ruleCHECK_BOXE= ruleCHECK_BOXE EOF ;
    public final EObject entryRuleCHECK_BOXE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHECK_BOXE = null;


        try {
            // InternalBrowserAutomation.g:602:51: (iv_ruleCHECK_BOXE= ruleCHECK_BOXE EOF )
            // InternalBrowserAutomation.g:603:2: iv_ruleCHECK_BOXE= ruleCHECK_BOXE EOF
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
    // InternalBrowserAutomation.g:609:1: ruleCHECK_BOXE returns [EObject current=null] : (otherlv_0= 'check' ( (lv_element_1_0= ruleCHECKBOX ) ) ruleBOOL ) ;
    public final EObject ruleCHECK_BOXE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:615:2: ( (otherlv_0= 'check' ( (lv_element_1_0= ruleCHECKBOX ) ) ruleBOOL ) )
            // InternalBrowserAutomation.g:616:2: (otherlv_0= 'check' ( (lv_element_1_0= ruleCHECKBOX ) ) ruleBOOL )
            {
            // InternalBrowserAutomation.g:616:2: (otherlv_0= 'check' ( (lv_element_1_0= ruleCHECKBOX ) ) ruleBOOL )
            // InternalBrowserAutomation.g:617:3: otherlv_0= 'check' ( (lv_element_1_0= ruleCHECKBOX ) ) ruleBOOL
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCHECK_BOXEAccess().getCheckKeyword_0());
            		
            // InternalBrowserAutomation.g:621:3: ( (lv_element_1_0= ruleCHECKBOX ) )
            // InternalBrowserAutomation.g:622:4: (lv_element_1_0= ruleCHECKBOX )
            {
            // InternalBrowserAutomation.g:622:4: (lv_element_1_0= ruleCHECKBOX )
            // InternalBrowserAutomation.g:623:5: lv_element_1_0= ruleCHECKBOX
            {

            					newCompositeNode(grammarAccess.getCHECK_BOXEAccess().getElementCHECKBOXParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_element_1_0=ruleCHECKBOX();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCHECK_BOXERule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_1_0,
            						"org.xtext.imt.browserautomation.BrowserAutomation.CHECKBOX");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getCHECK_BOXEAccess().getBOOLParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

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
    // InternalBrowserAutomation.g:651:1: entryRuleCHOOSE_COMBOBOX returns [EObject current=null] : iv_ruleCHOOSE_COMBOBOX= ruleCHOOSE_COMBOBOX EOF ;
    public final EObject entryRuleCHOOSE_COMBOBOX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHOOSE_COMBOBOX = null;


        try {
            // InternalBrowserAutomation.g:651:56: (iv_ruleCHOOSE_COMBOBOX= ruleCHOOSE_COMBOBOX EOF )
            // InternalBrowserAutomation.g:652:2: iv_ruleCHOOSE_COMBOBOX= ruleCHOOSE_COMBOBOX EOF
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
    // InternalBrowserAutomation.g:658:1: ruleCHOOSE_COMBOBOX returns [EObject current=null] : (otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= 'STRING' ) ) otherlv_4= '}' ) ;
    public final EObject ruleCHOOSE_COMBOBOX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_data_3_0=null;
        Token otherlv_4=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:664:2: ( (otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= 'STRING' ) ) otherlv_4= '}' ) )
            // InternalBrowserAutomation.g:665:2: (otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= 'STRING' ) ) otherlv_4= '}' )
            {
            // InternalBrowserAutomation.g:665:2: (otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= 'STRING' ) ) otherlv_4= '}' )
            // InternalBrowserAutomation.g:666:3: otherlv_0= 'choosecombo' ( (lv_element_1_0= ruleCOMBOBOX ) ) otherlv_2= '{' ( (lv_data_3_0= 'STRING' ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCHOOSE_COMBOBOXAccess().getChoosecomboKeyword_0());
            		
            // InternalBrowserAutomation.g:670:3: ( (lv_element_1_0= ruleCOMBOBOX ) )
            // InternalBrowserAutomation.g:671:4: (lv_element_1_0= ruleCOMBOBOX )
            {
            // InternalBrowserAutomation.g:671:4: (lv_element_1_0= ruleCOMBOBOX )
            // InternalBrowserAutomation.g:672:5: lv_element_1_0= ruleCOMBOBOX
            {

            					newCompositeNode(grammarAccess.getCHOOSE_COMBOBOXAccess().getElementCOMBOBOXParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCHOOSE_COMBOBOXAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBrowserAutomation.g:693:3: ( (lv_data_3_0= 'STRING' ) )
            // InternalBrowserAutomation.g:694:4: (lv_data_3_0= 'STRING' )
            {
            // InternalBrowserAutomation.g:694:4: (lv_data_3_0= 'STRING' )
            // InternalBrowserAutomation.g:695:5: lv_data_3_0= 'STRING'
            {
            lv_data_3_0=(Token)match(input,28,FOLLOW_17); 

            					newLeafNode(lv_data_3_0, grammarAccess.getCHOOSE_COMBOBOXAccess().getDataSTRINGKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCHOOSE_COMBOBOXRule());
            					}
            					setWithLastConsumed(current, "data", lv_data_3_0, "STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:715:1: entryRuleREAD_ON returns [EObject current=null] : iv_ruleREAD_ON= ruleREAD_ON EOF ;
    public final EObject entryRuleREAD_ON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREAD_ON = null;


        try {
            // InternalBrowserAutomation.g:715:48: (iv_ruleREAD_ON= ruleREAD_ON EOF )
            // InternalBrowserAutomation.g:716:2: iv_ruleREAD_ON= ruleREAD_ON EOF
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
    // InternalBrowserAutomation.g:722:1: ruleREAD_ON returns [EObject current=null] : (otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) ) ) ;
    public final EObject ruleREAD_ON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:728:2: ( (otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) ) ) )
            // InternalBrowserAutomation.g:729:2: (otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) ) )
            {
            // InternalBrowserAutomation.g:729:2: (otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) ) )
            // InternalBrowserAutomation.g:730:3: otherlv_0= 'read' ( (lv_element_1_0= ruleReadable ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getREAD_ONAccess().getReadKeyword_0());
            		
            // InternalBrowserAutomation.g:734:3: ( (lv_element_1_0= ruleReadable ) )
            // InternalBrowserAutomation.g:735:4: (lv_element_1_0= ruleReadable )
            {
            // InternalBrowserAutomation.g:735:4: (lv_element_1_0= ruleReadable )
            // InternalBrowserAutomation.g:736:5: lv_element_1_0= ruleReadable
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
    // InternalBrowserAutomation.g:757:1: entryRuleReadable returns [EObject current=null] : iv_ruleReadable= ruleReadable EOF ;
    public final EObject entryRuleReadable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadable = null;


        try {
            // InternalBrowserAutomation.g:757:49: (iv_ruleReadable= ruleReadable EOF )
            // InternalBrowserAutomation.g:758:2: iv_ruleReadable= ruleReadable EOF
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
    // InternalBrowserAutomation.g:764:1: ruleReadable returns [EObject current=null] : (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK ) ;
    public final EObject ruleReadable() throws RecognitionException {
        EObject current = null;

        EObject this_TEXT_0 = null;

        EObject this_BUTTON_1 = null;

        EObject this_LINK_2 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:770:2: ( (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK ) )
            // InternalBrowserAutomation.g:771:2: (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK )
            {
            // InternalBrowserAutomation.g:771:2: (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 36:
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
                    // InternalBrowserAutomation.g:772:3: this_TEXT_0= ruleTEXT
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
                    // InternalBrowserAutomation.g:781:3: this_BUTTON_1= ruleBUTTON
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
                    // InternalBrowserAutomation.g:790:3: this_LINK_2= ruleLINK
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
    // InternalBrowserAutomation.g:802:1: entryRuleInsertable returns [EObject current=null] : iv_ruleInsertable= ruleInsertable EOF ;
    public final EObject entryRuleInsertable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertable = null;


        try {
            // InternalBrowserAutomation.g:802:51: (iv_ruleInsertable= ruleInsertable EOF )
            // InternalBrowserAutomation.g:803:2: iv_ruleInsertable= ruleInsertable EOF
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
    // InternalBrowserAutomation.g:809:1: ruleInsertable returns [EObject current=null] : this_SEARCH_FIELD_0= ruleSEARCH_FIELD ;
    public final EObject ruleInsertable() throws RecognitionException {
        EObject current = null;

        EObject this_SEARCH_FIELD_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:815:2: (this_SEARCH_FIELD_0= ruleSEARCH_FIELD )
            // InternalBrowserAutomation.g:816:2: this_SEARCH_FIELD_0= ruleSEARCH_FIELD
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
    // InternalBrowserAutomation.g:827:1: entryRuleVerifiable returns [EObject current=null] : iv_ruleVerifiable= ruleVerifiable EOF ;
    public final EObject entryRuleVerifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifiable = null;


        try {
            // InternalBrowserAutomation.g:827:51: (iv_ruleVerifiable= ruleVerifiable EOF )
            // InternalBrowserAutomation.g:828:2: iv_ruleVerifiable= ruleVerifiable EOF
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
    // InternalBrowserAutomation.g:834:1: ruleVerifiable returns [EObject current=null] : (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK | this_IMAGE_3= ruleIMAGE ) ;
    public final EObject ruleVerifiable() throws RecognitionException {
        EObject current = null;

        EObject this_TEXT_0 = null;

        EObject this_BUTTON_1 = null;

        EObject this_LINK_2 = null;

        EObject this_IMAGE_3 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:840:2: ( (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK | this_IMAGE_3= ruleIMAGE ) )
            // InternalBrowserAutomation.g:841:2: (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK | this_IMAGE_3= ruleIMAGE )
            {
            // InternalBrowserAutomation.g:841:2: (this_TEXT_0= ruleTEXT | this_BUTTON_1= ruleBUTTON | this_LINK_2= ruleLINK | this_IMAGE_3= ruleIMAGE )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt7=1;
                }
                break;
            case 35:
                {
                alt7=2;
                }
                break;
            case 36:
                {
                alt7=3;
                }
                break;
            case 37:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBrowserAutomation.g:842:3: this_TEXT_0= ruleTEXT
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
                    // InternalBrowserAutomation.g:851:3: this_BUTTON_1= ruleBUTTON
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
                    // InternalBrowserAutomation.g:860:3: this_LINK_2= ruleLINK
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
                    // InternalBrowserAutomation.g:869:3: this_IMAGE_3= ruleIMAGE
                    {

                    			newCompositeNode(grammarAccess.getVerifiableAccess().getIMAGEParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IMAGE_3=ruleIMAGE();

                    state._fsp--;


                    			current = this_IMAGE_3;
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
    // InternalBrowserAutomation.g:881:1: entryRuleClickable returns [EObject current=null] : iv_ruleClickable= ruleClickable EOF ;
    public final EObject entryRuleClickable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickable = null;


        try {
            // InternalBrowserAutomation.g:881:50: (iv_ruleClickable= ruleClickable EOF )
            // InternalBrowserAutomation.g:882:2: iv_ruleClickable= ruleClickable EOF
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
    // InternalBrowserAutomation.g:888:1: ruleClickable returns [EObject current=null] : (this_BUTTON_0= ruleBUTTON | this_LINK_1= ruleLINK | this_IMAGE_2= ruleIMAGE | this_COMBOBOX_3= ruleCOMBOBOX ) ;
    public final EObject ruleClickable() throws RecognitionException {
        EObject current = null;

        EObject this_BUTTON_0 = null;

        EObject this_LINK_1 = null;

        EObject this_IMAGE_2 = null;

        EObject this_COMBOBOX_3 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:894:2: ( (this_BUTTON_0= ruleBUTTON | this_LINK_1= ruleLINK | this_IMAGE_2= ruleIMAGE | this_COMBOBOX_3= ruleCOMBOBOX ) )
            // InternalBrowserAutomation.g:895:2: (this_BUTTON_0= ruleBUTTON | this_LINK_1= ruleLINK | this_IMAGE_2= ruleIMAGE | this_COMBOBOX_3= ruleCOMBOBOX )
            {
            // InternalBrowserAutomation.g:895:2: (this_BUTTON_0= ruleBUTTON | this_LINK_1= ruleLINK | this_IMAGE_2= ruleIMAGE | this_COMBOBOX_3= ruleCOMBOBOX )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case 36:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            case 31:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBrowserAutomation.g:896:3: this_BUTTON_0= ruleBUTTON
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
                    // InternalBrowserAutomation.g:905:3: this_LINK_1= ruleLINK
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
                    // InternalBrowserAutomation.g:914:3: this_IMAGE_2= ruleIMAGE
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
                    // InternalBrowserAutomation.g:923:3: this_COMBOBOX_3= ruleCOMBOBOX
                    {

                    			newCompositeNode(grammarAccess.getClickableAccess().getCOMBOBOXParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_COMBOBOX_3=ruleCOMBOBOX();

                    state._fsp--;


                    			current = this_COMBOBOX_3;
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
    // InternalBrowserAutomation.g:935:1: entryRuleCOMBOBOX returns [EObject current=null] : iv_ruleCOMBOBOX= ruleCOMBOBOX EOF ;
    public final EObject entryRuleCOMBOBOX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOMBOBOX = null;


        try {
            // InternalBrowserAutomation.g:935:49: (iv_ruleCOMBOBOX= ruleCOMBOBOX EOF )
            // InternalBrowserAutomation.g:936:2: iv_ruleCOMBOBOX= ruleCOMBOBOX EOF
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
    // InternalBrowserAutomation.g:942:1: ruleCOMBOBOX returns [EObject current=null] : (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCOMBOBOX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:948:2: ( (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:949:2: (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:949:2: (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:950:3: otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCOMBOBOXAccess().getComboboxKeyword_0());
            		
            // InternalBrowserAutomation.g:954:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:955:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:955:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:956:5: lv_name_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:976:1: entryRuleCHECKBOX returns [EObject current=null] : iv_ruleCHECKBOX= ruleCHECKBOX EOF ;
    public final EObject entryRuleCHECKBOX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHECKBOX = null;


        try {
            // InternalBrowserAutomation.g:976:49: (iv_ruleCHECKBOX= ruleCHECKBOX EOF )
            // InternalBrowserAutomation.g:977:2: iv_ruleCHECKBOX= ruleCHECKBOX EOF
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
    // InternalBrowserAutomation.g:983:1: ruleCHECKBOX returns [EObject current=null] : (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCHECKBOX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:989:2: ( (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:990:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:990:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:991:3: otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCHECKBOXAccess().getCheckboxKeyword_0());
            		
            // InternalBrowserAutomation.g:995:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:996:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:996:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:997:5: lv_name_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:1017:1: entryRuleSEARCH_FIELD returns [EObject current=null] : iv_ruleSEARCH_FIELD= ruleSEARCH_FIELD EOF ;
    public final EObject entryRuleSEARCH_FIELD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEARCH_FIELD = null;


        try {
            // InternalBrowserAutomation.g:1017:53: (iv_ruleSEARCH_FIELD= ruleSEARCH_FIELD EOF )
            // InternalBrowserAutomation.g:1018:2: iv_ruleSEARCH_FIELD= ruleSEARCH_FIELD EOF
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
    // InternalBrowserAutomation.g:1024:1: ruleSEARCH_FIELD returns [EObject current=null] : (otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSEARCH_FIELD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1030:2: ( (otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1031:2: (otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1031:2: (otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1032:3: otherlv_0= 'searchfield' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSEARCH_FIELDAccess().getSearchfieldKeyword_0());
            		
            // InternalBrowserAutomation.g:1036:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1037:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1037:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1038:5: lv_name_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:1058:1: entryRuleTEXT returns [EObject current=null] : iv_ruleTEXT= ruleTEXT EOF ;
    public final EObject entryRuleTEXT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTEXT = null;


        try {
            // InternalBrowserAutomation.g:1058:45: (iv_ruleTEXT= ruleTEXT EOF )
            // InternalBrowserAutomation.g:1059:2: iv_ruleTEXT= ruleTEXT EOF
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
    // InternalBrowserAutomation.g:1065:1: ruleTEXT returns [EObject current=null] : (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTEXT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1071:2: ( (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1072:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1072:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1073:3: otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTEXTAccess().getTextKeyword_0());
            		
            // InternalBrowserAutomation.g:1077:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1078:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1078:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1079:5: lv_name_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:1099:1: entryRuleBUTTON returns [EObject current=null] : iv_ruleBUTTON= ruleBUTTON EOF ;
    public final EObject entryRuleBUTTON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBUTTON = null;


        try {
            // InternalBrowserAutomation.g:1099:47: (iv_ruleBUTTON= ruleBUTTON EOF )
            // InternalBrowserAutomation.g:1100:2: iv_ruleBUTTON= ruleBUTTON EOF
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
    // InternalBrowserAutomation.g:1106:1: ruleBUTTON returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBUTTON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1112:2: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1113:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1113:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1114:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBUTTONAccess().getButtonKeyword_0());
            		
            // InternalBrowserAutomation.g:1118:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1119:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1119:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1120:5: lv_name_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:1140:1: entryRuleLINK returns [EObject current=null] : iv_ruleLINK= ruleLINK EOF ;
    public final EObject entryRuleLINK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLINK = null;


        try {
            // InternalBrowserAutomation.g:1140:45: (iv_ruleLINK= ruleLINK EOF )
            // InternalBrowserAutomation.g:1141:2: iv_ruleLINK= ruleLINK EOF
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
    // InternalBrowserAutomation.g:1147:1: ruleLINK returns [EObject current=null] : (otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLINK() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1153:2: ( (otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1154:2: (otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1154:2: (otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1155:3: otherlv_0= 'link' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLINKAccess().getLinkKeyword_0());
            		
            // InternalBrowserAutomation.g:1159:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1160:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1160:4: (lv_url_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1161:5: lv_url_1_0= RULE_STRING
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
    // InternalBrowserAutomation.g:1181:1: entryRuleIMAGE returns [EObject current=null] : iv_ruleIMAGE= ruleIMAGE EOF ;
    public final EObject entryRuleIMAGE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIMAGE = null;


        try {
            // InternalBrowserAutomation.g:1181:46: (iv_ruleIMAGE= ruleIMAGE EOF )
            // InternalBrowserAutomation.g:1182:2: iv_ruleIMAGE= ruleIMAGE EOF
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
    // InternalBrowserAutomation.g:1188:1: ruleIMAGE returns [EObject current=null] : (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_param_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleIMAGE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_param_2_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:1194:2: ( (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_param_2_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:1195:2: (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_param_2_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:1195:2: (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_param_2_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:1196:3: otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_param_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIMAGEAccess().getImageKeyword_0());
            		
            // InternalBrowserAutomation.g:1200:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1201:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1201:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1202:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

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

            // InternalBrowserAutomation.g:1218:3: ( (lv_param_2_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1219:4: (lv_param_2_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1219:4: (lv_param_2_0= RULE_STRING )
            // InternalBrowserAutomation.g:1220:5: lv_param_2_0= RULE_STRING
            {
            lv_param_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_param_2_0, grammarAccess.getIMAGEAccess().getParamSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIMAGERule());
            					}
            					setWithLastConsumed(
            						current,
            						"param",
            						lv_param_2_0,
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
    // $ANTLR end "ruleIMAGE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000047F01000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000003880000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001C00000000L});

}