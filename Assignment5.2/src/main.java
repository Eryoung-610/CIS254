/*
 Eric Young
 CIS254
 February 15th, 2019
 Professor Harden
 Assignment 5.2
 
 This program takes user input that asks for a numerical value of pounds which will be printed out in the equivalent of ounces.
 This is an edited program that has been implemented with a special value loop compared to a question loop, where the user is prompted to
 enter a negative number in order to stop the program. 
 */

import java.util.Scanner;


public class main {
	public static void main (String[]args) {
		int response = 0;
		int pounds = 0;
		Scanner input = new Scanner(System.in);
		String string;
		
		System.out.println("Is there a number you would like to convert?");
		string = input.next();
		
		while (string.equals("Y") || string.equals("y"))
		
			
		while (pounds >= 0) {
		System.out.print("Enter pounds : ");
		pounds = input.nextInt();
		
		
		int ounces = pounds * 16;
		System.out.println(pounds + " pounds is " + ounces + " ounces.");
		
		System.out.print("Enter pounds (Negative Number to Quit) : ");
		pounds = input.nextInt();
		}
	}
}

/*
Enter pounds : 
4
4 pounds is 64 ounces.
*/