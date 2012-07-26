/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tpt.aadl.annex.behavior.declarative;

import fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.aadl2.Aadl2Package;

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
 * @see fr.tpt.aadl.annex.behavior.declarative.DeclarativeFactory
 * @model kind="package"
 * @generated
 */
public interface DeclarativePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "declarative";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://eve.enst.fr/svn/aadl-eclipse-dev/aadlba/trunk/fr.tpt.aadl.annex.behavior/declarative";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "declarative";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclarativePackage eINSTANCE = fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeBehaviorElementImpl <em>Behavior Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeBehaviorElementImpl
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getDeclarativeBehaviorElement()
	 * @generated
	 */
	int DECLARATIVE_BEHAVIOR_ELEMENT = 3;

	/**
	 * The meta object id for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.IdentifierImpl
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__OWNED_ELEMENT = AadlBaPackage.BEHAVIOR_STATE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__OWNED_COMMENT = AadlBaPackage.BEHAVIOR_STATE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__NAME = AadlBaPackage.BEHAVIOR_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__QUALIFIED_NAME = AadlBaPackage.BEHAVIOR_STATE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__OWNED_PROPERTY_ASSOCIATION = AadlBaPackage.BEHAVIOR_STATE__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__INITIAL = AadlBaPackage.BEHAVIOR_STATE__INITIAL;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__COMPLETE = AadlBaPackage.BEHAVIOR_STATE__COMPLETE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__FINAL = AadlBaPackage.BEHAVIOR_STATE__FINAL;

	/**
	 * The feature id for the '<em><b>Binded Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__BINDED_MODE = AadlBaPackage.BEHAVIOR_STATE__BINDED_MODE;

	/**
	 * The feature id for the '<em><b>Osate Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__OSATE_REF = AadlBaPackage.BEHAVIOR_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ba Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__BA_REF = AadlBaPackage.BEHAVIOR_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = AadlBaPackage.BEHAVIOR_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = AadlBaPackage.BEHAVIOR_STATE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.QualifiedNamedElementImpl <em>Qualified Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.QualifiedNamedElementImpl
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getQualifiedNamedElement()
	 * @generated
	 */
	int QUALIFIED_NAMED_ELEMENT = 9;

	/**
	 * The meta object id for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.NamedValueImpl <em>Named Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.NamedValueImpl
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getNamedValue()
	 * @generated
	 */
	int NAMED_VALUE = 8;

	/**
	 * The meta object id for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.CommActionImpl <em>Comm Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.CommActionImpl
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getCommAction()
	 * @generated
	 */
	int COMM_ACTION = 1;

	/**
	 * The meta object id for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.EnumerationImpl
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 6;

	/**
	 * The meta object id for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.ReferenceImpl
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 10;

	/**
	 * The meta object id for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.ArrayableIdentifierImpl <em>Arrayable Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.ArrayableIdentifierImpl
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getArrayableIdentifier()
	 * @generated
	 */
	int ARRAYABLE_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER__OWNED_ELEMENT = IDENTIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER__OWNED_COMMENT = IDENTIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER__QUALIFIED_NAME = IDENTIFIER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER__OWNED_PROPERTY_ASSOCIATION = IDENTIFIER__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER__INITIAL = IDENTIFIER__INITIAL;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER__COMPLETE = IDENTIFIER__COMPLETE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER__FINAL = IDENTIFIER__FINAL;

	/**
	 * The feature id for the '<em><b>Binded Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER__BINDED_MODE = IDENTIFIER__BINDED_MODE;

	/**
	 * The feature id for the '<em><b>Osate Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER__OSATE_REF = IDENTIFIER__OSATE_REF;

	/**
	 * The feature id for the '<em><b>Ba Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER__BA_REF = IDENTIFIER__BA_REF;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Array Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER__ARRAY_INDEXES = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arrayable Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYABLE_IDENTIFIER_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ACTION__OWNED_ELEMENT = AadlBaPackage.COMMUNICATION_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ACTION__OWNED_COMMENT = AadlBaPackage.COMMUNICATION_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Osate Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ACTION__OSATE_REF = AadlBaPackage.COMMUNICATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ba Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ACTION__BA_REF = AadlBaPackage.COMMUNICATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ACTION__PARAMETERS = AadlBaPackage.COMMUNICATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port Freeze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ACTION__PORT_FREEZE = AadlBaPackage.COMMUNICATION_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port Dequeue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ACTION__PORT_DEQUEUE = AadlBaPackage.COMMUNICATION_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ACTION__LOCK = AadlBaPackage.COMMUNICATION_ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unlock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ACTION__UNLOCK = AadlBaPackage.COMMUNICATION_ACTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ACTION__TARGET = AadlBaPackage.COMMUNICATION_ACTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ACTION__QUALIFIED_NAME = AadlBaPackage.COMMUNICATION_ACTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ACTION__REFERENCE = AadlBaPackage.COMMUNICATION_ACTION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Comm Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ACTION_FEATURE_COUNT = AadlBaPackage.COMMUNICATION_ACTION_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeTimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeTimeImpl
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getDeclarativeTime()
	 * @generated
	 */
	int DECLARATIVE_TIME = 5;

	/**
	 * The meta object id for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeBehaviorTransitionImpl <em>Behavior Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeBehaviorTransitionImpl
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getDeclarativeBehaviorTransition()
	 * @generated
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION = 4;

	/**
	 * The meta object id for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeArrayDimensionImpl <em>Array Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeArrayDimensionImpl
	 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getDeclarativeArrayDimension()
	 * @generated
	 */
	int DECLARATIVE_ARRAY_DIMENSION = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_ARRAY_DIMENSION__OWNED_ELEMENT = Aadl2Package.ARRAY_DIMENSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_ARRAY_DIMENSION__OWNED_COMMENT = Aadl2Package.ARRAY_DIMENSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_ARRAY_DIMENSION__SIZE = Aadl2Package.ARRAY_DIMENSION__SIZE;

	/**
	 * The feature id for the '<em><b>Osate Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_ARRAY_DIMENSION__OSATE_REF = Aadl2Package.ARRAY_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ba Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_ARRAY_DIMENSION__BA_REF = Aadl2Package.ARRAY_DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_ARRAY_DIMENSION__DIMENSION = Aadl2Package.ARRAY_DIMENSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_ARRAY_DIMENSION_FEATURE_COUNT = Aadl2Package.ARRAY_DIMENSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_ELEMENT__OWNED_ELEMENT = AadlBaPackage.BEHAVIOR_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_ELEMENT__OWNED_COMMENT = AadlBaPackage.BEHAVIOR_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Osate Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_ELEMENT__OSATE_REF = AadlBaPackage.BEHAVIOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ba Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_ELEMENT__BA_REF = AadlBaPackage.BEHAVIOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavior Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_ELEMENT_FEATURE_COUNT = AadlBaPackage.BEHAVIOR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__OWNED_ELEMENT = AadlBaPackage.BEHAVIOR_TRANSITION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__OWNED_COMMENT = AadlBaPackage.BEHAVIOR_TRANSITION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__NAME = AadlBaPackage.BEHAVIOR_TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__QUALIFIED_NAME = AadlBaPackage.BEHAVIOR_TRANSITION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__OWNED_PROPERTY_ASSOCIATION = AadlBaPackage.BEHAVIOR_TRANSITION__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Source State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__SOURCE_STATE = AadlBaPackage.BEHAVIOR_TRANSITION__SOURCE_STATE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__CONDITION = AadlBaPackage.BEHAVIOR_TRANSITION__CONDITION;

	/**
	 * The feature id for the '<em><b>Destination State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__DESTINATION_STATE = AadlBaPackage.BEHAVIOR_TRANSITION__DESTINATION_STATE;

	/**
	 * The feature id for the '<em><b>Action Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__ACTION_BLOCK = AadlBaPackage.BEHAVIOR_TRANSITION__ACTION_BLOCK;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__PRIORITY = AadlBaPackage.BEHAVIOR_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Osate Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__OSATE_REF = AadlBaPackage.BEHAVIOR_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ba Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__BA_REF = AadlBaPackage.BEHAVIOR_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__SRC_STATES = AadlBaPackage.BEHAVIOR_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dest State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION__DEST_STATE = AadlBaPackage.BEHAVIOR_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Behavior Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_BEHAVIOR_TRANSITION_FEATURE_COUNT = AadlBaPackage.BEHAVIOR_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TIME__OWNED_ELEMENT = AadlBaPackage.BEHAVIOR_TIME__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TIME__OWNED_COMMENT = AadlBaPackage.BEHAVIOR_TIME__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TIME__INTEGER_VALUE = AadlBaPackage.BEHAVIOR_TIME__INTEGER_VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TIME__UNIT = AadlBaPackage.BEHAVIOR_TIME__UNIT;

	/**
	 * The feature id for the '<em><b>Osate Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TIME__OSATE_REF = AadlBaPackage.BEHAVIOR_TIME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ba Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TIME__BA_REF = AadlBaPackage.BEHAVIOR_TIME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TIME__UNIT_ID = AadlBaPackage.BEHAVIOR_TIME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TIME_FEATURE_COUNT = AadlBaPackage.BEHAVIOR_TIME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__OWNED_ELEMENT = Aadl2Package.DATA_CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__OWNED_COMMENT = Aadl2Package.DATA_CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__NAME = Aadl2Package.DATA_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__QUALIFIED_NAME = Aadl2Package.DATA_CLASSIFIER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.DATA_CLASSIFIER__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__OWNED_MEMBER = Aadl2Package.DATA_CLASSIFIER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__MEMBER = Aadl2Package.DATA_CLASSIFIER__MEMBER;

	/**
	 * The feature id for the '<em><b>Classifier Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__CLASSIFIER_FEATURE = Aadl2Package.DATA_CLASSIFIER__CLASSIFIER_FEATURE;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__INHERITED_MEMBER = Aadl2Package.DATA_CLASSIFIER__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__GENERALIZATION = Aadl2Package.DATA_CLASSIFIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__GENERAL = Aadl2Package.DATA_CLASSIFIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Owned Annex Subclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__OWNED_ANNEX_SUBCLAUSE = Aadl2Package.DATA_CLASSIFIER__OWNED_ANNEX_SUBCLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Prototype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__OWNED_PROTOTYPE = Aadl2Package.DATA_CLASSIFIER__OWNED_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Owned Prototype Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__OWNED_PROTOTYPE_BINDING = Aadl2Package.DATA_CLASSIFIER__OWNED_PROTOTYPE_BINDING;

	/**
	 * The feature id for the '<em><b>No Prototypes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__NO_PROTOTYPES = Aadl2Package.DATA_CLASSIFIER__NO_PROTOTYPES;

	/**
	 * The feature id for the '<em><b>No Annexes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__NO_ANNEXES = Aadl2Package.DATA_CLASSIFIER__NO_ANNEXES;

	/**
	 * The feature id for the '<em><b>No Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__NO_PROPERTIES = Aadl2Package.DATA_CLASSIFIER__NO_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__OWNED_MODE = Aadl2Package.DATA_CLASSIFIER__OWNED_MODE;

	/**
	 * The feature id for the '<em><b>Owned Mode Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__OWNED_MODE_TRANSITION = Aadl2Package.DATA_CLASSIFIER__OWNED_MODE_TRANSITION;

	/**
	 * The feature id for the '<em><b>No Flows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__NO_FLOWS = Aadl2Package.DATA_CLASSIFIER__NO_FLOWS;

	/**
	 * The feature id for the '<em><b>No Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__NO_MODES = Aadl2Package.DATA_CLASSIFIER__NO_MODES;

	/**
	 * The feature id for the '<em><b>Osate Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__OSATE_REF = Aadl2Package.DATA_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ba Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__BA_REF = Aadl2Package.DATA_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ba Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__BA_NAMESPACE = Aadl2Package.DATA_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ba Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT__BA_NAME = Aadl2Package.DATA_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Qualified Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMED_ELEMENT_FEATURE_COUNT = Aadl2Package.DATA_CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_ELEMENT = QUALIFIED_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_COMMENT = QUALIFIED_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = QUALIFIED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__QUALIFIED_NAME = QUALIFIED_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_PROPERTY_ASSOCIATION = QUALIFIED_NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_MEMBER = QUALIFIED_NAMED_ELEMENT__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__MEMBER = QUALIFIED_NAMED_ELEMENT__MEMBER;

	/**
	 * The feature id for the '<em><b>Classifier Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CLASSIFIER_FEATURE = QUALIFIED_NAMED_ELEMENT__CLASSIFIER_FEATURE;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__INHERITED_MEMBER = QUALIFIED_NAMED_ELEMENT__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__GENERALIZATION = QUALIFIED_NAMED_ELEMENT__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__GENERAL = QUALIFIED_NAMED_ELEMENT__GENERAL;

	/**
	 * The feature id for the '<em><b>Owned Annex Subclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_ANNEX_SUBCLAUSE = QUALIFIED_NAMED_ELEMENT__OWNED_ANNEX_SUBCLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Prototype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_PROTOTYPE = QUALIFIED_NAMED_ELEMENT__OWNED_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Owned Prototype Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_PROTOTYPE_BINDING = QUALIFIED_NAMED_ELEMENT__OWNED_PROTOTYPE_BINDING;

	/**
	 * The feature id for the '<em><b>No Prototypes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NO_PROTOTYPES = QUALIFIED_NAMED_ELEMENT__NO_PROTOTYPES;

	/**
	 * The feature id for the '<em><b>No Annexes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NO_ANNEXES = QUALIFIED_NAMED_ELEMENT__NO_ANNEXES;

	/**
	 * The feature id for the '<em><b>No Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NO_PROPERTIES = QUALIFIED_NAMED_ELEMENT__NO_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_MODE = QUALIFIED_NAMED_ELEMENT__OWNED_MODE;

	/**
	 * The feature id for the '<em><b>Owned Mode Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_MODE_TRANSITION = QUALIFIED_NAMED_ELEMENT__OWNED_MODE_TRANSITION;

	/**
	 * The feature id for the '<em><b>No Flows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NO_FLOWS = QUALIFIED_NAMED_ELEMENT__NO_FLOWS;

	/**
	 * The feature id for the '<em><b>No Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NO_MODES = QUALIFIED_NAMED_ELEMENT__NO_MODES;

	/**
	 * The feature id for the '<em><b>Osate Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OSATE_REF = QUALIFIED_NAMED_ELEMENT__OSATE_REF;

	/**
	 * The feature id for the '<em><b>Ba Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__BA_REF = QUALIFIED_NAMED_ELEMENT__BA_REF;

	/**
	 * The feature id for the '<em><b>Ba Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__BA_NAMESPACE = QUALIFIED_NAMED_ELEMENT__BA_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ba Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__BA_NAME = QUALIFIED_NAMED_ELEMENT__BA_NAME;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERAL = QUALIFIED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PROPERTY = QUALIFIED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = QUALIFIED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE__OWNED_ELEMENT = AadlBaPackage.INTEGER_VALUE_VARIABLE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE__OWNED_COMMENT = AadlBaPackage.INTEGER_VALUE_VARIABLE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Osate Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE__OSATE_REF = AadlBaPackage.INTEGER_VALUE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ba Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE__BA_REF = AadlBaPackage.INTEGER_VALUE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE__REFERENCE = AadlBaPackage.INTEGER_VALUE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dequeue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE__DEQUEUE = AadlBaPackage.INTEGER_VALUE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE__FRESH = AadlBaPackage.INTEGER_VALUE_VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE__COUNT = AadlBaPackage.INTEGER_VALUE_VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Named Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VALUE_FEATURE_COUNT = AadlBaPackage.INTEGER_VALUE_VARIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__OWNED_ELEMENT = AadlBaPackage.ACTUAL_PORT_HOLDER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__OWNED_COMMENT = AadlBaPackage.ACTUAL_PORT_HOLDER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Array Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ARRAY_INDEXES = AadlBaPackage.ACTUAL_PORT_HOLDER__ARRAY_INDEXES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ELEMENT = AadlBaPackage.ACTUAL_PORT_HOLDER__ELEMENT;

	/**
	 * The feature id for the '<em><b>Group Holders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__GROUP_HOLDERS = AadlBaPackage.ACTUAL_PORT_HOLDER__GROUP_HOLDERS;

	/**
	 * The feature id for the '<em><b>Osate Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__OSATE_REF = AadlBaPackage.ACTUAL_PORT_HOLDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ba Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__BA_REF = AadlBaPackage.ACTUAL_PORT_HOLDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IDS = AadlBaPackage.ACTUAL_PORT_HOLDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = AadlBaPackage.ACTUAL_PORT_HOLDER_FEATURE_COUNT + 3;

	/**
	 * Returns the meta object for class '{@link fr.tpt.aadl.annex.behavior.declarative.DeclarativeBehaviorElement <em>Behavior Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Element</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.DeclarativeBehaviorElement
	 * @generated
	 */
	EClass getDeclarativeBehaviorElement();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.aadl.annex.behavior.declarative.DeclarativeBehaviorElement#getOsateRef <em>Osate Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Osate Ref</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.DeclarativeBehaviorElement#getOsateRef()
	 * @see #getDeclarativeBehaviorElement()
	 * @generated
	 */
	EReference getDeclarativeBehaviorElement_OsateRef();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.aadl.annex.behavior.declarative.DeclarativeBehaviorElement#getBaRef <em>Ba Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ba Ref</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.DeclarativeBehaviorElement#getBaRef()
	 * @see #getDeclarativeBehaviorElement()
	 * @generated
	 */
	EReference getDeclarativeBehaviorElement_BaRef();

	/**
	 * Returns the meta object for class '{@link fr.tpt.aadl.annex.behavior.declarative.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.aadl.annex.behavior.declarative.Identifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.Identifier#getId()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Id();

	/**
	 * Returns the meta object for class '{@link fr.tpt.aadl.annex.behavior.declarative.QualifiedNamedElement <em>Qualified Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Named Element</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.QualifiedNamedElement
	 * @generated
	 */
	EClass getQualifiedNamedElement();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tpt.aadl.annex.behavior.declarative.QualifiedNamedElement#getBaNamespace <em>Ba Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ba Namespace</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.QualifiedNamedElement#getBaNamespace()
	 * @see #getQualifiedNamedElement()
	 * @generated
	 */
	EReference getQualifiedNamedElement_BaNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tpt.aadl.annex.behavior.declarative.QualifiedNamedElement#getBaName <em>Ba Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ba Name</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.QualifiedNamedElement#getBaName()
	 * @see #getQualifiedNamedElement()
	 * @generated
	 */
	EReference getQualifiedNamedElement_BaName();

	/**
	 * Returns the meta object for class '{@link fr.tpt.aadl.annex.behavior.declarative.NamedValue <em>Named Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Value</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.NamedValue
	 * @generated
	 */
	EClass getNamedValue();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tpt.aadl.annex.behavior.declarative.NamedValue#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.NamedValue#getReference()
	 * @see #getNamedValue()
	 * @generated
	 */
	EReference getNamedValue_Reference();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.aadl.annex.behavior.declarative.NamedValue#isDequeue <em>Dequeue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dequeue</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.NamedValue#isDequeue()
	 * @see #getNamedValue()
	 * @generated
	 */
	EAttribute getNamedValue_Dequeue();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.aadl.annex.behavior.declarative.NamedValue#isFresh <em>Fresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fresh</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.NamedValue#isFresh()
	 * @see #getNamedValue()
	 * @generated
	 */
	EAttribute getNamedValue_Fresh();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.aadl.annex.behavior.declarative.NamedValue#isCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.NamedValue#isCount()
	 * @see #getNamedValue()
	 * @generated
	 */
	EAttribute getNamedValue_Count();

	/**
	 * Returns the meta object for class '{@link fr.tpt.aadl.annex.behavior.declarative.CommAction <em>Comm Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Action</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.CommAction
	 * @generated
	 */
	EClass getCommAction();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.aadl.annex.behavior.declarative.CommAction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.CommAction#getParameters()
	 * @see #getCommAction()
	 * @generated
	 */
	EReference getCommAction_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.aadl.annex.behavior.declarative.CommAction#isPortFreeze <em>Port Freeze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Freeze</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.CommAction#isPortFreeze()
	 * @see #getCommAction()
	 * @generated
	 */
	EAttribute getCommAction_PortFreeze();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.aadl.annex.behavior.declarative.CommAction#isPortDequeue <em>Port Dequeue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Dequeue</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.CommAction#isPortDequeue()
	 * @see #getCommAction()
	 * @generated
	 */
	EAttribute getCommAction_PortDequeue();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.aadl.annex.behavior.declarative.CommAction#isLock <em>Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.CommAction#isLock()
	 * @see #getCommAction()
	 * @generated
	 */
	EAttribute getCommAction_Lock();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.aadl.annex.behavior.declarative.CommAction#isUnlock <em>Unlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unlock</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.CommAction#isUnlock()
	 * @see #getCommAction()
	 * @generated
	 */
	EAttribute getCommAction_Unlock();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tpt.aadl.annex.behavior.declarative.CommAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.CommAction#getTarget()
	 * @see #getCommAction()
	 * @generated
	 */
	EReference getCommAction_Target();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tpt.aadl.annex.behavior.declarative.CommAction#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualified Name</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.CommAction#getQualifiedName()
	 * @see #getCommAction()
	 * @generated
	 */
	EReference getCommAction_QualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tpt.aadl.annex.behavior.declarative.CommAction#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.CommAction#getReference()
	 * @see #getCommAction()
	 * @generated
	 */
	EReference getCommAction_Reference();

	/**
	 * Returns the meta object for class '{@link fr.tpt.aadl.annex.behavior.declarative.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tpt.aadl.annex.behavior.declarative.Enumeration#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.Enumeration#getLiteral()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literal();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tpt.aadl.annex.behavior.declarative.Enumeration#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.Enumeration#getProperty()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Property();

	/**
	 * Returns the meta object for class '{@link fr.tpt.aadl.annex.behavior.declarative.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.aadl.annex.behavior.declarative.Reference#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ids</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.Reference#getIds()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Ids();

	/**
	 * Returns the meta object for class '{@link fr.tpt.aadl.annex.behavior.declarative.ArrayableIdentifier <em>Arrayable Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrayable Identifier</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.ArrayableIdentifier
	 * @generated
	 */
	EClass getArrayableIdentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.aadl.annex.behavior.declarative.ArrayableIdentifier#getArrayIndexes <em>Array Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Indexes</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.ArrayableIdentifier#getArrayIndexes()
	 * @see #getArrayableIdentifier()
	 * @generated
	 */
	EReference getArrayableIdentifier_ArrayIndexes();

	/**
	 * Returns the meta object for class '{@link fr.tpt.aadl.annex.behavior.declarative.DeclarativeTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.DeclarativeTime
	 * @generated
	 */
	EClass getDeclarativeTime();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tpt.aadl.annex.behavior.declarative.DeclarativeTime#getUnitId <em>Unit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Id</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.DeclarativeTime#getUnitId()
	 * @see #getDeclarativeTime()
	 * @generated
	 */
	EReference getDeclarativeTime_UnitId();

	/**
	 * Returns the meta object for class '{@link fr.tpt.aadl.annex.behavior.declarative.DeclarativeBehaviorTransition <em>Behavior Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Transition</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.DeclarativeBehaviorTransition
	 * @generated
	 */
	EClass getDeclarativeBehaviorTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.aadl.annex.behavior.declarative.DeclarativeBehaviorTransition#getSrcStates <em>Src States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Src States</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.DeclarativeBehaviorTransition#getSrcStates()
	 * @see #getDeclarativeBehaviorTransition()
	 * @generated
	 */
	EReference getDeclarativeBehaviorTransition_SrcStates();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tpt.aadl.annex.behavior.declarative.DeclarativeBehaviorTransition#getDestState <em>Dest State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dest State</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.DeclarativeBehaviorTransition#getDestState()
	 * @see #getDeclarativeBehaviorTransition()
	 * @generated
	 */
	EReference getDeclarativeBehaviorTransition_DestState();

	/**
	 * Returns the meta object for class '{@link fr.tpt.aadl.annex.behavior.declarative.DeclarativeArrayDimension <em>Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Dimension</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.DeclarativeArrayDimension
	 * @generated
	 */
	EClass getDeclarativeArrayDimension();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tpt.aadl.annex.behavior.declarative.DeclarativeArrayDimension#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see fr.tpt.aadl.annex.behavior.declarative.DeclarativeArrayDimension#getDimension()
	 * @see #getDeclarativeArrayDimension()
	 * @generated
	 */
	EReference getDeclarativeArrayDimension_Dimension();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeclarativeFactory getDeclarativeFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeBehaviorElementImpl <em>Behavior Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeBehaviorElementImpl
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getDeclarativeBehaviorElement()
		 * @generated
		 */
		EClass DECLARATIVE_BEHAVIOR_ELEMENT = eINSTANCE
				.getDeclarativeBehaviorElement();

		/**
		 * The meta object literal for the '<em><b>Osate Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIVE_BEHAVIOR_ELEMENT__OSATE_REF = eINSTANCE
				.getDeclarativeBehaviorElement_OsateRef();

		/**
		 * The meta object literal for the '<em><b>Ba Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIVE_BEHAVIOR_ELEMENT__BA_REF = eINSTANCE
				.getDeclarativeBehaviorElement_BaRef();

		/**
		 * The meta object literal for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.IdentifierImpl
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

		/**
		 * The meta object literal for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.QualifiedNamedElementImpl <em>Qualified Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.QualifiedNamedElementImpl
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getQualifiedNamedElement()
		 * @generated
		 */
		EClass QUALIFIED_NAMED_ELEMENT = eINSTANCE.getQualifiedNamedElement();

		/**
		 * The meta object literal for the '<em><b>Ba Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_NAMED_ELEMENT__BA_NAMESPACE = eINSTANCE
				.getQualifiedNamedElement_BaNamespace();

		/**
		 * The meta object literal for the '<em><b>Ba Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_NAMED_ELEMENT__BA_NAME = eINSTANCE
				.getQualifiedNamedElement_BaName();

		/**
		 * The meta object literal for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.NamedValueImpl <em>Named Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.NamedValueImpl
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getNamedValue()
		 * @generated
		 */
		EClass NAMED_VALUE = eINSTANCE.getNamedValue();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_VALUE__REFERENCE = eINSTANCE.getNamedValue_Reference();

		/**
		 * The meta object literal for the '<em><b>Dequeue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_VALUE__DEQUEUE = eINSTANCE.getNamedValue_Dequeue();

		/**
		 * The meta object literal for the '<em><b>Fresh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_VALUE__FRESH = eINSTANCE.getNamedValue_Fresh();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_VALUE__COUNT = eINSTANCE.getNamedValue_Count();

		/**
		 * The meta object literal for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.CommActionImpl <em>Comm Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.CommActionImpl
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getCommAction()
		 * @generated
		 */
		EClass COMM_ACTION = eINSTANCE.getCommAction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_ACTION__PARAMETERS = eINSTANCE
				.getCommAction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Port Freeze</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_ACTION__PORT_FREEZE = eINSTANCE
				.getCommAction_PortFreeze();

		/**
		 * The meta object literal for the '<em><b>Port Dequeue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_ACTION__PORT_DEQUEUE = eINSTANCE
				.getCommAction_PortDequeue();

		/**
		 * The meta object literal for the '<em><b>Lock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_ACTION__LOCK = eINSTANCE.getCommAction_Lock();

		/**
		 * The meta object literal for the '<em><b>Unlock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_ACTION__UNLOCK = eINSTANCE.getCommAction_Unlock();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_ACTION__TARGET = eINSTANCE.getCommAction_Target();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_ACTION__QUALIFIED_NAME = eINSTANCE
				.getCommAction_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_ACTION__REFERENCE = eINSTANCE.getCommAction_Reference();

		/**
		 * The meta object literal for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.EnumerationImpl
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERAL = eINSTANCE.getEnumeration_Literal();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__PROPERTY = eINSTANCE.getEnumeration_Property();

		/**
		 * The meta object literal for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.ReferenceImpl
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__IDS = eINSTANCE.getReference_Ids();

		/**
		 * The meta object literal for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.ArrayableIdentifierImpl <em>Arrayable Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.ArrayableIdentifierImpl
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getArrayableIdentifier()
		 * @generated
		 */
		EClass ARRAYABLE_IDENTIFIER = eINSTANCE.getArrayableIdentifier();

		/**
		 * The meta object literal for the '<em><b>Array Indexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAYABLE_IDENTIFIER__ARRAY_INDEXES = eINSTANCE
				.getArrayableIdentifier_ArrayIndexes();

		/**
		 * The meta object literal for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeTimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeTimeImpl
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getDeclarativeTime()
		 * @generated
		 */
		EClass DECLARATIVE_TIME = eINSTANCE.getDeclarativeTime();

		/**
		 * The meta object literal for the '<em><b>Unit Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIVE_TIME__UNIT_ID = eINSTANCE
				.getDeclarativeTime_UnitId();

		/**
		 * The meta object literal for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeBehaviorTransitionImpl <em>Behavior Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeBehaviorTransitionImpl
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getDeclarativeBehaviorTransition()
		 * @generated
		 */
		EClass DECLARATIVE_BEHAVIOR_TRANSITION = eINSTANCE
				.getDeclarativeBehaviorTransition();

		/**
		 * The meta object literal for the '<em><b>Src States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIVE_BEHAVIOR_TRANSITION__SRC_STATES = eINSTANCE
				.getDeclarativeBehaviorTransition_SrcStates();

		/**
		 * The meta object literal for the '<em><b>Dest State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIVE_BEHAVIOR_TRANSITION__DEST_STATE = eINSTANCE
				.getDeclarativeBehaviorTransition_DestState();

		/**
		 * The meta object literal for the '{@link fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeArrayDimensionImpl <em>Array Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativeArrayDimensionImpl
		 * @see fr.tpt.aadl.annex.behavior.declarative.impl.DeclarativePackageImpl#getDeclarativeArrayDimension()
		 * @generated
		 */
		EClass DECLARATIVE_ARRAY_DIMENSION = eINSTANCE
				.getDeclarativeArrayDimension();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIVE_ARRAY_DIMENSION__DIMENSION = eINSTANCE
				.getDeclarativeArrayDimension_Dimension();

	}

} //DeclarativePackage
