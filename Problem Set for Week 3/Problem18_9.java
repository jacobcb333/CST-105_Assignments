/*
(Print the characters in a string reversely) Write a recursive method that
displays a string reversely on the console using the following header:

public static void reverseDisplay(String value)

For example reverseDisplay("abcd") displays dcba. Write a test program that
prompts the user to enter a string and displays its reversal.
 */
package programming.exercises.pkgfor.week.pkg2;

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem18_9 {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String value = input.nextLine();
        
        //Calls recursive method
        reverseDisplay(value);
    }
    
    
    public static void reverseDisplay(String value){
        String temp = "";
        
        //Ends recursive method
        if(value.length() <= 1){
            System.out.print(value);
        }
        //Invoked the method within itself to cause a recursive method
        //which outputs the reverse string
        else{
            reverseDisplay (value.substring(1, value.length()));
            System.out.print(value.substring(0, 1));
        }
    }
}
