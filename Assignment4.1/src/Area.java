/*
 Eric Young
 CIS254
 February 5th, 2019
 Professor Harden
 Assignment 4.1 
 
This program is designed to return the area of a square or a triangle. The user will be prompted to enter whether the shape is a square or triangle, then prompted to enter in the necessary information to determine the area,
whether that be the length of a side of a square, or the base and height of a triangle. The usage of "If" statements is vital in this program as it sets up all the conditions and statements in order for this program to
work as intended.
 */

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		String shape;
		int base = 0;
		int height = 0;
		double area = 0;
		int sarea = 0;
		int side = 0;
		Scanner selection = new Scanner(System.in);	


		System.out.print("Enter the type of figure (s or t) : ");
		shape = selection.next();
		
		if (shape.equals("s")) {
			System.out.print("Enter the length of a side : ");
			side = selection.nextInt();
			sarea = side * side;
			System.out.println("The area is " + sarea);
		
			
		}
		
		if (shape.equals("t")) {
			System.out.print("Enter the base : ");
			base = selection.nextInt();
			System.out.print("Enter the height : ");
			height = selection.nextInt();
			area = (.5 * base * height);
			System.out.println("The area is " + area);
		}
	}

}

/*Outputs
Enter the type of figure (s or t) : t
Enter the base : 4
Enter the height : 3
The area is 6.0

Enter the type of figure (s or t) : s
Enter the length of a side : 9
The area is 81


*/