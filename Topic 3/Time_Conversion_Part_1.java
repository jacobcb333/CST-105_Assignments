/*
Write a program that will prompt the user to enter an hour in the 24-hour format
and print it in the 12-hour format. Example, 18 prints 6pm
 */

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Time_Conversion_Part_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int convert = 0;
        boolean am = false;
        boolean pm = false;
        
        System.out.print("Enter an hour in the 24-hour format: ");
        int hour = input.nextInt();
        
        if(hour > 12 && hour <= 23){
            convert = hour - 12;
            pm = true;
            am = false;
        }
        else if(hour > 1 && hour < 11){
            convert = hour;
            am = true;
            pm = false;
        }
        else if(hour == 12){
            convert = hour;
            am = false;
            pm = true;
        }
        else if(hour == 0){
            convert = 12;
            am = true;
            pm = false;
        }
        else{
            System.out.println("You entered an invalid hour.");
            System.exit(1);      
        }
        
        if(am){
            System.out.println("You entered " + hour + " the time converted to "
                    + "12 hour format is " + convert + "am");
        }
        else if(pm){
            System.out.println("You entered " + hour + " the time converted to "
                    + "12 hour format is " + convert + "pm");
        }
    }
}
