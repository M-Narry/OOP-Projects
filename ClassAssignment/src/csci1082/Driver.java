package csci1082;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int unitsPurchased;
		double userDiscount = 0;
		final int RETAIL_PRICE = 99;
		
		System.out.println("This program determines discount precentage based on software packages purchased.");
		System.out.print("Please enter number of units purchased: ");
		unitsPurchased = scnr.nextInt();
		
		double price = unitsPurchased * RETAIL_PRICE;
		
		if (unitsPurchased <= 0) {System.out.print("No items purchased");
		}
		else if((unitsPurchased > 0) && (unitsPurchased <= 9)) {System.out.println(price);
		} else if ((unitsPurchased >= 10) && (unitsPurchased <= 19)) 
		{userDiscount = price - (price * 0.20);
		System.out.printf("$" + userDiscount);
		} else if ((unitsPurchased >= 20) && (unitsPurchased <= 49)) 
		{userDiscount = price - (price * 0.30);
		System.out.printf("$" + userDiscount);
		} else if ((unitsPurchased >= 50) && (unitsPurchased <= 99)) 
		{userDiscount = price - (price * 0.40);
		System.out.printf("$" + userDiscount);
		} else {userDiscount = price - (price * 0.50);
		System.out.printf("$" + userDiscount);
		}
		scnr.close();
		}
	}