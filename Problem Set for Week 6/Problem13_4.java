/*
(Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to display a
calendar for a specified month using the Calendar and GregorianCalendar classes.
Your program receives the month and year from the command line.
 */
package programming.exercises.pkgfor.week.pkg6;

import java.util.Calendar;

/**
 *
 * @author jacobbushdiecker
 */

public class Problem13_4{
    //Creates an object of MyCalendar called calendar
    private static MyCalendar calendar;
    
    public static void main(String[] args){
        //makes sure input from command prompt is correct
        if(args.length> 2 || args.length== 0){
            System.out.println("Invalid arguments");
            System.exit(1);
        }
        
        int year;
        
        if(args.length == 1){
            year = Calendar.getInstance().get(Calendar.YEAR);
        }
        else{
            year = new Integer(args[1]);
        }
        
        int month = Integer.parseInt(args[0]) - 1;
        //Makes an instance of calendar with the year, month, and 1 arguments
        calendar = new MyCalendar(year, month, 1);
        calendar.set(Calendar.DATE, 1);
        
        printMonth();
    }
    
    public static void printMonth(){
        //Title for calendr
        printMonthTitle();
        
        //Body for calendar
        printMonthBody();
    }
    
    public static void printMonthTitle(){
        //Creates the header for the calendar
        System.out.println("         " + calendar.getMonthName() + " " + 
                calendar.get(Calendar.YEAR));
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
    
    public static void printMonthBody(){
        //Gets day of week
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        
        //Gets days in month
        int numberOfDaysInMonth = calendar.daysInMonth();
        
        int i = 0;
        //Used for the first wekk in the calendar
        for(i = 0; i < startDay; i++){
            System.out.print("    ");
        }
        
        //Will print the number of days in the month
        for(i = 1; i <= numberOfDaysInMonth; i++){
            System.out.printf("%4d", i);
            
            if((i + startDay) % 7 == 0){
                System.out.println();    
            }
        }
        System.out.println();
    }
}
