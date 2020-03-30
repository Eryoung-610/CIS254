/*
 Eric Young
 CIS254
 March 12th, 2019
 Professor Harden
 Assignment 7.1
 
This program creates an image of a Rocket. The rocket is composed of a "Cone", "Stages", and another Cone which makes the bottom. 
The Cone and stages methods are both included within the drawRocket method which creates the whole rocket image. The Stages method is composed of two methods,
drawHorizontalLine and draw2VerticalLines. The user is asked to input a height, width and stages to create the desired form of the rocket. 
 */

import java.util.Scanner;

public class Rocket {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int width;
		int height;
		int stages;

		System.out.print("Enter width: ");
		width = input.nextInt();
		System.out.print("Enter height: ");
		height = input.nextInt();
		System.out.print("Enter stages: ");
		stages = input.nextInt();

		drawRocket(width, height, stages);
	}

	//Combines all methods to create the rocket. 
	public static void drawRocket(int width, int height, int stages) {
		drawCone();
		/*drawHorizontalLine(width);
		draw2VerticalLines(width - 2, height - 2);
		drawHorizontalLine(width); */
		drawStages(width, height, stages);
		drawCone();
	}

	//Draws the top and bottom of the rocket, Upside down V shape from 3 sysOut statements
	public static void drawCone() {
		System.out.println("  *");
		System.out.println(" * *");
		System.out.println("*   *");
	}

	//Draws horizontal line depending on width
	public static void drawHorizontalLine(int numXs) {
		for (int count = 0; count < numXs; count++) {
			System.out.print("*");
		}
		System.out.println();
	}

	//Draws 2 vertical lines that meet with the width of the rocket, utilizes the drawOneRow method as well
	public static void draw2VerticalLines(int numSpaces, int numRows) {
		for (int rowCount = 0; rowCount < numRows; rowCount++) {
			drawOneRow(numSpaces);
		}
	}

	
	//Draws one row of *, using a for loop.
	public static void drawOneRow(int numSpaces) {
		System.out.print("*");
		for (int spaceCount = 0; spaceCount < numSpaces; spaceCount++) {
			System.out.print(" ");
		}
		System.out.println("*");
	}

	//Number of stages, (Rectangles of Rocket). Uses drawHorizontalLine, draw2VerticalLines, drawHorizontalLine methods.
	public static void drawStages(int width, int height, int stages) {
		for (int i = 0; i < stages; i++) {
			drawHorizontalLine(width);
			draw2VerticalLines(width - 2, height - 2);
			drawHorizontalLine(width);
		}
	}
	
}

/*
 
 OUTPUT
 
Enter width: 5
Enter height: 5
Enter stages: 2
  *
 * *
*   *
*****
*   *
*   *
*   *
*****
*****
*   *
*   *
*   *
*****
  *
 * *
*   *

*/