/**
 */
package org.osate.reqspec.reqSpec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.reqspec.reqSpec.ReqSpecFactory
 * @model kind="package"
 * @generated
 */
public interface ReqSpecPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "reqSpec";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.osate.org/reqspec/ReqSpec";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "reqSpec";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ReqSpecPackage eINSTANCE = org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.ReqSpecImpl <em>Req Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getReqSpec()
   * @generated
   */
  int REQ_SPEC = 0;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPEC__PARTS = 0;

  /**
   * The number of structural features of the '<em>Req Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.ReqSpecContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecContainerImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getReqSpecContainer()
   * @generated
   */
  int REQ_SPEC_CONTAINER = 1;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPEC_CONTAINER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.ContractualElementImpl <em>Contractual Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.ContractualElementImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getContractualElement()
   * @generated
   */
  int CONTRACTUAL_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__TITLE = 1;

  /**
   * The feature id for the '<em><b>Target Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__TARGET_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Target Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__TARGET_DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__TARGET = 4;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__CATEGORY = 5;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__DESCRIPTION = 6;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__CONSTANTS = 7;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__RATIONALE = 8;

  /**
   * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY = 9;

  /**
   * The feature id for the '<em><b>Document Requirement</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__DOCUMENT_REQUIREMENT = 10;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__DOC_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Issues</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__ISSUES = 12;

  /**
   * The number of structural features of the '<em>Contractual Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.ReqRootImpl <em>Req Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.ReqRootImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getReqRoot()
   * @generated
   */
  int REQ_ROOT = 3;

  /**
   * The number of structural features of the '<em>Req Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_ROOT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.StakeholderGoalsImpl <em>Stakeholder Goals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.StakeholderGoalsImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getStakeholderGoals()
   * @generated
   */
  int STAKEHOLDER_GOALS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_GOALS__NAME = REQ_SPEC_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_GOALS__TITLE = REQ_SPEC_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_GOALS__TARGET = REQ_SPEC_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Target Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_GOALS__TARGET_DESCRIPTION = REQ_SPEC_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Global</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_GOALS__GLOBAL = REQ_SPEC_CONTAINER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_GOALS__DESCRIPTION = REQ_SPEC_CONTAINER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_GOALS__CONTENT = REQ_SPEC_CONTAINER_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Issues</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_GOALS__ISSUES = REQ_SPEC_CONTAINER_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Stakeholder Goals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_GOALS_FEATURE_COUNT = REQ_SPEC_CONTAINER_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.ReqDocumentImpl <em>Req Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.ReqDocumentImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getReqDocument()
   * @generated
   */
  int REQ_DOCUMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_DOCUMENT__NAME = REQ_SPEC_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_DOCUMENT__TITLE = REQ_SPEC_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_DOCUMENT__DESCRIPTION = REQ_SPEC_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_DOCUMENT__CONTENT = REQ_SPEC_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Issues</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_DOCUMENT__ISSUES = REQ_SPEC_CONTAINER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Req Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_DOCUMENT_FEATURE_COUNT = REQ_SPEC_CONTAINER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.DocumentSectionImpl <em>Document Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.DocumentSectionImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getDocumentSection()
   * @generated
   */
  int DOCUMENT_SECTION = 6;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_SECTION__LABEL = REQ_SPEC_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_SECTION__TITLE = REQ_SPEC_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_SECTION__DESCRIPTION = REQ_SPEC_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_SECTION__CONTENT = REQ_SPEC_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Document Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_SECTION_FEATURE_COUNT = REQ_SPEC_CONTAINER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.ReqSpecsImpl <em>Req Specs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecsImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getReqSpecs()
   * @generated
   */
  int REQ_SPECS = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPECS__NAME = REQ_SPEC_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPECS__TITLE = REQ_SPEC_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPECS__TARGET = REQ_SPEC_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Target Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPECS__TARGET_DESCRIPTION = REQ_SPEC_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Global</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPECS__GLOBAL = REQ_SPEC_CONTAINER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Otherreqspecs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPECS__OTHERREQSPECS = REQ_SPEC_CONTAINER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPECS__CONSTANTS = REQ_SPEC_CONTAINER_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPECS__CONTENT = REQ_SPEC_CONTAINER_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPECS__DOC_REFERENCE = REQ_SPEC_CONTAINER_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Issues</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPECS__ISSUES = REQ_SPEC_CONTAINER_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Req Specs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_SPECS_FEATURE_COUNT = REQ_SPEC_CONTAINER_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.GoalImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = CONTRACTUAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TITLE = CONTRACTUAL_ELEMENT__TITLE;

  /**
   * The feature id for the '<em><b>Target Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TARGET_ELEMENT = CONTRACTUAL_ELEMENT__TARGET_ELEMENT;

  /**
   * The feature id for the '<em><b>Target Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TARGET_DESCRIPTION = CONTRACTUAL_ELEMENT__TARGET_DESCRIPTION;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TARGET = CONTRACTUAL_ELEMENT__TARGET;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__CATEGORY = CONTRACTUAL_ELEMENT__CATEGORY;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DESCRIPTION = CONTRACTUAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__CONSTANTS = CONTRACTUAL_ELEMENT__CONSTANTS;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__RATIONALE = CONTRACTUAL_ELEMENT__RATIONALE;

  /**
   * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__CHANGE_UNCERTAINTY = CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY;

  /**
   * The feature id for the '<em><b>Document Requirement</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DOCUMENT_REQUIREMENT = CONTRACTUAL_ELEMENT__DOCUMENT_REQUIREMENT;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DOC_REFERENCE = CONTRACTUAL_ELEMENT__DOC_REFERENCE;

  /**
   * The feature id for the '<em><b>Issues</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ISSUES = CONTRACTUAL_ELEMENT__ISSUES;

  /**
   * The feature id for the '<em><b>Refines Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__REFINES_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conflicts Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__CONFLICTS_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stakeholder Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__STAKEHOLDER_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.RequirementImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME = CONTRACTUAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TITLE = CONTRACTUAL_ELEMENT__TITLE;

  /**
   * The feature id for the '<em><b>Target Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TARGET_ELEMENT = CONTRACTUAL_ELEMENT__TARGET_ELEMENT;

  /**
   * The feature id for the '<em><b>Target Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TARGET_DESCRIPTION = CONTRACTUAL_ELEMENT__TARGET_DESCRIPTION;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TARGET = CONTRACTUAL_ELEMENT__TARGET;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__CATEGORY = CONTRACTUAL_ELEMENT__CATEGORY;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DESCRIPTION = CONTRACTUAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__CONSTANTS = CONTRACTUAL_ELEMENT__CONSTANTS;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__RATIONALE = CONTRACTUAL_ELEMENT__RATIONALE;

  /**
   * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__CHANGE_UNCERTAINTY = CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY;

  /**
   * The feature id for the '<em><b>Document Requirement</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DOCUMENT_REQUIREMENT = CONTRACTUAL_ELEMENT__DOCUMENT_REQUIREMENT;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DOC_REFERENCE = CONTRACTUAL_ELEMENT__DOC_REFERENCE;

  /**
   * The feature id for the '<em><b>Issues</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__ISSUES = CONTRACTUAL_ELEMENT__ISSUES;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__PREDICATE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exception</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__EXCEPTION = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exception Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__EXCEPTION_TEXT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Refines Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__REFINES_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Goal Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__GOAL_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Stakeholder Requirement Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.ReqPredicateImpl <em>Req Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.ReqPredicateImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getReqPredicate()
   * @generated
   */
  int REQ_PREDICATE = 10;

  /**
   * The number of structural features of the '<em>Req Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_PREDICATE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.InformalPredicateImpl <em>Informal Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.InformalPredicateImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getInformalPredicate()
   * @generated
   */
  int INFORMAL_PREDICATE = 11;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMAL_PREDICATE__DESCRIPTION = REQ_PREDICATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Informal Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMAL_PREDICATE_FEATURE_COUNT = REQ_PREDICATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.XPredicateImpl <em>XPredicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.XPredicateImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getXPredicate()
   * @generated
   */
  int XPREDICATE = 12;

  /**
   * The feature id for the '<em><b>Xpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPREDICATE__XPRESSION = REQ_PREDICATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XPredicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPREDICATE_FEATURE_COUNT = REQ_PREDICATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.ValueAssertionImpl <em>Value Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.ValueAssertionImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getValueAssertion()
   * @generated
   */
  int VALUE_ASSERTION = 13;

  /**
   * The feature id for the '<em><b>Xpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_ASSERTION__XPRESSION = REQ_PREDICATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_ASSERTION_FEATURE_COUNT = REQ_PREDICATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.InputAssumptionImpl <em>Input Assumption</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.InputAssumptionImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getInputAssumption()
   * @generated
   */
  int INPUT_ASSUMPTION = 14;

  /**
   * The feature id for the '<em><b>Xpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ASSUMPTION__XPRESSION = REQ_PREDICATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ASSUMPTION__REFERENCE = REQ_PREDICATE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Input Assumption</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ASSUMPTION_FEATURE_COUNT = REQ_PREDICATE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.OutputGuaranteeImpl <em>Output Guarantee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.OutputGuaranteeImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getOutputGuarantee()
   * @generated
   */
  int OUTPUT_GUARANTEE = 15;

  /**
   * The feature id for the '<em><b>Xpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_GUARANTEE__XPRESSION = REQ_PREDICATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_GUARANTEE__REFERENCE = REQ_PREDICATE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Output Guarantee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_GUARANTEE_FEATURE_COUNT = REQ_PREDICATE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.BehaviorEquationImpl <em>Behavior Equation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.BehaviorEquationImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getBehaviorEquation()
   * @generated
   */
  int BEHAVIOR_EQUATION = 16;

  /**
   * The feature id for the '<em><b>Xpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_EQUATION__XPRESSION = REQ_PREDICATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_EQUATION__REFERENCE = REQ_PREDICATE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Behavior Equation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_EQUATION_FEATURE_COUNT = REQ_PREDICATE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.ValDeclarationImpl <em>Val Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.ValDeclarationImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getValDeclaration()
   * @generated
   */
  int VAL_DECLARATION = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Val Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.reqspec.reqSpec.impl.ExternalDocumentImpl <em>External Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.reqspec.reqSpec.impl.ExternalDocumentImpl
   * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getExternalDocument()
   * @generated
   */
  int EXTERNAL_DOCUMENT = 18;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT__DOC_REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Doc Fragment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT__DOC_FRAGMENT = 1;

  /**
   * The number of structural features of the '<em>External Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.ReqSpec <em>Req Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Req Spec</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpec
   * @generated
   */
  EClass getReqSpec();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.reqspec.reqSpec.ReqSpec#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpec#getParts()
   * @see #getReqSpec()
   * @generated
   */
  EReference getReqSpec_Parts();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.ReqSpecContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpecContainer
   * @generated
   */
  EClass getReqSpecContainer();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.ContractualElement <em>Contractual Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contractual Element</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement
   * @generated
   */
  EClass getContractualElement();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.ContractualElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement#getName()
   * @see #getContractualElement()
   * @generated
   */
  EAttribute getContractualElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.ContractualElement#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement#getTitle()
   * @see #getContractualElement()
   * @generated
   */
  EAttribute getContractualElement_Title();

  /**
   * Returns the meta object for the reference '{@link org.osate.reqspec.reqSpec.ContractualElement#getTargetElement <em>Target Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Element</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement#getTargetElement()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_TargetElement();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.ContractualElement#getTargetDescription <em>Target Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Description</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement#getTargetDescription()
   * @see #getContractualElement()
   * @generated
   */
  EAttribute getContractualElement_TargetDescription();

  /**
   * Returns the meta object for the reference '{@link org.osate.reqspec.reqSpec.ContractualElement#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement#getTarget()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_Target();

  /**
   * Returns the meta object for the reference list '{@link org.osate.reqspec.reqSpec.ContractualElement#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Category</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement#getCategory()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_Category();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.reqspec.reqSpec.ContractualElement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement#getDescription()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.reqspec.reqSpec.ContractualElement#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement#getConstants()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_Constants();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.reqspec.reqSpec.ContractualElement#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rationale</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement#getRationale()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_Rationale();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.reqspec.reqSpec.ContractualElement#getChangeUncertainty <em>Change Uncertainty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Change Uncertainty</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement#getChangeUncertainty()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_ChangeUncertainty();

  /**
   * Returns the meta object for the reference list '{@link org.osate.reqspec.reqSpec.ContractualElement#getDocumentRequirement <em>Document Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Document Requirement</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement#getDocumentRequirement()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_DocumentRequirement();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.reqspec.reqSpec.ContractualElement#getDocReference <em>Doc Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Doc Reference</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement#getDocReference()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_DocReference();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.reqspec.reqSpec.ContractualElement#getIssues <em>Issues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issues</em>'.
   * @see org.osate.reqspec.reqSpec.ContractualElement#getIssues()
   * @see #getContractualElement()
   * @generated
   */
  EAttribute getContractualElement_Issues();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.ReqRoot <em>Req Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Req Root</em>'.
   * @see org.osate.reqspec.reqSpec.ReqRoot
   * @generated
   */
  EClass getReqRoot();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.StakeholderGoals <em>Stakeholder Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stakeholder Goals</em>'.
   * @see org.osate.reqspec.reqSpec.StakeholderGoals
   * @generated
   */
  EClass getStakeholderGoals();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.StakeholderGoals#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.reqspec.reqSpec.StakeholderGoals#getName()
   * @see #getStakeholderGoals()
   * @generated
   */
  EAttribute getStakeholderGoals_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.StakeholderGoals#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.reqspec.reqSpec.StakeholderGoals#getTitle()
   * @see #getStakeholderGoals()
   * @generated
   */
  EAttribute getStakeholderGoals_Title();

  /**
   * Returns the meta object for the reference '{@link org.osate.reqspec.reqSpec.StakeholderGoals#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.osate.reqspec.reqSpec.StakeholderGoals#getTarget()
   * @see #getStakeholderGoals()
   * @generated
   */
  EReference getStakeholderGoals_Target();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.StakeholderGoals#getTargetDescription <em>Target Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Description</em>'.
   * @see org.osate.reqspec.reqSpec.StakeholderGoals#getTargetDescription()
   * @see #getStakeholderGoals()
   * @generated
   */
  EAttribute getStakeholderGoals_TargetDescription();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.StakeholderGoals#isGlobal <em>Global</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Global</em>'.
   * @see org.osate.reqspec.reqSpec.StakeholderGoals#isGlobal()
   * @see #getStakeholderGoals()
   * @generated
   */
  EAttribute getStakeholderGoals_Global();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.reqspec.reqSpec.StakeholderGoals#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.reqspec.reqSpec.StakeholderGoals#getDescription()
   * @see #getStakeholderGoals()
   * @generated
   */
  EReference getStakeholderGoals_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.reqspec.reqSpec.StakeholderGoals#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see org.osate.reqspec.reqSpec.StakeholderGoals#getContent()
   * @see #getStakeholderGoals()
   * @generated
   */
  EReference getStakeholderGoals_Content();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.reqspec.reqSpec.StakeholderGoals#getIssues <em>Issues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issues</em>'.
   * @see org.osate.reqspec.reqSpec.StakeholderGoals#getIssues()
   * @see #getStakeholderGoals()
   * @generated
   */
  EAttribute getStakeholderGoals_Issues();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.ReqDocument <em>Req Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Req Document</em>'.
   * @see org.osate.reqspec.reqSpec.ReqDocument
   * @generated
   */
  EClass getReqDocument();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.ReqDocument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.reqspec.reqSpec.ReqDocument#getName()
   * @see #getReqDocument()
   * @generated
   */
  EAttribute getReqDocument_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.ReqDocument#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.reqspec.reqSpec.ReqDocument#getTitle()
   * @see #getReqDocument()
   * @generated
   */
  EAttribute getReqDocument_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.reqspec.reqSpec.ReqDocument#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.reqspec.reqSpec.ReqDocument#getDescription()
   * @see #getReqDocument()
   * @generated
   */
  EReference getReqDocument_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.reqspec.reqSpec.ReqDocument#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see org.osate.reqspec.reqSpec.ReqDocument#getContent()
   * @see #getReqDocument()
   * @generated
   */
  EReference getReqDocument_Content();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.reqspec.reqSpec.ReqDocument#getIssues <em>Issues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issues</em>'.
   * @see org.osate.reqspec.reqSpec.ReqDocument#getIssues()
   * @see #getReqDocument()
   * @generated
   */
  EAttribute getReqDocument_Issues();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.DocumentSection <em>Document Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Section</em>'.
   * @see org.osate.reqspec.reqSpec.DocumentSection
   * @generated
   */
  EClass getDocumentSection();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.DocumentSection#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.osate.reqspec.reqSpec.DocumentSection#getLabel()
   * @see #getDocumentSection()
   * @generated
   */
  EAttribute getDocumentSection_Label();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.DocumentSection#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.reqspec.reqSpec.DocumentSection#getTitle()
   * @see #getDocumentSection()
   * @generated
   */
  EAttribute getDocumentSection_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.reqspec.reqSpec.DocumentSection#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.reqspec.reqSpec.DocumentSection#getDescription()
   * @see #getDocumentSection()
   * @generated
   */
  EReference getDocumentSection_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.reqspec.reqSpec.DocumentSection#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see org.osate.reqspec.reqSpec.DocumentSection#getContent()
   * @see #getDocumentSection()
   * @generated
   */
  EReference getDocumentSection_Content();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.ReqSpecs <em>Req Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Req Specs</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpecs
   * @generated
   */
  EClass getReqSpecs();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.ReqSpecs#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpecs#getName()
   * @see #getReqSpecs()
   * @generated
   */
  EAttribute getReqSpecs_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.ReqSpecs#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpecs#getTitle()
   * @see #getReqSpecs()
   * @generated
   */
  EAttribute getReqSpecs_Title();

  /**
   * Returns the meta object for the reference '{@link org.osate.reqspec.reqSpec.ReqSpecs#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpecs#getTarget()
   * @see #getReqSpecs()
   * @generated
   */
  EReference getReqSpecs_Target();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.ReqSpecs#getTargetDescription <em>Target Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Description</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpecs#getTargetDescription()
   * @see #getReqSpecs()
   * @generated
   */
  EAttribute getReqSpecs_TargetDescription();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.ReqSpecs#isGlobal <em>Global</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Global</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpecs#isGlobal()
   * @see #getReqSpecs()
   * @generated
   */
  EAttribute getReqSpecs_Global();

  /**
   * Returns the meta object for the reference list '{@link org.osate.reqspec.reqSpec.ReqSpecs#getOtherreqspecs <em>Otherreqspecs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Otherreqspecs</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpecs#getOtherreqspecs()
   * @see #getReqSpecs()
   * @generated
   */
  EReference getReqSpecs_Otherreqspecs();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.reqspec.reqSpec.ReqSpecs#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpecs#getConstants()
   * @see #getReqSpecs()
   * @generated
   */
  EReference getReqSpecs_Constants();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.reqspec.reqSpec.ReqSpecs#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpecs#getContent()
   * @see #getReqSpecs()
   * @generated
   */
  EReference getReqSpecs_Content();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.reqspec.reqSpec.ReqSpecs#getDocReference <em>Doc Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Doc Reference</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpecs#getDocReference()
   * @see #getReqSpecs()
   * @generated
   */
  EReference getReqSpecs_DocReference();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.reqspec.reqSpec.ReqSpecs#getIssues <em>Issues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issues</em>'.
   * @see org.osate.reqspec.reqSpec.ReqSpecs#getIssues()
   * @see #getReqSpecs()
   * @generated
   */
  EAttribute getReqSpecs_Issues();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see org.osate.reqspec.reqSpec.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for the reference list '{@link org.osate.reqspec.reqSpec.Goal#getRefinesReference <em>Refines Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refines Reference</em>'.
   * @see org.osate.reqspec.reqSpec.Goal#getRefinesReference()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_RefinesReference();

  /**
   * Returns the meta object for the reference list '{@link org.osate.reqspec.reqSpec.Goal#getConflictsReference <em>Conflicts Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Conflicts Reference</em>'.
   * @see org.osate.reqspec.reqSpec.Goal#getConflictsReference()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_ConflictsReference();

  /**
   * Returns the meta object for the reference list '{@link org.osate.reqspec.reqSpec.Goal#getStakeholderReference <em>Stakeholder Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Stakeholder Reference</em>'.
   * @see org.osate.reqspec.reqSpec.Goal#getStakeholderReference()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_StakeholderReference();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see org.osate.reqspec.reqSpec.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.reqspec.reqSpec.Requirement#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see org.osate.reqspec.reqSpec.Requirement#getPredicate()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Predicate();

  /**
   * Returns the meta object for the reference '{@link org.osate.reqspec.reqSpec.Requirement#getException <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exception</em>'.
   * @see org.osate.reqspec.reqSpec.Requirement#getException()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Exception();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.Requirement#getExceptionText <em>Exception Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exception Text</em>'.
   * @see org.osate.reqspec.reqSpec.Requirement#getExceptionText()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_ExceptionText();

  /**
   * Returns the meta object for the reference list '{@link org.osate.reqspec.reqSpec.Requirement#getRefinesReference <em>Refines Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refines Reference</em>'.
   * @see org.osate.reqspec.reqSpec.Requirement#getRefinesReference()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_RefinesReference();

  /**
   * Returns the meta object for the reference list '{@link org.osate.reqspec.reqSpec.Requirement#getGoalReference <em>Goal Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Goal Reference</em>'.
   * @see org.osate.reqspec.reqSpec.Requirement#getGoalReference()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_GoalReference();

  /**
   * Returns the meta object for the reference list '{@link org.osate.reqspec.reqSpec.Requirement#getStakeholderRequirementReference <em>Stakeholder Requirement Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Stakeholder Requirement Reference</em>'.
   * @see org.osate.reqspec.reqSpec.Requirement#getStakeholderRequirementReference()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_StakeholderRequirementReference();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.ReqPredicate <em>Req Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Req Predicate</em>'.
   * @see org.osate.reqspec.reqSpec.ReqPredicate
   * @generated
   */
  EClass getReqPredicate();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.InformalPredicate <em>Informal Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Informal Predicate</em>'.
   * @see org.osate.reqspec.reqSpec.InformalPredicate
   * @generated
   */
  EClass getInformalPredicate();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.InformalPredicate#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.osate.reqspec.reqSpec.InformalPredicate#getDescription()
   * @see #getInformalPredicate()
   * @generated
   */
  EAttribute getInformalPredicate_Description();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.XPredicate <em>XPredicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XPredicate</em>'.
   * @see org.osate.reqspec.reqSpec.XPredicate
   * @generated
   */
  EClass getXPredicate();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.reqspec.reqSpec.XPredicate#getXpression <em>Xpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xpression</em>'.
   * @see org.osate.reqspec.reqSpec.XPredicate#getXpression()
   * @see #getXPredicate()
   * @generated
   */
  EReference getXPredicate_Xpression();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.ValueAssertion <em>Value Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Assertion</em>'.
   * @see org.osate.reqspec.reqSpec.ValueAssertion
   * @generated
   */
  EClass getValueAssertion();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.reqspec.reqSpec.ValueAssertion#getXpression <em>Xpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xpression</em>'.
   * @see org.osate.reqspec.reqSpec.ValueAssertion#getXpression()
   * @see #getValueAssertion()
   * @generated
   */
  EReference getValueAssertion_Xpression();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.InputAssumption <em>Input Assumption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Assumption</em>'.
   * @see org.osate.reqspec.reqSpec.InputAssumption
   * @generated
   */
  EClass getInputAssumption();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.reqspec.reqSpec.InputAssumption#getXpression <em>Xpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xpression</em>'.
   * @see org.osate.reqspec.reqSpec.InputAssumption#getXpression()
   * @see #getInputAssumption()
   * @generated
   */
  EReference getInputAssumption_Xpression();

  /**
   * Returns the meta object for the reference '{@link org.osate.reqspec.reqSpec.InputAssumption#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.osate.reqspec.reqSpec.InputAssumption#getReference()
   * @see #getInputAssumption()
   * @generated
   */
  EReference getInputAssumption_Reference();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.OutputGuarantee <em>Output Guarantee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Guarantee</em>'.
   * @see org.osate.reqspec.reqSpec.OutputGuarantee
   * @generated
   */
  EClass getOutputGuarantee();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.reqspec.reqSpec.OutputGuarantee#getXpression <em>Xpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xpression</em>'.
   * @see org.osate.reqspec.reqSpec.OutputGuarantee#getXpression()
   * @see #getOutputGuarantee()
   * @generated
   */
  EReference getOutputGuarantee_Xpression();

  /**
   * Returns the meta object for the reference '{@link org.osate.reqspec.reqSpec.OutputGuarantee#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.osate.reqspec.reqSpec.OutputGuarantee#getReference()
   * @see #getOutputGuarantee()
   * @generated
   */
  EReference getOutputGuarantee_Reference();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.BehaviorEquation <em>Behavior Equation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior Equation</em>'.
   * @see org.osate.reqspec.reqSpec.BehaviorEquation
   * @generated
   */
  EClass getBehaviorEquation();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.reqspec.reqSpec.BehaviorEquation#getXpression <em>Xpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xpression</em>'.
   * @see org.osate.reqspec.reqSpec.BehaviorEquation#getXpression()
   * @see #getBehaviorEquation()
   * @generated
   */
  EReference getBehaviorEquation_Xpression();

  /**
   * Returns the meta object for the reference '{@link org.osate.reqspec.reqSpec.BehaviorEquation#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.osate.reqspec.reqSpec.BehaviorEquation#getReference()
   * @see #getBehaviorEquation()
   * @generated
   */
  EReference getBehaviorEquation_Reference();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.ValDeclaration <em>Val Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Val Declaration</em>'.
   * @see org.osate.reqspec.reqSpec.ValDeclaration
   * @generated
   */
  EClass getValDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.ValDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.reqspec.reqSpec.ValDeclaration#getName()
   * @see #getValDeclaration()
   * @generated
   */
  EAttribute getValDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.osate.reqspec.reqSpec.ExternalDocument <em>External Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Document</em>'.
   * @see org.osate.reqspec.reqSpec.ExternalDocument
   * @generated
   */
  EClass getExternalDocument();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.ExternalDocument#getDocReference <em>Doc Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc Reference</em>'.
   * @see org.osate.reqspec.reqSpec.ExternalDocument#getDocReference()
   * @see #getExternalDocument()
   * @generated
   */
  EAttribute getExternalDocument_DocReference();

  /**
   * Returns the meta object for the attribute '{@link org.osate.reqspec.reqSpec.ExternalDocument#getDocFragment <em>Doc Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc Fragment</em>'.
   * @see org.osate.reqspec.reqSpec.ExternalDocument#getDocFragment()
   * @see #getExternalDocument()
   * @generated
   */
  EAttribute getExternalDocument_DocFragment();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ReqSpecFactory getReqSpecFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.ReqSpecImpl <em>Req Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getReqSpec()
     * @generated
     */
    EClass REQ_SPEC = eINSTANCE.getReqSpec();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQ_SPEC__PARTS = eINSTANCE.getReqSpec_Parts();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.ReqSpecContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecContainerImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getReqSpecContainer()
     * @generated
     */
    EClass REQ_SPEC_CONTAINER = eINSTANCE.getReqSpecContainer();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.ContractualElementImpl <em>Contractual Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.ContractualElementImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getContractualElement()
     * @generated
     */
    EClass CONTRACTUAL_ELEMENT = eINSTANCE.getContractualElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTUAL_ELEMENT__NAME = eINSTANCE.getContractualElement_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTUAL_ELEMENT__TITLE = eINSTANCE.getContractualElement_Title();

    /**
     * The meta object literal for the '<em><b>Target Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__TARGET_ELEMENT = eINSTANCE.getContractualElement_TargetElement();

    /**
     * The meta object literal for the '<em><b>Target Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTUAL_ELEMENT__TARGET_DESCRIPTION = eINSTANCE.getContractualElement_TargetDescription();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__TARGET = eINSTANCE.getContractualElement_Target();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__CATEGORY = eINSTANCE.getContractualElement_Category();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__DESCRIPTION = eINSTANCE.getContractualElement_Description();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__CONSTANTS = eINSTANCE.getContractualElement_Constants();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__RATIONALE = eINSTANCE.getContractualElement_Rationale();

    /**
     * The meta object literal for the '<em><b>Change Uncertainty</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY = eINSTANCE.getContractualElement_ChangeUncertainty();

    /**
     * The meta object literal for the '<em><b>Document Requirement</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__DOCUMENT_REQUIREMENT = eINSTANCE.getContractualElement_DocumentRequirement();

    /**
     * The meta object literal for the '<em><b>Doc Reference</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__DOC_REFERENCE = eINSTANCE.getContractualElement_DocReference();

    /**
     * The meta object literal for the '<em><b>Issues</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTUAL_ELEMENT__ISSUES = eINSTANCE.getContractualElement_Issues();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.ReqRootImpl <em>Req Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.ReqRootImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getReqRoot()
     * @generated
     */
    EClass REQ_ROOT = eINSTANCE.getReqRoot();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.StakeholderGoalsImpl <em>Stakeholder Goals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.StakeholderGoalsImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getStakeholderGoals()
     * @generated
     */
    EClass STAKEHOLDER_GOALS = eINSTANCE.getStakeholderGoals();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER_GOALS__NAME = eINSTANCE.getStakeholderGoals_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER_GOALS__TITLE = eINSTANCE.getStakeholderGoals_Title();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAKEHOLDER_GOALS__TARGET = eINSTANCE.getStakeholderGoals_Target();

    /**
     * The meta object literal for the '<em><b>Target Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER_GOALS__TARGET_DESCRIPTION = eINSTANCE.getStakeholderGoals_TargetDescription();

    /**
     * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER_GOALS__GLOBAL = eINSTANCE.getStakeholderGoals_Global();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAKEHOLDER_GOALS__DESCRIPTION = eINSTANCE.getStakeholderGoals_Description();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAKEHOLDER_GOALS__CONTENT = eINSTANCE.getStakeholderGoals_Content();

    /**
     * The meta object literal for the '<em><b>Issues</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER_GOALS__ISSUES = eINSTANCE.getStakeholderGoals_Issues();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.ReqDocumentImpl <em>Req Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.ReqDocumentImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getReqDocument()
     * @generated
     */
    EClass REQ_DOCUMENT = eINSTANCE.getReqDocument();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQ_DOCUMENT__NAME = eINSTANCE.getReqDocument_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQ_DOCUMENT__TITLE = eINSTANCE.getReqDocument_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQ_DOCUMENT__DESCRIPTION = eINSTANCE.getReqDocument_Description();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQ_DOCUMENT__CONTENT = eINSTANCE.getReqDocument_Content();

    /**
     * The meta object literal for the '<em><b>Issues</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQ_DOCUMENT__ISSUES = eINSTANCE.getReqDocument_Issues();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.DocumentSectionImpl <em>Document Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.DocumentSectionImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getDocumentSection()
     * @generated
     */
    EClass DOCUMENT_SECTION = eINSTANCE.getDocumentSection();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_SECTION__LABEL = eINSTANCE.getDocumentSection_Label();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_SECTION__TITLE = eINSTANCE.getDocumentSection_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_SECTION__DESCRIPTION = eINSTANCE.getDocumentSection_Description();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_SECTION__CONTENT = eINSTANCE.getDocumentSection_Content();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.ReqSpecsImpl <em>Req Specs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecsImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getReqSpecs()
     * @generated
     */
    EClass REQ_SPECS = eINSTANCE.getReqSpecs();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQ_SPECS__NAME = eINSTANCE.getReqSpecs_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQ_SPECS__TITLE = eINSTANCE.getReqSpecs_Title();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQ_SPECS__TARGET = eINSTANCE.getReqSpecs_Target();

    /**
     * The meta object literal for the '<em><b>Target Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQ_SPECS__TARGET_DESCRIPTION = eINSTANCE.getReqSpecs_TargetDescription();

    /**
     * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQ_SPECS__GLOBAL = eINSTANCE.getReqSpecs_Global();

    /**
     * The meta object literal for the '<em><b>Otherreqspecs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQ_SPECS__OTHERREQSPECS = eINSTANCE.getReqSpecs_Otherreqspecs();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQ_SPECS__CONSTANTS = eINSTANCE.getReqSpecs_Constants();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQ_SPECS__CONTENT = eINSTANCE.getReqSpecs_Content();

    /**
     * The meta object literal for the '<em><b>Doc Reference</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQ_SPECS__DOC_REFERENCE = eINSTANCE.getReqSpecs_DocReference();

    /**
     * The meta object literal for the '<em><b>Issues</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQ_SPECS__ISSUES = eINSTANCE.getReqSpecs_Issues();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.GoalImpl <em>Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.GoalImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getGoal()
     * @generated
     */
    EClass GOAL = eINSTANCE.getGoal();

    /**
     * The meta object literal for the '<em><b>Refines Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__REFINES_REFERENCE = eINSTANCE.getGoal_RefinesReference();

    /**
     * The meta object literal for the '<em><b>Conflicts Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__CONFLICTS_REFERENCE = eINSTANCE.getGoal_ConflictsReference();

    /**
     * The meta object literal for the '<em><b>Stakeholder Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__STAKEHOLDER_REFERENCE = eINSTANCE.getGoal_StakeholderReference();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.RequirementImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__PREDICATE = eINSTANCE.getRequirement_Predicate();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__EXCEPTION = eINSTANCE.getRequirement_Exception();

    /**
     * The meta object literal for the '<em><b>Exception Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__EXCEPTION_TEXT = eINSTANCE.getRequirement_ExceptionText();

    /**
     * The meta object literal for the '<em><b>Refines Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__REFINES_REFERENCE = eINSTANCE.getRequirement_RefinesReference();

    /**
     * The meta object literal for the '<em><b>Goal Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__GOAL_REFERENCE = eINSTANCE.getRequirement_GoalReference();

    /**
     * The meta object literal for the '<em><b>Stakeholder Requirement Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE = eINSTANCE.getRequirement_StakeholderRequirementReference();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.ReqPredicateImpl <em>Req Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.ReqPredicateImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getReqPredicate()
     * @generated
     */
    EClass REQ_PREDICATE = eINSTANCE.getReqPredicate();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.InformalPredicateImpl <em>Informal Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.InformalPredicateImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getInformalPredicate()
     * @generated
     */
    EClass INFORMAL_PREDICATE = eINSTANCE.getInformalPredicate();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFORMAL_PREDICATE__DESCRIPTION = eINSTANCE.getInformalPredicate_Description();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.XPredicateImpl <em>XPredicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.XPredicateImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getXPredicate()
     * @generated
     */
    EClass XPREDICATE = eINSTANCE.getXPredicate();

    /**
     * The meta object literal for the '<em><b>Xpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPREDICATE__XPRESSION = eINSTANCE.getXPredicate_Xpression();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.ValueAssertionImpl <em>Value Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.ValueAssertionImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getValueAssertion()
     * @generated
     */
    EClass VALUE_ASSERTION = eINSTANCE.getValueAssertion();

    /**
     * The meta object literal for the '<em><b>Xpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_ASSERTION__XPRESSION = eINSTANCE.getValueAssertion_Xpression();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.InputAssumptionImpl <em>Input Assumption</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.InputAssumptionImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getInputAssumption()
     * @generated
     */
    EClass INPUT_ASSUMPTION = eINSTANCE.getInputAssumption();

    /**
     * The meta object literal for the '<em><b>Xpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_ASSUMPTION__XPRESSION = eINSTANCE.getInputAssumption_Xpression();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_ASSUMPTION__REFERENCE = eINSTANCE.getInputAssumption_Reference();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.OutputGuaranteeImpl <em>Output Guarantee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.OutputGuaranteeImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getOutputGuarantee()
     * @generated
     */
    EClass OUTPUT_GUARANTEE = eINSTANCE.getOutputGuarantee();

    /**
     * The meta object literal for the '<em><b>Xpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_GUARANTEE__XPRESSION = eINSTANCE.getOutputGuarantee_Xpression();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_GUARANTEE__REFERENCE = eINSTANCE.getOutputGuarantee_Reference();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.BehaviorEquationImpl <em>Behavior Equation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.BehaviorEquationImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getBehaviorEquation()
     * @generated
     */
    EClass BEHAVIOR_EQUATION = eINSTANCE.getBehaviorEquation();

    /**
     * The meta object literal for the '<em><b>Xpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR_EQUATION__XPRESSION = eINSTANCE.getBehaviorEquation_Xpression();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR_EQUATION__REFERENCE = eINSTANCE.getBehaviorEquation_Reference();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.ValDeclarationImpl <em>Val Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.ValDeclarationImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getValDeclaration()
     * @generated
     */
    EClass VAL_DECLARATION = eINSTANCE.getValDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAL_DECLARATION__NAME = eINSTANCE.getValDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.osate.reqspec.reqSpec.impl.ExternalDocumentImpl <em>External Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.reqspec.reqSpec.impl.ExternalDocumentImpl
     * @see org.osate.reqspec.reqSpec.impl.ReqSpecPackageImpl#getExternalDocument()
     * @generated
     */
    EClass EXTERNAL_DOCUMENT = eINSTANCE.getExternalDocument();

    /**
     * The meta object literal for the '<em><b>Doc Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DOCUMENT__DOC_REFERENCE = eINSTANCE.getExternalDocument_DocReference();

    /**
     * The meta object literal for the '<em><b>Doc Fragment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DOCUMENT__DOC_FRAGMENT = eINSTANCE.getExternalDocument_DocFragment();

  }

} //ReqSpecPackage