
/*
 Eric Young
 CIS254
 April 7th, 2019
 Professor Harden
 Assignment 8.1
 
This program utilizes an array that stores integers up to a possible 1000 total elements. The elements entered will be from user input and incorporates a special value loop that will end when a number
less than 0 is entered within the array. 

 */

import java.util.Scanner;

public class Assignment8 {
	static int x = 0;
	private static int iArray[] = new int[1000];

	// Method utilizes a for loop that will check if the entry in the array is equal
	// to the value entered.
	public static boolean isInArray(int val) {
		for (int i = 0; i < x; i++) {
			if (iArray[i] == val)
				return true;
		}
		return false;
	}

	// This method checks if there are multiple integers entered(ex. 1, 1) and will
	// only evaluate to only one of those digits.
	public static void processVal(int val) {

		if (val < 0) {
		} else {
			if (isInArray(val))
				;
			else {
				iArray[x++] = val;
			}
		}
	}

	/*
	 * Loop to take in the input, checks if value is positive and if the total
	 * amount of inputs are within 1000. Utilizes the processval method to check if
	 * there are multiple entries of the same number.
	 */
	public static void readInt() {
		int val;
		int count = 1;
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Enter a non-negative integer (negative to quit) : ");
			val = in.nextInt();
			in.nextLine();
			processVal(val);
			count++;
		} while (val > 0 && count != 1000);

	}

	// After the user enters a negative number to stop the loop, this method
	// displays the results which also includes the non repeated entries.
	static void display() {
		System.out.print("You entered : ");
		for (int i = 0; i < x; i++) {
			System.out.print(iArray[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		readInt();
		display();
	}
}


/*OUTPUT
 * 
Enter a non-negative integer (negative to quit) : 1
Enter a non-negative integer (negative to quit) : 2
Enter a non-negative integer (negative to quit) : 3
Enter a non-negative integer (negative to quit) : 2
Enter a non-negative integer (negative to quit) : 1
Enter a non-negative integer (negative to quit) : 6
Enter a non-negative integer (negative to quit) : 3
Enter a non-negative integer (negative to quit) : 4
Enter a non-negative integer (negative to quit) : 5
Enter a non-negative integer (negative to quit) : 2
Enter a non-negative integer (negative to quit) : -4
You entered : 1 2 3 6 4 5 

 */
