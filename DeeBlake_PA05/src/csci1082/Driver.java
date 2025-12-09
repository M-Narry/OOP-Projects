/**
 * Description: This program locates the largest value of a user generated 2-dimensional array
 * 
 * Input:
 * 		User input: size of array
 * 					array elements
 * Computation:
 * 		Largest value
 * 		Locate largest value
 * 
 * Output:
 * 	Largest value as well as the location of the value.
 * 
 * *************************************
 * 
 * @author Blake Dee
 * @contact: blake.dee@my.century.edu
 * @since: 10/19/2025
 * 
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
		int arraySize1;
		int arraySize2;
		double largestValue = 0;
		int largestRow = 0;
		int largestCol = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("This program locates the largest value of a 2-dimensional array.\n\n");
		System.out.println("======INPUT======");
		System.out.print("Enter the number of rows and columns of the array: ");
		
		//Obtains array size
		arraySize1 = scnr.nextInt();
		arraySize2 = scnr.nextInt();
		
		//Creates array
		double array[][] = new double[arraySize1][arraySize2];
		
		System.out.println("Enter the array:");
		
		//Obtains values for the array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = scnr.nextDouble();
			}
		}
		
		//Checks for largest value and location
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > largestValue) {
					largestValue = array[i][j];
					largestRow = i;
					largestCol = j;
					
				}
			}
		}
		
		System.out.println("======OUTPUT======");
		System.out.printf("%-15s %.2f\n", "Largest Value:", largestValue);
		System.out.printf("%-15s [%d, %d]\n", "Location:", largestRow, largestCol);
		
		
		scnr.close();

	}

}
