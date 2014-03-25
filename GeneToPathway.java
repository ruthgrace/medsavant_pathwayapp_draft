//This class has methods for getting pathway information for all the genes in a single condition.
//All of this is done server-side.
public class GenesToPathways {
	private ArrayList<ConsolidatedVariantRecords> variantRecords;
	private ArrayList<String> genes;
	private ArrayList<String> koNumbers;
	private String table;
	public GenesToPathways(ArrayList<ConsolidatedVariantRecords> variantRecords) {
		this.variantRecords = variantRecords;
		this.genes = new ArrayList<String>();
		this.koNumbers = new ArrayList<String>();
		this.table="";
	}
	public void getSequence() {
		//retrieve the genetic sequence for each variant record by referencing hg19 (or whichever reference sequence the end and start positions of the ConsolidatedVariantRecords correlate to or were derived from)
		//assign the sequence to this.genes
	}
	public void generateKeggInput() {
		//Run BLAST against KEGG database to get KO numbers for each gene, in order to reference KEGG pathways.
		//actually an easier way to get the KO identifiers is to convert Gene Ontology terms into UniProt IDs using Ensembl Biomart, and then KEGG has a tool on their website to convert UniProt ID to Kegg Ontology identifiers
	}
	public void retreivePathwaysFromKegg() {
		//get the pathways that each gene is related to
	}
	public ArrayList<ConsolidatedPathwayRecord> getPathways() {
		//sort each gene into each pathway (pathways may have identical genes)
		//pathways should also contain the total number of genes in them
		//assign this.table to have the contents of a tab-delimited table with columns for the gene name, mutation count in each condition, a metric for the mutation differential, a boolean for whether or not the differential was called significant, and the KEGG pathway assignment (KO number).
		//return the list of pathways
	}
	public String getTable()  {
		return this.table;
	}
}