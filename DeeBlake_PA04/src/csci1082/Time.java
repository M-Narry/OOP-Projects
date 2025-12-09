package csci1082;

public class Time {
	// private variables
	private int hour;
	private int minute;
	private int second;
	
	// math for days from 2000 including leap years
	final long MILLISECONDS_FROM_2000 = ((30 * 365 + 7) * 24 * 60 * 60 * 1000);
	
	//Empty constructor given current system time
	public Time() {
		 setTime(System.currentTimeMillis());
	}
	// Constructor for time from January 1st, 2000
	public Time(long elapsedTime) {
		setTimeFrom2000(elapsedTime);
	}
	// Constructor given hour, minute, second
	public Time(int hour, int minute, int second) {
		
		// if statement if out of bounds
		if ((hour < 0) || (hour > 24)) {
			System.out.print("Invalid hour ");
			this.hour = 0;
		} else {
			this.hour = hour;
		}
			
		
		// if statement if out of bounds
		if ((minute < 0) || (minute > 59)) {
			System.out.print("Invalid minute ");
			this.minute = 0;
		} else {
			 this.minute = minute;
		}
		
		// if statement if out of bounds
		if ((second < 0) || (minute > 59)) {
			System.out.print("Invalid second ");
			this.second = 0;
		} else {
			this.second = second;
			}
	}
	// getting hour
	public int getHour() {
		
		return hour;
	}
	// getting minute
	public int getMinute() {
		
		return minute;
	}
	//getting second
	public int getSecond() {
	
		return second;
	}
	//Setter for time
	public void setTime(long elapsedTime) {
		
		//Math
		long totalSeconds = elapsedTime / 1000;
		this.second = (int)(totalSeconds % 60);
		
		
		long totalMinutes = totalSeconds / 60;
		this.minute = (int)(totalMinutes % 60);
		
		long totalHours = totalMinutes / 60;
		this.hour = (int)(totalHours % 24);
	}
	
	public void setTimeFrom2000(long elapsedTime) {
		long realMillis = MILLISECONDS_FROM_2000 + elapsedTime;
		
		long totalSeconds = realMillis / 1000;
		this.second = (int)(totalSeconds % 60);
		
		long totalMinutes = totalSeconds / 60;
		this.minute = (int)(totalMinutes % 60);
		
		long totalHours = totalMinutes / 60;
		this.hour = (int)(totalHours % 24);
		
		
	}
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
