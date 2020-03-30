/*
 Eric Young
 CIS254
 February 5th, 2019
 Professor Harden
 Assignment 4.4
 
This program is a scenario based in which the timing of a phone call, the call duration are the variables that will be manipulated. To fit the criteria to make this program
working as intended took a bit of working out. Creating a condition to verify that the time falls between the 0000-2400 hour clock seemed to be in order, despite it not
being a condition that needed to be met for this program. The conditions for the start time and call length for the calls were met with the use of if-else statements.

 */

import java.util.Scanner;

public class Calls {

	public static void main (String[]args) {
		int callLength = 0;
		int startTime = 0;
		double callRate = 0;
		double pricePerMin = .4;
		double callDurationRate = 0;
		
		Scanner start = new Scanner (System.in);
		
		System.out.print("Enter Start Time (24 Hour Clock) : ");
		startTime = start.nextInt();
				
		if (startTime >= 2400) {
			System.out.println("Please enter a valid time");
			return;
		}
		
		System.out.print("Enter Length of Call in Minutes : ");
		callLength = start.nextInt();
		
		double GrossCost = callLength * pricePerMin;
		double NetCost;
		
		if (startTime >= 800 && startTime < 1800) {
			callRate = 0;
		}
		else
			callRate = .5;
		
		if (callLength > 60) {
			callDurationRate = .15;
		}
		else
			callDurationRate = 0;
		
		NetCost = GrossCost * (1-callRate) * (1 - callDurationRate) * (1.04);
		
		System.out.println("Gross Cost : $" + GrossCost);
		
		
		System.out.println("Net Cost : $" + NetCost);
	}
}

/*Output
Enter Start Time (24 Hour Clock) : 2322
Enter Length of Call in Minutes : 67
Gross Cost : $26.8
Net Cost : $11.85

Enter Start Time (24 Hour Clock) : 759
Enter Length of Call in Minutes : 10
Gross Cost : $4.0
Net Cost : $2.08

Enter Start Time (24 Hour Clock) : 1300
Enter Length of Call in Minutes : 100
Gross Cost : $40.0
Net Cost : $35.36

Enter Start Time (24 Hour Clock) : 1300
Enter Length of Call in Minutes : 10
Gross Cost : $4.0
Net Cost : $4.16


*/