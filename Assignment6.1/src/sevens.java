/*
 Eric Young
 CIS254
 February 21st, 2019
 Professor Harden
 Assignment 6.1
 
This program's purpose is to prompt a user to enter a total amount of numbers that will be entered, then the user will be able to enter a number until the total is reached.
If there is a 7 that is entered, the program will return the first and last position of a 7. If there is only one 7 entered, the first and last position will be the same.
If there are no 7's entered, the output will say that there were no 7's entered. A for loop is vital as it prompts the user to enter a number over and over until the total number is reached. 

 */

import java.util.Scanner;

public class sevens {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int total,number,first = 0,last = 0;

		
		System.out.print("How many numbers will be entered ? : ");
		total = input.nextInt();
		
		for (int i = 1; i <= total; i++) {
			System.out.print("Enter num : ");
			number = input.nextInt();
			
			if (number == 7) {
					if(first == 0) {
						first = i;
					}
					last = i;
					
			}
				
		}
		
		if (first != 0 && last != 0) {
			System.out.println("The first 7 was in position " + first);
			System.out.println("The last 7 was in position " + last);
		}
		else
		{
			System.out.println("Sorry, no 7's were entered");
		}
		
	}

}


/*
OUTPUTS

How many numbers will be entered? 8    
Enter num: 5
Enter num: 7
Enter num: 6
Enter num: 7
Enter num: 7
Enter num: 3
Enter num: 8
Enter num: 6
The first 7 was in position 2    
The last 7 was in position 5

How many numbers will be entered? 8    
Enter num: 5
Enter num: 2
Enter num: 6
Enter num: 7
Enter num: 1
Enter num: 3
Enter num: 8
Enter num: 6
The first 7 was in position 4    
The last 7 was in position 4

How many numbers will be entered ? : 8
Enter num : 5
Enter num : 1
Enter num : 6
Enter num : 5
Enter num : 9
Enter num : 3
Enter num : 8
Enter num : 6
Sorry, no 7's were entered

*/