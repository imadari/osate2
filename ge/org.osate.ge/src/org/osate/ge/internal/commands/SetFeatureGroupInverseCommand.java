package org.osate.ge.internal.commands;

import javax.inject.Named;

import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.FeatureGroup;
import org.osate.aadl2.FeatureGroupType;
import org.osate.ge.di.Activate;
import org.osate.ge.di.CanActivate;
import org.osate.ge.di.GetLabel;
import org.osate.ge.di.IsAvailable;
import org.osate.ge.di.Names;
import org.osate.ge.internal.DiagramElement;
import org.osate.ge.internal.di.InternalNames;
import org.osate.ge.internal.di.ModifiesBusinessObjects;
import org.osate.ge.internal.diagram.AgeDiagramElement;
import org.osate.ge.internal.query.StandaloneDiagramElementQuery;
import org.osate.ge.internal.services.AadlFeatureService;
import org.osate.ge.internal.services.QueryService;

@ModifiesBusinessObjects
public class SetFeatureGroupInverseCommand {
	private static final StandaloneDiagramElementQuery parentQuery = StandaloneDiagramElementQuery.create((root) -> root.ancestor(1));
	final boolean inverse;

	public SetFeatureGroupInverseCommand(boolean inverse) {
		this.inverse = inverse;
	}

	@GetLabel
	public String getLabel() {
		return inverse ? "Set to Inverse" : "Set to Not Inverse";
	}

	@IsAvailable
	public boolean isAvailable(@Named(Names.BUSINESS_OBJECT) final FeatureGroup feat,
			@Named(InternalNames.DIAGRAM_ELEMENT_PROXY) final DiagramElement diagramElement,
			final QueryService queryService) {
		final Object containerBo = queryService.getFirstBusinessObject(parentQuery, diagramElement);
		final Classifier classifier = feat.getContainingClassifier();
		return classifier == containerBo && (classifier instanceof FeatureGroupType || classifier instanceof ComponentType);
	}

	@CanActivate
	public boolean canActivate(@Named(Names.BUSINESS_OBJECT) final FeatureGroup feat,
			@Named(InternalNames.DIAGRAM_ELEMENT_PROXY) final AgeDiagramElement diagramElement,
			final AadlFeatureService featureService,
			final QueryService queryService) {
		return featureService.getFeatureGroupType(diagramElement, feat) != null && feat.isInverse() != inverse;
	}

	@Activate
	public boolean activate(@Named(Names.BUSINESS_OBJECT) final FeatureGroup feat) {
		feat.setInverse(inverse);
		return true;
	}
}
