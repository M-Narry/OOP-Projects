/**
 Description: This program generates a random number and compares it to input.

Input:
	User Input: 
		lottery number

Computation:
	Comparison of the two numbers

Output:
	Message based on the amount of digits correct


************************************************

@author: Blake Dee
@contact: blake.dee@my.century.edu
@Since: 09/21/2025

Course: CSCI 1082-71

Institution: Century College

Instructor: Mathew Nyamagwa
*/

package csci1082;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// Variables
		
		//generating a random lottery number each round
		int lotteryNumber = (int)(Math.random() * 1000);
		
		// split the lottery number
		int lotteryDigit1 = lotteryNumber / 100;
		int lotteryDigit2 = (lotteryNumber / 10) % 10;
		int lotteryDigit3 = lotteryNumber % 10;
		
		// Finishing variables
		char userChar = ' ';
		int attempt;
		int userNumber;
		
		
		System.out.print("****************** CENTURY COLLEGE LOTTERY ******************\n\n");
		System.out.println("Welcome to the Century College Lottery Club!\nPlease follow the instructions below to WIN!!\n\n"
				+ "=============== INPUT ===============\n");
		
		// The bread and butter
		while (userChar != 'q') {
			
			// for loop to count attempts
			for (attempt = 1; attempt <= 3; ++attempt) {
				
				
				System.out.print("\nPlease enter your lottery number (three digits): ");
				
				//Get the digit
				userNumber = scnr.nextInt();
				
				System.out.print("\n=============== OUTPUT ===============\n\n");
				
				// extract those digits
				int digit1 = userNumber / 100;
				int digit2 = (userNumber / 10) % 10;
				int digit3 = userNumber % 10;
				
				// Compare user digits
				if (lotteryNumber == userNumber) {
					System.out.println("Perfect match!: You win $10,000");
				} else if ((digit1 == lotteryDigit1 || digit1 == lotteryDigit2 || digit1 == lotteryDigit3) &&
						   (digit2 == lotteryDigit1 || digit2 == lotteryDigit2 || digit2 == lotteryDigit3) &&
						   (digit3 == lotteryDigit1 || digit3 == lotteryDigit2 || digit3 == lotteryDigit3)) {
					System.out.println("All digits match: You win $3,000");
				} else if ((digit1 == lotteryDigit1 || digit1 == lotteryDigit2 || digit1 == lotteryDigit3) ||
						   (digit2 == lotteryDigit1 || digit2 == lotteryDigit2 || digit2 == lotteryDigit3) ||
						   (digit3 == lotteryDigit1 || digit3 == lotteryDigit2 || digit3 == lotteryDigit3)) {
					System.out.println("One digit matches: You win $1,000");
				} else {
					System.out.println("Sorry, no match");
				}
			}
		
		
		
		System.out.println("Play again? (enter 'q' to quit, any other key to continue)");
		userChar = scnr.next().charAt(0);
		System.out.println("Lottery Number was: " + lotteryNumber);

		}
		System.out.println("Goodbye.");
		
		// close that scanner
		scnr.close();
	}
}

