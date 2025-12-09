package csci1082;
public class Comedy extends Movie {
	private final double LATEFEE = 2.50;
	public Comedy(String title, String rating, int idNumber) {
		super(title, rating, idNumber);
	}
	
	@Override
	public double calculateLateFees(int daysLate) { 
		return daysLate * LATEFEE;
	}

}
