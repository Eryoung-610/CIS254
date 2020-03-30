/*
 Eric Young
 CIS254
 February 5th, 2019
 Professor Harden
 Assignment 4.3
 
This program is designed to be a simple version of a calculator with four mathematical operations (Addition, Subtraction, Multiplication, Division).
The user is prompted to enter two numbers then select an operation that will return the answer. This version of the program utilizes a switch-case with the cases
representing each mathematical operation. Each statement corresponds to it's operator sign whether it be adding, subtracting, etc.
 */

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
		double answer = 0;
		Scanner input = new Scanner (System.in);
				
		System.out.println("Please Enter the first number");
		double firstNum = input.nextInt();
		
		System.out.println("Please Enter the second number");
		double secNum = input.nextInt();
		
		System.out.println("Please select an option(+,-,x,/) \n1.+\n2.-\n3.x\n4./");
		String selection = input.next();
		
		switch (selection) {
		case "+": answer = firstNum + secNum;
			System.out.println(firstNum +  " + " + secNum +  " = " + answer );
			break;
		case "-": answer = firstNum - secNum;
			System.out.println(firstNum + " - " + secNum + " = " + answer);
			break;
		case "x": answer = firstNum * secNum;
			System.out.println(firstNum + " * " + secNum + " = " + answer);
			break;
		case "/": answer = firstNum / secNum;
			System.out.println(firstNum + " / " + secNum + " = " + answer);
			break;
		}
	}

}


/*Output
Please Enter the first number
6
Please Enter the second number
8
Please select an option(+,-,x,/) 
1.+
2.-
3.x
4./
x
6.0 * 8.0 = 48.0
*/