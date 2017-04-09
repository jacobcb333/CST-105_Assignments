/*
(Decimal to hex) Write a program that prompts the user to enter an integer 
between 0 and 15 and displays its corresponding hex number. 
 */
package programming.exercises.pkgfor.week.pkg2;
import java.util.*;
/**
 *
 * @author jacobbushdiecker
 */
public class Problem4_11 {
    public static void main(String[] args){
        //Create a scanner
        Scanner input = new Scanner(System.in);
        char ch;
        
        System.out.print("Enter a decimal value (0 to 15): ");
        int userInput = input.nextInt();
        
        //Ensures the user entered an accepted value
        if(userInput >= 0 && userInput <= 15){
            //0 to 9 to hex is the same
            if(userInput >= 0 && userInput <= 9){
                System.out.println("The hex value is " + userInput);
            }
            //Converts 10-15 to respective hex value
            else if(userInput >9 && userInput <= 15){
                switch(userInput){
                    case 10: System.out.println("The hex value is A"); break;
                    case 11: System.out.println("The hex value is B"); break;
                    case 12: System.out.println("The hex value is C"); break;
                    case 13: System.out.println("The hex value is D"); break;
                    case 14: System.out.println("The hex value is E"); break;
                    case 15: System.out.println("The hex value is F"); break;
                }
            }
        }
        //tests for invalid responses
        else{
            System.out.println("You've entered an invalid response.");
            System.exit(1);
        }
    }
}
