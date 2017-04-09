/*
(Occurrences of a specified character in a string) Rewrite Programming Exercise 18.10
using a helper method to pass the substring high index to the method. The helper
method header is:

public static int count(String str, char a, int high)
 */
package programming.exercises.pkgfor.week.pkg2;

import java.util.Scanner;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem18_15 {
    public static void main(String[] args){
        //Creates a Scanner
        Scanner input = new Scanner(System.in);
        
        String str = "";
        char a = 'a';
        
        System.out.print("Enter a string: ");
        str = input.nextLine();
        
        System.out.print("Enter a character: ");
        a = input.next().charAt(0);
        
        int high = str.length();
        
        System.out.println("The character " + a + " occurs within the string " +
            str + " " + count(str, a, high) + " times.");
    }
    
    public static int count(String str, char a, int high){
        //Uses high as test points
        if(high == 0){
            return 0;
        }
        
        int count = 0;
        
        if(str.charAt(0) == a){
            count++;
        }
        //Uses high-1 to eventually end the recursion
        return count + count(str.substring(1), a, (high -1));
    }
}
