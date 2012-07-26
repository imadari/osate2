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
package fr.tpt.aadl.annex.behavior.aadlba.impl;

import fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage;
import fr.tpt.aadl.annex.behavior.aadlba.BehaviorProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.PropertySet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.BehaviorPropertyImpl#getPropertySet <em>Property Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviorPropertyImpl extends BehaviorElementImpl implements BehaviorProperty
{
  /**
	 * The cached value of the '{@link #getPropertySet() <em>Property Set</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPropertySet()
	 * @generated
	 * @ordered
	 */
  protected PropertySet propertySet;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BehaviorPropertyImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return AadlBaPackage.Literals.BEHAVIOR_PROPERTY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PropertySet getPropertySet()
  {
		if (propertySet != null && ((EObject)propertySet).eIsProxy()) {
			InternalEObject oldPropertySet = (InternalEObject)propertySet;
			propertySet = (PropertySet)eResolveProxy(oldPropertySet);
			if (propertySet != oldPropertySet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlBaPackage.BEHAVIOR_PROPERTY__PROPERTY_SET, oldPropertySet, propertySet));
			}
		}
		return propertySet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PropertySet basicGetPropertySet()
  {
		return propertySet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPropertySet(PropertySet newPropertySet)
  {
		PropertySet oldPropertySet = propertySet;
		propertySet = newPropertySet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlBaPackage.BEHAVIOR_PROPERTY__PROPERTY_SET, oldPropertySet, propertySet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case AadlBaPackage.BEHAVIOR_PROPERTY__PROPERTY_SET:
				if (resolve) return getPropertySet();
				return basicGetPropertySet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case AadlBaPackage.BEHAVIOR_PROPERTY__PROPERTY_SET:
				setPropertySet((PropertySet)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case AadlBaPackage.BEHAVIOR_PROPERTY__PROPERTY_SET:
				setPropertySet((PropertySet)null);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case AadlBaPackage.BEHAVIOR_PROPERTY__PROPERTY_SET:
				return propertySet != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviorPropertyImpl
