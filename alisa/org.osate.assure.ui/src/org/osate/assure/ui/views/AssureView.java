/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 *
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 *
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 *
 * See COPYRIGHT file for full details.
 */

package org.osate.assure.ui.views;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ContributionManager;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.menus.IMenuService;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.ui.editor.GlobalURIEditorOpener;
import org.osate.assure.assure.AssuranceCaseResult;
import org.osate.assure.assure.AssureResult;
import org.osate.assure.assure.ClaimResult;
import org.osate.assure.assure.Metrics;
import org.osate.assure.ui.labeling.AssureColorColumnLabelProvider;
import org.osate.assure.ui.labeling.AssureDescriptionColumnLabelProvider;
import org.osate.assure.ui.labeling.AssureMetricsColumnLabelProvider;
import org.osate.assure.ui.labeling.AssureNameColumnLabelProvider;
import org.osate.assure.util.AssureUtilExtension;
import org.osate.categories.categories.CategoryFilter;

import com.google.inject.Inject;

public class AssureView extends ViewPart {
	public static final String ID = "org.osate.assure.ui.views.assureView";
	private TreeViewer treeViewer;
	public static String HIDE_CLAIMRESULTS_TOOL_TIP = "Hide Claim Results";
	public static String SHOW_CLAIMRESULTS_TOOL_TIP = "Show Claim Results";
	private NoClaimResultsFilter noClaimsResultFilter = new NoClaimResultsFilter();

	private AlisaView alisaView;
	private CategoryFilter selectedCategoryFilter;
	private AssuranceCaseResult recentProofTrees;

//	IXtextDocument xtextDoc;
//	IXtextModelListener modelListener = new IXtextModelListener() {
//
//		@Override
//		public void modelChanged(XtextResource resource) {
////				System.out.println("model changed: " + resource);
//			getSite().getShell().getDisplay().asyncExec(new Runnable() {
//
//				@Override
//				public void run() {
//					if (inputURI != null) {
//						AssuranceCaseResult assuranceCase = xtextDoc
//								.readOnly(new IUnitOfWork<AssuranceCaseResult, XtextResource>() {
//									@Override
//									public AssuranceCaseResult exec(XtextResource state) throws Exception {
//										return (AssuranceCaseResult) state.getResourceSet().getEObject(inputURI, true);
//									}
//								});
//						treeViewer.setInput(Arrays.asList(assuranceCase));
//					}
//
//				}
//			});
//		}
//	};

	@Inject
	GlobalURIEditorOpener globalURIEditorOpener;

	@Inject
	ILabelProvider labelProvider;
	URI inputURI;

	protected void updateSelectedFilter() {

		if (alisaView == null) {
			try {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				alisaView = (AlisaView) page.showView(AlisaView.ID);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				selectedCategoryFilter = null;
				return;
			}
		}
		selectedCategoryFilter = alisaView.getSelectedCategoryFilter();
		if (selectedCategoryFilter == null) {
			System.out.println("AssureView.updateSelectedFilter() null");
		} else {
			System.out.println("AssureView.updateSelectedFilter() " + selectedCategoryFilter.getName());
		}

	}

	/**
	 * 
	 * @return Whether prooftree has been changed. 
	 */
	protected boolean updateRecentProofTrees() {

		AssuranceCaseResult oldProofTrees = recentProofTrees;

		if (alisaView == null) {
			try {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				alisaView = (AlisaView) page.showView(AlisaView.ID);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				recentProofTrees = null;
				return true;
			}
		}
		if (alisaView.getSelectedAssuranceCase() == null) {
			System.out
					.println("AssureView.updateRecentProofTrees() null -- Assurance case is not selected in Alisaview");
		} else {
			recentProofTrees = alisaView.findCaseResult(alisaView.getSelectedAssuranceCase().getName());
//			if (recentProofTrees == null) {
//				System.out.println(
//						"AssureView.updateRecentProofTrees() null -- Failed to find assure file or never been generated.");
//			} else {
//				System.out.println("AssureView.updateRecentProofTrees() " + recentProofTrees.getName());
//			}
		}

		return oldProofTrees != recentProofTrees;
	}

	@Override
	public void createPartControl(Composite parent) {

		Tree resultTree = new Tree(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		resultTree.setHeaderVisible(true);

		treeViewer = new TreeViewer(resultTree);
		resultTree.setLinesVisible(false);
		TreeViewerColumn column0 = new TreeViewerColumn(treeViewer, SWT.LEFT);
		column0.getColumn().setAlignment(SWT.LEFT);
		column0.getColumn().setText("Evidence");
		column0.getColumn().setWidth(300);
		column0.getColumn().setResizable(true);
		column0.setLabelProvider(new AssureNameColumnLabelProvider());

		List<TreeViewerColumn> indicatorColumns = new ArrayList<TreeViewerColumn>();
		for (int i = 0; i < 10; i++) {
			indicatorColumns.add(new TreeViewerColumn(treeViewer, SWT.RIGHT));
			indicatorColumns.get(i).getColumn().setAlignment(SWT.LEFT);
			indicatorColumns.get(i).getColumn().setWidth(45);
			indicatorColumns.get(i).getColumn().setResizable(false);
			indicatorColumns.get(i).getColumn().setText("");
			if (i == 0) {
				indicatorColumns.get(i).getColumn().setText("0");
				indicatorColumns.get(i).getColumn().setAlignment(SWT.LEFT);
			} else if (i == 5) {
				indicatorColumns.get(i).getColumn().setText(".5    -");
				indicatorColumns.get(i).getColumn().setAlignment(SWT.LEFT);
			} else if (i == 9) {
				indicatorColumns.get(i).getColumn().setText("1");
				indicatorColumns.get(i).getColumn().setAlignment(SWT.RIGHT);
			} else {
				indicatorColumns.get(i).getColumn().setText("-");
				if (i > 4)
					indicatorColumns.get(i).getColumn().setAlignment(SWT.RIGHT);
				else
					indicatorColumns.get(i).getColumn().setAlignment(SWT.CENTER);
			}
			indicatorColumns.get(i).setLabelProvider(new AssureColorColumnLabelProvider(i));
		}

		TreeViewerColumn column2 = new TreeViewerColumn(treeViewer, SWT.RIGHT);
		column2.getColumn().setAlignment(SWT.LEFT);
		column2.getColumn().setText("Description");
		column2.getColumn().setWidth(450);
		column2.getColumn().setResizable(true);
		column2.setLabelProvider(new AssureDescriptionColumnLabelProvider());

		TreeViewerColumn columnx = new TreeViewerColumn(treeViewer, SWT.RIGHT);
		columnx.getColumn().setAlignment(SWT.LEFT);
		columnx.getColumn().setText("results count");
		columnx.getColumn().setWidth(200);
		columnx.getColumn().setResizable(true);
		columnx.setLabelProvider(new AssureMetricsColumnLabelProvider());

//	        treeViewer = new TreeViewer(parent, SWT.SINGLE);
		getSite().setSelectionProvider(treeViewer);
		treeViewer.setContentProvider(new AssureContentProvider());
//	        treeViewer.setLabelProvider(labelProvider);//new AssureLabelProvider(null));
		AssureTooltipListener.createAndRegister(treeViewer);
		treeViewer.addFilter(new NoMetricsFilter());
		// treeViewer.addFilter(noClaimsResultFilter);
//	        getSite().getPage().addSelectionListener("org.osate.assure.Assure",listener);
		MenuManager manager = new MenuManager();
		manager.setRemoveAllWhenShown(true);

		manager.addMenuListener(new IMenuListener() {
			@Override
			public void menuAboutToShow(IMenuManager manager) {
				IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
				if (!selection.isEmpty()) {
					final AssureResult ar = (AssureResult) selection.getFirstElement();

					if (ar instanceof ClaimResult) {
						final ClaimResult claim = (ClaimResult) ar;
						EObject location = AssureUtilExtension.getTarget(claim);
//	                    if (claim instanceof FailResult) {
//	                        manager.add(createHyperlinkAction("Open Failure Location", location));
//	                    } else if (location instanceof ProveStatement) { 
//	                        manager.add(createHyperlinkAction("Open Prove Statement", location));
//	                        manager.add(createExportSubmenu(claim));
//	                    } else {
						manager.add(createHyperlinkAction("Open Requirement", location));
//	                    }
//	                    Map<String, EObject> references = claim.getReferences();
//	                    for (String name : new TreeSet<String>(references.keySet())) {
//	                        manager.add(createHyperlinkAction("Go to '" + name + "'",
//	                                references.get(name)));
//	                    }

						manager.add(new Action("Copy Claim Text") {
							@Override
							public void run() {
								Transferable text = new StringSelection(
										AssureUtilExtension.constructDescription(claim));
								Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
								clipboard.setContents(text, null);
							}
						});
					}
				}

				manager.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
				IMenuService menuService = getViewSite().getWorkbenchWindow().getService(IMenuService.class);
				menuService.populateContributionManager((ContributionManager) manager, "popup:" + ID);
			}
		});
		getViewSite().getActionBars().getToolBarManager().add(createToggleShowClaimResultsAction());
		treeViewer.getControl().setMenu(manager.createContextMenu(treeViewer.getTree()));

		resultTree.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void focusGained(FocusEvent e) {
				// Updates recentProofTrees based on selection from AlisaView
				boolean changed = updateRecentProofTrees();

				if (recentProofTrees != null) {
					CategoryFilter oldfilter = selectedCategoryFilter;
					updateSelectedFilter();
					if (changed || oldfilter != selectedCategoryFilter) {
						setProofs(recentProofTrees, selectedCategoryFilter);
					}
				}

			}
		});

	}

	public void dispose() {
//		if (xtextDoc != null)
//			xtextDoc.removeModelListener(modelListener);
	}

	private IAction createHyperlinkAction(String text, final EObject eObject) {
		return new Action(text) {
			@Override
			public void run() {
				globalURIEditorOpener.open(EcoreUtil.getURI(eObject), true);
			}
		};
	}

	private IAction createToggleShowClaimResultsAction() {

		IAction result = new Action("Show Claim Results", IAction.AS_CHECK_BOX) {
			public void run() {
				if (isChecked()) {
					setToolTipText(HIDE_CLAIMRESULTS_TOOL_TIP);
					treeViewer.removeFilter(noClaimsResultFilter);
				} else {
					setToolTipText(SHOW_CLAIMRESULTS_TOOL_TIP);
					treeViewer.addFilter(noClaimsResultFilter);
				}
				treeViewer.refresh();
			}
		};
		result.setChecked(true);
		result.setImageDescriptor(ImageDescriptor.createFromFile(AssureView.class, "/icons/claims.png"));
		return result;
	}

	public void setProofs(AssuranceCaseResult proofTrees, CategoryFilter filter) {
//		if (xtextDoc != null) {
//			xtextDoc.removeModelListener(modelListener);
//		}
//		xtextDoc = EditorUtils.getActiveXtextEditor().getDocument();
//		xtextDoc.addModelListener(modelListener);
		Object[] expandedElements = treeViewer.getExpandedElements();
		TreePath[] expandedTreePaths = treeViewer.getExpandedTreePaths();
		if (proofTrees != null) {
			recentProofTrees = proofTrees;
			inputURI = EcoreUtil.getURI(proofTrees);

			AssureContentProvider contentProvider = (AssureContentProvider) treeViewer.getContentProvider();
			contentProvider.setFilter(filter);
			treeViewer.setInput(Arrays.asList(proofTrees));
		} else {
			inputURI = null;
			treeViewer.setInput(Collections.emptyList());
		}
		treeViewer.setExpandedElements(expandedElements);
		treeViewer.setExpandedTreePaths(expandedTreePaths);
	}

	@Override
	public void setFocus() {
		treeViewer.getControl().setFocus();
	}

	/**
	 * Viewer Filter class.
	 */
	private class NoMetricsFilter extends ViewerFilter {

		/**
		 * @param viewer the viewer
		 * @param parentElement the parent element
		 * @param element the element
		 * @return if the element is to display: true
		 * @see org.eclipse.jface.viewers.ViewerFilter
		 *      #select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
		 */
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (element instanceof Metrics) {
				return false;
			}
			return true;
		}
	}

	private class NoClaimResultsFilter extends ViewerFilter {
		/**
		 * @param viewer the viewer
		 * @param parentElement the parent element
		 * @param element the element
		 * @return if the element is to display: true
		 * @see org.eclipse.jface.viewers.ViewerFilter
		 *      #select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
		 */
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (element instanceof ClaimResult) {
				return false;
			}
			return true;
		}
	}
}
