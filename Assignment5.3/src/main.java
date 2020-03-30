/*
 Eric Young
 CIS254
 February 15th, 2019
 Professor Harden
 Assignment 5.3
 
 This program prompts a user to enter the age and a food preference of an attendee to a theoretical movie theater. The user enters as many attendee ages and food preferences
 until the inputed age is a negative number, which is designated to be the total amount of attendees. The output is statistical information in regards to the food preferences
 and age groupings, youngest age, oldest age, and the average age of all individuals entered. Several conditions with increments are utilized to get such information, a special value loop
 is used in order to stop the prompts.

 */

import java.util.Scanner;

public class main {
	public static void main (String [] args) {
		int age = 0;
		int total = 0;
		int count = 0;
		int youngest = 500;
		int oldest = 0;
		int popcorn = 0, soda = 0, both = 0;
		int groupA = 0, groupB = 0, groupC = 0, groupD = 0, groupE = 0;
		String food;
		
		Scanner input = new Scanner (System.in);
		
		while (age >= 0) {
			total = total + age;
			System.out.print("Enter age of attendee (Negative number to quit) : ");
			age = input.nextInt();
			count++;
		
		if (age < 0)
			break;
		
		if (count == 0){
             System.out.println("There is no average, because you did not "    
                  + "enter any numbers!");
         }
		
		if (youngest > age && age > 0) 
			 youngest = age;
		 
		if (oldest < age && age > 0) 
			 oldest = age;
		 
		if (age >= 0 && age <=18) 
			 groupA++;

		 else if (age > 19 && age <=30) 
			 groupB++;

		 else if (age > 31 && age <= 40) 
			 groupC++;
		
		 else if (age > 41 && age <= 60) 
			 groupD++;
		 
		 else if (age > 60) 
			 groupE++;
		 
		System.out.print("Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : ");
		food = input.next();
		
		if (food.equals("p") || food.equals("P"))
			popcorn++;
		else if (food.equals("S") || food.equals("s"))
			soda++;
		else
			both++;
		
		}
		
		System.out.println("\nAge 0 to 18 : "  + groupA);
		System.out.println("Age 19 to 30 : "  + groupB);
		System.out.println("Age 31 to 40 : " + groupC);
		System.out.println("Age 41 to 60 : " + groupD);
		System.out.println("Over 60 : " + groupE +"\n");
		
		
		System.out.println("Food preference popcorn: " + popcorn);
		System.out.println("Food preference soda : " + soda);
		System.out.println("Food preference both : " + both);
		System.out.println("The average age of attendees is : " + (total -1)/(count -1));
		System.out.println("The youngest person in attendance was : " + youngest);
		System.out.println("The oldest person in attendance was : " + oldest);
		
	}
}

/*
 OUTPUT
 
Enter age of attendee (Negative number to quit) : 34
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : s
Enter age of attendee (Negative number to quit) : 16
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : b
Enter age of attendee (Negative number to quit) : 68
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : b
Enter age of attendee (Negative number to quit) : 53
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : s
Enter age of attendee (Negative number to quit) : 39
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : p
Enter age of attendee (Negative number to quit) : 23
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : s
Enter age of attendee (Negative number to quit) : 21
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : s
Enter age of attendee (Negative number to quit) : -1

Age 0 to 18 : 1
Age 19 to 30 : 2
Age 31 to 40 : 2
Age 41 to 60 : 1
Over 60 : 1

Food preference popcorn: 1
Food preference soda : 4
Food preference both : 2
The average age of attendees is : 36
The youngest person in attendance was : 16
The oldest person in attendance was : 68

 */
	

