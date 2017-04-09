/*
(Sort three numbers) Write a method with the following header to display three
numbers in increasing order:

public static void displaySortedNumber(double num1, double num2, double num3)

Write a test program that prompts the user to enter three numbers and invokes
the method to display them in increasing order.
 */
package programming.exercises.pkgfor.week.pkg2;

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem6_5 {
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three numbers");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
       displaySortedNumbers(a, b, c);
        
    }
    
    
    public static void displaySortedNumbers(double num1, double num2, double num3){
        double temp = 0;
        double temp1 = 0;
        double temp2= 0;
        
        //This finds the largest number
        double[] array = {num1, num2, num3};
        for(int i = 0; i < array.length; i++){
            if(array[i] > temp){
                temp = array[i];
            }
        }
        
        //This finds the second largest number
        for(int i = 0; i < array.length; i++){
            if(array[i] > temp1 && array[i] != temp){
                temp1 = array[i];
            }
        }
        
        //This finds the smallest number
        for(int i = 0; i < array.length; i++){
            if(array[i] > temp2 && array[i] != temp && array[i] != temp1){
                temp2 = array[i];
            }
        }
        //Prints the numbers in ascending order
        System.out.println(temp2 + " " + temp1 + " " + temp);
    }   
    
}
