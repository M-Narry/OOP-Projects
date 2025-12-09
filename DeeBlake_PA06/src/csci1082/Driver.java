/**
 * Description: This program looks at user input and finds what the name ranks from name by year and gender
 * 
 * Input: 
 * 		user input: year, gender, name
 * 
 * Computation:
 * 		Evaluated rank
 * 	
 * Output:
 * 		rank of name per gender based on year
 * 
 * ******************************
 * 
 * @author Blake Dee
 * @contact: blake.dee@my.century.edu
 * @since: 10/26/2025
 * 
 * Course: CSCI 1082-01
 * 
 * Institution: Century College
 * 
 * Instructor: Mathew Nyamagwa
 */
package csci1082;
import java.util.Scanner;

public class Driver {
	

	public static void main(String[] args) {
		int year = 0;
		String gender = null;
		String name = null;
		Scanner input = new Scanner(System.in);
		String continueProgram = "y";
		
		
		introduceProgram();
		
		whileMethod(year, gender, name, input, continueProgram);
		
	}
	
	public static void introduceProgram() {
		System.out.println("This program looks at user input and finds what the name ranks from name by year and gender");
	}
	
	public static void whileMethod(int year, String gender, String name, Scanner input, String continueProgram) {
	while (continueProgram.equalsIgnoreCase("y")) {
		
		giveProgram(year, gender, name, input);
		
		System.out.println("============================");
		System.out.print("Would you like to search for another name?\nEnter 'y' to search or press any key to terminate: ");
		
		continueProgram = input.next();
	}
		System.out.println("END OF PROGRAM!!!");
			input.close();
	}

	public static void giveProgram(int year, String gender, String name, Scanner input) {
		System.out.print("Enter a year: ");
		year= input.nextInt();
		System.out.print("Enter a gender (M/F): ");
		gender = input.next();
		System.out.print("Enter a name: ");
		name = input.next();
		
		
		System.out.println("========== OUTPUT ==========");
		
		BabyNameRankingYear rankingYear = new BabyNameRankingYear(year);
		int rank = rankingYear.findRank(gender, name);
		
		if (rank == -1) {
			System.out.printf("The name %s is not ranked in the year %d%n", name, year);
		} else {
			System.out.printf("%s is ranked #%d in the year %d%n", name, rank, year);
	}
}
}


