/*
(String permutation) Write a recursive method to print all the permutations of a
string. For example, for the string abc, the permutation is

abc, acb, bac, bca, cab, cba

(Hint: Define the following two methods. The second is a healper method.)

public static void displayPermutation(String s)
public static void displayPermutation(String s1, String s2)

The first method simply invokes displayPermutation(" ", s). The second method
uses a loop to move a character from s2 to s1 and recursively inokes it with
a new s1 and s2. The base case is that s2 is empty and prints s1 to the console.

Wirte a test program that prompts the user to enter a string and displays all its
permutations.
 */
package programming.exercises.pkgfor.week.pkg2;

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem18_25 {
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        
        System.out.println("The possible permutations of " + s + " are: ");
        displayPermutation(s);
    }
    
    public static void displayPermutation(String s){
        //Calls recrusive method
        displayPermutation("", s);
    }
    
    public static void displayPermutation(String s1, String s2){
        //base case when length is at 0
        if(s2.length() == 0){
            System.out.println(s1);
        }
        else{
            //Recursion method using a for loop
            for(int i = 0; i < s2.length(); i++){
                displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) +
                        s2.substring(i + 1));
            }
        }
    }
}
