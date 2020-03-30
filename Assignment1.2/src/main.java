/*
 Eric Young
 CIS254
 January 14th, 2019
 Professor Harden
 Assignment 1.2
 
 This program takes user input that asks for a numerical value of pounds which will be printed out in the equivalent of ounces.
 */

import java.util.Scanner;

//Assignment 1.2

public class main {
	public static void main (String[]args) {
		int pounds = 0;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter pounds : ");
		pounds = input.nextInt();
		
		
		int ounces = pounds * 16;
		System.out.println(pounds + " pounds is " + ounces + " ounces.");
	}
}

/*
Enter pounds : 
4
4 pounds is 64 ounces.
*/