/*******************************************************************************
 * Copyright (C) 2016 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0105
 *******************************************************************************/
package org.osate.ge.ext;

import java.util.Objects;

public final class SimplePaletteEntry implements ExtensionPaletteEntry {
	private final String category;
	private final Type type;
	private final String label;
	private final String imageId;
	private final Object context;
	
	/**
	 * 
	 * @param type
	 * @param label
	 * @param imageId is optional.
	 * @param category
	 */
	public SimplePaletteEntry(final String category, final Type type, final String label, final String imageId, final Object context) {
		this.category = Objects.requireNonNull(category, "category must not be null");
		this.type = Objects.requireNonNull(type, "type must not be null");
		this.label = Objects.requireNonNull(label, "label must not be null");
		this.imageId = imageId;
		this.context = context;
	}

	@Override
	public String getCategory() {
		return category;
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public String getImageId() {
		return imageId;
	}
	
	@Override
	public Type getType() {
		return type;
	}
	
	@Override
	public Object getContext() {
		return context;
	}
}
