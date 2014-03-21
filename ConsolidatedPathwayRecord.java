
public class ConsolidatedPathwayRecord {
	private ArrayList<ConsolidatedVariantRecord> genes;
	private int numGenesInPathway;
	public ConsolidatedPathwayRecord(int numGenesInPathway) {
		genes = new ArrayList<ConsolidatedVariantRecord>();
		this.numGenesInPathway = numGenesInPathway;
	}
	
	public void addGene(ConsolidatedVariantRecord gene) {
		this.genes.add(gene);
	}
	public float meanGeneMetric() {
		int numGenes = genes.size();
		int totalMutations=0;
		for (int i = 0; i < numGenes; i++) {
			totalMutations+=this.genes.get(i).getTotalMutations();
		}
		return ((float) totalMutations)/((float) numGenes);
	}
}