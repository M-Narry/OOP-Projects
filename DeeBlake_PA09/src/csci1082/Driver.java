/**
 * DESCRIPTION: This program acts as a movie rental business software that creates movies with a title, MPAA rating, and id number and calculates late fees.
 * This program also acts to override the equals() method.
 * 
 * INPUT:
 * 		user input: none
 * 		constants: late fee per genre
 * 
 * 
 * COMPUTATION:
 * 		Late fee = days late * rate of late fee
 * 
 * 
 * OUTPUT:
 * 		Object toString.
 * 		equals() boolean
 * 		Late fee based on genre
 * 
 * *******************************************
 * 
 * @author Blake Dee
 * @contact blake.dee@my.century.edu
 * @since 11/16/2025
 * 
 * institution: Century College
 * course: csci 1081-01
 * instructor: Mathew Nyamagwa
 */
package csci1082;
public class Driver {
	public static void main(String[] args) {
		
		
		System.out.println("This program acts as a Movie Rental Business software to create movies with a title, MPAA rating, and id number.\n"
				+ "This program also overrides the .equals() method.\n\n");
		
		// Creating the objects
		Movie action1 = new Action("Top Gun", "PG-13", 101);
		Movie action2 = new Action("Top Gun", "PG-13", 101);
		Movie comedy1 = new Comedy("The Hangover", "R", 102);
		Movie drama1 = new Drama("The Notebook", "PG-13", 103);
		Movie movie1 = new Movie("Generic Movie", "PG", 104);
		Movie movie2 = new Movie();
		
		// Testing toString()
		System.out.println("Testing toString():");
		System.out.println("===== OUTPUT =====");
		System.out.println(action1);
		System.out.println(comedy1);
		System.out.println(drama1);
		System.out.println(movie1);
		// Testing empty constructor
		System.out.println(movie2);
		
		// Testing equals() override
		System.out.println("\nTesting equals() override:");
		System.out.println("===== OUTPUT =====");
		System.out.println(action1 + " equals " + action2 + "?: " + action1.equals(action2));
		System.out.println(action1 + " is a comedy?: " + action1.equals(comedy1));
		
		// Testing late fees
		System.out.println("\nTesting late fees:");
		System.out.println("===== OUTPUT =====");
		System.out.println("Action movie late fee (5 days): $" + action1.calculateLateFees(5));
		System.out.println("Comedy movie late fee (5 days): $" + comedy1.calculateLateFees(5));
		System.out.println("Drama movie late fee (5 days): $" + drama1.calculateLateFees(5));
		System.out.println("Generic movie late fee (5 days): $" + movie1.calculateLateFees(5));
		System.out.println("\n\nEND OF PROGRAM!!!");
		

}
}
