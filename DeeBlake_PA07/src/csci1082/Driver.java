/**
 * Description: This program recursively finds the highest number in an array of 7 given user input.
 * 
 * Input: 
 * 		User Input: Array integers
 * 		Constants: Array size
 * 
 * Computation: The largest number in the array
 * 
 * Output: The largest value in the array
 * 
 * ***************************
 * 
 * @author Blake Dee
 * @contact blake.dee@my.century.edu
 * @since 11/02/2025
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
		final int SIZE = 7;
		int[] array = new int [SIZE];
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("This program recursively finds the highest number in an array of 7);");
		System.out.println("==============INPUT=============");
		System.out.println("Enter a series of seven (7) integers: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		int largest = findLargest(array, SIZE);
		
		System.out.println("Recurstive: ");
		System.out.printf("%20s%d", "Largest value: ", largest);

		
		input.close();
	}
		
		public static int findLargest(int[] array, int n) {
			if (n == 1) {
				return array[0];
			}
			
			int max = findLargest(array, n - 1);
			
			if (array[n-1] > max) {
				return array[n - 1];
			} else {
				return max;
			}
		
		}
		}
