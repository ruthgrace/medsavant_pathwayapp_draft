import java.util.*;

//Represents metrics for all the variants in a gene in one condition.
public class ConsolidatedVariantRecord {
	//these can be used as parameters for the type of weighting method
	public static final int NON_WEIGHTED = 0;
	public static final int SAMPLE_WEIGHTED = 1;

	//each element of numMutations is the number of mutations of each mutation type
	private int[] numMutations;

	//these are indices of numMutations
	private final int SNP_INDEX = 0;
	private final int INSERTION_INDEX = 1;
	private final int DELETION_INDEX = 2;
	private final int TOTAL_MUTATIONS_INDEX = 3
	private int start_position;
	private int end_position;

	//returns sum of mutations
	public ConsolidatedVariantRecord(MergedMedSavantVariantRecord variantRecord,int weightingMethod) {
		this.start_position = variantRecord.getStartPosition();
		this.end_position = variantRecord.getEndPosition();
		switch (weightingMethod) {
			case 0: this.nonWeighted(variantRecord); break;
			case 1: this.sampleWeighted(variantRecord); break;
			default: System.out.println("invalid weighting method");
		}
		//do something about the gene ifknown or not known in vairantRecord.
	}
	public ConsolidateVariantRecord(MergedMedSavantVariantRecord variantRecord, MergedMedSavantVariantRecord comparedVariantRecord) {
		this.start_position = variantRecord.getStartPosition();
		this.end_position = variantRecord.getEndPosition();
		this.varianceWeighted(variantRecord, comparedVariantRecord);
	}
	private void nonWeighted (MergedMedSavantVariantRecord variantRecord) {
		//loop through variants, sum the number of each type, put them in numMutations
	}
	private void sampleWeighted(MergedMedSavantVariantRecord variantRecord) {
		//loop through vairants, sum the number of each type, divide by the number of samples, put them in nummutations
	}
	private void varianceWeighted(MergedMedSavantVariantRecord variantRecord, MergedMedSavantVariantRecord comparedVariantRecord) {
		//find the number of mutations of each type per participant, for both variant records
		//find the within-condition variance and the between-condition variance
		//assign the ratio of between-condition variance to within-condition variance to numMutations
	}

	public int totalMutations () {
		return this.numMutations[TOTAL_MUTATIONS_INDEX];
	}

	public ArrayList<ConsolidatedVariantRecord> filterGenesBySum (ArrayList<ConsolidatedVariantRecord> variantRecords, int cutoff) {
		int numVariants = variantRecords.size();
		ArrayList<ConsolidatedVariantRecord> filteredVariants = new ArrayList<ConsolidatedVariantRecord>();
		for (int i = 0; i < numVariants; i++) {
			if (variantRecords.get(i).totalMutations() >= cutoff) {
				filteredVariants.add(variantRecords.get(i));
			}
		}
		return filteredVariants;
	}

}