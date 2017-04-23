/*
(New Account class) An Account class was specified in Programming Exercise 9.7.
Design a new Account class as follows:

*Add a new data field name of the String type to store the name of the customer.
*Add a new constructor that constructs an account with the specified name, id, 
and balance.
*Add a new data field named transactions whose type is ArrayList that stores the
transaction for the accounts. Each transaction is an instance of the Transaction 
class. The Transaction class is defined as shown in Figure 11.6.
*Modify the withdraw and deposit methods to add a transaction to the transactions
array list.
*All other properties and methods are the same as in Programming Exercise 9.7.

Write a test program that creates an Account with annual interest rate. 1.5%,
balance 1000, id 1122, and named George. Deposit $30, $40, and $50 to the
account and withdraw $5, $4, and $2 from the account. Print an account summary
that shows account holder name, interest rate, balanace, and all transactions.
 */
package Problem14;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem11_08 {
    public static void main(String[] args){
        Account account = new Account("George", 1122, 1000);
        account.setAnnualInterestRate(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);
        System.out.println(account);
    }
}
