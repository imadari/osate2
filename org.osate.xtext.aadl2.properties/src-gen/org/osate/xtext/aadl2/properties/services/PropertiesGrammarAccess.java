/*
* /*
 *
 * <copyright>
 * Copyright  2012 by Carnegie Mellon University, all rights reserved.
 *
 * Use of the Open Source AADL Tool Environment (OSATE) is subject to the terms of the license set forth
 * at http://www.eclipse.org/org/documents/epl-v10.html.
 *
 * NO WARRANTY
 *
 * ANY INFORMATION, MATERIALS, SERVICES, INTELLECTUAL PROPERTY OR OTHER PROPERTY OR RIGHTS GRANTED OR PROVIDED BY
 * CARNEGIE MELLON UNIVERSITY PURSUANT TO THIS LICENSE (HEREINAFTER THE "DELIVERABLES") ARE ON AN "AS-IS" BASIS.
 * CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR A PARTICULAR PURPOSE, MERCHANTABILITY, INFORMATIONAL CONTENT,
 * NONINFRINGEMENT, OR ERROR-FREE OPERATION. CARNEGIE MELLON UNIVERSITY SHALL NOT BE LIABLE FOR INDIRECT, SPECIAL OR
 * CONSEQUENTIAL DAMAGES, SUCH AS LOSS OF PROFITS OR INABILITY TO USE SAID INTELLECTUAL PROPERTY, UNDER THIS LICENSE,
 * REGARDLESS OF WHETHER SUCH PARTY WAS AWARE OF THE POSSIBILITY OF SUCH DAMAGES. LICENSEE AGREES THAT IT WILL NOT
 * MAKE ANY WARRANTY ON BEHALF OF CARNEGIE MELLON UNIVERSITY, EXPRESS OR IMPLIED, TO ANY PERSON CONCERNING THE
 * APPLICATION OF OR THE RESULTS TO BE OBTAINED WITH THE DELIVERABLES UNDER THIS LICENSE.
 *
 * Licensee hereby agrees to defend, indemnify, and hold harmless Carnegie Mellon University, its trustees, officers,
 * employees, and agents from all claims or demands made against them (and any related losses, expenses, or
 * attorney's fees) arising out of, or relating to Licensee's and/or its sub licensees' negligent use or willful
 * misuse of or negligent conduct or willful misconduct regarding the Software, facilities, or other rights or
 * assistance granted by Carnegie Mellon University under this License, including, but not limited to, any claims of
 * product liability, personal injury, death, damage to property, or violation of any laws or regulations.
 *
 * Carnegie Mellon Carnegie Mellon University Software Engineering Institute authored documents are sponsored by the U.S. Department
 * of Defense under Contract F19628-00-C-0003. Carnegie Mellon University retains copyrights in all material produced
 * under this contract. The U.S. Government retains a non-exclusive, royalty-free license to publish or reproduce these
 * documents, or allow others to do so, for U.S. Government purposes only pursuant to the copyright license
 * under the contract clause at 252.227.7013.
 * </copyright>

*/

package org.osate.xtext.aadl2.properties.services;

import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;


@Singleton
public class PropertiesGrammarAccess extends AbstractGrammarElementFinder {


	public class PModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PModel");
		private final RuleCall cContainedPropertyAssociationParserRuleCall = (RuleCall)rule.eContents().get(1);

		//PModel returns aadl2::Element: //| BasicPropertyAssociation | PropertyAssociation
		//	ContainedPropertyAssociation;
		public ParserRule getRule() { return rule; }

		////| BasicPropertyAssociation | PropertyAssociation
		//ContainedPropertyAssociation
		public RuleCall getContainedPropertyAssociationParserRuleCall() { return cContainedPropertyAssociationParserRuleCall; }
	}

	public class ContainedPropertyAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ContainedPropertyAssociation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPropertyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPropertyPropertyCrossReference_0_0 = (CrossReference)cPropertyAssignment_0.eContents().get(0);
		private final RuleCall cPropertyPropertyQPREFParserRuleCall_0_0_1 = (RuleCall)cPropertyPropertyCrossReference_0_0.eContents().get(1);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Assignment cAppendAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final Keyword cAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0 = (Keyword)cAppendAssignment_1_1.eContents().get(0);
		private final Assignment cConstantAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cConstantConstantKeyword_2_0 = (Keyword)cConstantAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cOwnedValueAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0 = (RuleCall)cOwnedValueAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cOwnedValueAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0 = (RuleCall)cOwnedValueAssignment_3_1_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cAppliesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cToKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cAppliesToAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cAppliesToContainmentPathParserRuleCall_4_2_0 = (RuleCall)cAppliesToAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cAppliesToAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cAppliesToContainmentPathParserRuleCall_4_3_1_0 = (RuleCall)cAppliesToAssignment_4_3_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cInKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cBindingKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		private final Assignment cInBindingAssignment_5_3 = (Assignment)cGroup_5.eContents().get(3);
		private final CrossReference cInBindingClassifierCrossReference_5_3_0 = (CrossReference)cInBindingAssignment_5_3.eContents().get(0);
		private final RuleCall cInBindingClassifierQCREFParserRuleCall_5_3_0_1 = (RuleCall)cInBindingClassifierCrossReference_5_3_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);

		//// Properties
		//ContainedPropertyAssociation returns aadl2::PropertyAssociation:
		//	property=[aadl2::Property|QPREF] ("=>" | append?="+=>") constant?="constant"? (ownedValue+=OptionalModalPropertyValue
		//	("," ownedValue+=OptionalModalPropertyValue)*) ("applies" "to" appliesTo+=ContainmentPath (","
		//	appliesTo+=ContainmentPath)*)? ("in" "binding" "(" inBinding+=[aadl2::Classifier|QCREF] ")")? ";";
		public ParserRule getRule() { return rule; }

		//property=[aadl2::Property|QPREF] ("=>" | append?="+=>") constant?="constant"? (ownedValue+=OptionalModalPropertyValue
		//("," ownedValue+=OptionalModalPropertyValue)*) ("applies" "to" appliesTo+=ContainmentPath (","
		//appliesTo+=ContainmentPath)*)? ("in" "binding" "(" inBinding+=[aadl2::Classifier|QCREF] ")")? ";"
		public Group getGroup() { return cGroup; }

		//property=[aadl2::Property|QPREF]
		public Assignment getPropertyAssignment_0() { return cPropertyAssignment_0; }

		//[aadl2::Property|QPREF]
		public CrossReference getPropertyPropertyCrossReference_0_0() { return cPropertyPropertyCrossReference_0_0; }

		//QPREF
		public RuleCall getPropertyPropertyQPREFParserRuleCall_0_0_1() { return cPropertyPropertyQPREFParserRuleCall_0_0_1; }

		//"=>" | append?="+=>"
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_1_0() { return cEqualsSignGreaterThanSignKeyword_1_0; }

		//append?="+=>"
		public Assignment getAppendAssignment_1_1() { return cAppendAssignment_1_1; }

		//"+=>"
		public Keyword getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0() { return cAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0; }

		//constant?="constant"?
		public Assignment getConstantAssignment_2() { return cConstantAssignment_2; }

		//"constant"
		public Keyword getConstantConstantKeyword_2_0() { return cConstantConstantKeyword_2_0; }

		//ownedValue+=OptionalModalPropertyValue ("," ownedValue+=OptionalModalPropertyValue)*
		public Group getGroup_3() { return cGroup_3; }

		//ownedValue+=OptionalModalPropertyValue
		public Assignment getOwnedValueAssignment_3_0() { return cOwnedValueAssignment_3_0; }

		//OptionalModalPropertyValue
		public RuleCall getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0() { return cOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0; }

		//("," ownedValue+=OptionalModalPropertyValue)*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//ownedValue+=OptionalModalPropertyValue
		public Assignment getOwnedValueAssignment_3_1_1() { return cOwnedValueAssignment_3_1_1; }

		//OptionalModalPropertyValue
		public RuleCall getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0() { return cOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0; }

		//("applies" "to" appliesTo+=ContainmentPath ("," appliesTo+=ContainmentPath)*)?
		public Group getGroup_4() { return cGroup_4; }

		//"applies"
		public Keyword getAppliesKeyword_4_0() { return cAppliesKeyword_4_0; }

		//"to"
		public Keyword getToKeyword_4_1() { return cToKeyword_4_1; }

		//appliesTo+=ContainmentPath
		public Assignment getAppliesToAssignment_4_2() { return cAppliesToAssignment_4_2; }

		//ContainmentPath
		public RuleCall getAppliesToContainmentPathParserRuleCall_4_2_0() { return cAppliesToContainmentPathParserRuleCall_4_2_0; }

		//("," appliesTo+=ContainmentPath)*
		public Group getGroup_4_3() { return cGroup_4_3; }

		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }

		//appliesTo+=ContainmentPath
		public Assignment getAppliesToAssignment_4_3_1() { return cAppliesToAssignment_4_3_1; }

		//ContainmentPath
		public RuleCall getAppliesToContainmentPathParserRuleCall_4_3_1_0() { return cAppliesToContainmentPathParserRuleCall_4_3_1_0; }

		//("in" "binding" "(" inBinding+=[aadl2::Classifier|QCREF] ")")?
		public Group getGroup_5() { return cGroup_5; }

		//"in"
		public Keyword getInKeyword_5_0() { return cInKeyword_5_0; }

		//"binding"
		public Keyword getBindingKeyword_5_1() { return cBindingKeyword_5_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_5_2() { return cLeftParenthesisKeyword_5_2; }

		//inBinding+=[aadl2::Classifier|QCREF]
		public Assignment getInBindingAssignment_5_3() { return cInBindingAssignment_5_3; }

		//[aadl2::Classifier|QCREF]
		public CrossReference getInBindingClassifierCrossReference_5_3_0() { return cInBindingClassifierCrossReference_5_3_0; }

		//QCREF
		public RuleCall getInBindingClassifierQCREFParserRuleCall_5_3_0_1() { return cInBindingClassifierQCREFParserRuleCall_5_3_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_5_4() { return cRightParenthesisKeyword_5_4; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class PropertyAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PropertyAssociation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPropertyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPropertyPropertyCrossReference_0_0 = (CrossReference)cPropertyAssignment_0.eContents().get(0);
		private final RuleCall cPropertyPropertyQPREFParserRuleCall_0_0_1 = (RuleCall)cPropertyPropertyCrossReference_0_0.eContents().get(1);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Assignment cAppendAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final Keyword cAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0 = (Keyword)cAppendAssignment_1_1.eContents().get(0);
		private final Assignment cConstantAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cConstantConstantKeyword_2_0 = (Keyword)cConstantAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cOwnedValueAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0 = (RuleCall)cOwnedValueAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cOwnedValueAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0 = (RuleCall)cOwnedValueAssignment_3_1_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cInKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cBindingKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Assignment cInBindingAssignment_4_3 = (Assignment)cGroup_4.eContents().get(3);
		private final CrossReference cInBindingClassifierCrossReference_4_3_0 = (CrossReference)cInBindingAssignment_4_3.eContents().get(0);
		private final RuleCall cInBindingClassifierQCREFParserRuleCall_4_3_0_1 = (RuleCall)cInBindingClassifierCrossReference_4_3_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);

		//PropertyAssociation returns aadl2::PropertyAssociation:
		//	property=[aadl2::Property|QPREF] ("=>" | append?="+=>") constant?="constant"? (ownedValue+=OptionalModalPropertyValue
		//	("," ownedValue+=OptionalModalPropertyValue)*) ("in" "binding" "(" inBinding+=[aadl2::Classifier|QCREF] ")")? ";";
		public ParserRule getRule() { return rule; }

		//property=[aadl2::Property|QPREF] ("=>" | append?="+=>") constant?="constant"? (ownedValue+=OptionalModalPropertyValue
		//("," ownedValue+=OptionalModalPropertyValue)*) ("in" "binding" "(" inBinding+=[aadl2::Classifier|QCREF] ")")? ";"
		public Group getGroup() { return cGroup; }

		//property=[aadl2::Property|QPREF]
		public Assignment getPropertyAssignment_0() { return cPropertyAssignment_0; }

		//[aadl2::Property|QPREF]
		public CrossReference getPropertyPropertyCrossReference_0_0() { return cPropertyPropertyCrossReference_0_0; }

		//QPREF
		public RuleCall getPropertyPropertyQPREFParserRuleCall_0_0_1() { return cPropertyPropertyQPREFParserRuleCall_0_0_1; }

		//"=>" | append?="+=>"
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_1_0() { return cEqualsSignGreaterThanSignKeyword_1_0; }

		//append?="+=>"
		public Assignment getAppendAssignment_1_1() { return cAppendAssignment_1_1; }

		//"+=>"
		public Keyword getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0() { return cAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0; }

		//constant?="constant"?
		public Assignment getConstantAssignment_2() { return cConstantAssignment_2; }

		//"constant"
		public Keyword getConstantConstantKeyword_2_0() { return cConstantConstantKeyword_2_0; }

		//ownedValue+=OptionalModalPropertyValue ("," ownedValue+=OptionalModalPropertyValue)*
		public Group getGroup_3() { return cGroup_3; }

		//ownedValue+=OptionalModalPropertyValue
		public Assignment getOwnedValueAssignment_3_0() { return cOwnedValueAssignment_3_0; }

		//OptionalModalPropertyValue
		public RuleCall getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0() { return cOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0; }

		//("," ownedValue+=OptionalModalPropertyValue)*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//ownedValue+=OptionalModalPropertyValue
		public Assignment getOwnedValueAssignment_3_1_1() { return cOwnedValueAssignment_3_1_1; }

		//OptionalModalPropertyValue
		public RuleCall getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0() { return cOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0; }

		//("in" "binding" "(" inBinding+=[aadl2::Classifier|QCREF] ")")?
		public Group getGroup_4() { return cGroup_4; }

		//"in"
		public Keyword getInKeyword_4_0() { return cInKeyword_4_0; }

		//"binding"
		public Keyword getBindingKeyword_4_1() { return cBindingKeyword_4_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_4_2() { return cLeftParenthesisKeyword_4_2; }

		//inBinding+=[aadl2::Classifier|QCREF]
		public Assignment getInBindingAssignment_4_3() { return cInBindingAssignment_4_3; }

		//[aadl2::Classifier|QCREF]
		public CrossReference getInBindingClassifierCrossReference_4_3_0() { return cInBindingClassifierCrossReference_4_3_0; }

		//QCREF
		public RuleCall getInBindingClassifierQCREFParserRuleCall_4_3_0_1() { return cInBindingClassifierQCREFParserRuleCall_4_3_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_4_4() { return cRightParenthesisKeyword_4_4; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class BasicPropertyAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BasicPropertyAssociation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPropertyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPropertyPropertyCrossReference_0_0 = (CrossReference)cPropertyAssignment_0.eContents().get(0);
		private final RuleCall cPropertyPropertyQPREFParserRuleCall_0_0_1 = (RuleCall)cPropertyPropertyCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cOwnedValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOwnedValuePropertyValueParserRuleCall_2_0 = (RuleCall)cOwnedValueAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);

		//BasicPropertyAssociation returns aadl2::PropertyAssociation:
		//	property=[aadl2::Property|QPREF] "=>" ownedValue+=PropertyValue ";";
		public ParserRule getRule() { return rule; }

		//property=[aadl2::Property|QPREF] "=>" ownedValue+=PropertyValue ";"
		public Group getGroup() { return cGroup; }

		//property=[aadl2::Property|QPREF]
		public Assignment getPropertyAssignment_0() { return cPropertyAssignment_0; }

		//[aadl2::Property|QPREF]
		public CrossReference getPropertyPropertyCrossReference_0_0() { return cPropertyPropertyCrossReference_0_0; }

		//QPREF
		public RuleCall getPropertyPropertyQPREFParserRuleCall_0_0_1() { return cPropertyPropertyQPREFParserRuleCall_0_0_1; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }

		//ownedValue+=PropertyValue
		public Assignment getOwnedValueAssignment_2() { return cOwnedValueAssignment_2; }

		//PropertyValue
		public RuleCall getOwnedValuePropertyValueParserRuleCall_2_0() { return cOwnedValuePropertyValueParserRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class ContainmentPathElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ContainmentPath");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cContainedNamedElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cContainmentPathElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cContainmentPathElementContainmentPathElementParserRuleCall_1_0 = (RuleCall)cContainmentPathElementAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cContainmentPathElementAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cContainmentPathElementContainmentPathElementParserRuleCall_2_1_0 = (RuleCall)cContainmentPathElementAssignment_2_1.eContents().get(0);

		//ContainmentPath returns aadl2::ContainedNamedElement:
		//	{aadl2::ContainedNamedElement} containmentPathElement+=ContainmentPathElement ("."
		//	containmentPathElement+=ContainmentPathElement)*;
		public ParserRule getRule() { return rule; }

		//{aadl2::ContainedNamedElement} containmentPathElement+=ContainmentPathElement ("."
		//containmentPathElement+=ContainmentPathElement)*
		public Group getGroup() { return cGroup; }

		//{aadl2::ContainedNamedElement}
		public Action getContainedNamedElementAction_0() { return cContainedNamedElementAction_0; }

		//containmentPathElement+=ContainmentPathElement
		public Assignment getContainmentPathElementAssignment_1() { return cContainmentPathElementAssignment_1; }

		//ContainmentPathElement
		public RuleCall getContainmentPathElementContainmentPathElementParserRuleCall_1_0() { return cContainmentPathElementContainmentPathElementParserRuleCall_1_0; }

		//("." containmentPathElement+=ContainmentPathElement)*
		public Group getGroup_2() { return cGroup_2; }

		//"."
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }

		//containmentPathElement+=ContainmentPathElement
		public Assignment getContainmentPathElementAssignment_2_1() { return cContainmentPathElementAssignment_2_1; }

		//ContainmentPathElement
		public RuleCall getContainmentPathElementContainmentPathElementParserRuleCall_2_1_0() { return cContainmentPathElementContainmentPathElementParserRuleCall_2_1_0; }
	}

	public class ModalPropertyValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ModalPropertyValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOwnedValueAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOwnedValuePropertyExpressionParserRuleCall_0_0 = (RuleCall)cOwnedValueAssignment_0.eContents().get(0);
		private final Keyword cInKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cModesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInModeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cInModeModeCrossReference_4_0 = (CrossReference)cInModeAssignment_4.eContents().get(0);
		private final RuleCall cInModeModeIDTerminalRuleCall_4_0_1 = (RuleCall)cInModeModeCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cInModeAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cInModeModeCrossReference_5_1_0 = (CrossReference)cInModeAssignment_5_1.eContents().get(0);
		private final RuleCall cInModeModeIDTerminalRuleCall_5_1_0_1 = (RuleCall)cInModeModeCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);

		//ModalPropertyValue returns aadl2::ModalPropertyValue:
		//	ownedValue=PropertyExpression "in" "modes" "(" inMode+=[aadl2::Mode] ("," inMode+=[aadl2::Mode])* ")";
		public ParserRule getRule() { return rule; }

		//ownedValue=PropertyExpression "in" "modes" "(" inMode+=[aadl2::Mode] ("," inMode+=[aadl2::Mode])* ")"
		public Group getGroup() { return cGroup; }

		//ownedValue=PropertyExpression
		public Assignment getOwnedValueAssignment_0() { return cOwnedValueAssignment_0; }

		//PropertyExpression
		public RuleCall getOwnedValuePropertyExpressionParserRuleCall_0_0() { return cOwnedValuePropertyExpressionParserRuleCall_0_0; }

		//"in"
		public Keyword getInKeyword_1() { return cInKeyword_1; }

		//"modes"
		public Keyword getModesKeyword_2() { return cModesKeyword_2; }

		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }

		//inMode+=[aadl2::Mode]
		public Assignment getInModeAssignment_4() { return cInModeAssignment_4; }

		//[aadl2::Mode]
		public CrossReference getInModeModeCrossReference_4_0() { return cInModeModeCrossReference_4_0; }

		//ID
		public RuleCall getInModeModeIDTerminalRuleCall_4_0_1() { return cInModeModeIDTerminalRuleCall_4_0_1; }

		//("," inMode+=[aadl2::Mode])*
		public Group getGroup_5() { return cGroup_5; }

		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }

		//inMode+=[aadl2::Mode]
		public Assignment getInModeAssignment_5_1() { return cInModeAssignment_5_1; }

		//[aadl2::Mode]
		public CrossReference getInModeModeCrossReference_5_1_0() { return cInModeModeCrossReference_5_1_0; }

		//ID
		public RuleCall getInModeModeIDTerminalRuleCall_5_1_0_1() { return cInModeModeIDTerminalRuleCall_5_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
	}

	public class OptionalModalPropertyValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OptionalModalPropertyValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOwnedValueAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOwnedValuePropertyExpressionParserRuleCall_0_0 = (RuleCall)cOwnedValueAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cInKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cModesKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cInModeAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final CrossReference cInModeModeCrossReference_1_3_0 = (CrossReference)cInModeAssignment_1_3.eContents().get(0);
		private final RuleCall cInModeModeIDTerminalRuleCall_1_3_0_1 = (RuleCall)cInModeModeCrossReference_1_3_0.eContents().get(1);
		private final Group cGroup_1_4 = (Group)cGroup_1.eContents().get(4);
		private final Keyword cCommaKeyword_1_4_0 = (Keyword)cGroup_1_4.eContents().get(0);
		private final Assignment cInModeAssignment_1_4_1 = (Assignment)cGroup_1_4.eContents().get(1);
		private final CrossReference cInModeModeCrossReference_1_4_1_0 = (CrossReference)cInModeAssignment_1_4_1.eContents().get(0);
		private final RuleCall cInModeModeIDTerminalRuleCall_1_4_1_0_1 = (RuleCall)cInModeModeCrossReference_1_4_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_5 = (Keyword)cGroup_1.eContents().get(5);

		//OptionalModalPropertyValue returns aadl2::ModalPropertyValue:
		//	ownedValue=PropertyExpression // phf made this optional: need to check separately that only the last one is optional
		//	("in" "modes" "(" inMode+=[aadl2::Mode] ("," inMode+=[aadl2::Mode])* ")")?;
		public ParserRule getRule() { return rule; }

		//ownedValue=PropertyExpression // phf made this optional: need to check separately that only the last one is optional
		//("in" "modes" "(" inMode+=[aadl2::Mode] ("," inMode+=[aadl2::Mode])* ")")?
		public Group getGroup() { return cGroup; }

		//ownedValue=PropertyExpression
		public Assignment getOwnedValueAssignment_0() { return cOwnedValueAssignment_0; }

		//PropertyExpression
		public RuleCall getOwnedValuePropertyExpressionParserRuleCall_0_0() { return cOwnedValuePropertyExpressionParserRuleCall_0_0; }

		//("in" "modes" "(" inMode+=[aadl2::Mode] ("," inMode+=[aadl2::Mode])* ")")?
		public Group getGroup_1() { return cGroup_1; }

		//"in"
		public Keyword getInKeyword_1_0() { return cInKeyword_1_0; }

		//"modes"
		public Keyword getModesKeyword_1_1() { return cModesKeyword_1_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_1_2() { return cLeftParenthesisKeyword_1_2; }

		//inMode+=[aadl2::Mode]
		public Assignment getInModeAssignment_1_3() { return cInModeAssignment_1_3; }

		//[aadl2::Mode]
		public CrossReference getInModeModeCrossReference_1_3_0() { return cInModeModeCrossReference_1_3_0; }

		//ID
		public RuleCall getInModeModeIDTerminalRuleCall_1_3_0_1() { return cInModeModeIDTerminalRuleCall_1_3_0_1; }

		//("," inMode+=[aadl2::Mode])*
		public Group getGroup_1_4() { return cGroup_1_4; }

		//","
		public Keyword getCommaKeyword_1_4_0() { return cCommaKeyword_1_4_0; }

		//inMode+=[aadl2::Mode]
		public Assignment getInModeAssignment_1_4_1() { return cInModeAssignment_1_4_1; }

		//[aadl2::Mode]
		public CrossReference getInModeModeCrossReference_1_4_1_0() { return cInModeModeCrossReference_1_4_1_0; }

		//ID
		public RuleCall getInModeModeIDTerminalRuleCall_1_4_1_0_1() { return cInModeModeIDTerminalRuleCall_1_4_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_1_5() { return cRightParenthesisKeyword_1_5; }
	}

	public class PropertyValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PropertyValue");
		private final Assignment cOwnedValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cOwnedValuePropertyExpressionParserRuleCall_0 = (RuleCall)cOwnedValueAssignment.eContents().get(0);

		//// &&&&&&&&&& handling of in binding
		//PropertyValue returns aadl2::ModalPropertyValue:
		//	ownedValue=PropertyExpression;
		public ParserRule getRule() { return rule; }

		//ownedValue=PropertyExpression
		public Assignment getOwnedValueAssignment() { return cOwnedValueAssignment; }

		//PropertyExpression
		public RuleCall getOwnedValuePropertyExpressionParserRuleCall_0() { return cOwnedValuePropertyExpressionParserRuleCall_0; }
	}

	public class PropertyExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PropertyExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cOldRecordTermParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRecordTermParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cReferenceTermParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cComponentClassifierTermParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cComputedTermParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cStringTermParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cNumericRangeTermParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cRealTermParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cIntegerTermParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cListTermParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cBooleanLiteralParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cLiteralorReferenceTermParserRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);

		//PropertyExpression returns aadl2::PropertyExpression:
		//	OldRecordTerm | RecordTerm | ReferenceTerm | ComponentClassifierTerm | ComputedTerm | StringTerm | NumericRangeTerm |
		//	RealTerm | IntegerTerm | ListTerm | BooleanLiteral | LiteralorReferenceTerm;
		public ParserRule getRule() { return rule; }

		//OldRecordTerm | RecordTerm | ReferenceTerm | ComponentClassifierTerm | ComputedTerm | StringTerm | NumericRangeTerm |
		//RealTerm | IntegerTerm | ListTerm | BooleanLiteral | LiteralorReferenceTerm
		public Alternatives getAlternatives() { return cAlternatives; }

		//OldRecordTerm
		public RuleCall getOldRecordTermParserRuleCall_0() { return cOldRecordTermParserRuleCall_0; }

		//RecordTerm
		public RuleCall getRecordTermParserRuleCall_1() { return cRecordTermParserRuleCall_1; }

		//ReferenceTerm
		public RuleCall getReferenceTermParserRuleCall_2() { return cReferenceTermParserRuleCall_2; }

		//ComponentClassifierTerm
		public RuleCall getComponentClassifierTermParserRuleCall_3() { return cComponentClassifierTermParserRuleCall_3; }

		//ComputedTerm
		public RuleCall getComputedTermParserRuleCall_4() { return cComputedTermParserRuleCall_4; }

		//StringTerm
		public RuleCall getStringTermParserRuleCall_5() { return cStringTermParserRuleCall_5; }

		//NumericRangeTerm
		public RuleCall getNumericRangeTermParserRuleCall_6() { return cNumericRangeTermParserRuleCall_6; }

		//RealTerm
		public RuleCall getRealTermParserRuleCall_7() { return cRealTermParserRuleCall_7; }

		//IntegerTerm
		public RuleCall getIntegerTermParserRuleCall_8() { return cIntegerTermParserRuleCall_8; }

		//ListTerm
		public RuleCall getListTermParserRuleCall_9() { return cListTermParserRuleCall_9; }

		//BooleanLiteral
		public RuleCall getBooleanLiteralParserRuleCall_10() { return cBooleanLiteralParserRuleCall_10; }

		//LiteralorReferenceTerm
		public RuleCall getLiteralorReferenceTermParserRuleCall_11() { return cLiteralorReferenceTermParserRuleCall_11; }
	}

	public class LiteralorReferenceTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LiteralorReferenceTerm");
		private final Assignment cNamedValueAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cNamedValueAbstractNamedValueCrossReference_0 = (CrossReference)cNamedValueAssignment.eContents().get(0);
		private final RuleCall cNamedValueAbstractNamedValueQPREFParserRuleCall_0_1 = (RuleCall)cNamedValueAbstractNamedValueCrossReference_0.eContents().get(1);

		//LiteralorReferenceTerm returns aadl2::NamedValue:
		//	namedValue=[aadl2::AbstractNamedValue|QPREF];
		public ParserRule getRule() { return rule; }

		//namedValue=[aadl2::AbstractNamedValue|QPREF]
		public Assignment getNamedValueAssignment() { return cNamedValueAssignment; }

		//[aadl2::AbstractNamedValue|QPREF]
		public CrossReference getNamedValueAbstractNamedValueCrossReference_0() { return cNamedValueAbstractNamedValueCrossReference_0; }

		//QPREF
		public RuleCall getNamedValueAbstractNamedValueQPREFParserRuleCall_0_1() { return cNamedValueAbstractNamedValueQPREFParserRuleCall_0_1; }
	}

	public class BooleanLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BooleanLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBooleanLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Keyword cValueTrueKeyword_1_0_0 = (Keyword)cValueAssignment_1_0.eContents().get(0);
		private final Keyword cFalseKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);

		//BooleanLiteral returns aadl2::BooleanLiteral:
		//	{aadl2::BooleanLiteral} (value?="true" | "false");
		public ParserRule getRule() { return rule; }

		//{aadl2::BooleanLiteral} (value?="true" | "false")
		public Group getGroup() { return cGroup; }

		//{aadl2::BooleanLiteral}
		public Action getBooleanLiteralAction_0() { return cBooleanLiteralAction_0; }

		//value?="true" | "false"
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//value?="true"
		public Assignment getValueAssignment_1_0() { return cValueAssignment_1_0; }

		//"true"
		public Keyword getValueTrueKeyword_1_0_0() { return cValueTrueKeyword_1_0_0; }

		//"false"
		public Keyword getFalseKeyword_1_1() { return cFalseKeyword_1_1; }
	}

	public class ConstantValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConstantValue");
		private final Assignment cNamedValueAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cNamedValuePropertyConstantCrossReference_0 = (CrossReference)cNamedValueAssignment.eContents().get(0);
		private final RuleCall cNamedValuePropertyConstantQPREFParserRuleCall_0_1 = (RuleCall)cNamedValuePropertyConstantCrossReference_0.eContents().get(1);

		//ConstantValue returns aadl2::NamedValue:
		//	namedValue=[aadl2::PropertyConstant|QPREF];
		public ParserRule getRule() { return rule; }

		//namedValue=[aadl2::PropertyConstant|QPREF]
		public Assignment getNamedValueAssignment() { return cNamedValueAssignment; }

		//[aadl2::PropertyConstant|QPREF]
		public CrossReference getNamedValuePropertyConstantCrossReference_0() { return cNamedValuePropertyConstantCrossReference_0; }

		//QPREF
		public RuleCall getNamedValuePropertyConstantQPREFParserRuleCall_0_1() { return cNamedValuePropertyConstantQPREFParserRuleCall_0_1; }
	}

	public class ReferenceTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ReferenceTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReferenceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cContainmentPathElementAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContainmentPathElementContainmentPathElementParserRuleCall_2_0 = (RuleCall)cContainmentPathElementAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cFullStopKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cContainmentPathElementAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cContainmentPathElementContainmentPathElementParserRuleCall_3_1_0 = (RuleCall)cContainmentPathElementAssignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);

		//ReferenceTerm returns aadl2::ReferenceValue:
		//	"reference" "(" containmentPathElement+=ContainmentPathElement ("." containmentPathElement+=ContainmentPathElement)*
		//	")";
		public ParserRule getRule() { return rule; }

		//"reference" "(" containmentPathElement+=ContainmentPathElement ("." containmentPathElement+=ContainmentPathElement)* ")"
		public Group getGroup() { return cGroup; }

		//"reference"
		public Keyword getReferenceKeyword_0() { return cReferenceKeyword_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//containmentPathElement+=ContainmentPathElement
		public Assignment getContainmentPathElementAssignment_2() { return cContainmentPathElementAssignment_2; }

		//ContainmentPathElement
		public RuleCall getContainmentPathElementContainmentPathElementParserRuleCall_2_0() { return cContainmentPathElementContainmentPathElementParserRuleCall_2_0; }

		//("." containmentPathElement+=ContainmentPathElement)*
		public Group getGroup_3() { return cGroup_3; }

		//"."
		public Keyword getFullStopKeyword_3_0() { return cFullStopKeyword_3_0; }

		//containmentPathElement+=ContainmentPathElement
		public Assignment getContainmentPathElementAssignment_3_1() { return cContainmentPathElementAssignment_3_1; }

		//ContainmentPathElement
		public RuleCall getContainmentPathElementContainmentPathElementParserRuleCall_3_1_0() { return cContainmentPathElementContainmentPathElementParserRuleCall_3_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}

	public class RecordTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RecordTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOwnedFieldValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0 = (RuleCall)cOwnedFieldValueAssignment_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);

		//RecordTerm returns aadl2::RecordValue:
		//	"[" ownedFieldValue+=FieldPropertyAssociation+ "]";
		public ParserRule getRule() { return rule; }

		//"[" ownedFieldValue+=FieldPropertyAssociation+ "]"
		public Group getGroup() { return cGroup; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }

		//ownedFieldValue+=FieldPropertyAssociation+
		public Assignment getOwnedFieldValueAssignment_1() { return cOwnedFieldValueAssignment_1; }

		//FieldPropertyAssociation
		public RuleCall getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0() { return cOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }
	}

	public class OldRecordTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OldRecordTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOwnedFieldValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0 = (RuleCall)cOwnedFieldValueAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);

		//OldRecordTerm returns aadl2::RecordValue:
		//	"(" ownedFieldValue+=FieldPropertyAssociation+ ")";
		public ParserRule getRule() { return rule; }

		//"(" ownedFieldValue+=FieldPropertyAssociation+ ")"
		public Group getGroup() { return cGroup; }

		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }

		//ownedFieldValue+=FieldPropertyAssociation+
		public Assignment getOwnedFieldValueAssignment_1() { return cOwnedFieldValueAssignment_1; }

		//FieldPropertyAssociation
		public RuleCall getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0() { return cOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}

	public class ComputedTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ComputedTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComputeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFunctionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFunctionIDTerminalRuleCall_2_0 = (RuleCall)cFunctionAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);

		//ComputedTerm returns aadl2::ComputedValue:
		//	"compute" "(" function=ID ")";
		public ParserRule getRule() { return rule; }

		//"compute" "(" function=ID ")"
		public Group getGroup() { return cGroup; }

		//"compute"
		public Keyword getComputeKeyword_0() { return cComputeKeyword_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//function=ID
		public Assignment getFunctionAssignment_2() { return cFunctionAssignment_2; }

		//ID
		public RuleCall getFunctionIDTerminalRuleCall_2_0() { return cFunctionIDTerminalRuleCall_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class ComponentClassifierTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ComponentClassifierTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassifierKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cClassifierAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cClassifierComponentClassifierCrossReference_2_0 = (CrossReference)cClassifierAssignment_2.eContents().get(0);
		private final RuleCall cClassifierComponentClassifierQCREFParserRuleCall_2_0_1 = (RuleCall)cClassifierComponentClassifierCrossReference_2_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);

		//ComponentClassifierTerm returns aadl2::ClassifierValue:
		//	"classifier" "(" classifier=[aadl2::ComponentClassifier|QCREF] ")";
		public ParserRule getRule() { return rule; }

		//"classifier" "(" classifier=[aadl2::ComponentClassifier|QCREF] ")"
		public Group getGroup() { return cGroup; }

		//"classifier"
		public Keyword getClassifierKeyword_0() { return cClassifierKeyword_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//classifier=[aadl2::ComponentClassifier|QCREF]
		public Assignment getClassifierAssignment_2() { return cClassifierAssignment_2; }

		//[aadl2::ComponentClassifier|QCREF]
		public CrossReference getClassifierComponentClassifierCrossReference_2_0() { return cClassifierComponentClassifierCrossReference_2_0; }

		//QCREF
		public RuleCall getClassifierComponentClassifierQCREFParserRuleCall_2_0_1() { return cClassifierComponentClassifierQCREFParserRuleCall_2_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class ListTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ListTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOwnedListElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOwnedListElementPropertyExpressionParserRuleCall_1_0 = (RuleCall)cOwnedListElementAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cOwnedListElementAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cOwnedListElementPropertyExpressionParserRuleCall_2_1_0 = (RuleCall)cOwnedListElementAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);

		//ListTerm returns aadl2::ListValue:
		//	"(" ownedListElement+=PropertyExpression ("," ownedListElement+=PropertyExpression)* ")";
		public ParserRule getRule() { return rule; }

		//"(" ownedListElement+=PropertyExpression ("," ownedListElement+=PropertyExpression)* ")"
		public Group getGroup() { return cGroup; }

		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }

		//ownedListElement+=PropertyExpression
		public Assignment getOwnedListElementAssignment_1() { return cOwnedListElementAssignment_1; }

		//PropertyExpression
		public RuleCall getOwnedListElementPropertyExpressionParserRuleCall_1_0() { return cOwnedListElementPropertyExpressionParserRuleCall_1_0; }

		//("," ownedListElement+=PropertyExpression)*
		public Group getGroup_2() { return cGroup_2; }

		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }

		//ownedListElement+=PropertyExpression
		public Assignment getOwnedListElementAssignment_2_1() { return cOwnedListElementAssignment_2_1; }

		//PropertyExpression
		public RuleCall getOwnedListElementPropertyExpressionParserRuleCall_2_1_0() { return cOwnedListElementPropertyExpressionParserRuleCall_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class FieldPropertyAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FieldPropertyAssociation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPropertyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPropertyBasicPropertyCrossReference_0_0 = (CrossReference)cPropertyAssignment_0.eContents().get(0);
		private final RuleCall cPropertyBasicPropertyIDTerminalRuleCall_0_0_1 = (RuleCall)cPropertyBasicPropertyCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cOwnedValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOwnedValuePropertyExpressionParserRuleCall_2_0 = (RuleCall)cOwnedValueAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);

		//FieldPropertyAssociation returns aadl2::BasicPropertyAssociation:
		//	property=[aadl2::BasicProperty] "=>" ownedValue=PropertyExpression ";";
		public ParserRule getRule() { return rule; }

		//property=[aadl2::BasicProperty] "=>" ownedValue=PropertyExpression ";"
		public Group getGroup() { return cGroup; }

		//property=[aadl2::BasicProperty]
		public Assignment getPropertyAssignment_0() { return cPropertyAssignment_0; }

		//[aadl2::BasicProperty]
		public CrossReference getPropertyBasicPropertyCrossReference_0_0() { return cPropertyBasicPropertyCrossReference_0_0; }

		//ID
		public RuleCall getPropertyBasicPropertyIDTerminalRuleCall_0_0_1() { return cPropertyBasicPropertyIDTerminalRuleCall_0_0_1; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }

		//ownedValue=PropertyExpression
		public Assignment getOwnedValueAssignment_2() { return cOwnedValueAssignment_2; }

		//PropertyExpression
		public RuleCall getOwnedValuePropertyExpressionParserRuleCall_2_0() { return cOwnedValuePropertyExpressionParserRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class ContainmentPathElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ContainmentPathElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cNamedElementAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cNamedElementNamedElementCrossReference_0_0_0 = (CrossReference)cNamedElementAssignment_0_0.eContents().get(0);
		private final RuleCall cNamedElementNamedElementIDTerminalRuleCall_0_0_0_1 = (RuleCall)cNamedElementNamedElementCrossReference_0_0_0.eContents().get(1);
		private final Assignment cArrayRangeAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cArrayRangeArrayRangeParserRuleCall_0_1_0 = (RuleCall)cArrayRangeAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cAnnexKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNamedElementAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cNamedElementNamedElementCrossReference_1_1_0 = (CrossReference)cNamedElementAssignment_1_1.eContents().get(0);
		private final RuleCall cNamedElementNamedElementANNEXREFParserRuleCall_1_1_0_1 = (RuleCall)cNamedElementNamedElementCrossReference_1_1_0.eContents().get(1);

		//// from AADL2
		//// need to add annex path element
		//ContainmentPathElement returns aadl2::ContainmentPathElement:
		//	namedElement=[aadl2::NamedElement] arrayRange+=ArrayRange? | "annex" namedElement=[aadl2::NamedElement|ANNEXREF];
		public ParserRule getRule() { return rule; }

		//namedElement=[aadl2::NamedElement] arrayRange+=ArrayRange? | "annex" namedElement=[aadl2::NamedElement|ANNEXREF]
		public Alternatives getAlternatives() { return cAlternatives; }

		//namedElement=[aadl2::NamedElement] arrayRange+=ArrayRange?
		public Group getGroup_0() { return cGroup_0; }

		//namedElement=[aadl2::NamedElement]
		public Assignment getNamedElementAssignment_0_0() { return cNamedElementAssignment_0_0; }

		//[aadl2::NamedElement]
		public CrossReference getNamedElementNamedElementCrossReference_0_0_0() { return cNamedElementNamedElementCrossReference_0_0_0; }

		//ID
		public RuleCall getNamedElementNamedElementIDTerminalRuleCall_0_0_0_1() { return cNamedElementNamedElementIDTerminalRuleCall_0_0_0_1; }

		//arrayRange+=ArrayRange?
		public Assignment getArrayRangeAssignment_0_1() { return cArrayRangeAssignment_0_1; }

		//ArrayRange
		public RuleCall getArrayRangeArrayRangeParserRuleCall_0_1_0() { return cArrayRangeArrayRangeParserRuleCall_0_1_0; }

		//"annex" namedElement=[aadl2::NamedElement|ANNEXREF]
		public Group getGroup_1() { return cGroup_1; }

		//"annex"
		public Keyword getAnnexKeyword_1_0() { return cAnnexKeyword_1_0; }

		//namedElement=[aadl2::NamedElement|ANNEXREF]
		public Assignment getNamedElementAssignment_1_1() { return cNamedElementAssignment_1_1; }

		//[aadl2::NamedElement|ANNEXREF]
		public CrossReference getNamedElementNamedElementCrossReference_1_1_0() { return cNamedElementNamedElementCrossReference_1_1_0; }

		//ANNEXREF
		public RuleCall getNamedElementNamedElementANNEXREFParserRuleCall_1_1_0_1() { return cNamedElementNamedElementANNEXREFParserRuleCall_1_1_0_1; }
	}

	public class ANNEXREFElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ANNEXREF");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cSTARParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cSTARParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cIDTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final RuleCall cSTARParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final RuleCall cSTARParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);

		//ANNEXREF: // check what values are ok inside ** **
		//	"{" STAR STAR ID STAR STAR "}";
		public ParserRule getRule() { return rule; }

		//// check what values are ok inside ** **
		//"{" STAR STAR ID STAR STAR "}"
		public Group getGroup() { return cGroup; }

		//// check what values are ok inside ** **
		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//STAR
		public RuleCall getSTARParserRuleCall_1() { return cSTARParserRuleCall_1; }

		//STAR
		public RuleCall getSTARParserRuleCall_2() { return cSTARParserRuleCall_2; }

		//ID
		public RuleCall getIDTerminalRuleCall_3() { return cIDTerminalRuleCall_3; }

		//STAR
		public RuleCall getSTARParserRuleCall_4() { return cSTARParserRuleCall_4; }

		//STAR
		public RuleCall getSTARParserRuleCall_5() { return cSTARParserRuleCall_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class PlusMinusElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PlusMinus");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cPlusSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1 = (Keyword)cAlternatives.eContents().get(1);

		//PlusMinus returns aadl2::OperationKind:
		//	"+" | "-";
		public ParserRule getRule() { return rule; }

		//"+" | "-"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"+"
		public Keyword getPlusSignKeyword_0() { return cPlusSignKeyword_0; }

		//"-"
		public Keyword getHyphenMinusKeyword_1() { return cHyphenMinusKeyword_1; }
	}

	public class StringTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StringTerm");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueNoQuoteStringParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);

		//StringTerm returns aadl2::StringLiteral:
		//	value=NoQuoteString;
		public ParserRule getRule() { return rule; }

		//value=NoQuoteString
		public Assignment getValueAssignment() { return cValueAssignment; }

		//NoQuoteString
		public RuleCall getValueNoQuoteStringParserRuleCall_0() { return cValueNoQuoteStringParserRuleCall_0; }
	}

	public class NoQuoteStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NoQuoteString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);

		//NoQuoteString: // remove quotes from string in ValueConverter
		//	STRING;
		public ParserRule getRule() { return rule; }

		//// remove quotes from string in ValueConverter
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}

	public class ArrayRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ArrayRange");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cArrayRangeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLowerBoundAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLowerBoundINTVALUEParserRuleCall_2_0 = (RuleCall)cLowerBoundAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cFullStopFullStopKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cUpperBoundAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cUpperBoundINTVALUEParserRuleCall_3_1_0 = (RuleCall)cUpperBoundAssignment_3_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);

		//ArrayRange returns aadl2::ArrayRange:
		//	{aadl2::ArrayRange} "[" lowerBound=INTVALUE (".." upperBound=INTVALUE)? "]";
		public ParserRule getRule() { return rule; }

		//{aadl2::ArrayRange} "[" lowerBound=INTVALUE (".." upperBound=INTVALUE)? "]"
		public Group getGroup() { return cGroup; }

		//{aadl2::ArrayRange}
		public Action getArrayRangeAction_0() { return cArrayRangeAction_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }

		//lowerBound=INTVALUE
		public Assignment getLowerBoundAssignment_2() { return cLowerBoundAssignment_2; }

		//INTVALUE
		public RuleCall getLowerBoundINTVALUEParserRuleCall_2_0() { return cLowerBoundINTVALUEParserRuleCall_2_0; }

		//(".." upperBound=INTVALUE)?
		public Group getGroup_3() { return cGroup_3; }

		//".."
		public Keyword getFullStopFullStopKeyword_3_0() { return cFullStopFullStopKeyword_3_0; }

		//upperBound=INTVALUE
		public Assignment getUpperBoundAssignment_3_1() { return cUpperBoundAssignment_3_1; }

		//INTVALUE
		public RuleCall getUpperBoundINTVALUEParserRuleCall_3_1_0() { return cUpperBoundINTVALUEParserRuleCall_3_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}

	public class SignedConstantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SignedConstant");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOpPlusMinusParserRuleCall_0_0 = (RuleCall)cOpAssignment_0.eContents().get(0);
		private final Assignment cOwnedPropertyExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOwnedPropertyExpressionConstantValueParserRuleCall_1_0 = (RuleCall)cOwnedPropertyExpressionAssignment_1.eContents().get(0);

		//SignedConstant returns aadl2::Operation:
		//	op=PlusMinus ownedPropertyExpression+=ConstantValue;
		public ParserRule getRule() { return rule; }

		//op=PlusMinus ownedPropertyExpression+=ConstantValue
		public Group getGroup() { return cGroup; }

		//op=PlusMinus
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }

		//PlusMinus
		public RuleCall getOpPlusMinusParserRuleCall_0_0() { return cOpPlusMinusParserRuleCall_0_0; }

		//ownedPropertyExpression+=ConstantValue
		public Assignment getOwnedPropertyExpressionAssignment_1() { return cOwnedPropertyExpressionAssignment_1; }

		//ConstantValue
		public RuleCall getOwnedPropertyExpressionConstantValueParserRuleCall_1_0() { return cOwnedPropertyExpressionConstantValueParserRuleCall_1_0; }
	}

	public class IntegerTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IntegerTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValueSignedIntParserRuleCall_0_0 = (RuleCall)cValueAssignment_0.eContents().get(0);
		private final Assignment cUnitAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cUnitUnitLiteralCrossReference_1_0 = (CrossReference)cUnitAssignment_1.eContents().get(0);
		private final RuleCall cUnitUnitLiteralIDTerminalRuleCall_1_0_1 = (RuleCall)cUnitUnitLiteralCrossReference_1_0.eContents().get(1);

		//IntegerTerm returns aadl2::IntegerLiteral:
		//	value=SignedInt unit=[aadl2::UnitLiteral]?;
		public ParserRule getRule() { return rule; }

		//value=SignedInt unit=[aadl2::UnitLiteral]?
		public Group getGroup() { return cGroup; }

		//value=SignedInt
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }

		//SignedInt
		public RuleCall getValueSignedIntParserRuleCall_0_0() { return cValueSignedIntParserRuleCall_0_0; }

		//unit=[aadl2::UnitLiteral]?
		public Assignment getUnitAssignment_1() { return cUnitAssignment_1; }

		//[aadl2::UnitLiteral]
		public CrossReference getUnitUnitLiteralCrossReference_1_0() { return cUnitUnitLiteralCrossReference_1_0; }

		//ID
		public RuleCall getUnitUnitLiteralIDTerminalRuleCall_1_0_1() { return cUnitUnitLiteralIDTerminalRuleCall_1_0_1; }
	}

	public class SignedIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SignedInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cPlusSignKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final RuleCall cINTEGER_LITTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);

		//SignedInt returns aadl2::Integer:
		//	("+" | "-")? INTEGER_LIT;
		public ParserRule getRule() { return rule; }

		//("+" | "-")? INTEGER_LIT
		public Group getGroup() { return cGroup; }

		//("+" | "-")?
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//"+"
		public Keyword getPlusSignKeyword_0_0() { return cPlusSignKeyword_0_0; }

		//"-"
		public Keyword getHyphenMinusKeyword_0_1() { return cHyphenMinusKeyword_0_1; }

		//INTEGER_LIT
		public RuleCall getINTEGER_LITTerminalRuleCall_1() { return cINTEGER_LITTerminalRuleCall_1; }
	}

	public class RealTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RealTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValueSignedRealParserRuleCall_0_0 = (RuleCall)cValueAssignment_0.eContents().get(0);
		private final Assignment cUnitAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cUnitUnitLiteralCrossReference_1_0 = (CrossReference)cUnitAssignment_1.eContents().get(0);
		private final RuleCall cUnitUnitLiteralIDTerminalRuleCall_1_0_1 = (RuleCall)cUnitUnitLiteralCrossReference_1_0.eContents().get(1);

		//RealTerm returns aadl2::RealLiteral:
		//	value=SignedReal unit=[aadl2::UnitLiteral]?;
		public ParserRule getRule() { return rule; }

		//value=SignedReal unit=[aadl2::UnitLiteral]?
		public Group getGroup() { return cGroup; }

		//value=SignedReal
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }

		//SignedReal
		public RuleCall getValueSignedRealParserRuleCall_0_0() { return cValueSignedRealParserRuleCall_0_0; }

		//unit=[aadl2::UnitLiteral]?
		public Assignment getUnitAssignment_1() { return cUnitAssignment_1; }

		//[aadl2::UnitLiteral]
		public CrossReference getUnitUnitLiteralCrossReference_1_0() { return cUnitUnitLiteralCrossReference_1_0; }

		//ID
		public RuleCall getUnitUnitLiteralIDTerminalRuleCall_1_0_1() { return cUnitUnitLiteralIDTerminalRuleCall_1_0_1; }
	}

	public class SignedRealElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SignedReal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cPlusSignKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final RuleCall cREAL_LITTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);

		//SignedReal returns aadl2::Real:
		//	("+" | "-")? REAL_LIT;
		public ParserRule getRule() { return rule; }

		//("+" | "-")? REAL_LIT
		public Group getGroup() { return cGroup; }

		//("+" | "-")?
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//"+"
		public Keyword getPlusSignKeyword_0_0() { return cPlusSignKeyword_0_0; }

		//"-"
		public Keyword getHyphenMinusKeyword_0_1() { return cHyphenMinusKeyword_0_1; }

		//REAL_LIT
		public RuleCall getREAL_LITTerminalRuleCall_1() { return cREAL_LITTerminalRuleCall_1; }
	}

	public class NumericRangeTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NumericRangeTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cMinimumAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cMinimumNumAltParserRuleCall_0_0 = (RuleCall)cMinimumAssignment_0.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMaximumAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMaximumNumAltParserRuleCall_2_0 = (RuleCall)cMaximumAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDeltaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDeltaAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDeltaNumAltParserRuleCall_3_1_0 = (RuleCall)cDeltaAssignment_3_1.eContents().get(0);

		//NumericRangeTerm returns aadl2::RangeValue:
		//	minimum= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
		//	NumAlt ".." maximum= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
		//	NumAlt ("delta" delta= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
		//	NumAlt)?;
		public ParserRule getRule() { return rule; }

		//minimum= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
		//NumAlt ".." maximum= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
		//NumAlt ("delta" delta= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
		//NumAlt)?
		public Group getGroup() { return cGroup; }

		//minimum= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
		//NumAlt
		public Assignment getMinimumAssignment_0() { return cMinimumAssignment_0; }

		////(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
		//NumAlt
		public RuleCall getMinimumNumAltParserRuleCall_0_0() { return cMinimumNumAltParserRuleCall_0_0; }

		//".."
		public Keyword getFullStopFullStopKeyword_1() { return cFullStopFullStopKeyword_1; }

		//maximum= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
		//NumAlt
		public Assignment getMaximumAssignment_2() { return cMaximumAssignment_2; }

		////(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
		//NumAlt
		public RuleCall getMaximumNumAltParserRuleCall_2_0() { return cMaximumNumAltParserRuleCall_2_0; }

		//("delta" delta= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
		//NumAlt)?
		public Group getGroup_3() { return cGroup_3; }

		//"delta"
		public Keyword getDeltaKeyword_3_0() { return cDeltaKeyword_3_0; }

		//delta= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
		//NumAlt
		public Assignment getDeltaAssignment_3_1() { return cDeltaAssignment_3_1; }

		////(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
		//NumAlt
		public RuleCall getDeltaNumAltParserRuleCall_3_1_0() { return cDeltaNumAltParserRuleCall_3_1_0; }
	}

	public class NumAltElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NumAlt");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRealTermParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIntegerTermParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSignedConstantParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cConstantValueParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);

		//NumAlt returns aadl2::PropertyExpression:
		//	RealTerm | IntegerTerm | SignedConstant | ConstantValue;
		public ParserRule getRule() { return rule; }

		//RealTerm | IntegerTerm | SignedConstant | ConstantValue
		public Alternatives getAlternatives() { return cAlternatives; }

		//RealTerm
		public RuleCall getRealTermParserRuleCall_0() { return cRealTermParserRuleCall_0; }

		//IntegerTerm
		public RuleCall getIntegerTermParserRuleCall_1() { return cIntegerTermParserRuleCall_1; }

		//SignedConstant
		public RuleCall getSignedConstantParserRuleCall_2() { return cSignedConstantParserRuleCall_2; }

		//ConstantValue
		public RuleCall getConstantValueParserRuleCall_3() { return cConstantValueParserRuleCall_3; }
	}

	public class INTVALUEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "INTVALUE");
		private final RuleCall cINTEGER_LITTerminalRuleCall = (RuleCall)rule.eContents().get(1);

		//INTVALUE returns aadl2::Integer: //NUMERAL
		//	INTEGER_LIT;
		public ParserRule getRule() { return rule; }

		////NUMERAL
		//INTEGER_LIT
		public RuleCall getINTEGER_LITTerminalRuleCall() { return cINTEGER_LITTerminalRuleCall; }
	}

	public class QPREFElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QPREF");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonColonKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);

		//QPREF:
		//	ID ("::" ID)?;
		public ParserRule getRule() { return rule; }

		//ID ("::" ID)?
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("::" ID)?
		public Group getGroup_1() { return cGroup_1; }

		//"::"
		public Keyword getColonColonKeyword_1_0() { return cColonColonKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class QCREFElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QCREF");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);

		//QCREF:
		//	(ID "::")* ID ("." ID)?;
		public ParserRule getRule() { return rule; }

		//(ID "::")* ID ("." ID)?
		public Group getGroup() { return cGroup; }

		//(ID "::")*
		public Group getGroup_0() { return cGroup_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_0_0() { return cIDTerminalRuleCall_0_0; }

		//"::"
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }

		//("." ID)?
		public Group getGroup_2() { return cGroup_2; }

		//"."
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}

	public class STARElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "STAR");
		private final Keyword cAsteriskKeyword = (Keyword)rule.eContents().get(1);

		//STAR:
		//	"*";
		public ParserRule getRule() { return rule; }

		//"*"
		public Keyword getAsteriskKeyword() { return cAsteriskKeyword; }
	}


	private PModelElements pPModel;
	private ContainedPropertyAssociationElements pContainedPropertyAssociation;
	private PropertyAssociationElements pPropertyAssociation;
	private BasicPropertyAssociationElements pBasicPropertyAssociation;
	private ContainmentPathElements pContainmentPath;
	private ModalPropertyValueElements pModalPropertyValue;
	private OptionalModalPropertyValueElements pOptionalModalPropertyValue;
	private PropertyValueElements pPropertyValue;
	private PropertyExpressionElements pPropertyExpression;
	private LiteralorReferenceTermElements pLiteralorReferenceTerm;
	private BooleanLiteralElements pBooleanLiteral;
	private ConstantValueElements pConstantValue;
	private ReferenceTermElements pReferenceTerm;
	private RecordTermElements pRecordTerm;
	private OldRecordTermElements pOldRecordTerm;
	private ComputedTermElements pComputedTerm;
	private ComponentClassifierTermElements pComponentClassifierTerm;
	private ListTermElements pListTerm;
	private FieldPropertyAssociationElements pFieldPropertyAssociation;
	private ContainmentPathElementElements pContainmentPathElement;
	private ANNEXREFElements pANNEXREF;
	private PlusMinusElements pPlusMinus;
	private StringTermElements pStringTerm;
	private NoQuoteStringElements pNoQuoteString;
	private ArrayRangeElements pArrayRange;
	private SignedConstantElements pSignedConstant;
	private IntegerTermElements pIntegerTerm;
	private SignedIntElements pSignedInt;
	private RealTermElements pRealTerm;
	private SignedRealElements pSignedReal;
	private NumericRangeTermElements pNumericRangeTerm;
	private NumAltElements pNumAlt;
	private TerminalRule tSL_COMMENT;
	private INTVALUEElements pINTVALUE;
	private TerminalRule tEXPONENT;
	private TerminalRule tINT_EXPONENT;
	private TerminalRule tREAL_LIT;
	private TerminalRule tINTEGER_LIT;
	private TerminalRule tDIGIT;
	private TerminalRule tEXTENDED_DIGIT;
	private TerminalRule tBASED_INTEGER;
	private QPREFElements pQPREF;
	private QCREFElements pQCREF;
	private STARElements pSTAR;
	private TerminalRule tSTRING;
	private TerminalRule tID;
	private TerminalRule tWS;

	private final GrammarProvider grammarProvider;

	@Inject
	public PropertiesGrammarAccess(GrammarProvider grammarProvider) {
		this.grammarProvider = grammarProvider;
	}

	public Grammar getGrammar() {
		return grammarProvider.getGrammar(this);
	}



	//PModel returns aadl2::Element: //| BasicPropertyAssociation | PropertyAssociation
	//	ContainedPropertyAssociation;
	public PModelElements getPModelAccess() {
		return (pPModel != null) ? pPModel : (pPModel = new PModelElements());
	}

	public ParserRule getPModelRule() {
		return getPModelAccess().getRule();
	}

	//// Properties
	//ContainedPropertyAssociation returns aadl2::PropertyAssociation:
	//	property=[aadl2::Property|QPREF] ("=>" | append?="+=>") constant?="constant"? (ownedValue+=OptionalModalPropertyValue
	//	("," ownedValue+=OptionalModalPropertyValue)*) ("applies" "to" appliesTo+=ContainmentPath (","
	//	appliesTo+=ContainmentPath)*)? ("in" "binding" "(" inBinding+=[aadl2::Classifier|QCREF] ")")? ";";
	public ContainedPropertyAssociationElements getContainedPropertyAssociationAccess() {
		return (pContainedPropertyAssociation != null) ? pContainedPropertyAssociation : (pContainedPropertyAssociation = new ContainedPropertyAssociationElements());
	}

	public ParserRule getContainedPropertyAssociationRule() {
		return getContainedPropertyAssociationAccess().getRule();
	}

	//PropertyAssociation returns aadl2::PropertyAssociation:
	//	property=[aadl2::Property|QPREF] ("=>" | append?="+=>") constant?="constant"? (ownedValue+=OptionalModalPropertyValue
	//	("," ownedValue+=OptionalModalPropertyValue)*) ("in" "binding" "(" inBinding+=[aadl2::Classifier|QCREF] ")")? ";";
	public PropertyAssociationElements getPropertyAssociationAccess() {
		return (pPropertyAssociation != null) ? pPropertyAssociation : (pPropertyAssociation = new PropertyAssociationElements());
	}

	public ParserRule getPropertyAssociationRule() {
		return getPropertyAssociationAccess().getRule();
	}

	//BasicPropertyAssociation returns aadl2::PropertyAssociation:
	//	property=[aadl2::Property|QPREF] "=>" ownedValue+=PropertyValue ";";
	public BasicPropertyAssociationElements getBasicPropertyAssociationAccess() {
		return (pBasicPropertyAssociation != null) ? pBasicPropertyAssociation : (pBasicPropertyAssociation = new BasicPropertyAssociationElements());
	}

	public ParserRule getBasicPropertyAssociationRule() {
		return getBasicPropertyAssociationAccess().getRule();
	}

	//ContainmentPath returns aadl2::ContainedNamedElement:
	//	{aadl2::ContainedNamedElement} containmentPathElement+=ContainmentPathElement ("."
	//	containmentPathElement+=ContainmentPathElement)*;
	public ContainmentPathElements getContainmentPathAccess() {
		return (pContainmentPath != null) ? pContainmentPath : (pContainmentPath = new ContainmentPathElements());
	}

	public ParserRule getContainmentPathRule() {
		return getContainmentPathAccess().getRule();
	}

	//ModalPropertyValue returns aadl2::ModalPropertyValue:
	//	ownedValue=PropertyExpression "in" "modes" "(" inMode+=[aadl2::Mode] ("," inMode+=[aadl2::Mode])* ")";
	public ModalPropertyValueElements getModalPropertyValueAccess() {
		return (pModalPropertyValue != null) ? pModalPropertyValue : (pModalPropertyValue = new ModalPropertyValueElements());
	}

	public ParserRule getModalPropertyValueRule() {
		return getModalPropertyValueAccess().getRule();
	}

	//OptionalModalPropertyValue returns aadl2::ModalPropertyValue:
	//	ownedValue=PropertyExpression // phf made this optional: need to check separately that only the last one is optional
	//	("in" "modes" "(" inMode+=[aadl2::Mode] ("," inMode+=[aadl2::Mode])* ")")?;
	public OptionalModalPropertyValueElements getOptionalModalPropertyValueAccess() {
		return (pOptionalModalPropertyValue != null) ? pOptionalModalPropertyValue : (pOptionalModalPropertyValue = new OptionalModalPropertyValueElements());
	}

	public ParserRule getOptionalModalPropertyValueRule() {
		return getOptionalModalPropertyValueAccess().getRule();
	}

	//// &&&&&&&&&& handling of in binding
	//PropertyValue returns aadl2::ModalPropertyValue:
	//	ownedValue=PropertyExpression;
	public PropertyValueElements getPropertyValueAccess() {
		return (pPropertyValue != null) ? pPropertyValue : (pPropertyValue = new PropertyValueElements());
	}

	public ParserRule getPropertyValueRule() {
		return getPropertyValueAccess().getRule();
	}

	//PropertyExpression returns aadl2::PropertyExpression:
	//	OldRecordTerm | RecordTerm | ReferenceTerm | ComponentClassifierTerm | ComputedTerm | StringTerm | NumericRangeTerm |
	//	RealTerm | IntegerTerm | ListTerm | BooleanLiteral | LiteralorReferenceTerm;
	public PropertyExpressionElements getPropertyExpressionAccess() {
		return (pPropertyExpression != null) ? pPropertyExpression : (pPropertyExpression = new PropertyExpressionElements());
	}

	public ParserRule getPropertyExpressionRule() {
		return getPropertyExpressionAccess().getRule();
	}

	//LiteralorReferenceTerm returns aadl2::NamedValue:
	//	namedValue=[aadl2::AbstractNamedValue|QPREF];
	public LiteralorReferenceTermElements getLiteralorReferenceTermAccess() {
		return (pLiteralorReferenceTerm != null) ? pLiteralorReferenceTerm : (pLiteralorReferenceTerm = new LiteralorReferenceTermElements());
	}

	public ParserRule getLiteralorReferenceTermRule() {
		return getLiteralorReferenceTermAccess().getRule();
	}

	//BooleanLiteral returns aadl2::BooleanLiteral:
	//	{aadl2::BooleanLiteral} (value?="true" | "false");
	public BooleanLiteralElements getBooleanLiteralAccess() {
		return (pBooleanLiteral != null) ? pBooleanLiteral : (pBooleanLiteral = new BooleanLiteralElements());
	}

	public ParserRule getBooleanLiteralRule() {
		return getBooleanLiteralAccess().getRule();
	}

	//ConstantValue returns aadl2::NamedValue:
	//	namedValue=[aadl2::PropertyConstant|QPREF];
	public ConstantValueElements getConstantValueAccess() {
		return (pConstantValue != null) ? pConstantValue : (pConstantValue = new ConstantValueElements());
	}

	public ParserRule getConstantValueRule() {
		return getConstantValueAccess().getRule();
	}

	//ReferenceTerm returns aadl2::ReferenceValue:
	//	"reference" "(" containmentPathElement+=ContainmentPathElement ("." containmentPathElement+=ContainmentPathElement)*
	//	")";
	public ReferenceTermElements getReferenceTermAccess() {
		return (pReferenceTerm != null) ? pReferenceTerm : (pReferenceTerm = new ReferenceTermElements());
	}

	public ParserRule getReferenceTermRule() {
		return getReferenceTermAccess().getRule();
	}

	//RecordTerm returns aadl2::RecordValue:
	//	"[" ownedFieldValue+=FieldPropertyAssociation+ "]";
	public RecordTermElements getRecordTermAccess() {
		return (pRecordTerm != null) ? pRecordTerm : (pRecordTerm = new RecordTermElements());
	}

	public ParserRule getRecordTermRule() {
		return getRecordTermAccess().getRule();
	}

	//OldRecordTerm returns aadl2::RecordValue:
	//	"(" ownedFieldValue+=FieldPropertyAssociation+ ")";
	public OldRecordTermElements getOldRecordTermAccess() {
		return (pOldRecordTerm != null) ? pOldRecordTerm : (pOldRecordTerm = new OldRecordTermElements());
	}

	public ParserRule getOldRecordTermRule() {
		return getOldRecordTermAccess().getRule();
	}

	//ComputedTerm returns aadl2::ComputedValue:
	//	"compute" "(" function=ID ")";
	public ComputedTermElements getComputedTermAccess() {
		return (pComputedTerm != null) ? pComputedTerm : (pComputedTerm = new ComputedTermElements());
	}

	public ParserRule getComputedTermRule() {
		return getComputedTermAccess().getRule();
	}

	//ComponentClassifierTerm returns aadl2::ClassifierValue:
	//	"classifier" "(" classifier=[aadl2::ComponentClassifier|QCREF] ")";
	public ComponentClassifierTermElements getComponentClassifierTermAccess() {
		return (pComponentClassifierTerm != null) ? pComponentClassifierTerm : (pComponentClassifierTerm = new ComponentClassifierTermElements());
	}

	public ParserRule getComponentClassifierTermRule() {
		return getComponentClassifierTermAccess().getRule();
	}

	//ListTerm returns aadl2::ListValue:
	//	"(" ownedListElement+=PropertyExpression ("," ownedListElement+=PropertyExpression)* ")";
	public ListTermElements getListTermAccess() {
		return (pListTerm != null) ? pListTerm : (pListTerm = new ListTermElements());
	}

	public ParserRule getListTermRule() {
		return getListTermAccess().getRule();
	}

	//FieldPropertyAssociation returns aadl2::BasicPropertyAssociation:
	//	property=[aadl2::BasicProperty] "=>" ownedValue=PropertyExpression ";";
	public FieldPropertyAssociationElements getFieldPropertyAssociationAccess() {
		return (pFieldPropertyAssociation != null) ? pFieldPropertyAssociation : (pFieldPropertyAssociation = new FieldPropertyAssociationElements());
	}

	public ParserRule getFieldPropertyAssociationRule() {
		return getFieldPropertyAssociationAccess().getRule();
	}

	//// from AADL2
	//// need to add annex path element
	//ContainmentPathElement returns aadl2::ContainmentPathElement:
	//	namedElement=[aadl2::NamedElement] arrayRange+=ArrayRange? | "annex" namedElement=[aadl2::NamedElement|ANNEXREF];
	public ContainmentPathElementElements getContainmentPathElementAccess() {
		return (pContainmentPathElement != null) ? pContainmentPathElement : (pContainmentPathElement = new ContainmentPathElementElements());
	}

	public ParserRule getContainmentPathElementRule() {
		return getContainmentPathElementAccess().getRule();
	}

	//ANNEXREF: // check what values are ok inside ** **
	//	"{" STAR STAR ID STAR STAR "}";
	public ANNEXREFElements getANNEXREFAccess() {
		return (pANNEXREF != null) ? pANNEXREF : (pANNEXREF = new ANNEXREFElements());
	}

	public ParserRule getANNEXREFRule() {
		return getANNEXREFAccess().getRule();
	}

	//PlusMinus returns aadl2::OperationKind:
	//	"+" | "-";
	public PlusMinusElements getPlusMinusAccess() {
		return (pPlusMinus != null) ? pPlusMinus : (pPlusMinus = new PlusMinusElements());
	}

	public ParserRule getPlusMinusRule() {
		return getPlusMinusAccess().getRule();
	}

	//StringTerm returns aadl2::StringLiteral:
	//	value=NoQuoteString;
	public StringTermElements getStringTermAccess() {
		return (pStringTerm != null) ? pStringTerm : (pStringTerm = new StringTermElements());
	}

	public ParserRule getStringTermRule() {
		return getStringTermAccess().getRule();
	}

	//NoQuoteString: // remove quotes from string in ValueConverter
	//	STRING;
	public NoQuoteStringElements getNoQuoteStringAccess() {
		return (pNoQuoteString != null) ? pNoQuoteString : (pNoQuoteString = new NoQuoteStringElements());
	}

	public ParserRule getNoQuoteStringRule() {
		return getNoQuoteStringAccess().getRule();
	}

	//ArrayRange returns aadl2::ArrayRange:
	//	{aadl2::ArrayRange} "[" lowerBound=INTVALUE (".." upperBound=INTVALUE)? "]";
	public ArrayRangeElements getArrayRangeAccess() {
		return (pArrayRange != null) ? pArrayRange : (pArrayRange = new ArrayRangeElements());
	}

	public ParserRule getArrayRangeRule() {
		return getArrayRangeAccess().getRule();
	}

	//SignedConstant returns aadl2::Operation:
	//	op=PlusMinus ownedPropertyExpression+=ConstantValue;
	public SignedConstantElements getSignedConstantAccess() {
		return (pSignedConstant != null) ? pSignedConstant : (pSignedConstant = new SignedConstantElements());
	}

	public ParserRule getSignedConstantRule() {
		return getSignedConstantAccess().getRule();
	}

	//IntegerTerm returns aadl2::IntegerLiteral:
	//	value=SignedInt unit=[aadl2::UnitLiteral]?;
	public IntegerTermElements getIntegerTermAccess() {
		return (pIntegerTerm != null) ? pIntegerTerm : (pIntegerTerm = new IntegerTermElements());
	}

	public ParserRule getIntegerTermRule() {
		return getIntegerTermAccess().getRule();
	}

	//SignedInt returns aadl2::Integer:
	//	("+" | "-")? INTEGER_LIT;
	public SignedIntElements getSignedIntAccess() {
		return (pSignedInt != null) ? pSignedInt : (pSignedInt = new SignedIntElements());
	}

	public ParserRule getSignedIntRule() {
		return getSignedIntAccess().getRule();
	}

	//RealTerm returns aadl2::RealLiteral:
	//	value=SignedReal unit=[aadl2::UnitLiteral]?;
	public RealTermElements getRealTermAccess() {
		return (pRealTerm != null) ? pRealTerm : (pRealTerm = new RealTermElements());
	}

	public ParserRule getRealTermRule() {
		return getRealTermAccess().getRule();
	}

	//SignedReal returns aadl2::Real:
	//	("+" | "-")? REAL_LIT;
	public SignedRealElements getSignedRealAccess() {
		return (pSignedReal != null) ? pSignedReal : (pSignedReal = new SignedRealElements());
	}

	public ParserRule getSignedRealRule() {
		return getSignedRealAccess().getRule();
	}

	//NumericRangeTerm returns aadl2::RangeValue:
	//	minimum= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
	//	NumAlt ".." maximum= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
	//	NumAlt ("delta" delta= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
	//	NumAlt)?;
	public NumericRangeTermElements getNumericRangeTermAccess() {
		return (pNumericRangeTerm != null) ? pNumericRangeTerm : (pNumericRangeTerm = new NumericRangeTermElements());
	}

	public ParserRule getNumericRangeTermRule() {
		return getNumericRangeTermAccess().getRule();
	}

	//NumAlt returns aadl2::PropertyExpression:
	//	RealTerm | IntegerTerm | SignedConstant | ConstantValue;
	public NumAltElements getNumAltAccess() {
		return (pNumAlt != null) ? pNumAlt : (pNumAlt = new NumAltElements());
	}

	public ParserRule getNumAltRule() {
		return getNumAltAccess().getRule();
	}

	//terminal SL_COMMENT:
	//	"--" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return (tSL_COMMENT != null) ? tSL_COMMENT : (tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT"));
	}

	//INTVALUE returns aadl2::Integer: //NUMERAL
	//	INTEGER_LIT;
	public INTVALUEElements getINTVALUEAccess() {
		return (pINTVALUE != null) ? pINTVALUE : (pINTVALUE = new INTVALUEElements());
	}

	public ParserRule getINTVALUERule() {
		return getINTVALUEAccess().getRule();
	}

	////terminal NUMERAL:
	////	(DIGIT)+('_' (DIGIT)+)*
	////;
	////terminal INT returns ecore::EInt: (DIGIT)+('_' (DIGIT)+)*;
	//terminal fragment EXPONENT:
	//	("e" | "E") ("+" | "-")? DIGIT+;
	public TerminalRule getEXPONENTRule() {
		return (tEXPONENT != null) ? tEXPONENT : (tEXPONENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "EXPONENT"));
	}

	//terminal fragment INT_EXPONENT:
	//	("e" | "E") "+"? DIGIT+;
	public TerminalRule getINT_EXPONENTRule() {
		return (tINT_EXPONENT != null) ? tINT_EXPONENT : (tINT_EXPONENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INT_EXPONENT"));
	}

	//terminal REAL_LIT:
	//	DIGIT+ ("_" DIGIT+)* ("." DIGIT+ ("_" DIGIT+)* EXPONENT?);
	public TerminalRule getREAL_LITRule() {
		return (tREAL_LIT != null) ? tREAL_LIT : (tREAL_LIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "REAL_LIT"));
	}

	//terminal INTEGER_LIT:
	//	DIGIT+ ("_" DIGIT+)* ("#" BASED_INTEGER "#" INT_EXPONENT? | INT_EXPONENT?);
	public TerminalRule getINTEGER_LITRule() {
		return (tINTEGER_LIT != null) ? tINTEGER_LIT : (tINTEGER_LIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INTEGER_LIT"));
	}

	//terminal fragment DIGIT:
	//	"0".."9";
	public TerminalRule getDIGITRule() {
		return (tDIGIT != null) ? tDIGIT : (tDIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DIGIT"));
	}

	//terminal fragment EXTENDED_DIGIT:
	//	"0".."9" | "a".."f" | "A".."F";
	public TerminalRule getEXTENDED_DIGITRule() {
		return (tEXTENDED_DIGIT != null) ? tEXTENDED_DIGIT : (tEXTENDED_DIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "EXTENDED_DIGIT"));
	}

	//terminal fragment BASED_INTEGER:
	//	EXTENDED_DIGIT ("_"? EXTENDED_DIGIT)*;
	public TerminalRule getBASED_INTEGERRule() {
		return (tBASED_INTEGER != null) ? tBASED_INTEGER : (tBASED_INTEGER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "BASED_INTEGER"));
	}

	//QPREF:
	//	ID ("::" ID)?;
	public QPREFElements getQPREFAccess() {
		return (pQPREF != null) ? pQPREF : (pQPREF = new QPREFElements());
	}

	public ParserRule getQPREFRule() {
		return getQPREFAccess().getRule();
	}

	//QCREF:
	//	(ID "::")* ID ("." ID)?;
	public QCREFElements getQCREFAccess() {
		return (pQCREF != null) ? pQCREF : (pQCREF = new QCREFElements());
	}

	public ParserRule getQCREFRule() {
		return getQCREFAccess().getRule();
	}

	//STAR:
	//	"*";
	public STARElements getSTARAccess() {
		return (pSTAR != null) ? pSTAR : (pSTAR = new STARElements());
	}

	public ParserRule getSTARRule() {
		return getSTARAccess().getRule();
	}

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return (tSTRING != null) ? tSTRING : (tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "STRING"));
	}

	////terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	//terminal ID:
	//	("a".."z" | "A".."Z") ("_"? ("a".."z" | "A".."Z" | "0".."9"))*;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	}

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	}
}
