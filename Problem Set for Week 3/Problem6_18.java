/*
(check password) Some websites impose certain rules for passwords. Write a method
that checks whether a string is a valid password. Suppose the password rules are
as follows:

A password must have at least eight characters.
A password consists of only letters and digits.
A password must contain at least two digits.

Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or invalid Password otherwise.
 */
package programming.exercises.pkgfor.week.pkg2;

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem6_18 {
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        
        //Uses boolean checkPassword method to see if its valid or invalid
        if(checkPassword(password)){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }
    
    public static boolean checkPassword(String password){
        //Create the 3 test condition booleans and a final result boolean
        boolean isValid = false;
        boolean hasNumbers = false;
        boolean hasLetAndDig = false;
        boolean result = false;
        //Number for number iterator when testing the third condition
        int number = 0;
        
        //If statement to test if the password is at least eight characters
        if(password.length() >= 8){
            isValid = true;
        }
        else{
            isValid = false;
        }
        //Iterated through the password usign a for loop
        for(int i = 0; i < password.length(); i++){
            //Tests to see if the password at least contains two numbers
            if(password.charAt(i) == '0' || password.charAt(i) == '1' ||
            password.charAt(i) == '2' || password.charAt(i) == '3' ||
            password.charAt(i) == '4' || password.charAt(i) == '5' ||
            password.charAt(i) == '6' || password.charAt(i) == '7' ||
            password.charAt(i) == '8' || password.charAt(i) == '9'){
                number++;
            }
            if(number >= 2){
                hasNumbers = true;
            }
            else{
                hasNumbers = false;
            }
            //Tests to make sure the password only has numbers and letters.
            //Uses ASCII codes
            if((password.charAt(i) >= 48 && password.charAt(i) <= 57) ||
                    (password.charAt(i) >= 65 && password.charAt(i) <= 90) ||
                    (password.charAt(i) >= 97 && password.charAt(i) <= 122)){
                hasLetAndDig = true;
            }
            else{
                hasLetAndDig = false;
            }
        }
        
        //If all conditions are true, returns true else will return false
        if(isValid && hasNumbers && hasLetAndDig){
            result = true;
            return result;
        }
        else{
            return result;
        }
    }
}
