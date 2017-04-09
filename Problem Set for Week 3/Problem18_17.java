/*
(Occurrences of a specified character in an array) Write a recursive method that
find the number of occurrences of a specified character in an array. You need to
define the following two methods. The second one is a recursive helper method.

public static int count(char[] chars, char ch)
public static int count(char[] chars, char ch, int high)

Write a test program that prompts the user to enter a list of characters in one
line, and a character, and displays the number of occurrences of the character
in the list.
 */
package programming.exercises.pkgfor.week.pkg2;

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem18_17 {
    public static void main(String[] args){
        //Created a Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a list of characters in one line: ");
        String temp = input.nextLine();
        char[] chars = new char[temp.length()];
        for(int i = 0; i < temp.length(); i++){
            chars[i] = temp.charAt(i);
        }
        
        System.out.print("Enter a character: ");
        char a = input.next().charAt(0);
        
        System.out.println("The character " + a + " occurs within the string " +
            temp + " " + count(chars, a) + " times.");
    }
    
    public static int count(char[] chars, char ch){
        //Calls the recursive method
        return count(chars, ch, chars.length -1);
    }
    
    public static int count(char[] chars, char ch, int high){
        //Starts from end of array
        int count = (chars[high] == ch) ? 1 : 0;
        
        if(high == 0){
            return count;
        }
        else
            //Uses recursion to count occurence of char in the array and
            //lowers the value of high by one each time
            return count + count(chars, ch, high -1);
    }
}
