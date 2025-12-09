/**
 * Description: This program implements a time class that represents a time of day using hour, minute, and second fields.
 * 
 * 
 * 
 * INPUT:
 * 		CONSTANTS:
 * 				Milliseconds from 2000 = 946,684,800,000 ms
 * 
 * 		USER INPUT:
 * 				None
 * 
 * 
 * COMPUTATION:
 * 		Converts milliseconds into hours, minutes, seconds.
 * 		Adjusted for days including leap years.
 * 		
 * 
 * OUTPUT:
 * 		System time, explicitly defined time, elapsed time from 2000
 * 
 * 
 * *************************************
 * 
 * @author Blake Dee
 * @contact blake.dee@my.century.edu
 * @since 10/05/25
 * 
 * Course: CSCI 1082-01
 * 
 * Institution: Century College
 * 
 * Instructor: Mathew Nyamagwa
 */

package csci1082;

public class Driver {
	
	public static void main(String[] args) {
		
		System.out.println("This program implements a time class that represents a time of day using hour, minute, and second fields.");
		
		//No argument constructor test with current time
		Time test1 = new Time();
		System.out.println("Current system time: " + test1);
		
		// Test Constructor with elapsed time
		Time test2 = new Time(39567000);
		System.out.println("Elapsed time since Jan 1, 2000: " + test2);
		
		// Test constructor with hour, minute, second
		Time test3 = new Time(12, 30, 45);
		System.out.println("Explicitly set time (12:30:45): " + test3);
		
		// Test constructor with invalid entries
		Time test4 = new Time(-1, -1, -1);
		System.out.println("\tTesting out of bounds: " + test4);
		
		// Testing setTime
		test2.setTimeFrom2000(124532443);
		System.out.println("After setTimeFrom2000(124532443) " + test2);
		
	}

}
