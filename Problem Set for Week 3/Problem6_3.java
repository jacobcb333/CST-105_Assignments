/*
(Palindrome integer) Write the methods with the following headers

public static int reverse(int number)

public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome. A number is palindrome if its
reversal is the same as itself. Write a test program that prompts the user to 
enter an integer and reports whether the integer is palindrome.
 */
package programming.exercises.pkgfor.week.pkg2;
import java.util.*;
/**
 *
 * @author jacobbushdiecker
 */
public class Problem6_3 {
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a three digit number: ");
        int number = input.nextInt();
        
        //Uses boolean method to determine if its a palindrome, then gives reverse
        if(isPalindrome(reverse(number))){
            System.out.println(number + " is a palindrome, it's reverse is " +
                    reverse(number) + ".");
        }
        //gives reverse of number regardless if its a palindrome
        else{
            System.out.println(number + " is not a palindome, it's reverse is " +
                    + reverse(number) + ".");
        }
    }
    
    
    //Uses three integers to store the place of each integer
    public static int reverse(int number){
            int a = number / 100;
            int b = number % 100 / 10 * 10;
            int c = number % 10 * 100;
            int result = a + b + c;
            return result;
    }
    
    //Determines if the number is in fact a palindrome if the sum of the
    //three numbers is the same as the sum of the reverse three numbers
    public static boolean isPalindrome(int number){
        int x = number / 100;
        int y = number % 100 / 10;
        int z = number % 10;
        int x1 = z * 100;
        int y1 = y * 10;
        int z1 = z;
        if(number == (x1 + y1 + z1)){
            return true;
        }
        else{
            return false;
        }
    }
    
}
