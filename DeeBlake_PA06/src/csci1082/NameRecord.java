package csci1082;

public class NameRecord {
	private int rank;
	private String maleName;
	private int maleCount;
	private String femaleName;
	private int femaleCount;
	
	public NameRecord(int rank, String maleName, int maleCount, String femaleName, int femaleCount) {
		this.rank = rank;
		this.maleName = maleName;
		this.maleCount = maleCount;
		this.femaleName = femaleName;
		this.femaleCount = femaleCount;
		
	}
	
	public int getRank() {
		return rank;
	}
	
	public String getMaleName() {
		return maleName;
	}
	
	public int getMaleCount() {
		return maleCount;
	}
	
	public String getFemaleName() {
		return femaleName;
	}
	
	public int getFemaleCount() {
		return femaleCount;
	}

}
