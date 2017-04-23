/*
(Subclasses of Account) In Programming Exercise 9.7, the Account class was defined
to model a bank account. An account has the properties account number, balance,
annual interest rate, and date created, and methods to deposit and withdraw
funds. Create two subclasses for checking and savings accounts. A checking
account has an overdraft limit, but a savings account cannot be overdrawn.

Draw the UML diagram for the classes and then implement them. Write a test 
program that creates object of Account, SavingsAccount, and ChecckingAccount
and onvikes their toString() methods.
 */
package Problem14;

import Problem14.CheckingAccount;
import Problem14.Account;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem11_3 {
     public static void main(String[] args){

            Account account = new Account(111, 200);
            CheckingAccount checkingAccount = new CheckingAccount(112, 250);
            SavingsAccount savingsAccount = new SavingsAccount(113, 300);

            System.out.println(account);
            System.out.println(checkingAccount);
            System.out.println(savingsAccount);
        }
}
