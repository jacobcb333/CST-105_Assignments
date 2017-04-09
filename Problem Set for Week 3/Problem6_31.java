/*
(Financial: credit card number validation) Credit card numbers follow certain 
patterns. A credit card number must have between 13 and 16 digits. It must start with:

*4 for Visa cards
*5 for Master cards
*37 for American Express cards
*6 for Discover cards

In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers.
The algorithm is useful to determine whether a card number is entered correctly
or whether a credit card is scanned correctly by a scanner. Credit card numbers
are generated following this validity check, commonly known as the Luhn check or
the Mod 10 check.
 */
package programming.exercises.pkgfor.week.pkg2;

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem6_31 {
    public static void main(String[] args){
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();
        
        sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        
        if(isValid(sum)){
            System.out.println(number + " is valid");
        }
        else
            System.out.println(number + " is invalid");
    }
    
    
    //Returns true if the card number is valid
    public static boolean isValid(long number){
        if(number % 10 == 0){
            return true;
        }
        else return false;
    }
    
    //Get the result from Setp 2
    public static int sumOfDoubleEvenPlace(long number){
        int result = 0;
        number = number / 10;
        while (number != 0){
            result += getDigit((int)((number % 10) * 2));
            number = number / 100;
        }
        return result;
    }
    
    //Return this number if it is a single digit, otherwise,
    //return the sum of the two digits
    public static int getDigit(int number){
        int a = 0;
        int b = 0;
        if(number >= 0 && number <= 9){
            return number;
        }
        else{
            a = number % 10;
            b = number / 10;
            return (a + b);
        }
    }
    
    //Return sum of odd-place digits in number
    public static int sumOfOddPlace(long number){
        int result = 0;
        while (number != 0){
            result += (int)(number % 10);
            number = number / 100;
        }
        return result;
    }
    
    //Return true if the digit d is a prefix for number
    public static boolean prefixMatched(long number, int d){
        return getPrefix(number, getSize(number)) == number;
        
    }
    
    //Return the number of digits in d
    public static int getSize(long d){
        int len = 0;
        while(d >= 10){
            d /= 10;
            len++;
        }
        return len;
    }
    
    //Return the first k number of digits from number. If the
    //number of digits in number is less than K, return number.
    public static long getPrefix(long number, int k){
        long result = number;
        for(int i = 0; i < getSize(number) - (k - 1); i++){
            result /= 10;
        }
        return result;
    }
}
