/*
Write a program that will prompt the user to enter a time in a decimal format and 
print the amount of hours and minutes from the value entered. Example, user enters
4.5 and application parses to 4 hours and 30 minutes.
 */

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Time_Conversion_Part_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a decimal to be converted to time: ");
        double time = input.nextDouble();
        
        int hours = convertToHours(time);
        int minutes = convertToMinutes(time);
        
        System.out.println("The decimal " + time + " converted to hours and "
                + "minutes is " + hours + " hours and " +
                 minutes + " minutes.");
    }
    
    public static int convertToHours(double convert){
        Double d = new Double(convert);
        int convertConverted = d.intValue();
        int convertH = 60 * convertConverted / 60;
        return convertH;
    }
    
    public static int convertToMinutes(double convert){ 
        double convertM = 60 * convert;
        Double d = new Double(convertM);
        int temp = d.intValue();
        int result = temp % 60;
        
        return result;
    }
}
