import java.util.*;

/*
 * (The Account class) Design a class named Account that contains:
 * 
 * *A private int data field named id for the account (default 0).
 * *A private double data field named balance for the account (default 0).
 * *A private double data field named annualInterestRate that stores the current
 * interest rate (default 0). Assume all account have the same interest rate.
 * *A private Date data field named dateCreated that stores the date when the account
 * was created.
 * *A no-arg constructor that creates a default account.
 * *A constructor that creates an account with the specified id, balance, and annualInterestRate.
 * *The accessor method for dateCreated.
 * *A method named getMonthlyInterestRate() that returns the monthly interest rate.
 * *A method named getMonthlyInterest() that returns the monthly interest.
 * *A method named withdraw that withdraws a specified amount from the account.
 * *A method deposit that deposits a specified amount to the account.
 * 
 * Draw the UML diagram for the class and then implement the class. (Hint: the method
 * getMonthlyInterest() is to return monthly interet, not the interest rate. Monthly
 * interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12.
 * Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.)
 * 
 * Write a test program that creates an Account object with an account ID of 1122, a balance of
 * $20,000, and an annual interest rate of 4.5%. Use the withdraw method to withdraw $2,500,
 * use the deposit method to deposit $3,000, and print the balance, the monthly interest, and the
 * date when the account was created.
 */

public class Problem9_7 {
	public static void main(String[] args){
		//Creates the object account1 of the class Account and initializes it with the 
		//Account number, balance, and interest rate.
		Account account1 = new Account(1122, 20000, 4.5);
		
		//Performs the accounts withdraws and deposits.
		account1.withdraw(2500);
		account1.deposit(3000);
		
		//Outputs the changes to the users account and the monthly interest along with the date
		//created.
		System.out.println("For the account " + account1.getId() + " the current balance is " +
				account1.getBalance() + " after a withdraw of $2500" + "\nand a deposit of $3000"
				+  " the monthly interest is " + account1.getMonthlyInterest() + 
				" and the account was created on \n" + account1.getDateCreated());
	}
}

//Creates an Account class
class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account(){
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	
	//Changes the values of id, balance, and annualInterestRate in this instance
	public Account(int getId, int getBalance, double getAnnualInterestRate){
		this.id = getId;
		this.balance = getBalance;
		this.annualInterestRate = getAnnualInterestRate;
	}
	
	//Use get methods to access private variables
	public int getId(){
		return id;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return ((this.annualInterestRate / 12) / 100);
	}
	
	public double getMonthlyInterest(){
		return this.balance * getMonthlyInterestRate();
	}
	
	//Method to withdraw funds.
	public double withdraw(double withdrawAmmount){
		this.balance = this.balance - withdrawAmmount;
		return this.balance - withdrawAmmount;
	}
	
	//Method to deposit.
	public double deposit(double depositAmmount){
		this.balance = this.balance + depositAmmount;
		return this.balance + depositAmmount;
	}
	
	//Method to get current balanace.
	public double getBalance(){
		return balance;
	}
}
