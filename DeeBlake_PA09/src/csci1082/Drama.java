package csci1082;
public class Drama extends Movie {
	private final double LATEFEE = 2.00;
	public Drama(String title, String rating, int idNumber) {
		super(title, rating, idNumber);
	}
	
	@Override
	public double calculateLateFees(int daysLate) {
		return daysLate * LATEFEE;
	}

}
