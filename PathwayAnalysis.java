
public class PathwayAnalysis {
	private ArrayList<ConsolidatedPathwayRecord> pathways;
	
	public PathwayAnalysis() {
		pathways = new ArrayList<ConsolidatedPathwayRecord>();
	}

	public void overRepresentationAnalysis (ArrayList<ConsolidatedPathwayRecord> pathways, int numGenesWithVariants){
		//find the proportion of genes which passed the mutation significance filter in each pathway
		//find the average ratio of genes in a pathway to total genes with variants
		//this.pathways = a list of pathways which have a high ratio of genes passing the mutation significance filter to genes not passing the filter, as tested by the hypergeometric test
	}
	public ArrayList<ConsolidatedPathwayRecord> meanFunctionalClassScoring (ArrayList<ConsolidatedPathwayRecord> pathways, float cutoff) {
		int numPathways = pathways.size();
		for (int i = 0; i < numPathways; i++) {
			if (pathways.get(i).meanGeneMetric() >= cutoff) {
				this.pathways.add(pathways.get(i));
			}
		}
	}
}