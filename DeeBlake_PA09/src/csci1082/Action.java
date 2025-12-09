package csci1082;
public class Action extends Movie {
	private final double LATEFEE = 3.00;
	
	public Action(String title, String rating, int idNumber) {
		super(title, rating, idNumber);
	}
	
	@Override
	public double calculateLateFees(int daysLate) {
		return daysLate * LATEFEE;
		
	}

}
