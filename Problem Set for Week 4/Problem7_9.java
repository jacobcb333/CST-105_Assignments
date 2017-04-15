/*
(Find the smallest element)Write a method that finds the smallest element in an
array of double values using the following header:

public static double min(double[] array)

Write a test program that prompts the user to enter ten numbers, invokes this 
method to return the mininum value, and displays the mininum value. Here is a
samplerun of the program:
 */

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem7_9 {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        
        //Declares an array of a fixed size
        double[] array = new double[10];
        
        //Prompts user to enter ten numbers
        System.out.print("Enter ten numbers: ");
        
        //For loop that will iterate 10 times, and fills each spot in the
        //fixed array
        for(int i = 0; i < 10; i++){
            array[i] = input.nextDouble();
        }
        
        //Prints and calls to the min method
        System.out.println("The mininum number is: " + min(array));
        
    }
    
    //Method that finds the lowest value of an array
    public static double min(double[] array){
        double temp = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < temp){
                temp = array[i];
            }
        }
        return temp;
    }   
}
