package org.osate.ge.internal.ui.dialogs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.RowDataFactory;
import org.eclipse.jface.layout.RowLayoutFactory;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.osate.aadl2.ComponentCategory;
import org.osate.ge.internal.ui.util.UiUtil;
import org.osate.ge.internal.util.StringUtil;
import org.osate.ge.internal.util.classifiers.ClassifierOperationPart;
import org.osate.ge.internal.util.classifiers.ClassifierOperationPartType;

import com.google.common.base.CaseFormat;

class ClassifierOperationPartEditor extends Composite {
	private ElementLabelProvider elementLabelProvider = new ElementLabelProvider();
	private final CopyOnWriteArrayList<SelectionListener> selectionListeners = new CopyOnWriteArrayList<>();
	private final Group operationGroup;
	private final Label existingLabel;
	private final Composite existingValueContainer;
	private final Label existingValueLabel;
	private final Label packageLabel;
	private final Composite packageValueContainer;
	private final Label selectedPackageLabel;
	private final Label identifierLabel;
	private final Text identifierField;
	private final List<Button> operationPartTypeBtns = new ArrayList<>();
	private final boolean showPackageSelector;
	private final ComponentCategory componentCategory;
	private final Value currentValue = new Value();

	static interface Model {
		Collection<?> getPackageOptions();

		Collection<?> getSelectOptions();

		Collection<?> getUnfilteredSelectOptions();

		String getSelectTitle();

		String getSelectMessage();
	}

	/**
	 * Private class that stores mutable value.
	 *
	 */
	private class Value {
		ClassifierOperationPartType type;
		private Object selectedPackage;
		private Object selectedElement;
		private String identifier = "";

		public ClassifierOperationPart toConfiguredOperation() {
			return new ClassifierOperationPart(type, selectedPackage, identifier, componentCategory,
					selectedElement);
		}
	}

	public ClassifierOperationPartEditor(final Composite parent,
			final EnumSet<ClassifierOperationPartType> allowedOperations, final boolean showPackageSelector,
			final ComponentCategory componentCategory,
			final ClassifierOperationPartEditor.Model widgetModel) {
		super(parent, SWT.NONE);
		this.showPackageSelector = showPackageSelector;
		this.componentCategory = componentCategory;
		setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());

		//
		// Operations
		//
		operationGroup = new Group(this, SWT.NONE);
		operationGroup.setLayout(RowLayoutFactory.fillDefaults().type(SWT.HORIZONTAL).wrap(true).create());
		operationGroup.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).grab(true, false).create());

		final SelectionListener operationSelectedListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final Button btn = ((Button) e.widget);
				if (btn.getSelection()) {
					currentValue.type = (ClassifierOperationPartType) btn.getData();
					notifySelectionListeners();
					updateOperationDetailsVisibility();
				}
			}
		};

		for (final ClassifierOperationPartType operation : ClassifierOperationPartType.values()) {
			final Button newBtn = new Button(operationGroup, SWT.RADIO);
			newBtn.setText(StringUtil
					.camelCaseToUser(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, operation.toString())));
			newBtn.setData(operation);
			newBtn.addSelectionListener(operationSelectedListener);
			operationPartTypeBtns.add(newBtn);
		}

		setAllowedOperations(allowedOperations);

		//
		// Select Existing
		//
		existingLabel = new Label(this, SWT.NONE);
		existingLabel.setText("Existing:");
		existingLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());

		final RowLayout existingValueContainerLayout = new RowLayout(SWT.HORIZONTAL);
		existingValueContainerLayout.center = true;
		existingValueContainer = new Composite(this, SWT.NONE);
		existingValueContainer.setLayout(existingValueContainerLayout);
		existingValueContainer.setLayoutData(GridDataFactory.fillDefaults().create());

		existingValueLabel = new Label(existingValueContainer, SWT.NONE);
		existingValueLabel.setText(ClassifierOperationDialog.NOT_SELECTED_LABEL);

		final Button selectExistingBtn = new Button(existingValueContainer, SWT.NONE);
		selectExistingBtn.setText("...");

		selectExistingBtn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				final ElementSelectionDialog dlg = new ElementSelectionDialog(Display.getCurrent().getActiveShell(),
						widgetModel.getSelectTitle(), widgetModel.getSelectMessage(),
						widgetModel.getSelectOptions(), "Show All", widgetModel.getUnfilteredSelectOptions(),
						false);
				if (dlg.open() == Window.OK) {
					setSelectedElement(dlg.getFirstSelectedElement());
					notifySelectionListeners();
				}
			}
		});

		//
		// Create
		//
		packageLabel = new Label(this, SWT.NONE);
		packageLabel.setText("Package:");
		packageLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());

		final RowLayout packageValueContainerLayout = new RowLayout(SWT.HORIZONTAL);
		packageValueContainerLayout.center = true;
		packageValueContainer = new Composite(this, SWT.NONE);
		packageValueContainer.setLayout(packageValueContainerLayout);
		packageValueContainer
		.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());

		selectedPackageLabel = new Label(packageValueContainer, SWT.NONE);
		selectedPackageLabel.setText(ClassifierOperationDialog.NOT_SELECTED_LABEL);

		final Button selectPackageBtn = new Button(packageValueContainer, SWT.NONE);
		selectPackageBtn.setText("...");

		selectPackageBtn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				final ElementSelectionDialog dlg = new ElementSelectionDialog(Display.getCurrent().getActiveShell(),
						"Select a Package", "Select a package.", widgetModel.getPackageOptions(), false);
				if (dlg.open() == Window.OK) {
					setSelectedPackage(dlg.getFirstSelectedElement());
					notifySelectionListeners();
				}
			}
		});

		identifierLabel = new Label(this, SWT.NONE);
		identifierLabel.setText("Identifier:");
		identifierLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		identifierField = new Text(this, SWT.SINGLE | SWT.BORDER);
		identifierField.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		identifierField.addModifyListener(e -> {
			currentValue.identifier = identifierField.getText();
			notifySelectionListeners();
		});

		// Update widget visibility
		updateOperationDetailsVisibility();
	}

	public void setAllowedOperations(final EnumSet<ClassifierOperationPartType> allowedOperations) {
		if (allowedOperations == null || allowedOperations.size() == 0) {
			throw new RuntimeException("allowedOperations must contain at least one operation.");
		}

		setGridChildVisible(operationGroup, allowedOperations.size() > 1);

		if (allowedOperations.size() > 1) {
			ClassifierOperationPartType newType = null;

			// Update the visibility of the operation part type buttons
			for (final Button typeBtn : operationPartTypeBtns) {
				final boolean typeIsAllowed = allowedOperations.contains(typeBtn.getData());
				typeBtn.setVisible(typeIsAllowed);
				typeBtn.setLayoutData(RowDataFactory.swtDefaults().exclude(!typeIsAllowed).create());
				if (typeIsAllowed && typeBtn.getData() == currentValue.type) {
					newType = currentValue.type;
				}
			}

			// Update the current operation to reflect the UI
			setCurrentOperationPartType(newType);

			// Update button selection to reflect the new type
			for (final Button typeBtn : operationPartTypeBtns) {
				final boolean isSelectedType = typeBtn.getData() == currentValue.type;
				typeBtn.setSelection(isSelectedType);
			}

			operationGroup.requestLayout();
		} else {
			setCurrentOperationPartType(allowedOperations.iterator().next());
		}

		updateOperationDetailsVisibility();

		// Request Layout
		requestLayout();
	}

	/**
	 * Selection listeners are called when the value of the widget changes.
	 * @param listener
	 */
	public void addSelectionListener(final SelectionListener listener) {
		selectionListeners.add(listener);
	}

	void setCurrentOperationPartType(final ClassifierOperationPartType value) {
		final boolean opIsChanging = currentValue.type != value;
		currentValue.type = value;
		if (opIsChanging) {
			notifySelectionListeners();
		}
	}

	void setSelectedElement(final Object element) {
		currentValue.selectedElement = element;
		existingValueLabel.setText(getElementDescription(element));
		existingValueContainer.requestLayout();
	}

	void setSelectedPackage(final Object pkg) {
		currentValue.selectedPackage = pkg;
		selectedPackageLabel.setText(getElementDescription(pkg));
		packageValueContainer.requestLayout();
	}

	private String getElementDescription(final Object value) {
		if (value == null) {
			return ClassifierOperationDialog.NOT_SELECTED_LABEL;
		}

		final String desc = elementLabelProvider.getText(value);
		return desc == null ? "<null>" : desc;
	}

	private void notifySelectionListeners() {
		final Event e = new Event();
		e.widget = this;
		final SelectionEvent selectionEvent = new SelectionEvent(e);
		for (final SelectionListener l : selectionListeners) {
			l.widgetSelected(selectionEvent);
		}
	}

	private static void setGridChildVisible(final Control c, final boolean visible) {
		// Check for null to support widgets that are not created because they are not necessary for the allowed operations
		if (c != null) {
			if (c.getLayoutData() == null) {
				c.setLayoutData(GridDataFactory.fillDefaults().create());
			}

			((GridData) c.getLayoutData()).exclude = !visible;
			// c.setLayoutData(GridDataFactory.fillDefaults().exclude(!visible).create());
			c.setVisible(visible);
		}
	}

	private void updateOperationDetailsVisibility() {
		final boolean selectExisting = currentValue.type == ClassifierOperationPartType.EXISTING;
		setGridChildVisible(existingLabel, selectExisting);
		setGridChildVisible(existingValueContainer, selectExisting);

		final boolean createNew = ClassifierOperationPartType.isCreate(currentValue.type);
		setGridChildVisible(identifierLabel, createNew);
		setGridChildVisible(identifierField, createNew);

		final boolean showPackageWidgets = showPackageSelector && createNew;
		setGridChildVisible(packageLabel, showPackageWidgets);
		setGridChildVisible(packageValueContainer, showPackageWidgets);

		requestLayout();
	}

	public ClassifierOperationPart getConfiguredOperation() {
		return currentValue.toConfiguredOperation();
	}

	public void setTestingFieldId(final String id) {
		identifierField.setData(UiUtil.AUTOMATED_SWTBOT_TESTING_KEY, id);
	}
}