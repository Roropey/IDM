package fr.n7.simplepdl.txt.ide.contentassist.antlr.internal;

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
import fr.n7.simplepdl.txt.services.PDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'process'", "'{'", "'}'", "'ProcessElement'", "'wd'", "'ws'", "'from'", "'to'", "'Guidance'", "'text'", "'elements'", "'('", "')'", "','", "'Ressource'", "'stock'", "'work'", "'AskedRessource'", "'quantity'", "'ressource'", "'-'"
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


        public InternalPDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL.g"; }


    	private PDLGrammarAccess grammarAccess;

    	public void setGrammarAccess(PDLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalPDL.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL.g:54:1: ( ruleProcess EOF )
            // InternalPDL.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL.g:78:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // InternalPDL.g:79:1: ( ruleProcessElement EOF )
            // InternalPDL.g:80:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL.g:87:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:91:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // InternalPDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            {
            // InternalPDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            // InternalPDL.g:93:3: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // InternalPDL.g:94:3: ( rule__ProcessElement__Alternatives )
            // InternalPDL.g:94:4: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleEString"
    // InternalPDL.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPDL.g:104:1: ( ruleEString EOF )
            // InternalPDL.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPDL.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPDL.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPDL.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalPDL.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPDL.g:119:3: ( rule__EString__Alternatives )
            // InternalPDL.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleProcessElement_Impl"
    // InternalPDL.g:128:1: entryRuleProcessElement_Impl : ruleProcessElement_Impl EOF ;
    public final void entryRuleProcessElement_Impl() throws RecognitionException {
        try {
            // InternalPDL.g:129:1: ( ruleProcessElement_Impl EOF )
            // InternalPDL.g:130:1: ruleProcessElement_Impl EOF
            {
             before(grammarAccess.getProcessElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement_Impl();

            state._fsp--;

             after(grammarAccess.getProcessElement_ImplRule()); 
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
    // $ANTLR end "entryRuleProcessElement_Impl"


    // $ANTLR start "ruleProcessElement_Impl"
    // InternalPDL.g:137:1: ruleProcessElement_Impl : ( ( rule__ProcessElement_Impl__Group__0 ) ) ;
    public final void ruleProcessElement_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:141:2: ( ( ( rule__ProcessElement_Impl__Group__0 ) ) )
            // InternalPDL.g:142:2: ( ( rule__ProcessElement_Impl__Group__0 ) )
            {
            // InternalPDL.g:142:2: ( ( rule__ProcessElement_Impl__Group__0 ) )
            // InternalPDL.g:143:3: ( rule__ProcessElement_Impl__Group__0 )
            {
             before(grammarAccess.getProcessElement_ImplAccess().getGroup()); 
            // InternalPDL.g:144:3: ( rule__ProcessElement_Impl__Group__0 )
            // InternalPDL.g:144:4: rule__ProcessElement_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessElement_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleProcessElement_Impl"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL.g:153:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalPDL.g:154:1: ( ruleWorkDefinition EOF )
            // InternalPDL.g:155:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL.g:162:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:166:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalPDL.g:167:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalPDL.g:167:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalPDL.g:168:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalPDL.g:169:3: ( rule__WorkDefinition__Group__0 )
            // InternalPDL.g:169:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL.g:178:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDL.g:179:1: ( ruleWorkSequence EOF )
            // InternalPDL.g:180:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL.g:187:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:191:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDL.g:192:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDL.g:192:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDL.g:193:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDL.g:194:3: ( rule__WorkSequence__Group__0 )
            // InternalPDL.g:194:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL.g:203:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalPDL.g:204:1: ( ruleGuidance EOF )
            // InternalPDL.g:205:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL.g:212:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:216:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalPDL.g:217:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalPDL.g:217:2: ( ( rule__Guidance__Group__0 ) )
            // InternalPDL.g:218:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalPDL.g:219:3: ( rule__Guidance__Group__0 )
            // InternalPDL.g:219:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleRessource"
    // InternalPDL.g:228:1: entryRuleRessource : ruleRessource EOF ;
    public final void entryRuleRessource() throws RecognitionException {
        try {
            // InternalPDL.g:229:1: ( ruleRessource EOF )
            // InternalPDL.g:230:1: ruleRessource EOF
            {
             before(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            ruleRessource();

            state._fsp--;

             after(grammarAccess.getRessourceRule()); 
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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalPDL.g:237:1: ruleRessource : ( ( rule__Ressource__Group__0 ) ) ;
    public final void ruleRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:241:2: ( ( ( rule__Ressource__Group__0 ) ) )
            // InternalPDL.g:242:2: ( ( rule__Ressource__Group__0 ) )
            {
            // InternalPDL.g:242:2: ( ( rule__Ressource__Group__0 ) )
            // InternalPDL.g:243:3: ( rule__Ressource__Group__0 )
            {
             before(grammarAccess.getRessourceAccess().getGroup()); 
            // InternalPDL.g:244:3: ( rule__Ressource__Group__0 )
            // InternalPDL.g:244:4: rule__Ressource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getGroup()); 

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
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleAskedRessource"
    // InternalPDL.g:253:1: entryRuleAskedRessource : ruleAskedRessource EOF ;
    public final void entryRuleAskedRessource() throws RecognitionException {
        try {
            // InternalPDL.g:254:1: ( ruleAskedRessource EOF )
            // InternalPDL.g:255:1: ruleAskedRessource EOF
            {
             before(grammarAccess.getAskedRessourceRule()); 
            pushFollow(FOLLOW_1);
            ruleAskedRessource();

            state._fsp--;

             after(grammarAccess.getAskedRessourceRule()); 
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
    // $ANTLR end "entryRuleAskedRessource"


    // $ANTLR start "ruleAskedRessource"
    // InternalPDL.g:262:1: ruleAskedRessource : ( ( rule__AskedRessource__Group__0 ) ) ;
    public final void ruleAskedRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:266:2: ( ( ( rule__AskedRessource__Group__0 ) ) )
            // InternalPDL.g:267:2: ( ( rule__AskedRessource__Group__0 ) )
            {
            // InternalPDL.g:267:2: ( ( rule__AskedRessource__Group__0 ) )
            // InternalPDL.g:268:3: ( rule__AskedRessource__Group__0 )
            {
             before(grammarAccess.getAskedRessourceAccess().getGroup()); 
            // InternalPDL.g:269:3: ( rule__AskedRessource__Group__0 )
            // InternalPDL.g:269:4: rule__AskedRessource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AskedRessource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAskedRessourceAccess().getGroup()); 

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
    // $ANTLR end "ruleAskedRessource"


    // $ANTLR start "entryRuleEInt"
    // InternalPDL.g:278:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalPDL.g:279:1: ( ruleEInt EOF )
            // InternalPDL.g:280:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPDL.g:287:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:291:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalPDL.g:292:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalPDL.g:292:2: ( ( rule__EInt__Group__0 ) )
            // InternalPDL.g:293:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalPDL.g:294:3: ( rule__EInt__Group__0 )
            // InternalPDL.g:294:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL.g:303:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:307:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL.g:308:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL.g:308:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL.g:309:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL.g:310:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL.g:310:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // InternalPDL.g:318:1: rule__ProcessElement__Alternatives : ( ( ruleProcessElement_Impl ) | ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessource ) | ( ruleAskedRessource ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:322:1: ( ( ruleProcessElement_Impl ) | ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessource ) | ( ruleAskedRessource ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            case 29:
                {
                alt1=5;
                }
                break;
            case 32:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPDL.g:323:2: ( ruleProcessElement_Impl )
                    {
                    // InternalPDL.g:323:2: ( ruleProcessElement_Impl )
                    // InternalPDL.g:324:3: ruleProcessElement_Impl
                    {
                     before(grammarAccess.getProcessElementAccess().getProcessElement_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleProcessElement_Impl();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getProcessElement_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:329:2: ( ruleWorkDefinition )
                    {
                    // InternalPDL.g:329:2: ( ruleWorkDefinition )
                    // InternalPDL.g:330:3: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:335:2: ( ruleWorkSequence )
                    {
                    // InternalPDL.g:335:2: ( ruleWorkSequence )
                    // InternalPDL.g:336:3: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:341:2: ( ruleGuidance )
                    {
                    // InternalPDL.g:341:2: ( ruleGuidance )
                    // InternalPDL.g:342:3: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPDL.g:347:2: ( ruleRessource )
                    {
                    // InternalPDL.g:347:2: ( ruleRessource )
                    // InternalPDL.g:348:3: ruleRessource
                    {
                     before(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRessource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPDL.g:353:2: ( ruleAskedRessource )
                    {
                    // InternalPDL.g:353:2: ( ruleAskedRessource )
                    // InternalPDL.g:354:3: ruleAskedRessource
                    {
                     before(grammarAccess.getProcessElementAccess().getAskedRessourceParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAskedRessource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getAskedRessourceParserRuleCall_5()); 

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
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPDL.g:363:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:367:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalPDL.g:368:2: ( RULE_STRING )
                    {
                    // InternalPDL.g:368:2: ( RULE_STRING )
                    // InternalPDL.g:369:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:374:2: ( RULE_ID )
                    {
                    // InternalPDL.g:374:2: ( RULE_ID )
                    // InternalPDL.g:375:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDL.g:384:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:388:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPDL.g:389:2: ( ( 's2s' ) )
                    {
                    // InternalPDL.g:389:2: ( ( 's2s' ) )
                    // InternalPDL.g:390:3: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 
                    // InternalPDL.g:391:3: ( 's2s' )
                    // InternalPDL.g:391:4: 's2s'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:395:2: ( ( 'f2s' ) )
                    {
                    // InternalPDL.g:395:2: ( ( 'f2s' ) )
                    // InternalPDL.g:396:3: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 
                    // InternalPDL.g:397:3: ( 'f2s' )
                    // InternalPDL.g:397:4: 'f2s'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:401:2: ( ( 's2f' ) )
                    {
                    // InternalPDL.g:401:2: ( ( 's2f' ) )
                    // InternalPDL.g:402:3: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 
                    // InternalPDL.g:403:3: ( 's2f' )
                    // InternalPDL.g:403:4: 's2f'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:407:2: ( ( 'f2f' ) )
                    {
                    // InternalPDL.g:407:2: ( ( 'f2f' ) )
                    // InternalPDL.g:408:3: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 
                    // InternalPDL.g:409:3: ( 'f2f' )
                    // InternalPDL.g:409:4: 'f2f'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalPDL.g:417:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:421:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL.g:422:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

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
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalPDL.g:429:1: rule__Process__Group__0__Impl : ( () ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:433:1: ( ( () ) )
            // InternalPDL.g:434:1: ( () )
            {
            // InternalPDL.g:434:1: ( () )
            // InternalPDL.g:435:2: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0()); 
            // InternalPDL.g:436:2: ()
            // InternalPDL.g:436:3: 
            {
            }

             after(grammarAccess.getProcessAccess().getProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalPDL.g:444:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:448:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL.g:449:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

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
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalPDL.g:456:1: rule__Process__Group__1__Impl : ( 'process' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:460:1: ( ( 'process' ) )
            // InternalPDL.g:461:1: ( 'process' )
            {
            // InternalPDL.g:461:1: ( 'process' )
            // InternalPDL.g:462:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_1()); 

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
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalPDL.g:471:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:475:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL.g:476:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

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
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalPDL.g:483:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:487:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // InternalPDL.g:488:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // InternalPDL.g:488:1: ( ( rule__Process__NameAssignment_2 ) )
            // InternalPDL.g:489:2: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // InternalPDL.g:490:2: ( rule__Process__NameAssignment_2 )
            // InternalPDL.g:490:3: rule__Process__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalPDL.g:498:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:502:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL.g:503:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

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
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalPDL.g:510:1: rule__Process__Group__3__Impl : ( '{' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:514:1: ( ( '{' ) )
            // InternalPDL.g:515:1: ( '{' )
            {
            // InternalPDL.g:515:1: ( '{' )
            // InternalPDL.g:516:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalPDL.g:525:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:529:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalPDL.g:530:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

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
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalPDL.g:537:1: rule__Process__Group__4__Impl : ( ( rule__Process__ProcessElementsAssignment_4 )* ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:541:1: ( ( ( rule__Process__ProcessElementsAssignment_4 )* ) )
            // InternalPDL.g:542:1: ( ( rule__Process__ProcessElementsAssignment_4 )* )
            {
            // InternalPDL.g:542:1: ( ( rule__Process__ProcessElementsAssignment_4 )* )
            // InternalPDL.g:543:2: ( rule__Process__ProcessElementsAssignment_4 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_4()); 
            // InternalPDL.g:544:2: ( rule__Process__ProcessElementsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=20)||LA4_0==23||LA4_0==29||LA4_0==32) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPDL.g:544:3: rule__Process__ProcessElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__ProcessElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_4()); 

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
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalPDL.g:552:1: rule__Process__Group__5 : rule__Process__Group__5__Impl ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:556:1: ( rule__Process__Group__5__Impl )
            // InternalPDL.g:557:2: rule__Process__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__5__Impl();

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
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalPDL.g:563:1: rule__Process__Group__5__Impl : ( '}' ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:567:1: ( ( '}' ) )
            // InternalPDL.g:568:1: ( '}' )
            {
            // InternalPDL.g:568:1: ( '}' )
            // InternalPDL.g:569:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__ProcessElement_Impl__Group__0"
    // InternalPDL.g:579:1: rule__ProcessElement_Impl__Group__0 : rule__ProcessElement_Impl__Group__0__Impl rule__ProcessElement_Impl__Group__1 ;
    public final void rule__ProcessElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:583:1: ( rule__ProcessElement_Impl__Group__0__Impl rule__ProcessElement_Impl__Group__1 )
            // InternalPDL.g:584:2: rule__ProcessElement_Impl__Group__0__Impl rule__ProcessElement_Impl__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ProcessElement_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessElement_Impl__Group__1();

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
    // $ANTLR end "rule__ProcessElement_Impl__Group__0"


    // $ANTLR start "rule__ProcessElement_Impl__Group__0__Impl"
    // InternalPDL.g:591:1: rule__ProcessElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ProcessElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:595:1: ( ( () ) )
            // InternalPDL.g:596:1: ( () )
            {
            // InternalPDL.g:596:1: ( () )
            // InternalPDL.g:597:2: ()
            {
             before(grammarAccess.getProcessElement_ImplAccess().getProcessElementAction_0()); 
            // InternalPDL.g:598:2: ()
            // InternalPDL.g:598:3: 
            {
            }

             after(grammarAccess.getProcessElement_ImplAccess().getProcessElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessElement_Impl__Group__0__Impl"


    // $ANTLR start "rule__ProcessElement_Impl__Group__1"
    // InternalPDL.g:606:1: rule__ProcessElement_Impl__Group__1 : rule__ProcessElement_Impl__Group__1__Impl ;
    public final void rule__ProcessElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:610:1: ( rule__ProcessElement_Impl__Group__1__Impl )
            // InternalPDL.g:611:2: rule__ProcessElement_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__ProcessElement_Impl__Group__1"


    // $ANTLR start "rule__ProcessElement_Impl__Group__1__Impl"
    // InternalPDL.g:617:1: rule__ProcessElement_Impl__Group__1__Impl : ( 'ProcessElement' ) ;
    public final void rule__ProcessElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:621:1: ( ( 'ProcessElement' ) )
            // InternalPDL.g:622:1: ( 'ProcessElement' )
            {
            // InternalPDL.g:622:1: ( 'ProcessElement' )
            // InternalPDL.g:623:2: 'ProcessElement'
            {
             before(grammarAccess.getProcessElement_ImplAccess().getProcessElementKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessElement_ImplAccess().getProcessElementKeyword_1()); 

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
    // $ANTLR end "rule__ProcessElement_Impl__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalPDL.g:633:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:637:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalPDL.g:638:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

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
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalPDL.g:645:1: rule__WorkDefinition__Group__0__Impl : ( () ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:649:1: ( ( () ) )
            // InternalPDL.g:650:1: ( () )
            {
            // InternalPDL.g:650:1: ( () )
            // InternalPDL.g:651:2: ()
            {
             before(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 
            // InternalPDL.g:652:2: ()
            // InternalPDL.g:652:3: 
            {
            }

             after(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalPDL.g:660:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:664:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalPDL.g:665:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

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
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalPDL.g:672:1: rule__WorkDefinition__Group__1__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:676:1: ( ( 'wd' ) )
            // InternalPDL.g:677:1: ( 'wd' )
            {
            // InternalPDL.g:677:1: ( 'wd' )
            // InternalPDL.g:678:2: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalPDL.g:687:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:691:1: ( rule__WorkDefinition__Group__2__Impl )
            // InternalPDL.g:692:2: rule__WorkDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalPDL.g:698:1: rule__WorkDefinition__Group__2__Impl : ( ( rule__WorkDefinition__NameAssignment_2 ) ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:702:1: ( ( ( rule__WorkDefinition__NameAssignment_2 ) ) )
            // InternalPDL.g:703:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            {
            // InternalPDL.g:703:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            // InternalPDL.g:704:2: ( rule__WorkDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 
            // InternalPDL.g:705:2: ( rule__WorkDefinition__NameAssignment_2 )
            // InternalPDL.g:705:3: rule__WorkDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL.g:714:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:718:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL.g:719:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

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
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalPDL.g:726:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:730:1: ( ( 'ws' ) )
            // InternalPDL.g:731:1: ( 'ws' )
            {
            // InternalPDL.g:731:1: ( 'ws' )
            // InternalPDL.g:732:2: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

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
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalPDL.g:741:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:745:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL.g:746:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

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
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalPDL.g:753:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:757:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // InternalPDL.g:758:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // InternalPDL.g:758:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // InternalPDL.g:759:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // InternalPDL.g:760:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // InternalPDL.g:760:3: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

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
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalPDL.g:768:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:772:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalPDL.g:773:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

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
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalPDL.g:780:1: rule__WorkSequence__Group__2__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:784:1: ( ( 'from' ) )
            // InternalPDL.g:785:1: ( 'from' )
            {
            // InternalPDL.g:785:1: ( 'from' )
            // InternalPDL.g:786:2: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 

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
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalPDL.g:795:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:799:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalPDL.g:800:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

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
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalPDL.g:807:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:811:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // InternalPDL.g:812:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // InternalPDL.g:812:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // InternalPDL.g:813:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // InternalPDL.g:814:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            // InternalPDL.g:814:3: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 

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
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalPDL.g:822:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:826:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalPDL.g:827:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5();

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
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalPDL.g:834:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:838:1: ( ( 'to' ) )
            // InternalPDL.g:839:1: ( 'to' )
            {
            // InternalPDL.g:839:1: ( 'to' )
            // InternalPDL.g:840:2: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 

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
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // InternalPDL.g:849:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:853:1: ( rule__WorkSequence__Group__5__Impl )
            // InternalPDL.g:854:2: rule__WorkSequence__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5__Impl();

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
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // InternalPDL.g:860:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:864:1: ( ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) )
            // InternalPDL.g:865:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            {
            // InternalPDL.g:865:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            // InternalPDL.g:866:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 
            // InternalPDL.g:867:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            // InternalPDL.g:867:3: rule__WorkSequence__SuccessorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 

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
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalPDL.g:876:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:880:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalPDL.g:881:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

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
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalPDL.g:888:1: rule__Guidance__Group__0__Impl : ( 'Guidance' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:892:1: ( ( 'Guidance' ) )
            // InternalPDL.g:893:1: ( 'Guidance' )
            {
            // InternalPDL.g:893:1: ( 'Guidance' )
            // InternalPDL.g:894:2: 'Guidance'
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getGuidanceKeyword_0()); 

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
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalPDL.g:903:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:907:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // InternalPDL.g:908:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2();

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
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalPDL.g:915:1: rule__Guidance__Group__1__Impl : ( '{' ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:919:1: ( ( '{' ) )
            // InternalPDL.g:920:1: ( '{' )
            {
            // InternalPDL.g:920:1: ( '{' )
            // InternalPDL.g:921:2: '{'
            {
             before(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Guidance__Group__2"
    // InternalPDL.g:930:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:934:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // InternalPDL.g:935:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__3();

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
    // $ANTLR end "rule__Guidance__Group__2"


    // $ANTLR start "rule__Guidance__Group__2__Impl"
    // InternalPDL.g:942:1: rule__Guidance__Group__2__Impl : ( 'text' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:946:1: ( ( 'text' ) )
            // InternalPDL.g:947:1: ( 'text' )
            {
            // InternalPDL.g:947:1: ( 'text' )
            // InternalPDL.g:948:2: 'text'
            {
             before(grammarAccess.getGuidanceAccess().getTextKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTextKeyword_2()); 

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
    // $ANTLR end "rule__Guidance__Group__2__Impl"


    // $ANTLR start "rule__Guidance__Group__3"
    // InternalPDL.g:957:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:961:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // InternalPDL.g:962:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__4();

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
    // $ANTLR end "rule__Guidance__Group__3"


    // $ANTLR start "rule__Guidance__Group__3__Impl"
    // InternalPDL.g:969:1: rule__Guidance__Group__3__Impl : ( ( rule__Guidance__TextAssignment_3 ) ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:973:1: ( ( ( rule__Guidance__TextAssignment_3 ) ) )
            // InternalPDL.g:974:1: ( ( rule__Guidance__TextAssignment_3 ) )
            {
            // InternalPDL.g:974:1: ( ( rule__Guidance__TextAssignment_3 ) )
            // InternalPDL.g:975:2: ( rule__Guidance__TextAssignment_3 )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment_3()); 
            // InternalPDL.g:976:2: ( rule__Guidance__TextAssignment_3 )
            // InternalPDL.g:976:3: rule__Guidance__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment_3()); 

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
    // $ANTLR end "rule__Guidance__Group__3__Impl"


    // $ANTLR start "rule__Guidance__Group__4"
    // InternalPDL.g:984:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl rule__Guidance__Group__5 ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:988:1: ( rule__Guidance__Group__4__Impl rule__Guidance__Group__5 )
            // InternalPDL.g:989:2: rule__Guidance__Group__4__Impl rule__Guidance__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Guidance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__5();

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
    // $ANTLR end "rule__Guidance__Group__4"


    // $ANTLR start "rule__Guidance__Group__4__Impl"
    // InternalPDL.g:996:1: rule__Guidance__Group__4__Impl : ( ( rule__Guidance__Group_4__0 )? ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1000:1: ( ( ( rule__Guidance__Group_4__0 )? ) )
            // InternalPDL.g:1001:1: ( ( rule__Guidance__Group_4__0 )? )
            {
            // InternalPDL.g:1001:1: ( ( rule__Guidance__Group_4__0 )? )
            // InternalPDL.g:1002:2: ( rule__Guidance__Group_4__0 )?
            {
             before(grammarAccess.getGuidanceAccess().getGroup_4()); 
            // InternalPDL.g:1003:2: ( rule__Guidance__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPDL.g:1003:3: rule__Guidance__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guidance__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuidanceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Guidance__Group__4__Impl"


    // $ANTLR start "rule__Guidance__Group__5"
    // InternalPDL.g:1011:1: rule__Guidance__Group__5 : rule__Guidance__Group__5__Impl ;
    public final void rule__Guidance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1015:1: ( rule__Guidance__Group__5__Impl )
            // InternalPDL.g:1016:2: rule__Guidance__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__5__Impl();

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
    // $ANTLR end "rule__Guidance__Group__5"


    // $ANTLR start "rule__Guidance__Group__5__Impl"
    // InternalPDL.g:1022:1: rule__Guidance__Group__5__Impl : ( '}' ) ;
    public final void rule__Guidance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1026:1: ( ( '}' ) )
            // InternalPDL.g:1027:1: ( '}' )
            {
            // InternalPDL.g:1027:1: ( '}' )
            // InternalPDL.g:1028:2: '}'
            {
             before(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Guidance__Group__5__Impl"


    // $ANTLR start "rule__Guidance__Group_4__0"
    // InternalPDL.g:1038:1: rule__Guidance__Group_4__0 : rule__Guidance__Group_4__0__Impl rule__Guidance__Group_4__1 ;
    public final void rule__Guidance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1042:1: ( rule__Guidance__Group_4__0__Impl rule__Guidance__Group_4__1 )
            // InternalPDL.g:1043:2: rule__Guidance__Group_4__0__Impl rule__Guidance__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Guidance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__1();

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
    // $ANTLR end "rule__Guidance__Group_4__0"


    // $ANTLR start "rule__Guidance__Group_4__0__Impl"
    // InternalPDL.g:1050:1: rule__Guidance__Group_4__0__Impl : ( 'elements' ) ;
    public final void rule__Guidance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1054:1: ( ( 'elements' ) )
            // InternalPDL.g:1055:1: ( 'elements' )
            {
            // InternalPDL.g:1055:1: ( 'elements' )
            // InternalPDL.g:1056:2: 'elements'
            {
             before(grammarAccess.getGuidanceAccess().getElementsKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsKeyword_4_0()); 

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
    // $ANTLR end "rule__Guidance__Group_4__0__Impl"


    // $ANTLR start "rule__Guidance__Group_4__1"
    // InternalPDL.g:1065:1: rule__Guidance__Group_4__1 : rule__Guidance__Group_4__1__Impl rule__Guidance__Group_4__2 ;
    public final void rule__Guidance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1069:1: ( rule__Guidance__Group_4__1__Impl rule__Guidance__Group_4__2 )
            // InternalPDL.g:1070:2: rule__Guidance__Group_4__1__Impl rule__Guidance__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__2();

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
    // $ANTLR end "rule__Guidance__Group_4__1"


    // $ANTLR start "rule__Guidance__Group_4__1__Impl"
    // InternalPDL.g:1077:1: rule__Guidance__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Guidance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1081:1: ( ( '(' ) )
            // InternalPDL.g:1082:1: ( '(' )
            {
            // InternalPDL.g:1082:1: ( '(' )
            // InternalPDL.g:1083:2: '('
            {
             before(grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_4_1()); 

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
    // $ANTLR end "rule__Guidance__Group_4__1__Impl"


    // $ANTLR start "rule__Guidance__Group_4__2"
    // InternalPDL.g:1092:1: rule__Guidance__Group_4__2 : rule__Guidance__Group_4__2__Impl rule__Guidance__Group_4__3 ;
    public final void rule__Guidance__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1096:1: ( rule__Guidance__Group_4__2__Impl rule__Guidance__Group_4__3 )
            // InternalPDL.g:1097:2: rule__Guidance__Group_4__2__Impl rule__Guidance__Group_4__3
            {
            pushFollow(FOLLOW_17);
            rule__Guidance__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__3();

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
    // $ANTLR end "rule__Guidance__Group_4__2"


    // $ANTLR start "rule__Guidance__Group_4__2__Impl"
    // InternalPDL.g:1104:1: rule__Guidance__Group_4__2__Impl : ( ( rule__Guidance__ElementsAssignment_4_2 ) ) ;
    public final void rule__Guidance__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1108:1: ( ( ( rule__Guidance__ElementsAssignment_4_2 ) ) )
            // InternalPDL.g:1109:1: ( ( rule__Guidance__ElementsAssignment_4_2 ) )
            {
            // InternalPDL.g:1109:1: ( ( rule__Guidance__ElementsAssignment_4_2 ) )
            // InternalPDL.g:1110:2: ( rule__Guidance__ElementsAssignment_4_2 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_4_2()); 
            // InternalPDL.g:1111:2: ( rule__Guidance__ElementsAssignment_4_2 )
            // InternalPDL.g:1111:3: rule__Guidance__ElementsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_4_2()); 

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
    // $ANTLR end "rule__Guidance__Group_4__2__Impl"


    // $ANTLR start "rule__Guidance__Group_4__3"
    // InternalPDL.g:1119:1: rule__Guidance__Group_4__3 : rule__Guidance__Group_4__3__Impl rule__Guidance__Group_4__4 ;
    public final void rule__Guidance__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1123:1: ( rule__Guidance__Group_4__3__Impl rule__Guidance__Group_4__4 )
            // InternalPDL.g:1124:2: rule__Guidance__Group_4__3__Impl rule__Guidance__Group_4__4
            {
            pushFollow(FOLLOW_17);
            rule__Guidance__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__4();

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
    // $ANTLR end "rule__Guidance__Group_4__3"


    // $ANTLR start "rule__Guidance__Group_4__3__Impl"
    // InternalPDL.g:1131:1: rule__Guidance__Group_4__3__Impl : ( ( rule__Guidance__Group_4_3__0 )* ) ;
    public final void rule__Guidance__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1135:1: ( ( ( rule__Guidance__Group_4_3__0 )* ) )
            // InternalPDL.g:1136:1: ( ( rule__Guidance__Group_4_3__0 )* )
            {
            // InternalPDL.g:1136:1: ( ( rule__Guidance__Group_4_3__0 )* )
            // InternalPDL.g:1137:2: ( rule__Guidance__Group_4_3__0 )*
            {
             before(grammarAccess.getGuidanceAccess().getGroup_4_3()); 
            // InternalPDL.g:1138:2: ( rule__Guidance__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPDL.g:1138:3: rule__Guidance__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Guidance__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGuidanceAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Guidance__Group_4__3__Impl"


    // $ANTLR start "rule__Guidance__Group_4__4"
    // InternalPDL.g:1146:1: rule__Guidance__Group_4__4 : rule__Guidance__Group_4__4__Impl ;
    public final void rule__Guidance__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1150:1: ( rule__Guidance__Group_4__4__Impl )
            // InternalPDL.g:1151:2: rule__Guidance__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__4__Impl();

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
    // $ANTLR end "rule__Guidance__Group_4__4"


    // $ANTLR start "rule__Guidance__Group_4__4__Impl"
    // InternalPDL.g:1157:1: rule__Guidance__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Guidance__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1161:1: ( ( ')' ) )
            // InternalPDL.g:1162:1: ( ')' )
            {
            // InternalPDL.g:1162:1: ( ')' )
            // InternalPDL.g:1163:2: ')'
            {
             before(grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_4_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_4_4()); 

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
    // $ANTLR end "rule__Guidance__Group_4__4__Impl"


    // $ANTLR start "rule__Guidance__Group_4_3__0"
    // InternalPDL.g:1173:1: rule__Guidance__Group_4_3__0 : rule__Guidance__Group_4_3__0__Impl rule__Guidance__Group_4_3__1 ;
    public final void rule__Guidance__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1177:1: ( rule__Guidance__Group_4_3__0__Impl rule__Guidance__Group_4_3__1 )
            // InternalPDL.g:1178:2: rule__Guidance__Group_4_3__0__Impl rule__Guidance__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4_3__1();

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
    // $ANTLR end "rule__Guidance__Group_4_3__0"


    // $ANTLR start "rule__Guidance__Group_4_3__0__Impl"
    // InternalPDL.g:1185:1: rule__Guidance__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Guidance__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1189:1: ( ( ',' ) )
            // InternalPDL.g:1190:1: ( ',' )
            {
            // InternalPDL.g:1190:1: ( ',' )
            // InternalPDL.g:1191:2: ','
            {
             before(grammarAccess.getGuidanceAccess().getCommaKeyword_4_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Guidance__Group_4_3__0__Impl"


    // $ANTLR start "rule__Guidance__Group_4_3__1"
    // InternalPDL.g:1200:1: rule__Guidance__Group_4_3__1 : rule__Guidance__Group_4_3__1__Impl ;
    public final void rule__Guidance__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1204:1: ( rule__Guidance__Group_4_3__1__Impl )
            // InternalPDL.g:1205:2: rule__Guidance__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Guidance__Group_4_3__1"


    // $ANTLR start "rule__Guidance__Group_4_3__1__Impl"
    // InternalPDL.g:1211:1: rule__Guidance__Group_4_3__1__Impl : ( ( rule__Guidance__ElementsAssignment_4_3_1 ) ) ;
    public final void rule__Guidance__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1215:1: ( ( ( rule__Guidance__ElementsAssignment_4_3_1 ) ) )
            // InternalPDL.g:1216:1: ( ( rule__Guidance__ElementsAssignment_4_3_1 ) )
            {
            // InternalPDL.g:1216:1: ( ( rule__Guidance__ElementsAssignment_4_3_1 ) )
            // InternalPDL.g:1217:2: ( rule__Guidance__ElementsAssignment_4_3_1 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_4_3_1()); 
            // InternalPDL.g:1218:2: ( rule__Guidance__ElementsAssignment_4_3_1 )
            // InternalPDL.g:1218:3: rule__Guidance__ElementsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Guidance__Group_4_3__1__Impl"


    // $ANTLR start "rule__Ressource__Group__0"
    // InternalPDL.g:1227:1: rule__Ressource__Group__0 : rule__Ressource__Group__0__Impl rule__Ressource__Group__1 ;
    public final void rule__Ressource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1231:1: ( rule__Ressource__Group__0__Impl rule__Ressource__Group__1 )
            // InternalPDL.g:1232:2: rule__Ressource__Group__0__Impl rule__Ressource__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Ressource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__1();

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
    // $ANTLR end "rule__Ressource__Group__0"


    // $ANTLR start "rule__Ressource__Group__0__Impl"
    // InternalPDL.g:1239:1: rule__Ressource__Group__0__Impl : ( 'Ressource' ) ;
    public final void rule__Ressource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1243:1: ( ( 'Ressource' ) )
            // InternalPDL.g:1244:1: ( 'Ressource' )
            {
            // InternalPDL.g:1244:1: ( 'Ressource' )
            // InternalPDL.g:1245:2: 'Ressource'
            {
             before(grammarAccess.getRessourceAccess().getRessourceKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getRessourceKeyword_0()); 

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
    // $ANTLR end "rule__Ressource__Group__0__Impl"


    // $ANTLR start "rule__Ressource__Group__1"
    // InternalPDL.g:1254:1: rule__Ressource__Group__1 : rule__Ressource__Group__1__Impl rule__Ressource__Group__2 ;
    public final void rule__Ressource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1258:1: ( rule__Ressource__Group__1__Impl rule__Ressource__Group__2 )
            // InternalPDL.g:1259:2: rule__Ressource__Group__1__Impl rule__Ressource__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Ressource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__2();

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
    // $ANTLR end "rule__Ressource__Group__1"


    // $ANTLR start "rule__Ressource__Group__1__Impl"
    // InternalPDL.g:1266:1: rule__Ressource__Group__1__Impl : ( ( rule__Ressource__NameAssignment_1 ) ) ;
    public final void rule__Ressource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1270:1: ( ( ( rule__Ressource__NameAssignment_1 ) ) )
            // InternalPDL.g:1271:1: ( ( rule__Ressource__NameAssignment_1 ) )
            {
            // InternalPDL.g:1271:1: ( ( rule__Ressource__NameAssignment_1 ) )
            // InternalPDL.g:1272:2: ( rule__Ressource__NameAssignment_1 )
            {
             before(grammarAccess.getRessourceAccess().getNameAssignment_1()); 
            // InternalPDL.g:1273:2: ( rule__Ressource__NameAssignment_1 )
            // InternalPDL.g:1273:3: rule__Ressource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Ressource__Group__1__Impl"


    // $ANTLR start "rule__Ressource__Group__2"
    // InternalPDL.g:1281:1: rule__Ressource__Group__2 : rule__Ressource__Group__2__Impl rule__Ressource__Group__3 ;
    public final void rule__Ressource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1285:1: ( rule__Ressource__Group__2__Impl rule__Ressource__Group__3 )
            // InternalPDL.g:1286:2: rule__Ressource__Group__2__Impl rule__Ressource__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Ressource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__3();

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
    // $ANTLR end "rule__Ressource__Group__2"


    // $ANTLR start "rule__Ressource__Group__2__Impl"
    // InternalPDL.g:1293:1: rule__Ressource__Group__2__Impl : ( '{' ) ;
    public final void rule__Ressource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1297:1: ( ( '{' ) )
            // InternalPDL.g:1298:1: ( '{' )
            {
            // InternalPDL.g:1298:1: ( '{' )
            // InternalPDL.g:1299:2: '{'
            {
             before(grammarAccess.getRessourceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Ressource__Group__2__Impl"


    // $ANTLR start "rule__Ressource__Group__3"
    // InternalPDL.g:1308:1: rule__Ressource__Group__3 : rule__Ressource__Group__3__Impl rule__Ressource__Group__4 ;
    public final void rule__Ressource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1312:1: ( rule__Ressource__Group__3__Impl rule__Ressource__Group__4 )
            // InternalPDL.g:1313:2: rule__Ressource__Group__3__Impl rule__Ressource__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Ressource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__4();

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
    // $ANTLR end "rule__Ressource__Group__3"


    // $ANTLR start "rule__Ressource__Group__3__Impl"
    // InternalPDL.g:1320:1: rule__Ressource__Group__3__Impl : ( 'stock' ) ;
    public final void rule__Ressource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1324:1: ( ( 'stock' ) )
            // InternalPDL.g:1325:1: ( 'stock' )
            {
            // InternalPDL.g:1325:1: ( 'stock' )
            // InternalPDL.g:1326:2: 'stock'
            {
             before(grammarAccess.getRessourceAccess().getStockKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getStockKeyword_3()); 

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
    // $ANTLR end "rule__Ressource__Group__3__Impl"


    // $ANTLR start "rule__Ressource__Group__4"
    // InternalPDL.g:1335:1: rule__Ressource__Group__4 : rule__Ressource__Group__4__Impl rule__Ressource__Group__5 ;
    public final void rule__Ressource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1339:1: ( rule__Ressource__Group__4__Impl rule__Ressource__Group__5 )
            // InternalPDL.g:1340:2: rule__Ressource__Group__4__Impl rule__Ressource__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Ressource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__5();

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
    // $ANTLR end "rule__Ressource__Group__4"


    // $ANTLR start "rule__Ressource__Group__4__Impl"
    // InternalPDL.g:1347:1: rule__Ressource__Group__4__Impl : ( ( rule__Ressource__StockAssignment_4 ) ) ;
    public final void rule__Ressource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1351:1: ( ( ( rule__Ressource__StockAssignment_4 ) ) )
            // InternalPDL.g:1352:1: ( ( rule__Ressource__StockAssignment_4 ) )
            {
            // InternalPDL.g:1352:1: ( ( rule__Ressource__StockAssignment_4 ) )
            // InternalPDL.g:1353:2: ( rule__Ressource__StockAssignment_4 )
            {
             before(grammarAccess.getRessourceAccess().getStockAssignment_4()); 
            // InternalPDL.g:1354:2: ( rule__Ressource__StockAssignment_4 )
            // InternalPDL.g:1354:3: rule__Ressource__StockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__StockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getStockAssignment_4()); 

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
    // $ANTLR end "rule__Ressource__Group__4__Impl"


    // $ANTLR start "rule__Ressource__Group__5"
    // InternalPDL.g:1362:1: rule__Ressource__Group__5 : rule__Ressource__Group__5__Impl rule__Ressource__Group__6 ;
    public final void rule__Ressource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1366:1: ( rule__Ressource__Group__5__Impl rule__Ressource__Group__6 )
            // InternalPDL.g:1367:2: rule__Ressource__Group__5__Impl rule__Ressource__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Ressource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__6();

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
    // $ANTLR end "rule__Ressource__Group__5"


    // $ANTLR start "rule__Ressource__Group__5__Impl"
    // InternalPDL.g:1374:1: rule__Ressource__Group__5__Impl : ( ( rule__Ressource__Group_5__0 )? ) ;
    public final void rule__Ressource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1378:1: ( ( ( rule__Ressource__Group_5__0 )? ) )
            // InternalPDL.g:1379:1: ( ( rule__Ressource__Group_5__0 )? )
            {
            // InternalPDL.g:1379:1: ( ( rule__Ressource__Group_5__0 )? )
            // InternalPDL.g:1380:2: ( rule__Ressource__Group_5__0 )?
            {
             before(grammarAccess.getRessourceAccess().getGroup_5()); 
            // InternalPDL.g:1381:2: ( rule__Ressource__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPDL.g:1381:3: rule__Ressource__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ressource__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRessourceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Ressource__Group__5__Impl"


    // $ANTLR start "rule__Ressource__Group__6"
    // InternalPDL.g:1389:1: rule__Ressource__Group__6 : rule__Ressource__Group__6__Impl ;
    public final void rule__Ressource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1393:1: ( rule__Ressource__Group__6__Impl )
            // InternalPDL.g:1394:2: rule__Ressource__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__6__Impl();

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
    // $ANTLR end "rule__Ressource__Group__6"


    // $ANTLR start "rule__Ressource__Group__6__Impl"
    // InternalPDL.g:1400:1: rule__Ressource__Group__6__Impl : ( '}' ) ;
    public final void rule__Ressource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1404:1: ( ( '}' ) )
            // InternalPDL.g:1405:1: ( '}' )
            {
            // InternalPDL.g:1405:1: ( '}' )
            // InternalPDL.g:1406:2: '}'
            {
             before(grammarAccess.getRessourceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Ressource__Group__6__Impl"


    // $ANTLR start "rule__Ressource__Group_5__0"
    // InternalPDL.g:1416:1: rule__Ressource__Group_5__0 : rule__Ressource__Group_5__0__Impl rule__Ressource__Group_5__1 ;
    public final void rule__Ressource__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1420:1: ( rule__Ressource__Group_5__0__Impl rule__Ressource__Group_5__1 )
            // InternalPDL.g:1421:2: rule__Ressource__Group_5__0__Impl rule__Ressource__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Ressource__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group_5__1();

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
    // $ANTLR end "rule__Ressource__Group_5__0"


    // $ANTLR start "rule__Ressource__Group_5__0__Impl"
    // InternalPDL.g:1428:1: rule__Ressource__Group_5__0__Impl : ( 'work' ) ;
    public final void rule__Ressource__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1432:1: ( ( 'work' ) )
            // InternalPDL.g:1433:1: ( 'work' )
            {
            // InternalPDL.g:1433:1: ( 'work' )
            // InternalPDL.g:1434:2: 'work'
            {
             before(grammarAccess.getRessourceAccess().getWorkKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getWorkKeyword_5_0()); 

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
    // $ANTLR end "rule__Ressource__Group_5__0__Impl"


    // $ANTLR start "rule__Ressource__Group_5__1"
    // InternalPDL.g:1443:1: rule__Ressource__Group_5__1 : rule__Ressource__Group_5__1__Impl rule__Ressource__Group_5__2 ;
    public final void rule__Ressource__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1447:1: ( rule__Ressource__Group_5__1__Impl rule__Ressource__Group_5__2 )
            // InternalPDL.g:1448:2: rule__Ressource__Group_5__1__Impl rule__Ressource__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Ressource__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group_5__2();

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
    // $ANTLR end "rule__Ressource__Group_5__1"


    // $ANTLR start "rule__Ressource__Group_5__1__Impl"
    // InternalPDL.g:1455:1: rule__Ressource__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Ressource__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1459:1: ( ( '(' ) )
            // InternalPDL.g:1460:1: ( '(' )
            {
            // InternalPDL.g:1460:1: ( '(' )
            // InternalPDL.g:1461:2: '('
            {
             before(grammarAccess.getRessourceAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__Ressource__Group_5__1__Impl"


    // $ANTLR start "rule__Ressource__Group_5__2"
    // InternalPDL.g:1470:1: rule__Ressource__Group_5__2 : rule__Ressource__Group_5__2__Impl rule__Ressource__Group_5__3 ;
    public final void rule__Ressource__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1474:1: ( rule__Ressource__Group_5__2__Impl rule__Ressource__Group_5__3 )
            // InternalPDL.g:1475:2: rule__Ressource__Group_5__2__Impl rule__Ressource__Group_5__3
            {
            pushFollow(FOLLOW_17);
            rule__Ressource__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group_5__3();

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
    // $ANTLR end "rule__Ressource__Group_5__2"


    // $ANTLR start "rule__Ressource__Group_5__2__Impl"
    // InternalPDL.g:1482:1: rule__Ressource__Group_5__2__Impl : ( ( rule__Ressource__WorkAssignment_5_2 ) ) ;
    public final void rule__Ressource__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1486:1: ( ( ( rule__Ressource__WorkAssignment_5_2 ) ) )
            // InternalPDL.g:1487:1: ( ( rule__Ressource__WorkAssignment_5_2 ) )
            {
            // InternalPDL.g:1487:1: ( ( rule__Ressource__WorkAssignment_5_2 ) )
            // InternalPDL.g:1488:2: ( rule__Ressource__WorkAssignment_5_2 )
            {
             before(grammarAccess.getRessourceAccess().getWorkAssignment_5_2()); 
            // InternalPDL.g:1489:2: ( rule__Ressource__WorkAssignment_5_2 )
            // InternalPDL.g:1489:3: rule__Ressource__WorkAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__WorkAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getWorkAssignment_5_2()); 

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
    // $ANTLR end "rule__Ressource__Group_5__2__Impl"


    // $ANTLR start "rule__Ressource__Group_5__3"
    // InternalPDL.g:1497:1: rule__Ressource__Group_5__3 : rule__Ressource__Group_5__3__Impl rule__Ressource__Group_5__4 ;
    public final void rule__Ressource__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1501:1: ( rule__Ressource__Group_5__3__Impl rule__Ressource__Group_5__4 )
            // InternalPDL.g:1502:2: rule__Ressource__Group_5__3__Impl rule__Ressource__Group_5__4
            {
            pushFollow(FOLLOW_17);
            rule__Ressource__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group_5__4();

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
    // $ANTLR end "rule__Ressource__Group_5__3"


    // $ANTLR start "rule__Ressource__Group_5__3__Impl"
    // InternalPDL.g:1509:1: rule__Ressource__Group_5__3__Impl : ( ( rule__Ressource__Group_5_3__0 )* ) ;
    public final void rule__Ressource__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1513:1: ( ( ( rule__Ressource__Group_5_3__0 )* ) )
            // InternalPDL.g:1514:1: ( ( rule__Ressource__Group_5_3__0 )* )
            {
            // InternalPDL.g:1514:1: ( ( rule__Ressource__Group_5_3__0 )* )
            // InternalPDL.g:1515:2: ( rule__Ressource__Group_5_3__0 )*
            {
             before(grammarAccess.getRessourceAccess().getGroup_5_3()); 
            // InternalPDL.g:1516:2: ( rule__Ressource__Group_5_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPDL.g:1516:3: rule__Ressource__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Ressource__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRessourceAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Ressource__Group_5__3__Impl"


    // $ANTLR start "rule__Ressource__Group_5__4"
    // InternalPDL.g:1524:1: rule__Ressource__Group_5__4 : rule__Ressource__Group_5__4__Impl ;
    public final void rule__Ressource__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1528:1: ( rule__Ressource__Group_5__4__Impl )
            // InternalPDL.g:1529:2: rule__Ressource__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group_5__4__Impl();

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
    // $ANTLR end "rule__Ressource__Group_5__4"


    // $ANTLR start "rule__Ressource__Group_5__4__Impl"
    // InternalPDL.g:1535:1: rule__Ressource__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Ressource__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1539:1: ( ( ')' ) )
            // InternalPDL.g:1540:1: ( ')' )
            {
            // InternalPDL.g:1540:1: ( ')' )
            // InternalPDL.g:1541:2: ')'
            {
             before(grammarAccess.getRessourceAccess().getRightParenthesisKeyword_5_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__Ressource__Group_5__4__Impl"


    // $ANTLR start "rule__Ressource__Group_5_3__0"
    // InternalPDL.g:1551:1: rule__Ressource__Group_5_3__0 : rule__Ressource__Group_5_3__0__Impl rule__Ressource__Group_5_3__1 ;
    public final void rule__Ressource__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1555:1: ( rule__Ressource__Group_5_3__0__Impl rule__Ressource__Group_5_3__1 )
            // InternalPDL.g:1556:2: rule__Ressource__Group_5_3__0__Impl rule__Ressource__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Ressource__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group_5_3__1();

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
    // $ANTLR end "rule__Ressource__Group_5_3__0"


    // $ANTLR start "rule__Ressource__Group_5_3__0__Impl"
    // InternalPDL.g:1563:1: rule__Ressource__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Ressource__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1567:1: ( ( ',' ) )
            // InternalPDL.g:1568:1: ( ',' )
            {
            // InternalPDL.g:1568:1: ( ',' )
            // InternalPDL.g:1569:2: ','
            {
             before(grammarAccess.getRessourceAccess().getCommaKeyword_5_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Ressource__Group_5_3__0__Impl"


    // $ANTLR start "rule__Ressource__Group_5_3__1"
    // InternalPDL.g:1578:1: rule__Ressource__Group_5_3__1 : rule__Ressource__Group_5_3__1__Impl ;
    public final void rule__Ressource__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1582:1: ( rule__Ressource__Group_5_3__1__Impl )
            // InternalPDL.g:1583:2: rule__Ressource__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Ressource__Group_5_3__1"


    // $ANTLR start "rule__Ressource__Group_5_3__1__Impl"
    // InternalPDL.g:1589:1: rule__Ressource__Group_5_3__1__Impl : ( ( rule__Ressource__WorkAssignment_5_3_1 ) ) ;
    public final void rule__Ressource__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1593:1: ( ( ( rule__Ressource__WorkAssignment_5_3_1 ) ) )
            // InternalPDL.g:1594:1: ( ( rule__Ressource__WorkAssignment_5_3_1 ) )
            {
            // InternalPDL.g:1594:1: ( ( rule__Ressource__WorkAssignment_5_3_1 ) )
            // InternalPDL.g:1595:2: ( rule__Ressource__WorkAssignment_5_3_1 )
            {
             before(grammarAccess.getRessourceAccess().getWorkAssignment_5_3_1()); 
            // InternalPDL.g:1596:2: ( rule__Ressource__WorkAssignment_5_3_1 )
            // InternalPDL.g:1596:3: rule__Ressource__WorkAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__WorkAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getWorkAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Ressource__Group_5_3__1__Impl"


    // $ANTLR start "rule__AskedRessource__Group__0"
    // InternalPDL.g:1605:1: rule__AskedRessource__Group__0 : rule__AskedRessource__Group__0__Impl rule__AskedRessource__Group__1 ;
    public final void rule__AskedRessource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1609:1: ( rule__AskedRessource__Group__0__Impl rule__AskedRessource__Group__1 )
            // InternalPDL.g:1610:2: rule__AskedRessource__Group__0__Impl rule__AskedRessource__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AskedRessource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AskedRessource__Group__1();

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
    // $ANTLR end "rule__AskedRessource__Group__0"


    // $ANTLR start "rule__AskedRessource__Group__0__Impl"
    // InternalPDL.g:1617:1: rule__AskedRessource__Group__0__Impl : ( 'AskedRessource' ) ;
    public final void rule__AskedRessource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1621:1: ( ( 'AskedRessource' ) )
            // InternalPDL.g:1622:1: ( 'AskedRessource' )
            {
            // InternalPDL.g:1622:1: ( 'AskedRessource' )
            // InternalPDL.g:1623:2: 'AskedRessource'
            {
             before(grammarAccess.getAskedRessourceAccess().getAskedRessourceKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAskedRessourceAccess().getAskedRessourceKeyword_0()); 

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
    // $ANTLR end "rule__AskedRessource__Group__0__Impl"


    // $ANTLR start "rule__AskedRessource__Group__1"
    // InternalPDL.g:1632:1: rule__AskedRessource__Group__1 : rule__AskedRessource__Group__1__Impl rule__AskedRessource__Group__2 ;
    public final void rule__AskedRessource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1636:1: ( rule__AskedRessource__Group__1__Impl rule__AskedRessource__Group__2 )
            // InternalPDL.g:1637:2: rule__AskedRessource__Group__1__Impl rule__AskedRessource__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__AskedRessource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AskedRessource__Group__2();

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
    // $ANTLR end "rule__AskedRessource__Group__1"


    // $ANTLR start "rule__AskedRessource__Group__1__Impl"
    // InternalPDL.g:1644:1: rule__AskedRessource__Group__1__Impl : ( '{' ) ;
    public final void rule__AskedRessource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1648:1: ( ( '{' ) )
            // InternalPDL.g:1649:1: ( '{' )
            {
            // InternalPDL.g:1649:1: ( '{' )
            // InternalPDL.g:1650:2: '{'
            {
             before(grammarAccess.getAskedRessourceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAskedRessourceAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__AskedRessource__Group__1__Impl"


    // $ANTLR start "rule__AskedRessource__Group__2"
    // InternalPDL.g:1659:1: rule__AskedRessource__Group__2 : rule__AskedRessource__Group__2__Impl rule__AskedRessource__Group__3 ;
    public final void rule__AskedRessource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1663:1: ( rule__AskedRessource__Group__2__Impl rule__AskedRessource__Group__3 )
            // InternalPDL.g:1664:2: rule__AskedRessource__Group__2__Impl rule__AskedRessource__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__AskedRessource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AskedRessource__Group__3();

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
    // $ANTLR end "rule__AskedRessource__Group__2"


    // $ANTLR start "rule__AskedRessource__Group__2__Impl"
    // InternalPDL.g:1671:1: rule__AskedRessource__Group__2__Impl : ( 'quantity' ) ;
    public final void rule__AskedRessource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1675:1: ( ( 'quantity' ) )
            // InternalPDL.g:1676:1: ( 'quantity' )
            {
            // InternalPDL.g:1676:1: ( 'quantity' )
            // InternalPDL.g:1677:2: 'quantity'
            {
             before(grammarAccess.getAskedRessourceAccess().getQuantityKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAskedRessourceAccess().getQuantityKeyword_2()); 

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
    // $ANTLR end "rule__AskedRessource__Group__2__Impl"


    // $ANTLR start "rule__AskedRessource__Group__3"
    // InternalPDL.g:1686:1: rule__AskedRessource__Group__3 : rule__AskedRessource__Group__3__Impl rule__AskedRessource__Group__4 ;
    public final void rule__AskedRessource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1690:1: ( rule__AskedRessource__Group__3__Impl rule__AskedRessource__Group__4 )
            // InternalPDL.g:1691:2: rule__AskedRessource__Group__3__Impl rule__AskedRessource__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__AskedRessource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AskedRessource__Group__4();

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
    // $ANTLR end "rule__AskedRessource__Group__3"


    // $ANTLR start "rule__AskedRessource__Group__3__Impl"
    // InternalPDL.g:1698:1: rule__AskedRessource__Group__3__Impl : ( ( rule__AskedRessource__QuantityAssignment_3 ) ) ;
    public final void rule__AskedRessource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1702:1: ( ( ( rule__AskedRessource__QuantityAssignment_3 ) ) )
            // InternalPDL.g:1703:1: ( ( rule__AskedRessource__QuantityAssignment_3 ) )
            {
            // InternalPDL.g:1703:1: ( ( rule__AskedRessource__QuantityAssignment_3 ) )
            // InternalPDL.g:1704:2: ( rule__AskedRessource__QuantityAssignment_3 )
            {
             before(grammarAccess.getAskedRessourceAccess().getQuantityAssignment_3()); 
            // InternalPDL.g:1705:2: ( rule__AskedRessource__QuantityAssignment_3 )
            // InternalPDL.g:1705:3: rule__AskedRessource__QuantityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AskedRessource__QuantityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAskedRessourceAccess().getQuantityAssignment_3()); 

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
    // $ANTLR end "rule__AskedRessource__Group__3__Impl"


    // $ANTLR start "rule__AskedRessource__Group__4"
    // InternalPDL.g:1713:1: rule__AskedRessource__Group__4 : rule__AskedRessource__Group__4__Impl rule__AskedRessource__Group__5 ;
    public final void rule__AskedRessource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1717:1: ( rule__AskedRessource__Group__4__Impl rule__AskedRessource__Group__5 )
            // InternalPDL.g:1718:2: rule__AskedRessource__Group__4__Impl rule__AskedRessource__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__AskedRessource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AskedRessource__Group__5();

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
    // $ANTLR end "rule__AskedRessource__Group__4"


    // $ANTLR start "rule__AskedRessource__Group__4__Impl"
    // InternalPDL.g:1725:1: rule__AskedRessource__Group__4__Impl : ( 'ressource' ) ;
    public final void rule__AskedRessource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1729:1: ( ( 'ressource' ) )
            // InternalPDL.g:1730:1: ( 'ressource' )
            {
            // InternalPDL.g:1730:1: ( 'ressource' )
            // InternalPDL.g:1731:2: 'ressource'
            {
             before(grammarAccess.getAskedRessourceAccess().getRessourceKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAskedRessourceAccess().getRessourceKeyword_4()); 

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
    // $ANTLR end "rule__AskedRessource__Group__4__Impl"


    // $ANTLR start "rule__AskedRessource__Group__5"
    // InternalPDL.g:1740:1: rule__AskedRessource__Group__5 : rule__AskedRessource__Group__5__Impl rule__AskedRessource__Group__6 ;
    public final void rule__AskedRessource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1744:1: ( rule__AskedRessource__Group__5__Impl rule__AskedRessource__Group__6 )
            // InternalPDL.g:1745:2: rule__AskedRessource__Group__5__Impl rule__AskedRessource__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__AskedRessource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AskedRessource__Group__6();

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
    // $ANTLR end "rule__AskedRessource__Group__5"


    // $ANTLR start "rule__AskedRessource__Group__5__Impl"
    // InternalPDL.g:1752:1: rule__AskedRessource__Group__5__Impl : ( ( rule__AskedRessource__RessourceAssignment_5 ) ) ;
    public final void rule__AskedRessource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1756:1: ( ( ( rule__AskedRessource__RessourceAssignment_5 ) ) )
            // InternalPDL.g:1757:1: ( ( rule__AskedRessource__RessourceAssignment_5 ) )
            {
            // InternalPDL.g:1757:1: ( ( rule__AskedRessource__RessourceAssignment_5 ) )
            // InternalPDL.g:1758:2: ( rule__AskedRessource__RessourceAssignment_5 )
            {
             before(grammarAccess.getAskedRessourceAccess().getRessourceAssignment_5()); 
            // InternalPDL.g:1759:2: ( rule__AskedRessource__RessourceAssignment_5 )
            // InternalPDL.g:1759:3: rule__AskedRessource__RessourceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AskedRessource__RessourceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAskedRessourceAccess().getRessourceAssignment_5()); 

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
    // $ANTLR end "rule__AskedRessource__Group__5__Impl"


    // $ANTLR start "rule__AskedRessource__Group__6"
    // InternalPDL.g:1767:1: rule__AskedRessource__Group__6 : rule__AskedRessource__Group__6__Impl ;
    public final void rule__AskedRessource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1771:1: ( rule__AskedRessource__Group__6__Impl )
            // InternalPDL.g:1772:2: rule__AskedRessource__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AskedRessource__Group__6__Impl();

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
    // $ANTLR end "rule__AskedRessource__Group__6"


    // $ANTLR start "rule__AskedRessource__Group__6__Impl"
    // InternalPDL.g:1778:1: rule__AskedRessource__Group__6__Impl : ( '}' ) ;
    public final void rule__AskedRessource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1782:1: ( ( '}' ) )
            // InternalPDL.g:1783:1: ( '}' )
            {
            // InternalPDL.g:1783:1: ( '}' )
            // InternalPDL.g:1784:2: '}'
            {
             before(grammarAccess.getAskedRessourceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAskedRessourceAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__AskedRessource__Group__6__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalPDL.g:1794:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1798:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalPDL.g:1799:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalPDL.g:1806:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1810:1: ( ( ( '-' )? ) )
            // InternalPDL.g:1811:1: ( ( '-' )? )
            {
            // InternalPDL.g:1811:1: ( ( '-' )? )
            // InternalPDL.g:1812:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalPDL.g:1813:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPDL.g:1813:3: '-'
                    {
                    match(input,35,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalPDL.g:1821:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1825:1: ( rule__EInt__Group__1__Impl )
            // InternalPDL.g:1826:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalPDL.g:1832:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1836:1: ( ( RULE_INT ) )
            // InternalPDL.g:1837:1: ( RULE_INT )
            {
            // InternalPDL.g:1837:1: ( RULE_INT )
            // InternalPDL.g:1838:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Process__NameAssignment_2"
    // InternalPDL.g:1848:1: rule__Process__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1852:1: ( ( ruleEString ) )
            // InternalPDL.g:1853:2: ( ruleEString )
            {
            // InternalPDL.g:1853:2: ( ruleEString )
            // InternalPDL.g:1854:3: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Process__NameAssignment_2"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_4"
    // InternalPDL.g:1863:1: rule__Process__ProcessElementsAssignment_4 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1867:1: ( ( ruleProcessElement ) )
            // InternalPDL.g:1868:2: ( ruleProcessElement )
            {
            // InternalPDL.g:1868:2: ( ruleProcessElement )
            // InternalPDL.g:1869:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_4"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_2"
    // InternalPDL.g:1878:1: rule__WorkDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WorkDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1882:1: ( ( ruleEString ) )
            // InternalPDL.g:1883:2: ( ruleEString )
            {
            // InternalPDL.g:1883:2: ( ruleEString )
            // InternalPDL.g:1884:3: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__WorkDefinition__NameAssignment_2"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // InternalPDL.g:1893:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1897:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL.g:1898:2: ( ruleWorkSequenceType )
            {
            // InternalPDL.g:1898:2: ( ruleWorkSequenceType )
            // InternalPDL.g:1899:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_3"
    // InternalPDL.g:1908:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1912:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1913:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1913:2: ( ( RULE_ID ) )
            // InternalPDL.g:1914:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // InternalPDL.g:1915:3: ( RULE_ID )
            // InternalPDL.g:1916:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 

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
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_3"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_5"
    // InternalPDL.g:1927:1: rule__WorkSequence__SuccessorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1931:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1932:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1932:2: ( ( RULE_ID ) )
            // InternalPDL.g:1933:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            // InternalPDL.g:1934:3: ( RULE_ID )
            // InternalPDL.g:1935:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 

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
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_5"


    // $ANTLR start "rule__Guidance__TextAssignment_3"
    // InternalPDL.g:1946:1: rule__Guidance__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__Guidance__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1950:1: ( ( ruleEString ) )
            // InternalPDL.g:1951:2: ( ruleEString )
            {
            // InternalPDL.g:1951:2: ( ruleEString )
            // InternalPDL.g:1952:3: ruleEString
            {
             before(grammarAccess.getGuidanceAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getTextEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Guidance__TextAssignment_3"


    // $ANTLR start "rule__Guidance__ElementsAssignment_4_2"
    // InternalPDL.g:1961:1: rule__Guidance__ElementsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Guidance__ElementsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1965:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:1966:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:1966:2: ( ( ruleEString ) )
            // InternalPDL.g:1967:3: ( ruleEString )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_2_0()); 
            // InternalPDL.g:1968:3: ( ruleEString )
            // InternalPDL.g:1969:4: ruleEString
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__Guidance__ElementsAssignment_4_2"


    // $ANTLR start "rule__Guidance__ElementsAssignment_4_3_1"
    // InternalPDL.g:1980:1: rule__Guidance__ElementsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Guidance__ElementsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1984:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:1985:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:1985:2: ( ( ruleEString ) )
            // InternalPDL.g:1986:3: ( ruleEString )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_3_1_0()); 
            // InternalPDL.g:1987:3: ( ruleEString )
            // InternalPDL.g:1988:4: ruleEString
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__Guidance__ElementsAssignment_4_3_1"


    // $ANTLR start "rule__Ressource__NameAssignment_1"
    // InternalPDL.g:1999:1: rule__Ressource__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Ressource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2003:1: ( ( ruleEString ) )
            // InternalPDL.g:2004:2: ( ruleEString )
            {
            // InternalPDL.g:2004:2: ( ruleEString )
            // InternalPDL.g:2005:3: ruleEString
            {
             before(grammarAccess.getRessourceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRessourceAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ressource__NameAssignment_1"


    // $ANTLR start "rule__Ressource__StockAssignment_4"
    // InternalPDL.g:2014:1: rule__Ressource__StockAssignment_4 : ( ruleEInt ) ;
    public final void rule__Ressource__StockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2018:1: ( ( ruleEInt ) )
            // InternalPDL.g:2019:2: ( ruleEInt )
            {
            // InternalPDL.g:2019:2: ( ruleEInt )
            // InternalPDL.g:2020:3: ruleEInt
            {
             before(grammarAccess.getRessourceAccess().getStockEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRessourceAccess().getStockEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Ressource__StockAssignment_4"


    // $ANTLR start "rule__Ressource__WorkAssignment_5_2"
    // InternalPDL.g:2029:1: rule__Ressource__WorkAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Ressource__WorkAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2033:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2034:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2034:2: ( ( ruleEString ) )
            // InternalPDL.g:2035:3: ( ruleEString )
            {
             before(grammarAccess.getRessourceAccess().getWorkAskedRessourceCrossReference_5_2_0()); 
            // InternalPDL.g:2036:3: ( ruleEString )
            // InternalPDL.g:2037:4: ruleEString
            {
             before(grammarAccess.getRessourceAccess().getWorkAskedRessourceEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRessourceAccess().getWorkAskedRessourceEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getRessourceAccess().getWorkAskedRessourceCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Ressource__WorkAssignment_5_2"


    // $ANTLR start "rule__Ressource__WorkAssignment_5_3_1"
    // InternalPDL.g:2048:1: rule__Ressource__WorkAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Ressource__WorkAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2052:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2053:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2053:2: ( ( ruleEString ) )
            // InternalPDL.g:2054:3: ( ruleEString )
            {
             before(grammarAccess.getRessourceAccess().getWorkAskedRessourceCrossReference_5_3_1_0()); 
            // InternalPDL.g:2055:3: ( ruleEString )
            // InternalPDL.g:2056:4: ruleEString
            {
             before(grammarAccess.getRessourceAccess().getWorkAskedRessourceEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRessourceAccess().getWorkAskedRessourceEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getRessourceAccess().getWorkAskedRessourceCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__Ressource__WorkAssignment_5_3_1"


    // $ANTLR start "rule__AskedRessource__QuantityAssignment_3"
    // InternalPDL.g:2067:1: rule__AskedRessource__QuantityAssignment_3 : ( ruleEInt ) ;
    public final void rule__AskedRessource__QuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2071:1: ( ( ruleEInt ) )
            // InternalPDL.g:2072:2: ( ruleEInt )
            {
            // InternalPDL.g:2072:2: ( ruleEInt )
            // InternalPDL.g:2073:3: ruleEInt
            {
             before(grammarAccess.getAskedRessourceAccess().getQuantityEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAskedRessourceAccess().getQuantityEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AskedRessource__QuantityAssignment_3"


    // $ANTLR start "rule__AskedRessource__RessourceAssignment_5"
    // InternalPDL.g:2082:1: rule__AskedRessource__RessourceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__AskedRessource__RessourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2086:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2087:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2087:2: ( ( ruleEString ) )
            // InternalPDL.g:2088:3: ( ruleEString )
            {
             before(grammarAccess.getAskedRessourceAccess().getRessourceRessourceCrossReference_5_0()); 
            // InternalPDL.g:2089:3: ( ruleEString )
            // InternalPDL.g:2090:4: ruleEString
            {
             before(grammarAccess.getAskedRessourceAccess().getRessourceRessourceEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAskedRessourceAccess().getRessourceRessourceEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAskedRessourceAccess().getRessourceRessourceCrossReference_5_0()); 

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
    // $ANTLR end "rule__AskedRessource__RessourceAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000001209E0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001209C0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000020000L});

}