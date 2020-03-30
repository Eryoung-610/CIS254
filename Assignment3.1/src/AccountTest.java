/*
 Eric Young
 CIS254
 January 22th, 2019
 Professor Harden
 Assignment 3.1
 
Using the initial program outline from the etext, a withdrawal function was to be implemented to the program. Setting up an account was the first step as that is the object that will be manipulated.
Then utilizing setters/getters, the user is able to "deposit" or "withdraw" money into or out of the bank account under the example names of "Jane Green" and "John Blue". Each account will be manipulated
one at a time and will display the current balance after the account has been altered with. This procedure continues until there are no more bank accounts left to change.
 */

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		main account1 = new main("Jane Green", 0.00);
		main account2 = new main("John Blue", 0.00);

		//Display initial balance of each object
		System.out.printf("%s balance : $%.2f%n",
			account1.getName(), account1.getBalance());
		System.out.printf("%s balance : $%.2f%n%n",
			account2.getName(), account2.getBalance());
		
		// create a scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		//Set up deposit amount for account1
		System.out.print("Enter Deposit amount for account1 :"); //Prompt
		double depositAmount = input.nextDouble();//Obtain user input
		System.out.printf("%nadding %.2f to account1 balance %n%n",
			depositAmount);
		account1.deposit(depositAmount); //Add to account1's balance
		
		//Display balance
		System.out.printf("%s balance: $%.2f%n",
			account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
			account2.getName(),account2.getBalance());
		
		//Set up deposit amount for account2
		System.out.print("Enter Deposit amount for account2 :"); //Prompt
		depositAmount = input.nextDouble();//Obtain user input
		System.out.printf("%nadding %.2f to account1 balance %n%n",
			depositAmount);
		account2.deposit(depositAmount); //Add to account2's balance
		
		//Display balance
		System.out.printf("%s balance: $%.2f%n",
			account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
			account2.getName(),account2.getBalance());
		
		//Set up withdrawal amount for account1
		System.out.print("Enter Withdrawal amount for account1 :"); //Prompt
		double withdrawalAmount = input.nextDouble(); //Obtain user input
		System.out.printf("%n withdrawing %.2f to account1 balance %n%n",
				withdrawalAmount);
		account1.withdraw(withdrawalAmount);
		
		//Display balance
		System.out.printf("%s balance: $%.2f%n",
			account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
			account2.getName(),account2.getBalance());
		
		//Set up withdrawal amount for account2
		System.out.print("Enter Withdrawal amount for account2 :"); //Prompt
		withdrawalAmount = input.nextDouble(); //Obtain user input
		System.out.printf("%n withdrawing %.2f to account2 balance %n%n",
				withdrawalAmount);
		account2.withdraw(withdrawalAmount);
		
		//Display balance
		System.out.printf("%s balance: $%.2f%n",
			account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
			account2.getName(),account2.getBalance());
	}

}

/*
OUTPUT

Jane Green balance : $0.00
John Blue balance : $0.00

Enter Deposit amount for account1 :10

adding 10.00 to account1 balance 

Jane Green balance: $10.00
John Blue balance: $0.00

Enter Deposit amount for account2 :15

adding 15.00 to account1 balance 

Jane Green balance: $10.00
John Blue balance: $15.00

Enter Withdrawal amount for account1 :5

 withdrawing 5.00 to account1 balance 

Jane Green balance: $5.00
John Blue balance: $15.00

Enter Withdrawal amount for account2 :5

 withdrawing 5.00 to account2 balance 

Jane Green balance: $5.00
John Blue balance: $10.00


*/