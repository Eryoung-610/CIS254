/*
 Eric Young
 CIS254
 January 22th, 2019
 Professor Harden
 Assignment 3.1
 
This program is designed to replicate a bank account. Setting up private variables, deposit/withdraw functions in addition to the set/getName, getbalance methods are the initial steps to
creating this program. The deposit and withdraw functions have conditions to ensure that A) the deposit value is greater than 0, otherwise it would be withdrawing. B) Checking if the
withdraw value is lesser or equal than the balance, otherwise there would be an overdraw, in the event that this does occur, there is a statement stating that the withdraw amount
exceeds the current account balance
 */

public class main {
	private String name; //Instance variable
	private double balance;
	
	// Account constructor that receives two parameters
	public main(String name, double balance) {
		this.name = name; // Assign name to instance variable name


		// validate that the balance is greater than 0.0; if it's not,
		// instance variable balance keeps its default initial value of 0.0
		if (balance > 0.0) { // if the balance is valid
			this.balance = balance; // assign it to instance variable balance
		}
	}
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) { //if the depositAmount is valid
			balance = balance + depositAmount; //Add it to the balance
		}
	}
	
	public void withdraw (double withdrawAmount) {
		if (withdrawAmount <= balance)
			balance = balance - withdrawAmount;
		else
			System.out.println("WITHDRAWAL AMOUNT EXCEEDS ACCOUNT BALANCE");
	}
	
	//Method returns the account balance
	public double getBalance() {
		return balance;
	}
	
	//Method that sets the name
	public void setName(String name) {
		this.name = name;
	}

	//Method that returns the name
	public String getName() {
		return name;
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