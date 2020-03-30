/*
 Eric Young
 CIS254
 January 22th, 2019
 Professor Harden
 Assignment 2.2
 
This program of temperature conversion (From Celsius to Fahrenheit) will ask the user for a given degree in celsius which will then be converted to the equivalent degree in
Fahrenheit. In order to create this program, initializing the variable of celsius and implementing a scanner would be the first step. Using the given formula for celsius to fahrenheit,
((9/5) * degrees of celsius) + 32, altering the return value instead of it being an integer, changing it to a double returns the correct value, as integer 9/5 only returns 1.
 */

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		int celsius = 0;
		
		System.out.print("Enter degrees celsius : ");
		Scanner input = new Scanner(System.in);
		
		celsius = input.nextInt();
		double fahrenheit = (((double)9/5) * celsius) + 32;
		
		System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
		
	}

}

/*
OUTPUT
Enter degrees celsius : 30
30 degrees Celsius is 86.0 degrees Fahrenheit.


*/