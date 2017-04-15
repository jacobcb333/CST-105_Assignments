/*
(Game: ATM machine) Use the Account class created in Programming Exercise 9.7
to simulate an ATM machine. Create ten accounts in an array with id 0, 1,...., 9,
and initial balance $100. The system prompts the user to enter an id. If the id
is entered incorrectly, ask the user to enter a correct id. Once an id is accepted,
the main menu is displayed as shown in the sample run. You can enter a choice
1 for viewing the current balance, 2 for withdrawing money, 3 for depositing
miney, and 4 for exiting the main menu. Once you exit, the system will prompt for
an id again. Thus, once the system starts, it will not stop.

 */

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem10_7 {
    public static void main(String[] args){
        //Creates accounts
        int[] accounts = {0,1,2,3,4,5,6,7,8,9};
        
        //Creates the default balances for all people
        double[] balance = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        
        //Will run the ATM forever
        boolean on = true;
        
        //Checks if the pin is correct
        boolean correctPin = false;
        
        //When user is done will print true
        boolean isDone = true;
        
        //Calls the account class
        Account account = new Account();
        
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        //Default ID that doesn't exist
        int id = 100000;
        
        //Will run the ATM forever
        do{
            //Will text if the user isDone each time, if the user was done
            //ask the next user for their ID
            if(isDone){
                System.out.print("Enter an id: ");
                id = input.nextInt();
                //Will change to isDone to false to run the do while loop
                isDone = false;
            }
            
            //Will check to make sure inputted ID is correct
            if(account.validAccount(id, accounts)){
                do{
                    //Calls to the Account class with mainMenu
                    account.mainMenu();
                    
                    int choice = input.nextInt();
                    if(choice == 1){
                        //account.checkBalance(balance);
                        balance[id] = account.checkBalance(balance[id]);
                        isDone = false;
                    }
                    else if(choice == 2){
                        //account.withdraw(id, balance);
                        balance[id] = account.withdraw(id, balance[id]);
                        isDone = false;
                    }
                    else if(choice == 3){
                        //account.deposit(id, balance);
                        balance[id] = account.deposit(id, balance[id]);
                        isDone = false;
                    }
                    else if(choice == 4){
                        isDone = true;
                    }
                    else{
                        System.out.println("You've made an invalid entry.");
                        isDone = false;
                    }
                    
                    System.out.println();
                //Will break this loop if the user wishes to exit with option 4
                }while(!isDone);   
            }
            //Checks for correct ID entered
            else{
                System.out.println("Wrong ID Entered.");
                correctPin = false;
                //isDone will be true to avoid an infinite loop
                isDone = true;
            }
        //Will never break
        }while(on);
    }
}

class Account{
    private int id;
    
    //No arg constructor
    public Account(){
    }
    
    //Will check if the account is vaid
    public boolean validAccount(int id, int[] accounts){
        for(int i = 0; i < accounts.length; i++){
            if(id == accounts[i]){
                return true;
            }
        }
        return false;
    }
    
    //Prints the main menu
    public void mainMenu(){
        System.out.print("1: check balance\n2: withdraw\n3: deposit\n4: exit"
                + "\nEnter a choice: ");
    }
    
    //checks user balance
    public double checkBalance(double balance){
        System.out.println("The balance is " + balance);
        return balance;
    }
    
    //withdraws from users balance only if user has available funds
    public double withdraw(int id, double balance){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ammount to withdraw: ");
        double ammount = input.nextDouble();
        if(balance >= ammount){
            balance = balance - ammount;
            return balance;
        }
        else{
            System.out.println("You don't have enough money to withdraw " + ammount);
            return balance;
        }
    }
    
    //deposits set ammount to the users balance
    public double deposit(int id, double balance){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ammount to deposit: ");
        double ammount = input.nextDouble();
        balance = balance + ammount;
        return balance;
    }
}
