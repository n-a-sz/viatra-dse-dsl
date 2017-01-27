package org.eclipse.viatra.dse.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.viatra.dse.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ExecutionModel'", "':'", "'packageName'", "'configurations'", "'('", "','", "')'", "'runs'", "'dseproblemcomponents'", "';'", "'Problem'", "'imports'", "'Configuration'", "'Constraint'", "'InitialModel'", "'MetaModel'", "'objectives'", "'Rules'", "'StateCoder'", "'SolutionStore'", "'maxNumberOfThreads'", "'='", "'dseproblems'", "'Strategy'", "'BaseObjective'", "'Rule'", "'.'", "'()'", "'ConstraintsObjective'", "'hardConstraints'", "'softConstraints'", "'acceptAnySolutions'", "'storeBestSolutionsOnly'", "'logSolutionsWhenFound'", "'registerSolutionFoundHandler'", "'DseImport'", "'EvolutionaryStrategyBuilder'", "'crossOvers'", "'mutations'", "'Type'", "'Mutation'", "'-'", "'E'", "'e'", "'DfsStrategy'", "'BfsStrategy'", "'FixedPriorityStrategy'", "'HillClimbingStrategy'", "'HIGHER_IS_BETTER'", "'LOWER_IS_BETTER'", "'DIFFERENCE_TO_ZERO_IS_BETTER'", "'MUST_HAVE_MATCH'", "'NO_MATCH'", "'Nsga2'", "'Pesa'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainModel"
    // InternalDsl.g:65:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // InternalDsl.g:65:52: (iv_ruleDomainModel= ruleDomainModel EOF )
            // InternalDsl.g:66:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalDsl.g:72:1: ruleDomainModel returns [EObject current=null] : ( (lv_type_0_0= ruleType ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( ( (lv_type_0_0= ruleType ) )* )
            // InternalDsl.g:79:2: ( (lv_type_0_0= ruleType ) )*
            {
            // InternalDsl.g:79:2: ( (lv_type_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||LA1_0==21||(LA1_0>=23 && LA1_0<=26)||(LA1_0>=29 && LA1_0<=30)||(LA1_0>=34 && LA1_0<=36)||LA1_0==39||(LA1_0>=46 && LA1_0<=47)||(LA1_0>=50 && LA1_0<=51)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:80:3: (lv_type_0_0= ruleType )
            	    {
            	    // InternalDsl.g:80:3: (lv_type_0_0= ruleType )
            	    // InternalDsl.g:81:4: lv_type_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getDomainModelAccess().getTypeTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_type_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"type",
            	    					lv_type_0_0,
            	    					"org.eclipse.viatra.dse.Dsl.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleDseExecutionModel"
    // InternalDsl.g:101:1: entryRuleDseExecutionModel returns [EObject current=null] : iv_ruleDseExecutionModel= ruleDseExecutionModel EOF ;
    public final EObject entryRuleDseExecutionModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDseExecutionModel = null;


        try {
            // InternalDsl.g:101:58: (iv_ruleDseExecutionModel= ruleDseExecutionModel EOF )
            // InternalDsl.g:102:2: iv_ruleDseExecutionModel= ruleDseExecutionModel EOF
            {
             newCompositeNode(grammarAccess.getDseExecutionModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDseExecutionModel=ruleDseExecutionModel();

            state._fsp--;

             current =iv_ruleDseExecutionModel; 
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
    // $ANTLR end "entryRuleDseExecutionModel"


    // $ANTLR start "ruleDseExecutionModel"
    // InternalDsl.g:108:1: ruleDseExecutionModel returns [EObject current=null] : ( () otherlv_1= 'ExecutionModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'packageName' ( (lv_packageName_5_0= ruleEString ) ) )? (otherlv_6= 'configurations' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) )* (otherlv_13= 'runs' ( (lv_numberOfRuns_14_0= ruleEInt ) ) )? (otherlv_15= 'dseproblemcomponents' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= ';' ) ;
    public final EObject ruleDseExecutionModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_packageName_5_0 = null;

        AntlrDatatypeRuleToken lv_numberOfRuns_14_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:114:2: ( ( () otherlv_1= 'ExecutionModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'packageName' ( (lv_packageName_5_0= ruleEString ) ) )? (otherlv_6= 'configurations' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) )* (otherlv_13= 'runs' ( (lv_numberOfRuns_14_0= ruleEInt ) ) )? (otherlv_15= 'dseproblemcomponents' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= ';' ) )
            // InternalDsl.g:115:2: ( () otherlv_1= 'ExecutionModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'packageName' ( (lv_packageName_5_0= ruleEString ) ) )? (otherlv_6= 'configurations' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) )* (otherlv_13= 'runs' ( (lv_numberOfRuns_14_0= ruleEInt ) ) )? (otherlv_15= 'dseproblemcomponents' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= ';' )
            {
            // InternalDsl.g:115:2: ( () otherlv_1= 'ExecutionModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'packageName' ( (lv_packageName_5_0= ruleEString ) ) )? (otherlv_6= 'configurations' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) )* (otherlv_13= 'runs' ( (lv_numberOfRuns_14_0= ruleEInt ) ) )? (otherlv_15= 'dseproblemcomponents' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= ';' )
            // InternalDsl.g:116:3: () otherlv_1= 'ExecutionModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'packageName' ( (lv_packageName_5_0= ruleEString ) ) )? (otherlv_6= 'configurations' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) )* (otherlv_13= 'runs' ( (lv_numberOfRuns_14_0= ruleEInt ) ) )? (otherlv_15= 'dseproblemcomponents' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= ';'
            {
            // InternalDsl.g:116:3: ()
            // InternalDsl.g:117:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDseExecutionModelAccess().getDseExecutionModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDseExecutionModelAccess().getExecutionModelKeyword_1());
            		
            // InternalDsl.g:127:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:128:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:128:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:129:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDseExecutionModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDseExecutionModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDseExecutionModelAccess().getColonKeyword_3());
            		
            // InternalDsl.g:149:3: (otherlv_4= 'packageName' ( (lv_packageName_5_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:150:4: otherlv_4= 'packageName' ( (lv_packageName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getDseExecutionModelAccess().getPackageNameKeyword_4_0());
                    			
                    // InternalDsl.g:154:4: ( (lv_packageName_5_0= ruleEString ) )
                    // InternalDsl.g:155:5: (lv_packageName_5_0= ruleEString )
                    {
                    // InternalDsl.g:155:5: (lv_packageName_5_0= ruleEString )
                    // InternalDsl.g:156:6: lv_packageName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDseExecutionModelAccess().getPackageNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_packageName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDseExecutionModelRule());
                    						}
                    						set(
                    							current,
                    							"packageName",
                    							lv_packageName_5_0,
                    							"org.eclipse.viatra.dse.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:174:3: (otherlv_6= 'configurations' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:175:4: otherlv_6= 'configurations' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getDseExecutionModelAccess().getConfigurationsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getDseExecutionModelAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDsl.g:183:4: ( ( ruleEString ) )
                    // InternalDsl.g:184:5: ( ruleEString )
                    {
                    // InternalDsl.g:184:5: ( ruleEString )
                    // InternalDsl.g:185:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDseExecutionModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDseExecutionModelAccess().getConfigurationsConfigurationCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:199:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDsl.g:200:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDseExecutionModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:204:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:205:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:205:6: ( ruleEString )
                    	    // InternalDsl.g:206:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDseExecutionModelRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDseExecutionModelAccess().getConfigurationsConfigurationCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getDseExecutionModelAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:226:3: ( (otherlv_12= RULE_ID ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:227:4: (otherlv_12= RULE_ID )
            	    {
            	    // InternalDsl.g:227:4: (otherlv_12= RULE_ID )
            	    // InternalDsl.g:228:5: otherlv_12= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDseExecutionModelRule());
            	    					}
            	    				
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    					newLeafNode(otherlv_12, grammarAccess.getDseExecutionModelAccess().getDseproblemsDseProblemCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalDsl.g:239:3: (otherlv_13= 'runs' ( (lv_numberOfRuns_14_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:240:4: otherlv_13= 'runs' ( (lv_numberOfRuns_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getDseExecutionModelAccess().getRunsKeyword_7_0());
                    			
                    // InternalDsl.g:244:4: ( (lv_numberOfRuns_14_0= ruleEInt ) )
                    // InternalDsl.g:245:5: (lv_numberOfRuns_14_0= ruleEInt )
                    {
                    // InternalDsl.g:245:5: (lv_numberOfRuns_14_0= ruleEInt )
                    // InternalDsl.g:246:6: lv_numberOfRuns_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDseExecutionModelAccess().getNumberOfRunsEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_numberOfRuns_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDseExecutionModelRule());
                    						}
                    						set(
                    							current,
                    							"numberOfRuns",
                    							lv_numberOfRuns_14_0,
                    							"org.eclipse.viatra.dse.Dsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:264:3: (otherlv_15= 'dseproblemcomponents' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:265:4: otherlv_15= 'dseproblemcomponents' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getDseExecutionModelAccess().getDseproblemcomponentsKeyword_8_0());
                    			
                    otherlv_16=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getDseExecutionModelAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalDsl.g:273:4: ( ( ruleEString ) )
                    // InternalDsl.g:274:5: ( ruleEString )
                    {
                    // InternalDsl.g:274:5: ( ruleEString )
                    // InternalDsl.g:275:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDseExecutionModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDseExecutionModelAccess().getDseproblemcomponentsDseProblemComponentCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:289:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDsl.g:290:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDseExecutionModelAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalDsl.g:294:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:295:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:295:6: ( ruleEString )
                    	    // InternalDsl.g:296:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDseExecutionModelRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDseExecutionModelAccess().getDseproblemcomponentsDseProblemComponentCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getDseExecutionModelAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getDseExecutionModelAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleDseExecutionModel"


    // $ANTLR start "entryRuleDseProblem"
    // InternalDsl.g:324:1: entryRuleDseProblem returns [EObject current=null] : iv_ruleDseProblem= ruleDseProblem EOF ;
    public final EObject entryRuleDseProblem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDseProblem = null;


        try {
            // InternalDsl.g:324:51: (iv_ruleDseProblem= ruleDseProblem EOF )
            // InternalDsl.g:325:2: iv_ruleDseProblem= ruleDseProblem EOF
            {
             newCompositeNode(grammarAccess.getDseProblemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDseProblem=ruleDseProblem();

            state._fsp--;

             current =iv_ruleDseProblem; 
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
    // $ANTLR end "entryRuleDseProblem"


    // $ANTLR start "ruleDseProblem"
    // InternalDsl.g:331:1: ruleDseProblem returns [EObject current=null] : (otherlv_0= 'Problem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'imports' otherlv_4= ':' ( (lv_imports_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_imports_7_0= ruleEString ) ) )* (otherlv_8= ';' )? )? (otherlv_9= 'Configuration' otherlv_10= ':' ( ( ruleEString ) ) )? (otherlv_12= 'Constraint' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'InitialModel' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'MetaModel' otherlv_21= ':' ( ( ruleEString ) ) )? otherlv_23= 'objectives' otherlv_24= ':' ( ( ruleEString ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= 'Rules' otherlv_29= ':' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* (otherlv_33= 'StateCoder' otherlv_34= ':' ( (otherlv_35= RULE_ID ) ) )? (otherlv_36= 'SolutionStore' otherlv_37= ':' ( (otherlv_38= RULE_ID ) ) )? otherlv_39= ';' ) ;
    public final EObject ruleDseProblem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        AntlrDatatypeRuleToken lv_imports_5_0 = null;

        AntlrDatatypeRuleToken lv_imports_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:337:2: ( (otherlv_0= 'Problem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'imports' otherlv_4= ':' ( (lv_imports_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_imports_7_0= ruleEString ) ) )* (otherlv_8= ';' )? )? (otherlv_9= 'Configuration' otherlv_10= ':' ( ( ruleEString ) ) )? (otherlv_12= 'Constraint' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'InitialModel' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'MetaModel' otherlv_21= ':' ( ( ruleEString ) ) )? otherlv_23= 'objectives' otherlv_24= ':' ( ( ruleEString ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= 'Rules' otherlv_29= ':' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* (otherlv_33= 'StateCoder' otherlv_34= ':' ( (otherlv_35= RULE_ID ) ) )? (otherlv_36= 'SolutionStore' otherlv_37= ':' ( (otherlv_38= RULE_ID ) ) )? otherlv_39= ';' ) )
            // InternalDsl.g:338:2: (otherlv_0= 'Problem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'imports' otherlv_4= ':' ( (lv_imports_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_imports_7_0= ruleEString ) ) )* (otherlv_8= ';' )? )? (otherlv_9= 'Configuration' otherlv_10= ':' ( ( ruleEString ) ) )? (otherlv_12= 'Constraint' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'InitialModel' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'MetaModel' otherlv_21= ':' ( ( ruleEString ) ) )? otherlv_23= 'objectives' otherlv_24= ':' ( ( ruleEString ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= 'Rules' otherlv_29= ':' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* (otherlv_33= 'StateCoder' otherlv_34= ':' ( (otherlv_35= RULE_ID ) ) )? (otherlv_36= 'SolutionStore' otherlv_37= ':' ( (otherlv_38= RULE_ID ) ) )? otherlv_39= ';' )
            {
            // InternalDsl.g:338:2: (otherlv_0= 'Problem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'imports' otherlv_4= ':' ( (lv_imports_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_imports_7_0= ruleEString ) ) )* (otherlv_8= ';' )? )? (otherlv_9= 'Configuration' otherlv_10= ':' ( ( ruleEString ) ) )? (otherlv_12= 'Constraint' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'InitialModel' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'MetaModel' otherlv_21= ':' ( ( ruleEString ) ) )? otherlv_23= 'objectives' otherlv_24= ':' ( ( ruleEString ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= 'Rules' otherlv_29= ':' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* (otherlv_33= 'StateCoder' otherlv_34= ':' ( (otherlv_35= RULE_ID ) ) )? (otherlv_36= 'SolutionStore' otherlv_37= ':' ( (otherlv_38= RULE_ID ) ) )? otherlv_39= ';' )
            // InternalDsl.g:339:3: otherlv_0= 'Problem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'imports' otherlv_4= ':' ( (lv_imports_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_imports_7_0= ruleEString ) ) )* (otherlv_8= ';' )? )? (otherlv_9= 'Configuration' otherlv_10= ':' ( ( ruleEString ) ) )? (otherlv_12= 'Constraint' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'InitialModel' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'MetaModel' otherlv_21= ':' ( ( ruleEString ) ) )? otherlv_23= 'objectives' otherlv_24= ':' ( ( ruleEString ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= 'Rules' otherlv_29= ':' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* (otherlv_33= 'StateCoder' otherlv_34= ':' ( (otherlv_35= RULE_ID ) ) )? (otherlv_36= 'SolutionStore' otherlv_37= ':' ( (otherlv_38= RULE_ID ) ) )? otherlv_39= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDseProblemAccess().getProblemKeyword_0());
            		
            // InternalDsl.g:343:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:344:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:344:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:345:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDseProblemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDseProblemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDseProblemAccess().getColonKeyword_2());
            		
            // InternalDsl.g:365:3: (otherlv_3= 'imports' otherlv_4= ':' ( (lv_imports_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_imports_7_0= ruleEString ) ) )* (otherlv_8= ';' )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:366:4: otherlv_3= 'imports' otherlv_4= ':' ( (lv_imports_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_imports_7_0= ruleEString ) ) )* (otherlv_8= ';' )?
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getDseProblemAccess().getImportsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getDseProblemAccess().getColonKeyword_3_1());
                    			
                    // InternalDsl.g:374:4: ( (lv_imports_5_0= ruleEString ) )
                    // InternalDsl.g:375:5: (lv_imports_5_0= ruleEString )
                    {
                    // InternalDsl.g:375:5: (lv_imports_5_0= ruleEString )
                    // InternalDsl.g:376:6: lv_imports_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDseProblemAccess().getImportsEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_imports_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDseProblemRule());
                    						}
                    						add(
                    							current,
                    							"imports",
                    							lv_imports_5_0,
                    							"org.eclipse.viatra.dse.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:393:4: (otherlv_6= ',' ( (lv_imports_7_0= ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDsl.g:394:5: otherlv_6= ',' ( (lv_imports_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDseProblemAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:398:5: ( (lv_imports_7_0= ruleEString ) )
                    	    // InternalDsl.g:399:6: (lv_imports_7_0= ruleEString )
                    	    {
                    	    // InternalDsl.g:399:6: (lv_imports_7_0= ruleEString )
                    	    // InternalDsl.g:400:7: lv_imports_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getDseProblemAccess().getImportsEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_imports_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDseProblemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"imports",
                    	    								lv_imports_7_0,
                    	    								"org.eclipse.viatra.dse.Dsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // InternalDsl.g:418:4: (otherlv_8= ';' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==20) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalDsl.g:419:5: otherlv_8= ';'
                            {
                            otherlv_8=(Token)match(input,20,FOLLOW_17); 

                            					newLeafNode(otherlv_8, grammarAccess.getDseProblemAccess().getSemicolonKeyword_3_4());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalDsl.g:425:3: (otherlv_9= 'Configuration' otherlv_10= ':' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:426:4: otherlv_9= 'Configuration' otherlv_10= ':' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getDseProblemAccess().getConfigurationKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getDseProblemAccess().getColonKeyword_4_1());
                    			
                    // InternalDsl.g:434:4: ( ( ruleEString ) )
                    // InternalDsl.g:435:5: ( ruleEString )
                    {
                    // InternalDsl.g:435:5: ( ruleEString )
                    // InternalDsl.g:436:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDseProblemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDseProblemAccess().getConfigurationsConfigurationCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:451:3: (otherlv_12= 'Constraint' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:452:4: otherlv_12= 'Constraint' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getDseProblemAccess().getConstraintKeyword_5_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getDseProblemAccess().getColonKeyword_5_1());
                    			
                    // InternalDsl.g:460:4: ( (otherlv_14= RULE_ID ) )
                    // InternalDsl.g:461:5: (otherlv_14= RULE_ID )
                    {
                    // InternalDsl.g:461:5: (otherlv_14= RULE_ID )
                    // InternalDsl.g:462:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDseProblemRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_14, grammarAccess.getDseProblemAccess().getConstraintsConstraintCrossReference_5_2_0());
                    					

                    }


                    }

                    // InternalDsl.g:473:4: (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDsl.g:474:5: otherlv_15= ',' ( (otherlv_16= RULE_ID ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getDseProblemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:478:5: ( (otherlv_16= RULE_ID ) )
                    	    // InternalDsl.g:479:6: (otherlv_16= RULE_ID )
                    	    {
                    	    // InternalDsl.g:479:6: (otherlv_16= RULE_ID )
                    	    // InternalDsl.g:480:7: otherlv_16= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDseProblemRule());
                    	    							}
                    	    						
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_16, grammarAccess.getDseProblemAccess().getConstraintsConstraintCrossReference_5_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDsl.g:493:3: (otherlv_17= 'InitialModel' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:494:4: otherlv_17= 'InitialModel' otherlv_18= ':' ( (otherlv_19= RULE_ID ) )
                    {
                    otherlv_17=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getDseProblemAccess().getInitialModelKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getDseProblemAccess().getColonKeyword_6_1());
                    			
                    // InternalDsl.g:502:4: ( (otherlv_19= RULE_ID ) )
                    // InternalDsl.g:503:5: (otherlv_19= RULE_ID )
                    {
                    // InternalDsl.g:503:5: (otherlv_19= RULE_ID )
                    // InternalDsl.g:504:6: otherlv_19= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDseProblemRule());
                    						}
                    					
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_19, grammarAccess.getDseProblemAccess().getInitialmodelInitialModelCrossReference_6_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:516:3: (otherlv_20= 'MetaModel' otherlv_21= ':' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:517:4: otherlv_20= 'MetaModel' otherlv_21= ':' ( ( ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_20, grammarAccess.getDseProblemAccess().getMetaModelKeyword_7_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_21, grammarAccess.getDseProblemAccess().getColonKeyword_7_1());
                    			
                    // InternalDsl.g:525:4: ( ( ruleEString ) )
                    // InternalDsl.g:526:5: ( ruleEString )
                    {
                    // InternalDsl.g:526:5: ( ruleEString )
                    // InternalDsl.g:527:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDseProblemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDseProblemAccess().getMetamodelMetaModelCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_23, grammarAccess.getDseProblemAccess().getObjectivesKeyword_8());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_24, grammarAccess.getDseProblemAccess().getColonKeyword_9());
            		
            // InternalDsl.g:550:3: ( ( ruleEString ) )
            // InternalDsl.g:551:4: ( ruleEString )
            {
            // InternalDsl.g:551:4: ( ruleEString )
            // InternalDsl.g:552:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDseProblemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDseProblemAccess().getObjectivesBaseObjectiveCrossReference_10_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:566:3: (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:567:4: otherlv_26= ',' ( (otherlv_27= RULE_ID ) )
            	    {
            	    otherlv_26=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_26, grammarAccess.getDseProblemAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalDsl.g:571:4: ( (otherlv_27= RULE_ID ) )
            	    // InternalDsl.g:572:5: (otherlv_27= RULE_ID )
            	    {
            	    // InternalDsl.g:572:5: (otherlv_27= RULE_ID )
            	    // InternalDsl.g:573:6: otherlv_27= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDseProblemRule());
            	    						}
            	    					
            	    otherlv_27=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    						newLeafNode(otherlv_27, grammarAccess.getDseProblemAccess().getObjectivesBaseObjectiveCrossReference_11_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_28=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_28, grammarAccess.getDseProblemAccess().getRulesKeyword_12());
            		
            otherlv_29=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_29, grammarAccess.getDseProblemAccess().getColonKeyword_13());
            		
            // InternalDsl.g:593:3: ( (otherlv_30= RULE_ID ) )
            // InternalDsl.g:594:4: (otherlv_30= RULE_ID )
            {
            // InternalDsl.g:594:4: (otherlv_30= RULE_ID )
            // InternalDsl.g:595:5: otherlv_30= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDseProblemRule());
            					}
            				
            otherlv_30=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_30, grammarAccess.getDseProblemAccess().getTransformationrulesTransformationRuleCrossReference_14_0());
            				

            }


            }

            // InternalDsl.g:606:3: (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:607:4: otherlv_31= ',' ( (otherlv_32= RULE_ID ) )
            	    {
            	    otherlv_31=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_31, grammarAccess.getDseProblemAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalDsl.g:611:4: ( (otherlv_32= RULE_ID ) )
            	    // InternalDsl.g:612:5: (otherlv_32= RULE_ID )
            	    {
            	    // InternalDsl.g:612:5: (otherlv_32= RULE_ID )
            	    // InternalDsl.g:613:6: otherlv_32= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDseProblemRule());
            	    						}
            	    					
            	    otherlv_32=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(otherlv_32, grammarAccess.getDseProblemAccess().getTransformationrulesTransformationRuleCrossReference_15_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalDsl.g:625:3: (otherlv_33= 'StateCoder' otherlv_34= ':' ( (otherlv_35= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:626:4: otherlv_33= 'StateCoder' otherlv_34= ':' ( (otherlv_35= RULE_ID ) )
                    {
                    otherlv_33=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_33, grammarAccess.getDseProblemAccess().getStateCoderKeyword_16_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getDseProblemAccess().getColonKeyword_16_1());
                    			
                    // InternalDsl.g:634:4: ( (otherlv_35= RULE_ID ) )
                    // InternalDsl.g:635:5: (otherlv_35= RULE_ID )
                    {
                    // InternalDsl.g:635:5: (otherlv_35= RULE_ID )
                    // InternalDsl.g:636:6: otherlv_35= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDseProblemRule());
                    						}
                    					
                    otherlv_35=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_35, grammarAccess.getDseProblemAccess().getStatecoderStateCoderCrossReference_16_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:648:3: (otherlv_36= 'SolutionStore' otherlv_37= ':' ( (otherlv_38= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:649:4: otherlv_36= 'SolutionStore' otherlv_37= ':' ( (otherlv_38= RULE_ID ) )
                    {
                    otherlv_36=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_36, grammarAccess.getDseProblemAccess().getSolutionStoreKeyword_17_0());
                    			
                    otherlv_37=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_37, grammarAccess.getDseProblemAccess().getColonKeyword_17_1());
                    			
                    // InternalDsl.g:657:4: ( (otherlv_38= RULE_ID ) )
                    // InternalDsl.g:658:5: (otherlv_38= RULE_ID )
                    {
                    // InternalDsl.g:658:5: (otherlv_38= RULE_ID )
                    // InternalDsl.g:659:6: otherlv_38= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDseProblemRule());
                    						}
                    					
                    otherlv_38=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_38, grammarAccess.getDseProblemAccess().getSolutionstoreSolutionStoreCrossReference_17_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_39=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_39, grammarAccess.getDseProblemAccess().getSemicolonKeyword_18());
            		

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
    // $ANTLR end "ruleDseProblem"


    // $ANTLR start "entryRuleConfiguration"
    // InternalDsl.g:679:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalDsl.g:679:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalDsl.g:680:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalDsl.g:686:1: ruleConfiguration returns [EObject current=null] : ( () otherlv_1= 'Configuration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'maxNumberOfThreads' otherlv_5= '=' ( (lv_maxNumberOfThreads_6_0= ruleEInt ) ) )? (otherlv_7= 'dseproblems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? ( ( ruleEString ) )? otherlv_14= ';' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_maxNumberOfThreads_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:692:2: ( ( () otherlv_1= 'Configuration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'maxNumberOfThreads' otherlv_5= '=' ( (lv_maxNumberOfThreads_6_0= ruleEInt ) ) )? (otherlv_7= 'dseproblems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? ( ( ruleEString ) )? otherlv_14= ';' ) )
            // InternalDsl.g:693:2: ( () otherlv_1= 'Configuration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'maxNumberOfThreads' otherlv_5= '=' ( (lv_maxNumberOfThreads_6_0= ruleEInt ) ) )? (otherlv_7= 'dseproblems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? ( ( ruleEString ) )? otherlv_14= ';' )
            {
            // InternalDsl.g:693:2: ( () otherlv_1= 'Configuration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'maxNumberOfThreads' otherlv_5= '=' ( (lv_maxNumberOfThreads_6_0= ruleEInt ) ) )? (otherlv_7= 'dseproblems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? ( ( ruleEString ) )? otherlv_14= ';' )
            // InternalDsl.g:694:3: () otherlv_1= 'Configuration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'maxNumberOfThreads' otherlv_5= '=' ( (lv_maxNumberOfThreads_6_0= ruleEInt ) ) )? (otherlv_7= 'dseproblems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? ( ( ruleEString ) )? otherlv_14= ';'
            {
            // InternalDsl.g:694:3: ()
            // InternalDsl.g:695:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigurationAccess().getConfigurationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getConfigurationKeyword_1());
            		
            // InternalDsl.g:705:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:706:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:706:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:707:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConfigurationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getColonKeyword_3());
            		
            // InternalDsl.g:727:3: (otherlv_4= 'maxNumberOfThreads' otherlv_5= '=' ( (lv_maxNumberOfThreads_6_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:728:4: otherlv_4= 'maxNumberOfThreads' otherlv_5= '=' ( (lv_maxNumberOfThreads_6_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getMaxNumberOfThreadsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalDsl.g:736:4: ( (lv_maxNumberOfThreads_6_0= ruleEInt ) )
                    // InternalDsl.g:737:5: (lv_maxNumberOfThreads_6_0= ruleEInt )
                    {
                    // InternalDsl.g:737:5: (lv_maxNumberOfThreads_6_0= ruleEInt )
                    // InternalDsl.g:738:6: lv_maxNumberOfThreads_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getConfigurationAccess().getMaxNumberOfThreadsEIntParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_maxNumberOfThreads_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    						}
                    						set(
                    							current,
                    							"maxNumberOfThreads",
                    							lv_maxNumberOfThreads_6_0,
                    							"org.eclipse.viatra.dse.Dsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:756:3: (otherlv_7= 'dseproblems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:757:4: otherlv_7= 'dseproblems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getDseproblemsKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getConfigurationAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDsl.g:765:4: ( ( ruleEString ) )
                    // InternalDsl.g:766:5: ( ruleEString )
                    {
                    // InternalDsl.g:766:5: ( ruleEString )
                    // InternalDsl.g:767:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigurationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConfigurationAccess().getDseproblemsDseProblemCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:781:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalDsl.g:782:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getConfigurationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:786:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:787:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:787:6: ( ruleEString )
                    	    // InternalDsl.g:788:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConfigurationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getConfigurationAccess().getDseproblemsDseProblemCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_28); 

                    				newLeafNode(otherlv_12, grammarAccess.getConfigurationAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:808:3: ( ( ruleEString ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:809:4: ( ruleEString )
                    {
                    // InternalDsl.g:809:4: ( ruleEString )
                    // InternalDsl.g:810:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConfigurationRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getConfigurationAccess().getStrategyBaseStrategyCrossReference_6_0());
                    				
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getConfigurationAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleStrategy"
    // InternalDsl.g:832:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // InternalDsl.g:832:49: (iv_ruleStrategy= ruleStrategy EOF )
            // InternalDsl.g:833:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
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
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // InternalDsl.g:839:1: ruleStrategy returns [EObject current=null] : ( () otherlv_1= 'Strategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleStrategyType ) ) (otherlv_5= '(' ( (lv_depth_6_0= ruleEInt ) ) otherlv_7= ')' )? otherlv_8= ';' ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_depth_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:845:2: ( ( () otherlv_1= 'Strategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleStrategyType ) ) (otherlv_5= '(' ( (lv_depth_6_0= ruleEInt ) ) otherlv_7= ')' )? otherlv_8= ';' ) )
            // InternalDsl.g:846:2: ( () otherlv_1= 'Strategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleStrategyType ) ) (otherlv_5= '(' ( (lv_depth_6_0= ruleEInt ) ) otherlv_7= ')' )? otherlv_8= ';' )
            {
            // InternalDsl.g:846:2: ( () otherlv_1= 'Strategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleStrategyType ) ) (otherlv_5= '(' ( (lv_depth_6_0= ruleEInt ) ) otherlv_7= ')' )? otherlv_8= ';' )
            // InternalDsl.g:847:3: () otherlv_1= 'Strategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleStrategyType ) ) (otherlv_5= '(' ( (lv_depth_6_0= ruleEInt ) ) otherlv_7= ')' )? otherlv_8= ';'
            {
            // InternalDsl.g:847:3: ()
            // InternalDsl.g:848:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrategyAccess().getStrategyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStrategyAccess().getStrategyKeyword_1());
            		
            // InternalDsl.g:858:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:859:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:859:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:860:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStrategyAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStrategyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getStrategyAccess().getColonKeyword_3());
            		
            // InternalDsl.g:880:3: ( (lv_type_4_0= ruleStrategyType ) )
            // InternalDsl.g:881:4: (lv_type_4_0= ruleStrategyType )
            {
            // InternalDsl.g:881:4: (lv_type_4_0= ruleStrategyType )
            // InternalDsl.g:882:5: lv_type_4_0= ruleStrategyType
            {

            					newCompositeNode(grammarAccess.getStrategyAccess().getTypeStrategyTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_type_4_0=ruleStrategyType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStrategyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.eclipse.viatra.dse.Dsl.StrategyType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:899:3: (otherlv_5= '(' ( (lv_depth_6_0= ruleEInt ) ) otherlv_7= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:900:4: otherlv_5= '(' ( (lv_depth_6_0= ruleEInt ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalDsl.g:904:4: ( (lv_depth_6_0= ruleEInt ) )
                    // InternalDsl.g:905:5: (lv_depth_6_0= ruleEInt )
                    {
                    // InternalDsl.g:905:5: (lv_depth_6_0= ruleEInt )
                    // InternalDsl.g:906:6: lv_depth_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getStrategyAccess().getDepthEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_depth_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStrategyRule());
                    						}
                    						set(
                    							current,
                    							"depth",
                    							lv_depth_6_0,
                    							"org.eclipse.viatra.dse.Dsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_5_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStrategyAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleConstraint_Impl"
    // InternalDsl.g:936:1: entryRuleConstraint_Impl returns [EObject current=null] : iv_ruleConstraint_Impl= ruleConstraint_Impl EOF ;
    public final EObject entryRuleConstraint_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint_Impl = null;


        try {
            // InternalDsl.g:936:56: (iv_ruleConstraint_Impl= ruleConstraint_Impl EOF )
            // InternalDsl.g:937:2: iv_ruleConstraint_Impl= ruleConstraint_Impl EOF
            {
             newCompositeNode(grammarAccess.getConstraint_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint_Impl=ruleConstraint_Impl();

            state._fsp--;

             current =iv_ruleConstraint_Impl; 
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
    // $ANTLR end "entryRuleConstraint_Impl"


    // $ANTLR start "ruleConstraint_Impl"
    // InternalDsl.g:943:1: ruleConstraint_Impl returns [EObject current=null] : ( () otherlv_1= 'Constraint' ( (lv_constraintName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleConstraint_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_constraintName_2_0=null;


        	enterRule();

        try {
            // InternalDsl.g:949:2: ( ( () otherlv_1= 'Constraint' ( (lv_constraintName_2_0= RULE_ID ) ) ) )
            // InternalDsl.g:950:2: ( () otherlv_1= 'Constraint' ( (lv_constraintName_2_0= RULE_ID ) ) )
            {
            // InternalDsl.g:950:2: ( () otherlv_1= 'Constraint' ( (lv_constraintName_2_0= RULE_ID ) ) )
            // InternalDsl.g:951:3: () otherlv_1= 'Constraint' ( (lv_constraintName_2_0= RULE_ID ) )
            {
            // InternalDsl.g:951:3: ()
            // InternalDsl.g:952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstraint_ImplAccess().getConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraint_ImplAccess().getConstraintKeyword_1());
            		
            // InternalDsl.g:962:3: ( (lv_constraintName_2_0= RULE_ID ) )
            // InternalDsl.g:963:4: (lv_constraintName_2_0= RULE_ID )
            {
            // InternalDsl.g:963:4: (lv_constraintName_2_0= RULE_ID )
            // InternalDsl.g:964:5: lv_constraintName_2_0= RULE_ID
            {
            lv_constraintName_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_constraintName_2_0, grammarAccess.getConstraint_ImplAccess().getConstraintNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraint_ImplRule());
            					}
            					setWithLastConsumed(
            						current,
            						"constraintName",
            						lv_constraintName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleConstraint_Impl"


    // $ANTLR start "entryRuleInitialModel"
    // InternalDsl.g:984:1: entryRuleInitialModel returns [EObject current=null] : iv_ruleInitialModel= ruleInitialModel EOF ;
    public final EObject entryRuleInitialModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialModel = null;


        try {
            // InternalDsl.g:984:53: (iv_ruleInitialModel= ruleInitialModel EOF )
            // InternalDsl.g:985:2: iv_ruleInitialModel= ruleInitialModel EOF
            {
             newCompositeNode(grammarAccess.getInitialModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialModel=ruleInitialModel();

            state._fsp--;

             current =iv_ruleInitialModel; 
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
    // $ANTLR end "entryRuleInitialModel"


    // $ANTLR start "ruleInitialModel"
    // InternalDsl.g:991:1: ruleInitialModel returns [EObject current=null] : ( () otherlv_1= 'InitialModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_path_4_0= ruleEString ) )? otherlv_5= ';' ) ;
    public final EObject ruleInitialModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_path_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:997:2: ( ( () otherlv_1= 'InitialModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_path_4_0= ruleEString ) )? otherlv_5= ';' ) )
            // InternalDsl.g:998:2: ( () otherlv_1= 'InitialModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_path_4_0= ruleEString ) )? otherlv_5= ';' )
            {
            // InternalDsl.g:998:2: ( () otherlv_1= 'InitialModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_path_4_0= ruleEString ) )? otherlv_5= ';' )
            // InternalDsl.g:999:3: () otherlv_1= 'InitialModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_path_4_0= ruleEString ) )? otherlv_5= ';'
            {
            // InternalDsl.g:999:3: ()
            // InternalDsl.g:1000:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialModelAccess().getInitialModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialModelAccess().getInitialModelKeyword_1());
            		
            // InternalDsl.g:1010:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:1011:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:1011:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:1012:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInitialModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialModelAccess().getColonKeyword_3());
            		
            // InternalDsl.g:1032:3: ( (lv_path_4_0= ruleEString ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1033:4: (lv_path_4_0= ruleEString )
                    {
                    // InternalDsl.g:1033:4: (lv_path_4_0= ruleEString )
                    // InternalDsl.g:1034:5: lv_path_4_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getInitialModelAccess().getPathEStringParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_path_4_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInitialModelRule());
                    					}
                    					set(
                    						current,
                    						"path",
                    						lv_path_4_0,
                    						"org.eclipse.viatra.dse.Dsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInitialModelAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleInitialModel"


    // $ANTLR start "entryRuleMetaModel"
    // InternalDsl.g:1059:1: entryRuleMetaModel returns [EObject current=null] : iv_ruleMetaModel= ruleMetaModel EOF ;
    public final EObject entryRuleMetaModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModel = null;


        try {
            // InternalDsl.g:1059:50: (iv_ruleMetaModel= ruleMetaModel EOF )
            // InternalDsl.g:1060:2: iv_ruleMetaModel= ruleMetaModel EOF
            {
             newCompositeNode(grammarAccess.getMetaModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaModel=ruleMetaModel();

            state._fsp--;

             current =iv_ruleMetaModel; 
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
    // $ANTLR end "entryRuleMetaModel"


    // $ANTLR start "ruleMetaModel"
    // InternalDsl.g:1066:1: ruleMetaModel returns [EObject current=null] : ( () otherlv_1= 'MetaModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' ) ;
    public final EObject ruleMetaModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1072:2: ( ( () otherlv_1= 'MetaModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' ) )
            // InternalDsl.g:1073:2: ( () otherlv_1= 'MetaModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' )
            {
            // InternalDsl.g:1073:2: ( () otherlv_1= 'MetaModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' )
            // InternalDsl.g:1074:3: () otherlv_1= 'MetaModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';'
            {
            // InternalDsl.g:1074:3: ()
            // InternalDsl.g:1075:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMetaModelAccess().getMetaModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMetaModelAccess().getMetaModelKeyword_1());
            		
            // InternalDsl.g:1085:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1086:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1086:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1087:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetaModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetaModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.viatra.dse.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMetaModelAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleMetaModel"


    // $ANTLR start "entryRuleBaseObjective_Impl"
    // InternalDsl.g:1112:1: entryRuleBaseObjective_Impl returns [EObject current=null] : iv_ruleBaseObjective_Impl= ruleBaseObjective_Impl EOF ;
    public final EObject entryRuleBaseObjective_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseObjective_Impl = null;


        try {
            // InternalDsl.g:1112:59: (iv_ruleBaseObjective_Impl= ruleBaseObjective_Impl EOF )
            // InternalDsl.g:1113:2: iv_ruleBaseObjective_Impl= ruleBaseObjective_Impl EOF
            {
             newCompositeNode(grammarAccess.getBaseObjective_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseObjective_Impl=ruleBaseObjective_Impl();

            state._fsp--;

             current =iv_ruleBaseObjective_Impl; 
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
    // $ANTLR end "entryRuleBaseObjective_Impl"


    // $ANTLR start "ruleBaseObjective_Impl"
    // InternalDsl.g:1119:1: ruleBaseObjective_Impl returns [EObject current=null] : ( () otherlv_1= 'BaseObjective' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_fitnessConstraint_4_0= ruleEDouble ) )? ( (lv_comparator_5_0= ruleComparators ) )? otherlv_6= ';' ) ;
    public final EObject ruleBaseObjective_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_fitnessConstraint_4_0 = null;

        Enumerator lv_comparator_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1125:2: ( ( () otherlv_1= 'BaseObjective' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_fitnessConstraint_4_0= ruleEDouble ) )? ( (lv_comparator_5_0= ruleComparators ) )? otherlv_6= ';' ) )
            // InternalDsl.g:1126:2: ( () otherlv_1= 'BaseObjective' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_fitnessConstraint_4_0= ruleEDouble ) )? ( (lv_comparator_5_0= ruleComparators ) )? otherlv_6= ';' )
            {
            // InternalDsl.g:1126:2: ( () otherlv_1= 'BaseObjective' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_fitnessConstraint_4_0= ruleEDouble ) )? ( (lv_comparator_5_0= ruleComparators ) )? otherlv_6= ';' )
            // InternalDsl.g:1127:3: () otherlv_1= 'BaseObjective' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_fitnessConstraint_4_0= ruleEDouble ) )? ( (lv_comparator_5_0= ruleComparators ) )? otherlv_6= ';'
            {
            // InternalDsl.g:1127:3: ()
            // InternalDsl.g:1128:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseObjective_ImplAccess().getBaseObjectiveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseObjective_ImplAccess().getBaseObjectiveKeyword_1());
            		
            // InternalDsl.g:1138:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:1139:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:1139:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:1140:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_2_0, grammarAccess.getBaseObjective_ImplAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBaseObjective_ImplRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:1156:3: (otherlv_3= ':' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1157:4: otherlv_3= ':'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getBaseObjective_ImplAccess().getColonKeyword_3());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1162:3: ( (lv_fitnessConstraint_4_0= ruleEDouble ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT||LA28_0==37||LA28_0==52) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1163:4: (lv_fitnessConstraint_4_0= ruleEDouble )
                    {
                    // InternalDsl.g:1163:4: (lv_fitnessConstraint_4_0= ruleEDouble )
                    // InternalDsl.g:1164:5: lv_fitnessConstraint_4_0= ruleEDouble
                    {

                    					newCompositeNode(grammarAccess.getBaseObjective_ImplAccess().getFitnessConstraintEDoubleParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_34);
                    lv_fitnessConstraint_4_0=ruleEDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBaseObjective_ImplRule());
                    					}
                    					set(
                    						current,
                    						"fitnessConstraint",
                    						lv_fitnessConstraint_4_0,
                    						"org.eclipse.viatra.dse.Dsl.EDouble");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1181:3: ( (lv_comparator_5_0= ruleComparators ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=59 && LA29_0<=61)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1182:4: (lv_comparator_5_0= ruleComparators )
                    {
                    // InternalDsl.g:1182:4: (lv_comparator_5_0= ruleComparators )
                    // InternalDsl.g:1183:5: lv_comparator_5_0= ruleComparators
                    {

                    					newCompositeNode(grammarAccess.getBaseObjective_ImplAccess().getComparatorComparatorsEnumRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_comparator_5_0=ruleComparators();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBaseObjective_ImplRule());
                    					}
                    					set(
                    						current,
                    						"comparator",
                    						lv_comparator_5_0,
                    						"org.eclipse.viatra.dse.Dsl.Comparators");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBaseObjective_ImplAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleBaseObjective_Impl"


    // $ANTLR start "entryRuleTransformationRule"
    // InternalDsl.g:1208:1: entryRuleTransformationRule returns [EObject current=null] : iv_ruleTransformationRule= ruleTransformationRule EOF ;
    public final EObject entryRuleTransformationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationRule = null;


        try {
            // InternalDsl.g:1208:59: (iv_ruleTransformationRule= ruleTransformationRule EOF )
            // InternalDsl.g:1209:2: iv_ruleTransformationRule= ruleTransformationRule EOF
            {
             newCompositeNode(grammarAccess.getTransformationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformationRule=ruleTransformationRule();

            state._fsp--;

             current =iv_ruleTransformationRule; 
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
    // $ANTLR end "entryRuleTransformationRule"


    // $ANTLR start "ruleTransformationRule"
    // InternalDsl.g:1215:1: ruleTransformationRule returns [EObject current=null] : ( () otherlv_1= 'Rule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_className_4_0= ruleEString ) ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) otherlv_7= '()' otherlv_8= ';' ) ;
    public final EObject ruleTransformationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_className_4_0 = null;

        AntlrDatatypeRuleToken lv_methodName_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1221:2: ( ( () otherlv_1= 'Rule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_className_4_0= ruleEString ) ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) otherlv_7= '()' otherlv_8= ';' ) )
            // InternalDsl.g:1222:2: ( () otherlv_1= 'Rule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_className_4_0= ruleEString ) ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) otherlv_7= '()' otherlv_8= ';' )
            {
            // InternalDsl.g:1222:2: ( () otherlv_1= 'Rule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_className_4_0= ruleEString ) ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) otherlv_7= '()' otherlv_8= ';' )
            // InternalDsl.g:1223:3: () otherlv_1= 'Rule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_className_4_0= ruleEString ) ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) otherlv_7= '()' otherlv_8= ';'
            {
            // InternalDsl.g:1223:3: ()
            // InternalDsl.g:1224:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransformationRuleAccess().getTransformationRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTransformationRuleAccess().getRuleKeyword_1());
            		
            // InternalDsl.g:1234:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:1235:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:1235:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:1236:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTransformationRuleAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransformationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getTransformationRuleAccess().getColonKeyword_3());
            		
            // InternalDsl.g:1256:3: ( (lv_className_4_0= ruleEString ) )
            // InternalDsl.g:1257:4: (lv_className_4_0= ruleEString )
            {
            // InternalDsl.g:1257:4: (lv_className_4_0= ruleEString )
            // InternalDsl.g:1258:5: lv_className_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransformationRuleAccess().getClassNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_35);
            lv_className_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformationRuleRule());
            					}
            					set(
            						current,
            						"className",
            						lv_className_4_0,
            						"org.eclipse.viatra.dse.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getTransformationRuleAccess().getFullStopKeyword_5());
            		
            // InternalDsl.g:1279:3: ( (lv_methodName_6_0= ruleEString ) )
            // InternalDsl.g:1280:4: (lv_methodName_6_0= ruleEString )
            {
            // InternalDsl.g:1280:4: (lv_methodName_6_0= ruleEString )
            // InternalDsl.g:1281:5: lv_methodName_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransformationRuleAccess().getMethodNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_36);
            lv_methodName_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformationRuleRule());
            					}
            					set(
            						current,
            						"methodName",
            						lv_methodName_6_0,
            						"org.eclipse.viatra.dse.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getTransformationRuleAccess().getLeftParenthesisRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTransformationRuleAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleTransformationRule"


    // $ANTLR start "entryRuleStateCoder"
    // InternalDsl.g:1310:1: entryRuleStateCoder returns [EObject current=null] : iv_ruleStateCoder= ruleStateCoder EOF ;
    public final EObject entryRuleStateCoder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateCoder = null;


        try {
            // InternalDsl.g:1310:51: (iv_ruleStateCoder= ruleStateCoder EOF )
            // InternalDsl.g:1311:2: iv_ruleStateCoder= ruleStateCoder EOF
            {
             newCompositeNode(grammarAccess.getStateCoderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateCoder=ruleStateCoder();

            state._fsp--;

             current =iv_ruleStateCoder; 
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
    // $ANTLR end "entryRuleStateCoder"


    // $ANTLR start "ruleStateCoder"
    // InternalDsl.g:1317:1: ruleStateCoder returns [EObject current=null] : ( () otherlv_1= 'StateCoder' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleStateCoder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1323:2: ( ( () otherlv_1= 'StateCoder' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalDsl.g:1324:2: ( () otherlv_1= 'StateCoder' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalDsl.g:1324:2: ( () otherlv_1= 'StateCoder' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalDsl.g:1325:3: () otherlv_1= 'StateCoder' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalDsl.g:1325:3: ()
            // InternalDsl.g:1326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateCoderAccess().getStateCoderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStateCoderAccess().getStateCoderKeyword_1());
            		
            // InternalDsl.g:1336:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:1337:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:1337:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:1338:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStateCoderAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateCoderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStateCoderAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleStateCoder"


    // $ANTLR start "entryRuleConstraintsObjective"
    // InternalDsl.g:1362:1: entryRuleConstraintsObjective returns [EObject current=null] : iv_ruleConstraintsObjective= ruleConstraintsObjective EOF ;
    public final EObject entryRuleConstraintsObjective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintsObjective = null;


        try {
            // InternalDsl.g:1362:61: (iv_ruleConstraintsObjective= ruleConstraintsObjective EOF )
            // InternalDsl.g:1363:2: iv_ruleConstraintsObjective= ruleConstraintsObjective EOF
            {
             newCompositeNode(grammarAccess.getConstraintsObjectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintsObjective=ruleConstraintsObjective();

            state._fsp--;

             current =iv_ruleConstraintsObjective; 
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
    // $ANTLR end "entryRuleConstraintsObjective"


    // $ANTLR start "ruleConstraintsObjective"
    // InternalDsl.g:1369:1: ruleConstraintsObjective returns [EObject current=null] : ( () otherlv_1= 'ConstraintsObjective' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_fitnessConstraint_4_0= ruleEDouble ) )? (otherlv_5= 'hardConstraints' ( (lv_hardConstraints_6_0= ruleQueryConstraint ) ) )* (otherlv_7= 'softConstraints' ( (lv_softConstraints_8_0= ruleQueryConstraint ) ) )* ( (lv_comparator_9_0= ruleComparators ) )? otherlv_10= ';' ) ;
    public final EObject ruleConstraintsObjective() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_fitnessConstraint_4_0 = null;

        EObject lv_hardConstraints_6_0 = null;

        EObject lv_softConstraints_8_0 = null;

        Enumerator lv_comparator_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1375:2: ( ( () otherlv_1= 'ConstraintsObjective' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_fitnessConstraint_4_0= ruleEDouble ) )? (otherlv_5= 'hardConstraints' ( (lv_hardConstraints_6_0= ruleQueryConstraint ) ) )* (otherlv_7= 'softConstraints' ( (lv_softConstraints_8_0= ruleQueryConstraint ) ) )* ( (lv_comparator_9_0= ruleComparators ) )? otherlv_10= ';' ) )
            // InternalDsl.g:1376:2: ( () otherlv_1= 'ConstraintsObjective' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_fitnessConstraint_4_0= ruleEDouble ) )? (otherlv_5= 'hardConstraints' ( (lv_hardConstraints_6_0= ruleQueryConstraint ) ) )* (otherlv_7= 'softConstraints' ( (lv_softConstraints_8_0= ruleQueryConstraint ) ) )* ( (lv_comparator_9_0= ruleComparators ) )? otherlv_10= ';' )
            {
            // InternalDsl.g:1376:2: ( () otherlv_1= 'ConstraintsObjective' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_fitnessConstraint_4_0= ruleEDouble ) )? (otherlv_5= 'hardConstraints' ( (lv_hardConstraints_6_0= ruleQueryConstraint ) ) )* (otherlv_7= 'softConstraints' ( (lv_softConstraints_8_0= ruleQueryConstraint ) ) )* ( (lv_comparator_9_0= ruleComparators ) )? otherlv_10= ';' )
            // InternalDsl.g:1377:3: () otherlv_1= 'ConstraintsObjective' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_fitnessConstraint_4_0= ruleEDouble ) )? (otherlv_5= 'hardConstraints' ( (lv_hardConstraints_6_0= ruleQueryConstraint ) ) )* (otherlv_7= 'softConstraints' ( (lv_softConstraints_8_0= ruleQueryConstraint ) ) )* ( (lv_comparator_9_0= ruleComparators ) )? otherlv_10= ';'
            {
            // InternalDsl.g:1377:3: ()
            // InternalDsl.g:1378:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstraintsObjectiveAccess().getConstraintsObjectiveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintsObjectiveAccess().getConstraintsObjectiveKeyword_1());
            		
            // InternalDsl.g:1388:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:1389:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:1389:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:1390:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConstraintsObjectiveAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintsObjectiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintsObjectiveAccess().getColonKeyword_3());
            		
            // InternalDsl.g:1410:3: ( (lv_fitnessConstraint_4_0= ruleEDouble ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||LA30_0==37||LA30_0==52) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1411:4: (lv_fitnessConstraint_4_0= ruleEDouble )
                    {
                    // InternalDsl.g:1411:4: (lv_fitnessConstraint_4_0= ruleEDouble )
                    // InternalDsl.g:1412:5: lv_fitnessConstraint_4_0= ruleEDouble
                    {

                    					newCompositeNode(grammarAccess.getConstraintsObjectiveAccess().getFitnessConstraintEDoubleParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_fitnessConstraint_4_0=ruleEDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstraintsObjectiveRule());
                    					}
                    					set(
                    						current,
                    						"fitnessConstraint",
                    						lv_fitnessConstraint_4_0,
                    						"org.eclipse.viatra.dse.Dsl.EDouble");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1429:3: (otherlv_5= 'hardConstraints' ( (lv_hardConstraints_6_0= ruleQueryConstraint ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==40) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDsl.g:1430:4: otherlv_5= 'hardConstraints' ( (lv_hardConstraints_6_0= ruleQueryConstraint ) )
            	    {
            	    otherlv_5=(Token)match(input,40,FOLLOW_9); 

            	    				newLeafNode(otherlv_5, grammarAccess.getConstraintsObjectiveAccess().getHardConstraintsKeyword_5_0());
            	    			
            	    // InternalDsl.g:1434:4: ( (lv_hardConstraints_6_0= ruleQueryConstraint ) )
            	    // InternalDsl.g:1435:5: (lv_hardConstraints_6_0= ruleQueryConstraint )
            	    {
            	    // InternalDsl.g:1435:5: (lv_hardConstraints_6_0= ruleQueryConstraint )
            	    // InternalDsl.g:1436:6: lv_hardConstraints_6_0= ruleQueryConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getConstraintsObjectiveAccess().getHardConstraintsQueryConstraintParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_hardConstraints_6_0=ruleQueryConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstraintsObjectiveRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hardConstraints",
            	    							lv_hardConstraints_6_0,
            	    							"org.eclipse.viatra.dse.Dsl.QueryConstraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalDsl.g:1454:3: (otherlv_7= 'softConstraints' ( (lv_softConstraints_8_0= ruleQueryConstraint ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==41) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDsl.g:1455:4: otherlv_7= 'softConstraints' ( (lv_softConstraints_8_0= ruleQueryConstraint ) )
            	    {
            	    otherlv_7=(Token)match(input,41,FOLLOW_9); 

            	    				newLeafNode(otherlv_7, grammarAccess.getConstraintsObjectiveAccess().getSoftConstraintsKeyword_6_0());
            	    			
            	    // InternalDsl.g:1459:4: ( (lv_softConstraints_8_0= ruleQueryConstraint ) )
            	    // InternalDsl.g:1460:5: (lv_softConstraints_8_0= ruleQueryConstraint )
            	    {
            	    // InternalDsl.g:1460:5: (lv_softConstraints_8_0= ruleQueryConstraint )
            	    // InternalDsl.g:1461:6: lv_softConstraints_8_0= ruleQueryConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getConstraintsObjectiveAccess().getSoftConstraintsQueryConstraintParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_softConstraints_8_0=ruleQueryConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstraintsObjectiveRule());
            	    						}
            	    						add(
            	    							current,
            	    							"softConstraints",
            	    							lv_softConstraints_8_0,
            	    							"org.eclipse.viatra.dse.Dsl.QueryConstraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalDsl.g:1479:3: ( (lv_comparator_9_0= ruleComparators ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=59 && LA33_0<=61)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:1480:4: (lv_comparator_9_0= ruleComparators )
                    {
                    // InternalDsl.g:1480:4: (lv_comparator_9_0= ruleComparators )
                    // InternalDsl.g:1481:5: lv_comparator_9_0= ruleComparators
                    {

                    					newCompositeNode(grammarAccess.getConstraintsObjectiveAccess().getComparatorComparatorsEnumRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_comparator_9_0=ruleComparators();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstraintsObjectiveRule());
                    					}
                    					set(
                    						current,
                    						"comparator",
                    						lv_comparator_9_0,
                    						"org.eclipse.viatra.dse.Dsl.Comparators");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getConstraintsObjectiveAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleConstraintsObjective"


    // $ANTLR start "entryRuleQueryConstraint"
    // InternalDsl.g:1506:1: entryRuleQueryConstraint returns [EObject current=null] : iv_ruleQueryConstraint= ruleQueryConstraint EOF ;
    public final EObject entryRuleQueryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryConstraint = null;


        try {
            // InternalDsl.g:1506:56: (iv_ruleQueryConstraint= ruleQueryConstraint EOF )
            // InternalDsl.g:1507:2: iv_ruleQueryConstraint= ruleQueryConstraint EOF
            {
             newCompositeNode(grammarAccess.getQueryConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryConstraint=ruleQueryConstraint();

            state._fsp--;

             current =iv_ruleQueryConstraint; 
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
    // $ANTLR end "entryRuleQueryConstraint"


    // $ANTLR start "ruleQueryConstraint"
    // InternalDsl.g:1513:1: ruleQueryConstraint returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_constraintName_4_0= ruleEString ) ) )? (otherlv_5= ',' ( (lv_weight_6_0= ruleEDouble ) ) )? (otherlv_7= ',' ( (lv_type_8_0= ruleModelQueryType ) ) )? otherlv_9= ')' ) ;
    public final EObject ruleQueryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_constraintName_4_0 = null;

        AntlrDatatypeRuleToken lv_weight_6_0 = null;

        Enumerator lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1519:2: ( ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_constraintName_4_0= ruleEString ) ) )? (otherlv_5= ',' ( (lv_weight_6_0= ruleEDouble ) ) )? (otherlv_7= ',' ( (lv_type_8_0= ruleModelQueryType ) ) )? otherlv_9= ')' ) )
            // InternalDsl.g:1520:2: ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_constraintName_4_0= ruleEString ) ) )? (otherlv_5= ',' ( (lv_weight_6_0= ruleEDouble ) ) )? (otherlv_7= ',' ( (lv_type_8_0= ruleModelQueryType ) ) )? otherlv_9= ')' )
            {
            // InternalDsl.g:1520:2: ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_constraintName_4_0= ruleEString ) ) )? (otherlv_5= ',' ( (lv_weight_6_0= ruleEDouble ) ) )? (otherlv_7= ',' ( (lv_type_8_0= ruleModelQueryType ) ) )? otherlv_9= ')' )
            // InternalDsl.g:1521:3: () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_constraintName_4_0= ruleEString ) ) )? (otherlv_5= ',' ( (lv_weight_6_0= ruleEDouble ) ) )? (otherlv_7= ',' ( (lv_type_8_0= ruleModelQueryType ) ) )? otherlv_9= ')'
            {
            // InternalDsl.g:1521:3: ()
            // InternalDsl.g:1522:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQueryConstraintAccess().getQueryConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryConstraintAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDsl.g:1532:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:1533:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:1533:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:1534:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getQueryConstraintAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:1550:3: (otherlv_3= ',' ( (lv_constraintName_4_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                int LA34_1 = input.LA(2);

                if ( ((LA34_1>=RULE_ID && LA34_1<=RULE_STRING)) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:1551:4: otherlv_3= ',' ( (lv_constraintName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getQueryConstraintAccess().getCommaKeyword_3_0());
                    			
                    // InternalDsl.g:1555:4: ( (lv_constraintName_4_0= ruleEString ) )
                    // InternalDsl.g:1556:5: (lv_constraintName_4_0= ruleEString )
                    {
                    // InternalDsl.g:1556:5: (lv_constraintName_4_0= ruleEString )
                    // InternalDsl.g:1557:6: lv_constraintName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQueryConstraintAccess().getConstraintNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_constraintName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQueryConstraintRule());
                    						}
                    						set(
                    							current,
                    							"constraintName",
                    							lv_constraintName_4_0,
                    							"org.eclipse.viatra.dse.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1575:3: (otherlv_5= ',' ( (lv_weight_6_0= ruleEDouble ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==16) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==RULE_INT||LA35_1==37||LA35_1==52) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:1576:4: otherlv_5= ',' ( (lv_weight_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getQueryConstraintAccess().getCommaKeyword_4_0());
                    			
                    // InternalDsl.g:1580:4: ( (lv_weight_6_0= ruleEDouble ) )
                    // InternalDsl.g:1581:5: (lv_weight_6_0= ruleEDouble )
                    {
                    // InternalDsl.g:1581:5: (lv_weight_6_0= ruleEDouble )
                    // InternalDsl.g:1582:6: lv_weight_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getQueryConstraintAccess().getWeightEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_weight_6_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQueryConstraintRule());
                    						}
                    						set(
                    							current,
                    							"weight",
                    							lv_weight_6_0,
                    							"org.eclipse.viatra.dse.Dsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1600:3: (otherlv_7= ',' ( (lv_type_8_0= ruleModelQueryType ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==16) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:1601:4: otherlv_7= ',' ( (lv_type_8_0= ruleModelQueryType ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_41); 

                    				newLeafNode(otherlv_7, grammarAccess.getQueryConstraintAccess().getCommaKeyword_5_0());
                    			
                    // InternalDsl.g:1605:4: ( (lv_type_8_0= ruleModelQueryType ) )
                    // InternalDsl.g:1606:5: (lv_type_8_0= ruleModelQueryType )
                    {
                    // InternalDsl.g:1606:5: (lv_type_8_0= ruleModelQueryType )
                    // InternalDsl.g:1607:6: lv_type_8_0= ruleModelQueryType
                    {

                    						newCompositeNode(grammarAccess.getQueryConstraintAccess().getTypeModelQueryTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_type_8_0=ruleModelQueryType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQueryConstraintRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_8_0,
                    							"org.eclipse.viatra.dse.Dsl.ModelQueryType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getQueryConstraintAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleQueryConstraint"


    // $ANTLR start "entryRuleSolutionStore"
    // InternalDsl.g:1633:1: entryRuleSolutionStore returns [EObject current=null] : iv_ruleSolutionStore= ruleSolutionStore EOF ;
    public final EObject entryRuleSolutionStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolutionStore = null;


        try {
            // InternalDsl.g:1633:54: (iv_ruleSolutionStore= ruleSolutionStore EOF )
            // InternalDsl.g:1634:2: iv_ruleSolutionStore= ruleSolutionStore EOF
            {
             newCompositeNode(grammarAccess.getSolutionStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolutionStore=ruleSolutionStore();

            state._fsp--;

             current =iv_ruleSolutionStore; 
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
    // $ANTLR end "entryRuleSolutionStore"


    // $ANTLR start "ruleSolutionStore"
    // InternalDsl.g:1640:1: ruleSolutionStore returns [EObject current=null] : ( () otherlv_1= 'SolutionStore' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_foundSolutions_4_0= ruleEInt ) )? ( (lv_acceptAnySolutions_5_0= 'acceptAnySolutions' ) )? ( (lv_storeBestSolutionsOnly_6_0= 'storeBestSolutionsOnly' ) )? ( (lv_logSolutionsWhenFound_7_0= 'logSolutionsWhenFound' ) )? ( (lv_registerSolutionFoundHandler_8_0= 'registerSolutionFoundHandler' ) )? otherlv_9= ';' ) ;
    public final EObject ruleSolutionStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_acceptAnySolutions_5_0=null;
        Token lv_storeBestSolutionsOnly_6_0=null;
        Token lv_logSolutionsWhenFound_7_0=null;
        Token lv_registerSolutionFoundHandler_8_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_foundSolutions_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1646:2: ( ( () otherlv_1= 'SolutionStore' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_foundSolutions_4_0= ruleEInt ) )? ( (lv_acceptAnySolutions_5_0= 'acceptAnySolutions' ) )? ( (lv_storeBestSolutionsOnly_6_0= 'storeBestSolutionsOnly' ) )? ( (lv_logSolutionsWhenFound_7_0= 'logSolutionsWhenFound' ) )? ( (lv_registerSolutionFoundHandler_8_0= 'registerSolutionFoundHandler' ) )? otherlv_9= ';' ) )
            // InternalDsl.g:1647:2: ( () otherlv_1= 'SolutionStore' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_foundSolutions_4_0= ruleEInt ) )? ( (lv_acceptAnySolutions_5_0= 'acceptAnySolutions' ) )? ( (lv_storeBestSolutionsOnly_6_0= 'storeBestSolutionsOnly' ) )? ( (lv_logSolutionsWhenFound_7_0= 'logSolutionsWhenFound' ) )? ( (lv_registerSolutionFoundHandler_8_0= 'registerSolutionFoundHandler' ) )? otherlv_9= ';' )
            {
            // InternalDsl.g:1647:2: ( () otherlv_1= 'SolutionStore' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_foundSolutions_4_0= ruleEInt ) )? ( (lv_acceptAnySolutions_5_0= 'acceptAnySolutions' ) )? ( (lv_storeBestSolutionsOnly_6_0= 'storeBestSolutionsOnly' ) )? ( (lv_logSolutionsWhenFound_7_0= 'logSolutionsWhenFound' ) )? ( (lv_registerSolutionFoundHandler_8_0= 'registerSolutionFoundHandler' ) )? otherlv_9= ';' )
            // InternalDsl.g:1648:3: () otherlv_1= 'SolutionStore' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_foundSolutions_4_0= ruleEInt ) )? ( (lv_acceptAnySolutions_5_0= 'acceptAnySolutions' ) )? ( (lv_storeBestSolutionsOnly_6_0= 'storeBestSolutionsOnly' ) )? ( (lv_logSolutionsWhenFound_7_0= 'logSolutionsWhenFound' ) )? ( (lv_registerSolutionFoundHandler_8_0= 'registerSolutionFoundHandler' ) )? otherlv_9= ';'
            {
            // InternalDsl.g:1648:3: ()
            // InternalDsl.g:1649:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSolutionStoreAccess().getSolutionStoreAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSolutionStoreAccess().getSolutionStoreKeyword_1());
            		
            // InternalDsl.g:1659:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:1660:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:1660:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:1661:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSolutionStoreAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSolutionStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getSolutionStoreAccess().getColonKeyword_3());
            		
            // InternalDsl.g:1681:3: ( (lv_foundSolutions_4_0= ruleEInt ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT||LA37_0==52) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:1682:4: (lv_foundSolutions_4_0= ruleEInt )
                    {
                    // InternalDsl.g:1682:4: (lv_foundSolutions_4_0= ruleEInt )
                    // InternalDsl.g:1683:5: lv_foundSolutions_4_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getSolutionStoreAccess().getFoundSolutionsEIntParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_43);
                    lv_foundSolutions_4_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSolutionStoreRule());
                    					}
                    					set(
                    						current,
                    						"foundSolutions",
                    						lv_foundSolutions_4_0,
                    						"org.eclipse.viatra.dse.Dsl.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1700:3: ( (lv_acceptAnySolutions_5_0= 'acceptAnySolutions' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:1701:4: (lv_acceptAnySolutions_5_0= 'acceptAnySolutions' )
                    {
                    // InternalDsl.g:1701:4: (lv_acceptAnySolutions_5_0= 'acceptAnySolutions' )
                    // InternalDsl.g:1702:5: lv_acceptAnySolutions_5_0= 'acceptAnySolutions'
                    {
                    lv_acceptAnySolutions_5_0=(Token)match(input,42,FOLLOW_44); 

                    					newLeafNode(lv_acceptAnySolutions_5_0, grammarAccess.getSolutionStoreAccess().getAcceptAnySolutionsAcceptAnySolutionsKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSolutionStoreRule());
                    					}
                    					setWithLastConsumed(current, "acceptAnySolutions", true, "acceptAnySolutions");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1714:3: ( (lv_storeBestSolutionsOnly_6_0= 'storeBestSolutionsOnly' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:1715:4: (lv_storeBestSolutionsOnly_6_0= 'storeBestSolutionsOnly' )
                    {
                    // InternalDsl.g:1715:4: (lv_storeBestSolutionsOnly_6_0= 'storeBestSolutionsOnly' )
                    // InternalDsl.g:1716:5: lv_storeBestSolutionsOnly_6_0= 'storeBestSolutionsOnly'
                    {
                    lv_storeBestSolutionsOnly_6_0=(Token)match(input,43,FOLLOW_45); 

                    					newLeafNode(lv_storeBestSolutionsOnly_6_0, grammarAccess.getSolutionStoreAccess().getStoreBestSolutionsOnlyStoreBestSolutionsOnlyKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSolutionStoreRule());
                    					}
                    					setWithLastConsumed(current, "storeBestSolutionsOnly", true, "storeBestSolutionsOnly");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1728:3: ( (lv_logSolutionsWhenFound_7_0= 'logSolutionsWhenFound' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:1729:4: (lv_logSolutionsWhenFound_7_0= 'logSolutionsWhenFound' )
                    {
                    // InternalDsl.g:1729:4: (lv_logSolutionsWhenFound_7_0= 'logSolutionsWhenFound' )
                    // InternalDsl.g:1730:5: lv_logSolutionsWhenFound_7_0= 'logSolutionsWhenFound'
                    {
                    lv_logSolutionsWhenFound_7_0=(Token)match(input,44,FOLLOW_46); 

                    					newLeafNode(lv_logSolutionsWhenFound_7_0, grammarAccess.getSolutionStoreAccess().getLogSolutionsWhenFoundLogSolutionsWhenFoundKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSolutionStoreRule());
                    					}
                    					setWithLastConsumed(current, "logSolutionsWhenFound", true, "logSolutionsWhenFound");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1742:3: ( (lv_registerSolutionFoundHandler_8_0= 'registerSolutionFoundHandler' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:1743:4: (lv_registerSolutionFoundHandler_8_0= 'registerSolutionFoundHandler' )
                    {
                    // InternalDsl.g:1743:4: (lv_registerSolutionFoundHandler_8_0= 'registerSolutionFoundHandler' )
                    // InternalDsl.g:1744:5: lv_registerSolutionFoundHandler_8_0= 'registerSolutionFoundHandler'
                    {
                    lv_registerSolutionFoundHandler_8_0=(Token)match(input,45,FOLLOW_14); 

                    					newLeafNode(lv_registerSolutionFoundHandler_8_0, grammarAccess.getSolutionStoreAccess().getRegisterSolutionFoundHandlerRegisterSolutionFoundHandlerKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSolutionStoreRule());
                    					}
                    					setWithLastConsumed(current, "registerSolutionFoundHandler", true, "registerSolutionFoundHandler");
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSolutionStoreAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleSolutionStore"


    // $ANTLR start "entryRuleDseImport_Impl"
    // InternalDsl.g:1764:1: entryRuleDseImport_Impl returns [EObject current=null] : iv_ruleDseImport_Impl= ruleDseImport_Impl EOF ;
    public final EObject entryRuleDseImport_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDseImport_Impl = null;


        try {
            // InternalDsl.g:1764:55: (iv_ruleDseImport_Impl= ruleDseImport_Impl EOF )
            // InternalDsl.g:1765:2: iv_ruleDseImport_Impl= ruleDseImport_Impl EOF
            {
             newCompositeNode(grammarAccess.getDseImport_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDseImport_Impl=ruleDseImport_Impl();

            state._fsp--;

             current =iv_ruleDseImport_Impl; 
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
    // $ANTLR end "entryRuleDseImport_Impl"


    // $ANTLR start "ruleDseImport_Impl"
    // InternalDsl.g:1771:1: ruleDseImport_Impl returns [EObject current=null] : ( () otherlv_1= 'DseImport' ( (lv_imports_2_0= ruleEString ) )* ) ;
    public final EObject ruleDseImport_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_imports_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1777:2: ( ( () otherlv_1= 'DseImport' ( (lv_imports_2_0= ruleEString ) )* ) )
            // InternalDsl.g:1778:2: ( () otherlv_1= 'DseImport' ( (lv_imports_2_0= ruleEString ) )* )
            {
            // InternalDsl.g:1778:2: ( () otherlv_1= 'DseImport' ( (lv_imports_2_0= ruleEString ) )* )
            // InternalDsl.g:1779:3: () otherlv_1= 'DseImport' ( (lv_imports_2_0= ruleEString ) )*
            {
            // InternalDsl.g:1779:3: ()
            // InternalDsl.g:1780:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDseImport_ImplAccess().getDseImportAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getDseImport_ImplAccess().getDseImportKeyword_1());
            		
            // InternalDsl.g:1790:3: ( (lv_imports_2_0= ruleEString ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_STRING)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDsl.g:1791:4: (lv_imports_2_0= ruleEString )
            	    {
            	    // InternalDsl.g:1791:4: (lv_imports_2_0= ruleEString )
            	    // InternalDsl.g:1792:5: lv_imports_2_0= ruleEString
            	    {

            	    					newCompositeNode(grammarAccess.getDseImport_ImplAccess().getImportsEStringParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_47);
            	    lv_imports_2_0=ruleEString();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDseImport_ImplRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"org.eclipse.viatra.dse.Dsl.EString");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "ruleDseImport_Impl"


    // $ANTLR start "entryRuleEvolutionaryStrategyBuilder"
    // InternalDsl.g:1813:1: entryRuleEvolutionaryStrategyBuilder returns [EObject current=null] : iv_ruleEvolutionaryStrategyBuilder= ruleEvolutionaryStrategyBuilder EOF ;
    public final EObject entryRuleEvolutionaryStrategyBuilder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvolutionaryStrategyBuilder = null;


        try {
            // InternalDsl.g:1813:68: (iv_ruleEvolutionaryStrategyBuilder= ruleEvolutionaryStrategyBuilder EOF )
            // InternalDsl.g:1814:2: iv_ruleEvolutionaryStrategyBuilder= ruleEvolutionaryStrategyBuilder EOF
            {
             newCompositeNode(grammarAccess.getEvolutionaryStrategyBuilderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvolutionaryStrategyBuilder=ruleEvolutionaryStrategyBuilder();

            state._fsp--;

             current =iv_ruleEvolutionaryStrategyBuilder; 
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
    // $ANTLR end "entryRuleEvolutionaryStrategyBuilder"


    // $ANTLR start "ruleEvolutionaryStrategyBuilder"
    // InternalDsl.g:1820:1: ruleEvolutionaryStrategyBuilder returns [EObject current=null] : ( () otherlv_1= 'EvolutionaryStrategyBuilder' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_populationSize_4_0= ruleEInt ) )? ( (lv_type_5_0= ruleEvolutionStrategyType ) )? (otherlv_6= 'crossOvers' otherlv_7= '(' ( (lv_crossOvers_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_crossOvers_10_0= ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'mutations' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')' )? otherlv_18= ';' ) ;
    public final EObject ruleEvolutionaryStrategyBuilder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_populationSize_4_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_crossOvers_8_0 = null;

        AntlrDatatypeRuleToken lv_crossOvers_10_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1826:2: ( ( () otherlv_1= 'EvolutionaryStrategyBuilder' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_populationSize_4_0= ruleEInt ) )? ( (lv_type_5_0= ruleEvolutionStrategyType ) )? (otherlv_6= 'crossOvers' otherlv_7= '(' ( (lv_crossOvers_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_crossOvers_10_0= ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'mutations' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')' )? otherlv_18= ';' ) )
            // InternalDsl.g:1827:2: ( () otherlv_1= 'EvolutionaryStrategyBuilder' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_populationSize_4_0= ruleEInt ) )? ( (lv_type_5_0= ruleEvolutionStrategyType ) )? (otherlv_6= 'crossOvers' otherlv_7= '(' ( (lv_crossOvers_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_crossOvers_10_0= ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'mutations' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')' )? otherlv_18= ';' )
            {
            // InternalDsl.g:1827:2: ( () otherlv_1= 'EvolutionaryStrategyBuilder' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_populationSize_4_0= ruleEInt ) )? ( (lv_type_5_0= ruleEvolutionStrategyType ) )? (otherlv_6= 'crossOvers' otherlv_7= '(' ( (lv_crossOvers_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_crossOvers_10_0= ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'mutations' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')' )? otherlv_18= ';' )
            // InternalDsl.g:1828:3: () otherlv_1= 'EvolutionaryStrategyBuilder' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_populationSize_4_0= ruleEInt ) )? ( (lv_type_5_0= ruleEvolutionStrategyType ) )? (otherlv_6= 'crossOvers' otherlv_7= '(' ( (lv_crossOvers_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_crossOvers_10_0= ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'mutations' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')' )? otherlv_18= ';'
            {
            // InternalDsl.g:1828:3: ()
            // InternalDsl.g:1829:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvolutionaryStrategyBuilderAccess().getEvolutionaryStrategyBuilderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEvolutionaryStrategyBuilderAccess().getEvolutionaryStrategyBuilderKeyword_1());
            		
            // InternalDsl.g:1839:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:1840:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:1840:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:1841:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEvolutionaryStrategyBuilderAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvolutionaryStrategyBuilderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getEvolutionaryStrategyBuilderAccess().getColonKeyword_3());
            		
            // InternalDsl.g:1861:3: ( (lv_populationSize_4_0= ruleEInt ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT||LA43_0==52) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:1862:4: (lv_populationSize_4_0= ruleEInt )
                    {
                    // InternalDsl.g:1862:4: (lv_populationSize_4_0= ruleEInt )
                    // InternalDsl.g:1863:5: lv_populationSize_4_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getEvolutionaryStrategyBuilderAccess().getPopulationSizeEIntParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_49);
                    lv_populationSize_4_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEvolutionaryStrategyBuilderRule());
                    					}
                    					set(
                    						current,
                    						"populationSize",
                    						lv_populationSize_4_0,
                    						"org.eclipse.viatra.dse.Dsl.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1880:3: ( (lv_type_5_0= ruleEvolutionStrategyType ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=64 && LA44_0<=65)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:1881:4: (lv_type_5_0= ruleEvolutionStrategyType )
                    {
                    // InternalDsl.g:1881:4: (lv_type_5_0= ruleEvolutionStrategyType )
                    // InternalDsl.g:1882:5: lv_type_5_0= ruleEvolutionStrategyType
                    {

                    					newCompositeNode(grammarAccess.getEvolutionaryStrategyBuilderAccess().getTypeEvolutionStrategyTypeEnumRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_50);
                    lv_type_5_0=ruleEvolutionStrategyType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEvolutionaryStrategyBuilderRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_5_0,
                    						"org.eclipse.viatra.dse.Dsl.EvolutionStrategyType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1899:3: (otherlv_6= 'crossOvers' otherlv_7= '(' ( (lv_crossOvers_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_crossOvers_10_0= ruleEString ) ) )* otherlv_11= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:1900:4: otherlv_6= 'crossOvers' otherlv_7= '(' ( (lv_crossOvers_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_crossOvers_10_0= ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getEvolutionaryStrategyBuilderAccess().getCrossOversKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getEvolutionaryStrategyBuilderAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDsl.g:1908:4: ( (lv_crossOvers_8_0= ruleEString ) )
                    // InternalDsl.g:1909:5: (lv_crossOvers_8_0= ruleEString )
                    {
                    // InternalDsl.g:1909:5: (lv_crossOvers_8_0= ruleEString )
                    // InternalDsl.g:1910:6: lv_crossOvers_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEvolutionaryStrategyBuilderAccess().getCrossOversEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_crossOvers_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvolutionaryStrategyBuilderRule());
                    						}
                    						add(
                    							current,
                    							"crossOvers",
                    							lv_crossOvers_8_0,
                    							"org.eclipse.viatra.dse.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1927:4: (otherlv_9= ',' ( (lv_crossOvers_10_0= ruleEString ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==16) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalDsl.g:1928:5: otherlv_9= ',' ( (lv_crossOvers_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEvolutionaryStrategyBuilderAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:1932:5: ( (lv_crossOvers_10_0= ruleEString ) )
                    	    // InternalDsl.g:1933:6: (lv_crossOvers_10_0= ruleEString )
                    	    {
                    	    // InternalDsl.g:1933:6: (lv_crossOvers_10_0= ruleEString )
                    	    // InternalDsl.g:1934:7: lv_crossOvers_10_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getEvolutionaryStrategyBuilderAccess().getCrossOversEStringParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_crossOvers_10_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEvolutionaryStrategyBuilderRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"crossOvers",
                    	    								lv_crossOvers_10_0,
                    	    								"org.eclipse.viatra.dse.Dsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_51); 

                    				newLeafNode(otherlv_11, grammarAccess.getEvolutionaryStrategyBuilderAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1957:3: (otherlv_12= 'mutations' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==49) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:1958:4: otherlv_12= 'mutations' otherlv_13= '(' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,49,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getEvolutionaryStrategyBuilderAccess().getMutationsKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getEvolutionaryStrategyBuilderAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalDsl.g:1966:4: ( (otherlv_14= RULE_ID ) )
                    // InternalDsl.g:1967:5: (otherlv_14= RULE_ID )
                    {
                    // InternalDsl.g:1967:5: (otherlv_14= RULE_ID )
                    // InternalDsl.g:1968:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvolutionaryStrategyBuilderRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_14, grammarAccess.getEvolutionaryStrategyBuilderAccess().getMutationsIMutationRateCrossReference_7_2_0());
                    					

                    }


                    }

                    // InternalDsl.g:1979:4: (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==16) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalDsl.g:1980:5: otherlv_15= ',' ( (otherlv_16= RULE_ID ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getEvolutionaryStrategyBuilderAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDsl.g:1984:5: ( (otherlv_16= RULE_ID ) )
                    	    // InternalDsl.g:1985:6: (otherlv_16= RULE_ID )
                    	    {
                    	    // InternalDsl.g:1985:6: (otherlv_16= RULE_ID )
                    	    // InternalDsl.g:1986:7: otherlv_16= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEvolutionaryStrategyBuilderRule());
                    	    							}
                    	    						
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    							newLeafNode(otherlv_16, grammarAccess.getEvolutionaryStrategyBuilderAccess().getMutationsIMutationRateCrossReference_7_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getEvolutionaryStrategyBuilderAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getEvolutionaryStrategyBuilderAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleEvolutionaryStrategyBuilder"


    // $ANTLR start "entryRuleType"
    // InternalDsl.g:2011:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDsl.g:2011:45: (iv_ruleType= ruleType EOF )
            // InternalDsl.g:2012:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDsl.g:2018:1: ruleType returns [EObject current=null] : (this_Type_Impl_0= ruleType_Impl | this_DseExecutionModel_1= ruleDseExecutionModel | this_DseProblem_2= ruleDseProblem | this_Configuration_3= ruleConfiguration | this_Strategy_4= ruleStrategy | this_Constraint_Impl_5= ruleConstraint_Impl | this_InitialModel_6= ruleInitialModel | this_MetaModel_7= ruleMetaModel | this_BaseObjective_Impl_8= ruleBaseObjective_Impl | this_TransformationRule_9= ruleTransformationRule | this_StateCoder_10= ruleStateCoder | this_ConstraintsObjective_11= ruleConstraintsObjective | this_QueryConstraint_12= ruleQueryConstraint | this_SolutionStore_13= ruleSolutionStore | this_DseImport_Impl_14= ruleDseImport_Impl | this_EvolutionaryStrategyBuilder_15= ruleEvolutionaryStrategyBuilder | this_IMutationRate_16= ruleIMutationRate ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_Impl_0 = null;

        EObject this_DseExecutionModel_1 = null;

        EObject this_DseProblem_2 = null;

        EObject this_Configuration_3 = null;

        EObject this_Strategy_4 = null;

        EObject this_Constraint_Impl_5 = null;

        EObject this_InitialModel_6 = null;

        EObject this_MetaModel_7 = null;

        EObject this_BaseObjective_Impl_8 = null;

        EObject this_TransformationRule_9 = null;

        EObject this_StateCoder_10 = null;

        EObject this_ConstraintsObjective_11 = null;

        EObject this_QueryConstraint_12 = null;

        EObject this_SolutionStore_13 = null;

        EObject this_DseImport_Impl_14 = null;

        EObject this_EvolutionaryStrategyBuilder_15 = null;

        EObject this_IMutationRate_16 = null;



        	enterRule();

        try {
            // InternalDsl.g:2024:2: ( (this_Type_Impl_0= ruleType_Impl | this_DseExecutionModel_1= ruleDseExecutionModel | this_DseProblem_2= ruleDseProblem | this_Configuration_3= ruleConfiguration | this_Strategy_4= ruleStrategy | this_Constraint_Impl_5= ruleConstraint_Impl | this_InitialModel_6= ruleInitialModel | this_MetaModel_7= ruleMetaModel | this_BaseObjective_Impl_8= ruleBaseObjective_Impl | this_TransformationRule_9= ruleTransformationRule | this_StateCoder_10= ruleStateCoder | this_ConstraintsObjective_11= ruleConstraintsObjective | this_QueryConstraint_12= ruleQueryConstraint | this_SolutionStore_13= ruleSolutionStore | this_DseImport_Impl_14= ruleDseImport_Impl | this_EvolutionaryStrategyBuilder_15= ruleEvolutionaryStrategyBuilder | this_IMutationRate_16= ruleIMutationRate ) )
            // InternalDsl.g:2025:2: (this_Type_Impl_0= ruleType_Impl | this_DseExecutionModel_1= ruleDseExecutionModel | this_DseProblem_2= ruleDseProblem | this_Configuration_3= ruleConfiguration | this_Strategy_4= ruleStrategy | this_Constraint_Impl_5= ruleConstraint_Impl | this_InitialModel_6= ruleInitialModel | this_MetaModel_7= ruleMetaModel | this_BaseObjective_Impl_8= ruleBaseObjective_Impl | this_TransformationRule_9= ruleTransformationRule | this_StateCoder_10= ruleStateCoder | this_ConstraintsObjective_11= ruleConstraintsObjective | this_QueryConstraint_12= ruleQueryConstraint | this_SolutionStore_13= ruleSolutionStore | this_DseImport_Impl_14= ruleDseImport_Impl | this_EvolutionaryStrategyBuilder_15= ruleEvolutionaryStrategyBuilder | this_IMutationRate_16= ruleIMutationRate )
            {
            // InternalDsl.g:2025:2: (this_Type_Impl_0= ruleType_Impl | this_DseExecutionModel_1= ruleDseExecutionModel | this_DseProblem_2= ruleDseProblem | this_Configuration_3= ruleConfiguration | this_Strategy_4= ruleStrategy | this_Constraint_Impl_5= ruleConstraint_Impl | this_InitialModel_6= ruleInitialModel | this_MetaModel_7= ruleMetaModel | this_BaseObjective_Impl_8= ruleBaseObjective_Impl | this_TransformationRule_9= ruleTransformationRule | this_StateCoder_10= ruleStateCoder | this_ConstraintsObjective_11= ruleConstraintsObjective | this_QueryConstraint_12= ruleQueryConstraint | this_SolutionStore_13= ruleSolutionStore | this_DseImport_Impl_14= ruleDseImport_Impl | this_EvolutionaryStrategyBuilder_15= ruleEvolutionaryStrategyBuilder | this_IMutationRate_16= ruleIMutationRate )
            int alt49=17;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt49=1;
                }
                break;
            case 11:
                {
                alt49=2;
                }
                break;
            case 21:
                {
                alt49=3;
                }
                break;
            case 23:
                {
                alt49=4;
                }
                break;
            case 34:
                {
                alt49=5;
                }
                break;
            case 24:
                {
                alt49=6;
                }
                break;
            case 25:
                {
                alt49=7;
                }
                break;
            case 26:
                {
                alt49=8;
                }
                break;
            case 35:
                {
                alt49=9;
                }
                break;
            case 36:
                {
                alt49=10;
                }
                break;
            case 29:
                {
                alt49=11;
                }
                break;
            case 39:
                {
                alt49=12;
                }
                break;
            case 15:
                {
                alt49=13;
                }
                break;
            case 30:
                {
                alt49=14;
                }
                break;
            case 46:
                {
                alt49=15;
                }
                break;
            case 47:
                {
                alt49=16;
                }
                break;
            case 51:
                {
                alt49=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalDsl.g:2026:3: this_Type_Impl_0= ruleType_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_Impl_0=ruleType_Impl();

                    state._fsp--;


                    			current = this_Type_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2035:3: this_DseExecutionModel_1= ruleDseExecutionModel
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDseExecutionModelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DseExecutionModel_1=ruleDseExecutionModel();

                    state._fsp--;


                    			current = this_DseExecutionModel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:2044:3: this_DseProblem_2= ruleDseProblem
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDseProblemParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DseProblem_2=ruleDseProblem();

                    state._fsp--;


                    			current = this_DseProblem_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:2053:3: this_Configuration_3= ruleConfiguration
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getConfigurationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Configuration_3=ruleConfiguration();

                    state._fsp--;


                    			current = this_Configuration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:2062:3: this_Strategy_4= ruleStrategy
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getStrategyParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Strategy_4=ruleStrategy();

                    state._fsp--;


                    			current = this_Strategy_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDsl.g:2071:3: this_Constraint_Impl_5= ruleConstraint_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getConstraint_ImplParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constraint_Impl_5=ruleConstraint_Impl();

                    state._fsp--;


                    			current = this_Constraint_Impl_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDsl.g:2080:3: this_InitialModel_6= ruleInitialModel
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getInitialModelParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitialModel_6=ruleInitialModel();

                    state._fsp--;


                    			current = this_InitialModel_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDsl.g:2089:3: this_MetaModel_7= ruleMetaModel
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMetaModelParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_MetaModel_7=ruleMetaModel();

                    state._fsp--;


                    			current = this_MetaModel_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDsl.g:2098:3: this_BaseObjective_Impl_8= ruleBaseObjective_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBaseObjective_ImplParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_BaseObjective_Impl_8=ruleBaseObjective_Impl();

                    state._fsp--;


                    			current = this_BaseObjective_Impl_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDsl.g:2107:3: this_TransformationRule_9= ruleTransformationRule
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getTransformationRuleParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransformationRule_9=ruleTransformationRule();

                    state._fsp--;


                    			current = this_TransformationRule_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDsl.g:2116:3: this_StateCoder_10= ruleStateCoder
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getStateCoderParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_StateCoder_10=ruleStateCoder();

                    state._fsp--;


                    			current = this_StateCoder_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDsl.g:2125:3: this_ConstraintsObjective_11= ruleConstraintsObjective
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getConstraintsObjectiveParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstraintsObjective_11=ruleConstraintsObjective();

                    state._fsp--;


                    			current = this_ConstraintsObjective_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDsl.g:2134:3: this_QueryConstraint_12= ruleQueryConstraint
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getQueryConstraintParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_QueryConstraint_12=ruleQueryConstraint();

                    state._fsp--;


                    			current = this_QueryConstraint_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalDsl.g:2143:3: this_SolutionStore_13= ruleSolutionStore
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSolutionStoreParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_SolutionStore_13=ruleSolutionStore();

                    state._fsp--;


                    			current = this_SolutionStore_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalDsl.g:2152:3: this_DseImport_Impl_14= ruleDseImport_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDseImport_ImplParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_DseImport_Impl_14=ruleDseImport_Impl();

                    state._fsp--;


                    			current = this_DseImport_Impl_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalDsl.g:2161:3: this_EvolutionaryStrategyBuilder_15= ruleEvolutionaryStrategyBuilder
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEvolutionaryStrategyBuilderParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvolutionaryStrategyBuilder_15=ruleEvolutionaryStrategyBuilder();

                    state._fsp--;


                    			current = this_EvolutionaryStrategyBuilder_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalDsl.g:2170:3: this_IMutationRate_16= ruleIMutationRate
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getIMutationRateParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_IMutationRate_16=ruleIMutationRate();

                    state._fsp--;


                    			current = this_IMutationRate_16;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleType_Impl"
    // InternalDsl.g:2182:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalDsl.g:2182:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalDsl.g:2183:2: iv_ruleType_Impl= ruleType_Impl EOF
            {
             newCompositeNode(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType_Impl=ruleType_Impl();

            state._fsp--;

             current =iv_ruleType_Impl; 
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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalDsl.g:2189:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2195:2: ( ( () otherlv_1= 'Type' ) )
            // InternalDsl.g:2196:2: ( () otherlv_1= 'Type' )
            {
            // InternalDsl.g:2196:2: ( () otherlv_1= 'Type' )
            // InternalDsl.g:2197:3: () otherlv_1= 'Type'
            {
            // InternalDsl.g:2197:3: ()
            // InternalDsl.g:2198:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		

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
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleIMutationRate"
    // InternalDsl.g:2212:1: entryRuleIMutationRate returns [EObject current=null] : iv_ruleIMutationRate= ruleIMutationRate EOF ;
    public final EObject entryRuleIMutationRate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIMutationRate = null;


        try {
            // InternalDsl.g:2212:54: (iv_ruleIMutationRate= ruleIMutationRate EOF )
            // InternalDsl.g:2213:2: iv_ruleIMutationRate= ruleIMutationRate EOF
            {
             newCompositeNode(grammarAccess.getIMutationRateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIMutationRate=ruleIMutationRate();

            state._fsp--;

             current =iv_ruleIMutationRate; 
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
    // $ANTLR end "entryRuleIMutationRate"


    // $ANTLR start "ruleIMutationRate"
    // InternalDsl.g:2219:1: ruleIMutationRate returns [EObject current=null] : ( () otherlv_1= 'Mutation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_weight_4_0= ruleEInt ) )? otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleIMutationRate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_weight_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2225:2: ( ( () otherlv_1= 'Mutation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_weight_4_0= ruleEInt ) )? otherlv_5= ')' otherlv_6= ';' ) )
            // InternalDsl.g:2226:2: ( () otherlv_1= 'Mutation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_weight_4_0= ruleEInt ) )? otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalDsl.g:2226:2: ( () otherlv_1= 'Mutation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_weight_4_0= ruleEInt ) )? otherlv_5= ')' otherlv_6= ';' )
            // InternalDsl.g:2227:3: () otherlv_1= 'Mutation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_weight_4_0= ruleEInt ) )? otherlv_5= ')' otherlv_6= ';'
            {
            // InternalDsl.g:2227:3: ()
            // InternalDsl.g:2228:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIMutationRateAccess().getIMutationRateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIMutationRateAccess().getMutationKeyword_1());
            		
            // InternalDsl.g:2238:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:2239:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:2239:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:2240:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getIMutationRateAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIMutationRateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_52); 

            			newLeafNode(otherlv_3, grammarAccess.getIMutationRateAccess().getLeftParenthesisKeyword_3());
            		
            // InternalDsl.g:2260:3: ( (lv_weight_4_0= ruleEInt ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_INT||LA50_0==52) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDsl.g:2261:4: (lv_weight_4_0= ruleEInt )
                    {
                    // InternalDsl.g:2261:4: (lv_weight_4_0= ruleEInt )
                    // InternalDsl.g:2262:5: lv_weight_4_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getIMutationRateAccess().getWeightEIntParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_weight_4_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIMutationRateRule());
                    					}
                    					set(
                    						current,
                    						"weight",
                    						lv_weight_4_0,
                    						"org.eclipse.viatra.dse.Dsl.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getIMutationRateAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIMutationRateAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleIMutationRate"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:2291:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:2291:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:2292:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:2298:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2304:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:2305:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:2305:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ID) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalDsl.g:2306:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2314:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:2325:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDsl.g:2325:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDsl.g:2326:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:2332:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2338:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:2339:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:2339:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:2340:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:2340:3: (kw= '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==52) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDsl.g:2341:4: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_53); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl.g:2358:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDsl.g:2358:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDsl.g:2359:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDsl.g:2365:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDsl.g:2371:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDsl.g:2372:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDsl.g:2372:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDsl.g:2373:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDsl.g:2373:3: (kw= '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==52) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDsl.g:2374:4: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_54); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2380:3: (this_INT_1= RULE_INT )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_INT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDsl.g:2381:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_35); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,37,FOLLOW_53); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_55); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalDsl.g:2401:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=53 && LA57_0<=54)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDsl.g:2402:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDsl.g:2402:4: (kw= 'E' | kw= 'e' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==53) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==54) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalDsl.g:2403:5: kw= 'E'
                            {
                            kw=(Token)match(input,53,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:2409:5: kw= 'e'
                            {
                            kw=(Token)match(input,54,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:2415:4: (kw= '-' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==52) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalDsl.g:2416:5: kw= '-'
                            {
                            kw=(Token)match(input,52,FOLLOW_53); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleStrategyType"
    // InternalDsl.g:2434:1: ruleStrategyType returns [Enumerator current=null] : ( (enumLiteral_0= 'DfsStrategy' ) | (enumLiteral_1= 'BfsStrategy' ) | (enumLiteral_2= 'FixedPriorityStrategy' ) | (enumLiteral_3= 'HillClimbingStrategy' ) ) ;
    public final Enumerator ruleStrategyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:2440:2: ( ( (enumLiteral_0= 'DfsStrategy' ) | (enumLiteral_1= 'BfsStrategy' ) | (enumLiteral_2= 'FixedPriorityStrategy' ) | (enumLiteral_3= 'HillClimbingStrategy' ) ) )
            // InternalDsl.g:2441:2: ( (enumLiteral_0= 'DfsStrategy' ) | (enumLiteral_1= 'BfsStrategy' ) | (enumLiteral_2= 'FixedPriorityStrategy' ) | (enumLiteral_3= 'HillClimbingStrategy' ) )
            {
            // InternalDsl.g:2441:2: ( (enumLiteral_0= 'DfsStrategy' ) | (enumLiteral_1= 'BfsStrategy' ) | (enumLiteral_2= 'FixedPriorityStrategy' ) | (enumLiteral_3= 'HillClimbingStrategy' ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt58=1;
                }
                break;
            case 56:
                {
                alt58=2;
                }
                break;
            case 57:
                {
                alt58=3;
                }
                break;
            case 58:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalDsl.g:2442:3: (enumLiteral_0= 'DfsStrategy' )
                    {
                    // InternalDsl.g:2442:3: (enumLiteral_0= 'DfsStrategy' )
                    // InternalDsl.g:2443:4: enumLiteral_0= 'DfsStrategy'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getStrategyTypeAccess().getDfsStrategyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStrategyTypeAccess().getDfsStrategyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:2450:3: (enumLiteral_1= 'BfsStrategy' )
                    {
                    // InternalDsl.g:2450:3: (enumLiteral_1= 'BfsStrategy' )
                    // InternalDsl.g:2451:4: enumLiteral_1= 'BfsStrategy'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getStrategyTypeAccess().getBfsStrategyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStrategyTypeAccess().getBfsStrategyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:2458:3: (enumLiteral_2= 'FixedPriorityStrategy' )
                    {
                    // InternalDsl.g:2458:3: (enumLiteral_2= 'FixedPriorityStrategy' )
                    // InternalDsl.g:2459:4: enumLiteral_2= 'FixedPriorityStrategy'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getStrategyTypeAccess().getFixedPriorityStrategyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStrategyTypeAccess().getFixedPriorityStrategyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:2466:3: (enumLiteral_3= 'HillClimbingStrategy' )
                    {
                    // InternalDsl.g:2466:3: (enumLiteral_3= 'HillClimbingStrategy' )
                    // InternalDsl.g:2467:4: enumLiteral_3= 'HillClimbingStrategy'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getStrategyTypeAccess().getHillClimbingStrategyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getStrategyTypeAccess().getHillClimbingStrategyEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleStrategyType"


    // $ANTLR start "ruleComparators"
    // InternalDsl.g:2477:1: ruleComparators returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGHER_IS_BETTER' ) | (enumLiteral_1= 'LOWER_IS_BETTER' ) | (enumLiteral_2= 'DIFFERENCE_TO_ZERO_IS_BETTER' ) ) ;
    public final Enumerator ruleComparators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:2483:2: ( ( (enumLiteral_0= 'HIGHER_IS_BETTER' ) | (enumLiteral_1= 'LOWER_IS_BETTER' ) | (enumLiteral_2= 'DIFFERENCE_TO_ZERO_IS_BETTER' ) ) )
            // InternalDsl.g:2484:2: ( (enumLiteral_0= 'HIGHER_IS_BETTER' ) | (enumLiteral_1= 'LOWER_IS_BETTER' ) | (enumLiteral_2= 'DIFFERENCE_TO_ZERO_IS_BETTER' ) )
            {
            // InternalDsl.g:2484:2: ( (enumLiteral_0= 'HIGHER_IS_BETTER' ) | (enumLiteral_1= 'LOWER_IS_BETTER' ) | (enumLiteral_2= 'DIFFERENCE_TO_ZERO_IS_BETTER' ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt59=1;
                }
                break;
            case 60:
                {
                alt59=2;
                }
                break;
            case 61:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalDsl.g:2485:3: (enumLiteral_0= 'HIGHER_IS_BETTER' )
                    {
                    // InternalDsl.g:2485:3: (enumLiteral_0= 'HIGHER_IS_BETTER' )
                    // InternalDsl.g:2486:4: enumLiteral_0= 'HIGHER_IS_BETTER'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getComparatorsAccess().getHIGHER_IS_BETTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparatorsAccess().getHIGHER_IS_BETTEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:2493:3: (enumLiteral_1= 'LOWER_IS_BETTER' )
                    {
                    // InternalDsl.g:2493:3: (enumLiteral_1= 'LOWER_IS_BETTER' )
                    // InternalDsl.g:2494:4: enumLiteral_1= 'LOWER_IS_BETTER'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getComparatorsAccess().getLOWER_IS_BETTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparatorsAccess().getLOWER_IS_BETTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:2501:3: (enumLiteral_2= 'DIFFERENCE_TO_ZERO_IS_BETTER' )
                    {
                    // InternalDsl.g:2501:3: (enumLiteral_2= 'DIFFERENCE_TO_ZERO_IS_BETTER' )
                    // InternalDsl.g:2502:4: enumLiteral_2= 'DIFFERENCE_TO_ZERO_IS_BETTER'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getComparatorsAccess().getDIFFERENCE_TO_ZERO_IS_BETTEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparatorsAccess().getDIFFERENCE_TO_ZERO_IS_BETTEREnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleComparators"


    // $ANTLR start "ruleModelQueryType"
    // InternalDsl.g:2512:1: ruleModelQueryType returns [Enumerator current=null] : ( (enumLiteral_0= 'MUST_HAVE_MATCH' ) | (enumLiteral_1= 'NO_MATCH' ) ) ;
    public final Enumerator ruleModelQueryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2518:2: ( ( (enumLiteral_0= 'MUST_HAVE_MATCH' ) | (enumLiteral_1= 'NO_MATCH' ) ) )
            // InternalDsl.g:2519:2: ( (enumLiteral_0= 'MUST_HAVE_MATCH' ) | (enumLiteral_1= 'NO_MATCH' ) )
            {
            // InternalDsl.g:2519:2: ( (enumLiteral_0= 'MUST_HAVE_MATCH' ) | (enumLiteral_1= 'NO_MATCH' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==62) ) {
                alt60=1;
            }
            else if ( (LA60_0==63) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalDsl.g:2520:3: (enumLiteral_0= 'MUST_HAVE_MATCH' )
                    {
                    // InternalDsl.g:2520:3: (enumLiteral_0= 'MUST_HAVE_MATCH' )
                    // InternalDsl.g:2521:4: enumLiteral_0= 'MUST_HAVE_MATCH'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getModelQueryTypeAccess().getMUST_HAVE_MATCHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModelQueryTypeAccess().getMUST_HAVE_MATCHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:2528:3: (enumLiteral_1= 'NO_MATCH' )
                    {
                    // InternalDsl.g:2528:3: (enumLiteral_1= 'NO_MATCH' )
                    // InternalDsl.g:2529:4: enumLiteral_1= 'NO_MATCH'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getModelQueryTypeAccess().getNO_MATCHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModelQueryTypeAccess().getNO_MATCHEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleModelQueryType"


    // $ANTLR start "ruleEvolutionStrategyType"
    // InternalDsl.g:2539:1: ruleEvolutionStrategyType returns [Enumerator current=null] : ( (enumLiteral_0= 'Nsga2' ) | (enumLiteral_1= 'Pesa' ) ) ;
    public final Enumerator ruleEvolutionStrategyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2545:2: ( ( (enumLiteral_0= 'Nsga2' ) | (enumLiteral_1= 'Pesa' ) ) )
            // InternalDsl.g:2546:2: ( (enumLiteral_0= 'Nsga2' ) | (enumLiteral_1= 'Pesa' ) )
            {
            // InternalDsl.g:2546:2: ( (enumLiteral_0= 'Nsga2' ) | (enumLiteral_1= 'Pesa' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==64) ) {
                alt61=1;
            }
            else if ( (LA61_0==65) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalDsl.g:2547:3: (enumLiteral_0= 'Nsga2' )
                    {
                    // InternalDsl.g:2547:3: (enumLiteral_0= 'Nsga2' )
                    // InternalDsl.g:2548:4: enumLiteral_0= 'Nsga2'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getEvolutionStrategyTypeAccess().getNsga2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvolutionStrategyTypeAccess().getNsga2EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:2555:3: (enumLiteral_1= 'Pesa' )
                    {
                    // InternalDsl.g:2555:3: (enumLiteral_1= 'Pesa' )
                    // InternalDsl.g:2556:4: enumLiteral_1= 'Pesa'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getEvolutionStrategyTypeAccess().getPesaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvolutionStrategyTypeAccess().getPesaEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleEvolutionStrategyType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000CC09C67A08802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C6010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001C4010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000F910000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000E010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000060110000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000280100030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200100030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0780000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x3810002000101040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x3810002000100040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x3800000000100000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x3810032000100040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x3800030000100000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x3800020000100000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010002000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00103C0000100040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00003C0000100000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000380000100000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000300000100000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0013000000100040L,0x0000000000000003L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0003000000100000L,0x0000000000000003L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0003000000100000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000100000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000020040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0060000000000002L});

}