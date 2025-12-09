package csci1082;
public class Movie {
	
	protected String rating;
	protected int idNumber;
	protected String title;
	private final double LATEFEE = 2.00;
	
	// Empty Constructor
	public Movie() {
		this.title = "";
		this.rating = "";
		this.idNumber = 0;
	}
	
	// Constructor
	public Movie(String title, String rating, int idNumber) {
		this.title = title;
		this.rating = rating;
		this.idNumber = idNumber;
	}
	
	// Setters
	public void setRating(String rating) {
		this.rating = rating;
		
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	// Getters
	public String getRating() {
		return rating;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public String getTitle() {
		return title;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Movie)) {
			return false;
		}
		Movie other = (Movie) obj;
		
		return this.idNumber == other.idNumber && this.title.equals(other.title) && this.rating.equals(other.rating);
		
		
	}
	
	public String toString() {
		return title + ": " + rating + " ID: " + idNumber;
	}
	
	public double calculateLateFees(int daysLate) {
		return daysLate * LATEFEE;
	}
	

}
