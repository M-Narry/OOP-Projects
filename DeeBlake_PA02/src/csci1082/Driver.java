/**
*Description: This program calculates the amount of Newtons given weight in kilograms
*
*
*INPUT: 
*	CONSTANTS: 
*		Gravity = 9.80
*	User input:
*		Weight in kilograms.
*
*COMPUTATION:
*	Calculate the amount of Newtons from Kilograms.
*
*OUTPUT:
*	Weight in Newtons
*
*************************
*
*@author Blake Dee
*@contact: blake.dee@my.century.edu
*@since: 09/14/2025
*
*Course: CSCI 1082-01
*
*Institution: Century College
*
*Instructor: Mathew Nyamagwa
*/
package csci1082;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Driver {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//variables
		double kilograms;
		final double GRAVITY = 9.80;
		
		System.out.printf("Kilogram to newton calculator \n"+
				"Please enter a weight in kg:  \n");
		kilograms = scnr.nextDouble();
		
		//conversion equation
		double newtons = kilograms * GRAVITY;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		// else-if structure
		if (newtons < 10) 
			{System.out.print("Object is too light");
		} else if (newtons > 1000) 
			{System.out.print("Object is too heavy!");
		} else {System.out.print(df.format(newtons) + " Newtons\n");
		}
		
		scnr.close();
	}

}
