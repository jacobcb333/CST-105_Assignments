/*
(Occurences of a specified character in a string) Write a recursive method that
finds the number of occurences of a specified letter in a string using the following
method header:

public static int count(String str, char a)

For example, count ("Welcome", 'e') returns 2. Write a test program that prompts
the user to enter a string and a character, and displays the number of occurences 
for the character in the string.
 */
package programming.exercises.pkgfor.week.pkg2;

import java.util.Scanner;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem18_10 {
    public static void main(String[] args){
        //Creates a scanner
        Scanner input = new Scanner(System.in);
        
        String str = "";
        char a = 'a';
        
        System.out.print("Enter a string: ");
        str = input.nextLine();
        
        System.out.print("Enter a character: ");
        a = input.next().charAt(0);
        
        System.out.println("The character " + a + " occurs within the string " +
            str + " " + count(str, a) + " times.");
    }
    
    //Recursive method that returns the number of times a char appears in a string
    public static int count(String str, char a){
        //Ends the recursion
        if(str.length() == 0){
            return 0;
        }
        
        int count = 0;
        
        if(str.charAt(0) == a){
            count++;
        }
        //Adds previous count to currenct count (similar to a loop)
        return count + count(str.substring(1), a);
        
    }
}
