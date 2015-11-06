/**
 */
package org.osate.verify.verify;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.verify.verify.VerifyPackage
 * @generated
 */
public interface VerifyFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VerifyFactory eINSTANCE = org.osate.verify.verify.impl.VerifyFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Verification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verification</em>'.
   * @generated
   */
  Verification createVerification();

  /**
   * Returns a new object of class '<em>Verification Plan</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verification Plan</em>'.
   * @generated
   */
  VerificationPlan createVerificationPlan();

  /**
   * Returns a new object of class '<em>Claim</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Claim</em>'.
   * @generated
   */
  Claim createClaim();

  /**
   * Returns a new object of class '<em>Argument Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument Expr</em>'.
   * @generated
   */
  ArgumentExpr createArgumentExpr();

  /**
   * Returns a new object of class '<em>Verification Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verification Activity</em>'.
   * @generated
   */
  VerificationActivity createVerificationActivity();

  /**
   * Returns a new object of class '<em>Verification Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verification Condition</em>'.
   * @generated
   */
  VerificationCondition createVerificationCondition();

  /**
   * Returns a new object of class '<em>Verification Method Registry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verification Method Registry</em>'.
   * @generated
   */
  VerificationMethodRegistry createVerificationMethodRegistry();

  /**
   * Returns a new object of class '<em>Verification Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verification Method</em>'.
   * @generated
   */
  VerificationMethod createVerificationMethod();

  /**
   * Returns a new object of class '<em>Method Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Type</em>'.
   * @generated
   */
  MethodType createMethodType();

  /**
   * Returns a new object of class '<em>Resolute Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resolute Method</em>'.
   * @generated
   */
  ResoluteMethod createResoluteMethod();

  /**
   * Returns a new object of class '<em>Java Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Java Method</em>'.
   * @generated
   */
  JavaMethod createJavaMethod();

  /**
   * Returns a new object of class '<em>Manual Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Manual Method</em>'.
   * @generated
   */
  ManualMethod createManualMethod();

  /**
   * Returns a new object of class '<em>Plugin Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin Method</em>'.
   * @generated
   */
  PluginMethod createPluginMethod();

  /**
   * Returns a new object of class '<em>Then Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Then Expr</em>'.
   * @generated
   */
  ThenExpr createThenExpr();

  /**
   * Returns a new object of class '<em>Else Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Else Expr</em>'.
   * @generated
   */
  ElseExpr createElseExpr();

  /**
   * Returns a new object of class '<em>All Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>All Expr</em>'.
   * @generated
   */
  AllExpr createAllExpr();

  /**
   * Returns a new object of class '<em>Ref Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Expr</em>'.
   * @generated
   */
  RefExpr createRefExpr();

  /**
   * Returns a new object of class '<em>Verification Validation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verification Validation</em>'.
   * @generated
   */
  VerificationValidation createVerificationValidation();

  /**
   * Returns a new object of class '<em>Verification Precondition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verification Precondition</em>'.
   * @generated
   */
  VerificationPrecondition createVerificationPrecondition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VerifyPackage getVerifyPackage();

} //VerifyFactory