/**
*Description: This program calculates the cost of a customer's bill.
*
*
*INPUT: Number of items customer purchases.
*	CONSTANTS: 
*		cost of a tv = 1200
*		cost of a vcr = 540
*		cost of a remote control = 63.20
*		cost of a cd player = 400
*		cost of a tape recorder = 350
*		sales tax = %8.25
*	User input:
*		number of tvs
*		number of vcrs
*		number of remote controls
*		number of cd players
*		number of tape recorders
*
*COMPUTATION:
*	Calculate the price of each item based on the amount the customer purchases
*	Calculate the amount paid in sales tax
*	Calculate the amount paid in all
*
*OUTPUT:
*	Total, tax total, and subtotal
*
*************************
*
*@author Blake Dee
*@contact: blake.dee@my.century.edu
*@since: 09/07/2025
*
*Course: CSCI 1082-01
*
*Institution: Century College
*
*Instructor: Mathew Nyamagwa
*/
package csci1082;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// initialize variables
		int tv;
		int vcr;
		int remoteController;
		int cdPlayer;
		int tapeRecorder;
		
		// constants
		final double TV_PRICE = 1200.00;
		final double VCR_PRICE = 540.00;
		final double REMOTE_CONTROLLER_PRICE = 63.20;
		final double CD_PLAYER_PRICE = 400.00;
		final double TAPE_RECORDER_PRICE = 350.00;
		final double TAX_RATE = 0.0825;
		
		// get input
		System.out.print("| ======== INPUT ======== |");
		System.out.println();
		
		System.out.print("TV (s) : ");
		tv = scnr.nextInt();
		
		System.out.print("VCR (s) : ");
		vcr = scnr.nextInt();
		
		System.out.print("Remote Controller (s) : ");
		remoteController = scnr.nextInt();
		
		System.out.print("CD Player (s) : ");
		cdPlayer = scnr.nextInt();
		
		System.out.print("Tape Recorder (s) : ");
		tapeRecorder = scnr.nextInt();
		
		scnr.close();
		
		// equations
		double totalTv = tv * TV_PRICE;
		double totalVcr = vcr * VCR_PRICE;
		double totalRemote = remoteController * REMOTE_CONTROLLER_PRICE;
		double totalCd = cdPlayer * CD_PLAYER_PRICE;
		double totalRecorder = tapeRecorder * TAPE_RECORDER_PRICE;
		double subtotal = totalTv + totalVcr + totalRemote + totalCd + totalRecorder;
		double taxTotal = subtotal * TAX_RATE;
		double total = subtotal +taxTotal;
		
		// DecimalFormat for currency
        DecimalFormat df = new DecimalFormat("#,###.00");

        // output
        System.out.println("| ======== CUSTOMER BILL ======== |");
        System.out.printf("%-5s %-20s %12s %15s\n", "QTY", "DESCRIPTION", "UNIT PRICE", "TOTAL PRICE");
        System.out.println("-----------------------------------------------------------------------");

        System.out.printf("%-5d %-20s %12s %15s\n", tv, "TV", df.format(TV_PRICE), df.format(totalTv));
        System.out.printf("%-5d %-20s %12s %15s\n", vcr, "VCR", df.format(VCR_PRICE), df.format(totalVcr));
        System.out.printf("%-5d %-20s %12s %15s\n", remoteController, "REMOTE CONTROLLER", df.format(REMOTE_CONTROLLER_PRICE), df.format(totalRemote));
        System.out.printf("%-5d %-20s %12s %15s\n", cdPlayer, "CD PLAYER", df.format(CD_PLAYER_PRICE), df.format(totalCd));
        System.out.printf("%-5d %-20s %12s %15s\n", tapeRecorder, "TAPE RECORDER", df.format(TAPE_RECORDER_PRICE), df.format(totalRecorder));

        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%40s %14s%n", "SUBTOTAL:", df.format(subtotal));
        System.out.printf("%40s %14s%n", "TAX (8.25%):", df.format(taxTotal));
        System.out.printf("%40s %14s%n", "TOTAL:", df.format(total));
	}

}
