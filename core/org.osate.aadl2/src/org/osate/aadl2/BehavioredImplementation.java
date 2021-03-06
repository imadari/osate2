/**
 * <copyright>
 * Copyright  2008 by Carnegie Mellon University, all rights reserved.
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
 * Carnegie Mellon University Software Engineering Institute authored documents are sponsored by the U.S. Department
 * of Defense under Contract F19628-00-C-0003. Carnegie Mellon University retains copyrights in all material produced
 * under this contract. The U.S. Government retains a non-exclusive, royalty-free license to publish or reproduce these
 * documents, or allow others to do so, for U.S. Government purposes only pursuant to the copyright license
 * under the contract clause at 252.227.7013.
 * </copyright>
 *
 * $Id: BehavioredImplementation.java,v 1.7 2009-02-19 19:07:41 lwrage Exp $
 */
package org.osate.aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviored Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Calls.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadl2.BehavioredImplementation#getSubprogramCalls <em>Subprogram Call</em>}</li>
 *   <li>{@link org.osate.aadl2.BehavioredImplementation#getOwnedSubprogramCallSequences <em>Owned Subprogram Call Sequence</em>}</li>
 * </ul>
 *
 * @see org.osate.aadl2.Aadl2Package#getBehavioredImplementation()
 * @model abstract="true"
 * @generated
 */
public interface BehavioredImplementation extends ComponentImplementation {
	/**
	 * Returns the value of the '<em><b>Subprogram Call</b></em>' reference list.
	 * The list contents are of type {@link org.osate.aadl2.SubprogramCall}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.osate.aadl2.Namespace#getMembers() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprogram Call</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Calls.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subprogram Call</em>' reference list.
	 * @see org.osate.aadl2.Aadl2Package#getBehavioredImplementation_SubprogramCall()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<SubprogramCall> getSubprogramCalls();

	/**
	 * Get all subprogram call sequences, including inherited.
	 *
	 * @return List of subprogram call sequences in this component implementation
	 */
	EList<SubprogramCallSequence> getAllSubprogramCallSequences();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Call Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadl2.SubprogramCallSequence}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.osate.aadl2.Classifier#getClassifierFeatures() <em>Classifier Feature</em>}'</li>
	 *   <li>'{@link org.osate.aadl2.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Subprogram Call Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Calls.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Call Sequence</em>' containment reference list.
	 * @see org.osate.aadl2.Aadl2Package#getBehavioredImplementation_OwnedSubprogramCallSequence()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SubprogramCallSequence> getOwnedSubprogramCallSequences();

	/**
	 * Creates a new {@link org.osate.aadl2.SubprogramCallSequence} and appends it to the '<em><b>Owned Subprogram Call Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.osate.aadl2.SubprogramCallSequence}.
	 * @see #getOwnedSubprogramCallSequences()
	 * @generated
	 */
	SubprogramCallSequence createOwnedSubprogramCallSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get all calls owned by owned call sequences.
	 * <p>From package AADLDetails::Calls.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<SubprogramCall> subprogramCalls();

} // BehavioredImplementation
