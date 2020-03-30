/*
 Eric Young
 CIS254
 February 5th, 2019
 Professor Harden
 Assignment 4.2
 
This program is designed to return a type of education when prompting the user to enter an amount of years of schooling. This program highlights the basics of utilizing
if statements and understanding how the condition-statements work. In addition to the conditions, the usage of operators is also a key part of this program as it checks if
the given value of years falls between certain values that correspond to the type of schooling the user has.
 */


import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int years = 0;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter the amount of years of schooling");
		years = input.nextInt();
		
		if (years <= 0) {
			System.out.println("None");
		}
		if (years >= 1 && years <= 6) {
			System.out.println("Elemetary School");
		}
		if (years >= 7 && years <= 8) {
			System.out.println("Middle School");
		}
		if (years >= 9 && years <= 12) {
			System.out.println("High School");
		}
		if (years >= 12) {
			System.out.println("College");
		}
		
	}

}

/* Output
 Please enter the amount of years of schooling
14
College

 
 */ 
