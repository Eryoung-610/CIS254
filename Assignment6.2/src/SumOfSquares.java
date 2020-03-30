/*
 Eric Young
 CIS254
 February 21st, 2019
 Professor Harden
 Assignment 6.2
 
This program is used to determine the sum of squares from 1 to a user entered number. This program utilizes a special value loop that terminates if the user
enters a number less than 1. The loop will keep iterating until the entered number is reached and the total will be returned as the sum of squares.

 */

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int value = 1;
		int sum = 0;
		
		while (value > 0) {
			System.out.print("Enter a number greater than 0 (Less than 1 to quit) : ");
			value = input.nextInt();
			sum = 0;
			
			if (value <= 0)
				break;
			
			for (int i = 1; i<=value;i++) {
				sum = sum + i*i;
			}
			System.out.println("The sum of the squares from 1 to " + value + " is " + sum);
			
			
		}
		

	}

}

/*
OUTPUT

Enter a number greater than 0 (Less than 1 to quit) : 4
The sum of the squares from 1 to 4 is 30
Enter a number greater than 0 (Less than 1 to quit) : 1
The sum of the squares from 1 to 1 is 1
Enter a number greater than 0 (Less than 1 to quit) : 0


*/