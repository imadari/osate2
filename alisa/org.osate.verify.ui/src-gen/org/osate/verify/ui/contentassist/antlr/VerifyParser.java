/*
* generated by Xtext
*/
package org.osate.verify.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.osate.verify.services.VerifyGrammarAccess;

public class VerifyParser extends AbstractContentAssistParser {
	
	@Inject
	private VerifyGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.osate.verify.ui.contentassist.antlr.internal.InternalVerifyParser createParser() {
		org.osate.verify.ui.contentassist.antlr.internal.InternalVerifyParser result = new org.osate.verify.ui.contentassist.antlr.internal.InternalVerifyParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getVerificationAccess().getContentsAlternatives_0(), "rule__Verification__ContentsAlternatives_0");
					put(grammarAccess.getVerificationLibraryAccess().getContentAlternatives_5_1_0(), "rule__VerificationLibrary__ContentAlternatives_5_1_0");
					put(grammarAccess.getVerificationFolderAccess().getContentAlternatives_3_0(), "rule__VerificationFolder__ContentAlternatives_3_0");
					put(grammarAccess.getVerificationContainerAccess().getAlternatives(), "rule__VerificationContainer__Alternatives");
					put(grammarAccess.getVerificationConditionAccess().getAlternatives_0(), "rule__VerificationCondition__Alternatives_0");
					put(grammarAccess.getAtomicEvidenceExprAccess().getAlternatives(), "rule__AtomicEvidenceExpr__Alternatives");
					put(grammarAccess.getVerificationActionAccess().getAlternatives(), "rule__VerificationAction__Alternatives");
					put(grammarAccess.getDescriptionElementAccess().getAlternatives(), "rule__DescriptionElement__Alternatives");
					put(grammarAccess.getPredicateExpressionAccess().getOpAlternatives_1_0(), "rule__PredicateExpression__OpAlternatives_1_0");
					put(grammarAccess.getTextElementAccess().getAlternatives(), "rule__TextElement__Alternatives");
					put(grammarAccess.getSupportedTypesAccess().getAlternatives(), "rule__SupportedTypes__Alternatives");
					put(grammarAccess.getVerificationPlanAccess().getGroup(), "rule__VerificationPlan__Group__0");
					put(grammarAccess.getVerificationPlanAccess().getGroup_2(), "rule__VerificationPlan__Group_2__0");
					put(grammarAccess.getVerificationPlanAccess().getGroup_6_0(), "rule__VerificationPlan__Group_6_0__0");
					put(grammarAccess.getVerificationPlanAccess().getGroup_6_3(), "rule__VerificationPlan__Group_6_3__0");
					put(grammarAccess.getVerificationPlanAccess().getGroup_6_4(), "rule__VerificationPlan__Group_6_4__0");
					put(grammarAccess.getClaimAccess().getGroup(), "rule__Claim__Group__0");
					put(grammarAccess.getClaimAccess().getGroup_2(), "rule__Claim__Group_2__0");
					put(grammarAccess.getClaimAccess().getGroup_6_0(), "rule__Claim__Group_6_0__0");
					put(grammarAccess.getClaimAccess().getGroup_6_1(), "rule__Claim__Group_6_1__0");
					put(grammarAccess.getWeightedClaimAccess().getGroup(), "rule__WeightedClaim__Group__0");
					put(grammarAccess.getWeightedClaimAccess().getGroup_2(), "rule__WeightedClaim__Group_2__0");
					put(grammarAccess.getVerificationLibraryAccess().getGroup(), "rule__VerificationLibrary__Group__0");
					put(grammarAccess.getVerificationLibraryAccess().getGroup_2(), "rule__VerificationLibrary__Group_2__0");
					put(grammarAccess.getVerificationLibraryAccess().getGroup_3(), "rule__VerificationLibrary__Group_3__0");
					put(grammarAccess.getVerificationLibraryAccess().getGroup_5_0(), "rule__VerificationLibrary__Group_5_0__0");
					put(grammarAccess.getVerificationFolderAccess().getGroup(), "rule__VerificationFolder__Group__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup(), "rule__VerificationActivity__Group__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_2(), "rule__VerificationActivity__Group_2__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_3(), "rule__VerificationActivity__Group_3__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_5_0(), "rule__VerificationActivity__Group_5_0__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_5_1(), "rule__VerificationActivity__Group_5_1__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_5_2(), "rule__VerificationActivity__Group_5_2__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_5_3(), "rule__VerificationActivity__Group_5_3__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_5_4(), "rule__VerificationActivity__Group_5_4__0");
					put(grammarAccess.getVerificationConditionAccess().getGroup(), "rule__VerificationCondition__Group__0");
					put(grammarAccess.getVerificationConditionAccess().getGroup_0_0(), "rule__VerificationCondition__Group_0_0__0");
					put(grammarAccess.getVerificationConditionAccess().getGroup_0_1(), "rule__VerificationCondition__Group_0_1__0");
					put(grammarAccess.getVerificationConditionAccess().getGroup_2(), "rule__VerificationCondition__Group_2__0");
					put(grammarAccess.getVerificationConditionAccess().getGroup_4_0(), "rule__VerificationCondition__Group_4_0__0");
					put(grammarAccess.getVerificationConditionAccess().getGroup_4_1(), "rule__VerificationCondition__Group_4_1__0");
					put(grammarAccess.getVerificationConditionAccess().getGroup_4_2(), "rule__VerificationCondition__Group_4_2__0");
					put(grammarAccess.getAllEvidenceExprAccess().getGroup(), "rule__AllEvidenceExpr__Group__0");
					put(grammarAccess.getAllEvidenceExprAccess().getGroup_4(), "rule__AllEvidenceExpr__Group_4__0");
					put(grammarAccess.getAndThenEvidenceExprAccess().getGroup(), "rule__AndThenEvidenceExpr__Group__0");
					put(grammarAccess.getAndThenEvidenceExprAccess().getGroup_1(), "rule__AndThenEvidenceExpr__Group_1__0");
					put(grammarAccess.getAndThenEvidenceExprAccess().getGroup_1_0(), "rule__AndThenEvidenceExpr__Group_1_0__0");
					put(grammarAccess.getAndThenEvidenceExprAccess().getGroup_1_0_0(), "rule__AndThenEvidenceExpr__Group_1_0_0__0");
					put(grammarAccess.getFailThenEvidenceExprAccess().getGroup(), "rule__FailThenEvidenceExpr__Group__0");
					put(grammarAccess.getFailThenEvidenceExprAccess().getGroup_1(), "rule__FailThenEvidenceExpr__Group_1__0");
					put(grammarAccess.getFailThenEvidenceExprAccess().getGroup_1_0(), "rule__FailThenEvidenceExpr__Group_1_0__0");
					put(grammarAccess.getFailThenEvidenceExprAccess().getGroup_1_0_0(), "rule__FailThenEvidenceExpr__Group_1_0_0__0");
					put(grammarAccess.getAtomicEvidenceExprAccess().getGroup_1(), "rule__AtomicEvidenceExpr__Group_1__0");
					put(grammarAccess.getConditionalEvidenceAccess().getGroup(), "rule__ConditionalEvidence__Group__0");
					put(grammarAccess.getConditionalEvidenceAccess().getGroup_1(), "rule__ConditionalEvidence__Group_1__0");
					put(grammarAccess.getConditionalEvidenceAccess().getGroup_1_0(), "rule__ConditionalEvidence__Group_1_0__0");
					put(grammarAccess.getConditionalEvidenceAccess().getGroup_1_0_0(), "rule__ConditionalEvidence__Group_1_0_0__0");
					put(grammarAccess.getVAReferenceAccess().getGroup(), "rule__VAReference__Group__0");
					put(grammarAccess.getVAReferenceAccess().getGroup_2(), "rule__VAReference__Group_2__0");
					put(grammarAccess.getVerificationMethodRegistryAccess().getGroup(), "rule__VerificationMethodRegistry__Group__0");
					put(grammarAccess.getVerificationMethodRegistryAccess().getGroup_2(), "rule__VerificationMethodRegistry__Group_2__0");
					put(grammarAccess.getVerificationMethodRegistryAccess().getGroup_4(), "rule__VerificationMethodRegistry__Group_4__0");
					put(grammarAccess.getVerificationMethodRegistryAccess().getGroup_4_0(), "rule__VerificationMethodRegistry__Group_4_0__0");
					put(grammarAccess.getVerificationMethodAccess().getGroup(), "rule__VerificationMethod__Group__0");
					put(grammarAccess.getVerificationMethodAccess().getGroup_2(), "rule__VerificationMethod__Group_2__0");
					put(grammarAccess.getVerificationMethodAccess().getGroup_3(), "rule__VerificationMethod__Group_3__0");
					put(grammarAccess.getVerificationMethodAccess().getGroup_7_0(), "rule__VerificationMethod__Group_7_0__0");
					put(grammarAccess.getVerificationMethodAccess().getGroup_7_1(), "rule__VerificationMethod__Group_7_1__0");
					put(grammarAccess.getVerificationMethodAccess().getGroup_7_2(), "rule__VerificationMethod__Group_7_2__0");
					put(grammarAccess.getReferencePathAccess().getGroup(), "rule__ReferencePath__Group__0");
					put(grammarAccess.getReferencePathAccess().getGroup_1(), "rule__ReferencePath__Group_1__0");
					put(grammarAccess.getPredicateExpressionAccess().getGroup(), "rule__PredicateExpression__Group__0");
					put(grammarAccess.getFinalValueAccess().getGroup(), "rule__FinalValue__Group__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup(), "rule__AadlClassifierReference__Group__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup_0(), "rule__AadlClassifierReference__Group_0__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup_2(), "rule__AadlClassifierReference__Group_2__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVerificationAccess().getContentsAssignment(), "rule__Verification__ContentsAssignment");
					put(grammarAccess.getVerificationPlanAccess().getNameAssignment_1(), "rule__VerificationPlan__NameAssignment_1");
					put(grammarAccess.getVerificationPlanAccess().getTitleAssignment_2_1(), "rule__VerificationPlan__TitleAssignment_2_1");
					put(grammarAccess.getVerificationPlanAccess().getTargetAssignment_4(), "rule__VerificationPlan__TargetAssignment_4");
					put(grammarAccess.getVerificationPlanAccess().getDescriptionAssignment_6_0_1(), "rule__VerificationPlan__DescriptionAssignment_6_0_1");
					put(grammarAccess.getVerificationPlanAccess().getClaimAssignment_6_1(), "rule__VerificationPlan__ClaimAssignment_6_1");
					put(grammarAccess.getVerificationPlanAccess().getWeightedClaimAssignment_6_2(), "rule__VerificationPlan__WeightedClaimAssignment_6_2");
					put(grammarAccess.getVerificationPlanAccess().getRationaleAssignment_6_3_1(), "rule__VerificationPlan__RationaleAssignment_6_3_1");
					put(grammarAccess.getVerificationPlanAccess().getPlanAssumptionAssignment_6_4_2(), "rule__VerificationPlan__PlanAssumptionAssignment_6_4_2");
					put(grammarAccess.getClaimAccess().getNameAssignment_1(), "rule__Claim__NameAssignment_1");
					put(grammarAccess.getClaimAccess().getTitleAssignment_2_1(), "rule__Claim__TitleAssignment_2_1");
					put(grammarAccess.getClaimAccess().getRequirementAssignment_4(), "rule__Claim__RequirementAssignment_4");
					put(grammarAccess.getClaimAccess().getAssertAssignment_6_0_1(), "rule__Claim__AssertAssignment_6_0_1");
					put(grammarAccess.getClaimAccess().getRationaleAssignment_6_1_1(), "rule__Claim__RationaleAssignment_6_1_1");
					put(grammarAccess.getClaimAccess().getSubclaimAssignment_6_2(), "rule__Claim__SubclaimAssignment_6_2");
					put(grammarAccess.getWeightedClaimAccess().getClaimAssignment_1(), "rule__WeightedClaim__ClaimAssignment_1");
					put(grammarAccess.getWeightedClaimAccess().getWeightAssignment_2_1(), "rule__WeightedClaim__WeightAssignment_2_1");
					put(grammarAccess.getVerificationLibraryAccess().getNameAssignment_1(), "rule__VerificationLibrary__NameAssignment_1");
					put(grammarAccess.getVerificationLibraryAccess().getTitleAssignment_2_1(), "rule__VerificationLibrary__TitleAssignment_2_1");
					put(grammarAccess.getVerificationLibraryAccess().getTargetAssignment_3_1(), "rule__VerificationLibrary__TargetAssignment_3_1");
					put(grammarAccess.getVerificationLibraryAccess().getDescriptionAssignment_5_0_1(), "rule__VerificationLibrary__DescriptionAssignment_5_0_1");
					put(grammarAccess.getVerificationLibraryAccess().getContentAssignment_5_1(), "rule__VerificationLibrary__ContentAssignment_5_1");
					put(grammarAccess.getVerificationFolderAccess().getLabelAssignment_1(), "rule__VerificationFolder__LabelAssignment_1");
					put(grammarAccess.getVerificationFolderAccess().getContentAssignment_3(), "rule__VerificationFolder__ContentAssignment_3");
					put(grammarAccess.getVerificationActivityAccess().getNameAssignment_1(), "rule__VerificationActivity__NameAssignment_1");
					put(grammarAccess.getVerificationActivityAccess().getTitleAssignment_2_1(), "rule__VerificationActivity__TitleAssignment_2_1");
					put(grammarAccess.getVerificationActivityAccess().getRequirementAssignment_3_1(), "rule__VerificationActivity__RequirementAssignment_3_1");
					put(grammarAccess.getVerificationActivityAccess().getDescriptionAssignment_5_0_1(), "rule__VerificationActivity__DescriptionAssignment_5_0_1");
					put(grammarAccess.getVerificationActivityAccess().getCategoryAssignment_5_1_1(), "rule__VerificationActivity__CategoryAssignment_5_1_1");
					put(grammarAccess.getVerificationActivityAccess().getMethodAssignment_5_2_1(), "rule__VerificationActivity__MethodAssignment_5_2_1");
					put(grammarAccess.getVerificationActivityAccess().getTimeoutAssignment_5_3_1(), "rule__VerificationActivity__TimeoutAssignment_5_3_1");
					put(grammarAccess.getVerificationActivityAccess().getRationaleAssignment_5_4_1(), "rule__VerificationActivity__RationaleAssignment_5_4_1");
					put(grammarAccess.getVerificationConditionAccess().getNameAssignment_1(), "rule__VerificationCondition__NameAssignment_1");
					put(grammarAccess.getVerificationConditionAccess().getTitleAssignment_2_1(), "rule__VerificationCondition__TitleAssignment_2_1");
					put(grammarAccess.getVerificationConditionAccess().getDescriptionAssignment_4_0_1(), "rule__VerificationCondition__DescriptionAssignment_4_0_1");
					put(grammarAccess.getVerificationConditionAccess().getAssertAssignment_4_1_1(), "rule__VerificationCondition__AssertAssignment_4_1_1");
					put(grammarAccess.getVerificationConditionAccess().getRationaleAssignment_4_2_1(), "rule__VerificationCondition__RationaleAssignment_4_2_1");
					put(grammarAccess.getAllEvidenceExprAccess().getAllAssignment_3(), "rule__AllEvidenceExpr__AllAssignment_3");
					put(grammarAccess.getAllEvidenceExprAccess().getAllAssignment_4_1(), "rule__AllEvidenceExpr__AllAssignment_4_1");
					put(grammarAccess.getAndThenEvidenceExprAccess().getRightAssignment_1_1(), "rule__AndThenEvidenceExpr__RightAssignment_1_1");
					put(grammarAccess.getFailThenEvidenceExprAccess().getRightAssignment_1_1(), "rule__FailThenEvidenceExpr__RightAssignment_1_1");
					put(grammarAccess.getConditionalEvidenceAccess().getConditionAssignment_1_1(), "rule__ConditionalEvidence__ConditionAssignment_1_1");
					put(grammarAccess.getVAReferenceAccess().getVerificationAssignment_1(), "rule__VAReference__VerificationAssignment_1");
					put(grammarAccess.getVAReferenceAccess().getWeightAssignment_2_1(), "rule__VAReference__WeightAssignment_2_1");
					put(grammarAccess.getVerificationMethodRegistryAccess().getNameAssignment_1(), "rule__VerificationMethodRegistry__NameAssignment_1");
					put(grammarAccess.getVerificationMethodRegistryAccess().getTitleAssignment_2_1(), "rule__VerificationMethodRegistry__TitleAssignment_2_1");
					put(grammarAccess.getVerificationMethodRegistryAccess().getDescriptionAssignment_4_0_1(), "rule__VerificationMethodRegistry__DescriptionAssignment_4_0_1");
					put(grammarAccess.getVerificationMethodRegistryAccess().getMethodsAssignment_4_1(), "rule__VerificationMethodRegistry__MethodsAssignment_4_1");
					put(grammarAccess.getVerificationMethodAccess().getNameAssignment_1(), "rule__VerificationMethod__NameAssignment_1");
					put(grammarAccess.getVerificationMethodAccess().getTitleAssignment_2_1(), "rule__VerificationMethod__TitleAssignment_2_1");
					put(grammarAccess.getVerificationMethodAccess().getRequirementAssignment_3_1(), "rule__VerificationMethod__RequirementAssignment_3_1");
					put(grammarAccess.getVerificationMethodAccess().getMethodTypeAssignment_5(), "rule__VerificationMethod__MethodTypeAssignment_5");
					put(grammarAccess.getVerificationMethodAccess().getMethodPathAssignment_6(), "rule__VerificationMethod__MethodPathAssignment_6");
					put(grammarAccess.getVerificationMethodAccess().getMarkerAssignment_7_0_1(), "rule__VerificationMethod__MarkerAssignment_7_0_1");
					put(grammarAccess.getVerificationMethodAccess().getDescriptionAssignment_7_1_1(), "rule__VerificationMethod__DescriptionAssignment_7_1_1");
					put(grammarAccess.getVerificationMethodAccess().getCategoryAssignment_7_2_1(), "rule__VerificationMethod__CategoryAssignment_7_2_1");
					put(grammarAccess.getVerificationMethodAccess().getConditionsAssignment_7_3(), "rule__VerificationMethod__ConditionsAssignment_7_3");
					put(grammarAccess.getModelAccess().getContentAssignment(), "rule__Model__ContentAssignment");
					put(grammarAccess.getDescriptionAccess().getDescriptionAssignment(), "rule__Description__DescriptionAssignment");
					put(grammarAccess.getDescriptionElementAccess().getTextAssignment_0(), "rule__DescriptionElement__TextAssignment_0");
					put(grammarAccess.getDescriptionElementAccess().getRefAssignment_1(), "rule__DescriptionElement__RefAssignment_1");
					put(grammarAccess.getDescriptionElementAccess().getNewlineAssignment_2(), "rule__DescriptionElement__NewlineAssignment_2");
					put(grammarAccess.getDescriptionElementAccess().getThisTargetAssignment_3(), "rule__DescriptionElement__ThisTargetAssignment_3");
					put(grammarAccess.getReferencePathAccess().getRefAssignment_0(), "rule__ReferencePath__RefAssignment_0");
					put(grammarAccess.getReferencePathAccess().getSubpathAssignment_1_1(), "rule__ReferencePath__SubpathAssignment_1_1");
					put(grammarAccess.getPredicateExpressionAccess().getOpAssignment_1(), "rule__PredicateExpression__OpAssignment_1");
					put(grammarAccess.getFinalValueAccess().getNameAssignment_0(), "rule__FinalValue__NameAssignment_0");
					put(grammarAccess.getFinalValueAccess().getValueAssignment_2(), "rule__FinalValue__ValueAssignment_2");
					put(grammarAccess.getMultiLineStringAccess().getDescriptionAssignment(), "rule__MultiLineString__DescriptionAssignment");
					put(grammarAccess.getTextElementAccess().getTextAssignment_0(), "rule__TextElement__TextAssignment_0");
					put(grammarAccess.getTextElementAccess().getNewlineAssignment_1(), "rule__TextElement__NewlineAssignment_1");
					put(grammarAccess.getVerificationPlanAccess().getUnorderedGroup_6(), "rule__VerificationPlan__UnorderedGroup_6");
					put(grammarAccess.getClaimAccess().getUnorderedGroup_6(), "rule__Claim__UnorderedGroup_6");
					put(grammarAccess.getVerificationLibraryAccess().getUnorderedGroup_5(), "rule__VerificationLibrary__UnorderedGroup_5");
					put(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_5(), "rule__VerificationActivity__UnorderedGroup_5");
					put(grammarAccess.getVerificationConditionAccess().getUnorderedGroup_4(), "rule__VerificationCondition__UnorderedGroup_4");
					put(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_7(), "rule__VerificationMethod__UnorderedGroup_7");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.osate.verify.ui.contentassist.antlr.internal.InternalVerifyParser typedParser = (org.osate.verify.ui.contentassist.antlr.internal.InternalVerifyParser) parser;
			typedParser.entryRuleVerification();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public VerifyGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VerifyGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
