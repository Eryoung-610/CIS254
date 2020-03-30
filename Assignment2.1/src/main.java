/*
 Eric Young
 CIS254
 January 22th, 2019
 Professor Harden
 Assignment 2.1
 
This program gathers user input by asking for a numerical value of cents(Not in decimals), and then returns a combination of coins that make up that user input value.
Gathering the user input and declaring the variable of cents is the first step in this program. Then each coin variable (quarters,dimes,nickels,pennies) would either divide or
utilize the mod function to keep separating each coin. With the mathematical operations completed, the output will be returned in a list and given the total amount of each coin
that would be represented.
 */

import java.util.Scanner;

public class main {
	public static void main (String []args) {
		
		int cents = 0;
	
		
		Scanner input = new Scanner(System.in);
				
		
		System.out.print("Enter number of cents : ");
		cents = input.nextInt();
		
		
		
		int quarters = (cents/25);
		cents = cents % 25;
		int dimes = (cents / 10) % 10;
		cents = cents % 10;
		int nickels = (cents % 10) / 5;
		cents = cents % 5;
		int pennies = (cents%5);
		
		
		
		System.out.println("Pennies : " + pennies);
		System.out.println("Nickels : " + nickels);
		System.out.println("Dimes : " + dimes);
		System.out.println("Quarters : " + quarters);
		
	}
}


/*
OUTPUT

Enter number of cents : 119
Pennies : 4
Nickels : 1
Dimes : 1
Quarters : 4



*/