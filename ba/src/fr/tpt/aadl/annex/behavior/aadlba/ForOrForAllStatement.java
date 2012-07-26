/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the Eclipse Public License as published by Eclipse, either
 * version 1.0 of the License, or (at your option) any later version. This
 * program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the Eclipse Public License for
 * more details. You should have received a copy of the Eclipse Public License
 * along with this program. If not, see
 * http://www.eclipse.org/org/documents/epl-v10.php
 */
package fr.tpt.aadl.annex.behavior.aadlba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Or For All Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.ForOrForAllStatement#getIteratedValues <em>Iterated Values</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.ForOrForAllStatement#isForAll <em>For All</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.ForOrForAllStatement#getIterativeVariable <em>Iterative Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getForOrForAllStatement()
 * @model
 * @generated
 */
public interface ForOrForAllStatement extends LoopStatement
{
  /**
	 * Returns the value of the '<em><b>Iterated Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iterated Values</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterated Values</em>' containment reference.
	 * @see #setIteratedValues(ElementValues)
	 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getForOrForAllStatement_IteratedValues()
	 * @model containment="true" required="true"
	 * @generated
	 */
  ElementValues getIteratedValues();

  /**
	 * Sets the value of the '{@link fr.tpt.aadl.annex.behavior.aadlba.ForOrForAllStatement#getIteratedValues <em>Iterated Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterated Values</em>' containment reference.
	 * @see #getIteratedValues()
	 * @generated
	 */
  void setIteratedValues(ElementValues value);

  /**
	 * Returns the value of the '<em><b>For All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>For All</em>' attribute.
	 * @see #setForAll(boolean)
	 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getForOrForAllStatement_ForAll()
	 * @model default="false" dataType="fr.tpt.aadl.annex.behavior.aadlba.Boolean"
	 * @generated
	 */
  boolean isForAll();

  /**
	 * Sets the value of the '{@link fr.tpt.aadl.annex.behavior.aadlba.ForOrForAllStatement#isForAll <em>For All</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For All</em>' attribute.
	 * @see #isForAll()
	 * @generated
	 */
  void setForAll(boolean value);

  /**
	 * Returns the value of the '<em><b>Iterative Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iterative Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterative Variable</em>' containment reference.
	 * @see #setIterativeVariable(IterativeVariable)
	 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getForOrForAllStatement_IterativeVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
  IterativeVariable getIterativeVariable();

  /**
	 * Sets the value of the '{@link fr.tpt.aadl.annex.behavior.aadlba.ForOrForAllStatement#getIterativeVariable <em>Iterative Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterative Variable</em>' containment reference.
	 * @see #getIterativeVariable()
	 * @generated
	 */
  void setIterativeVariable(IterativeVariable value);

} // ForOrForAllStatement
