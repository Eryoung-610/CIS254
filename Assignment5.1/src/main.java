/*
 Eric Young
 CIS254
 February 15th, 2019
 Professor Harden
 Assignment 5.1
 
 This program takes user input that asks for a numerical value of pounds which will be printed out in the equivalent of ounces.
 While this is an "improved" version of a previous assignment, this version has implemented a while loop that keeps prompting the user to enter a number
 if the user enters "Y" if they would like to enter another number. The loop is a question type loop compared to a special value loop.
 */

import java.util.Scanner;


public class main {
	public static void main (String[]args) {
		String response;
		int pounds = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Is there a number you would like to convert?");
		response = input.next();
		while (response.equals ("y") || response.equals("Y")) {
		System.out.println("Enter pounds : ");
		pounds = input.nextInt();
		
		
		int ounces = pounds * 16;
		System.out.println(pounds + " pounds is " + ounces + " ounces.");
		
		System.out.println("Would you like to enter another number ? (Y/N)");
		response = input.next();
		}
	}
}

/*
Enter pounds : 
4
4 pounds is 64 ounces.
*/