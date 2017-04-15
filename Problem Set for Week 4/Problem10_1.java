/*
(The Time class) Design a class named Time. The class contains:

*The data field hour, minute, and second that represent time.
*A no-arg construtor that creates a Time object for the current time. (The values
of the data fields will represent the current time.)
*A constructor that constructs a Time object with a specified elapsed time since
midnight, January 1, 1970, in milliseconds. (The values of the data field will 
represent this time.)
*A constructor that constructs a Time object with the specified hour, minute,
and second.
*Three getter methods for the data field hour, minute, and second, respectively.
*A method named setTime(long elapseTime) that sets a new time for the object
using the elapsed time. For example, if the elapsed time is 5555500000 milliseconds,
the hour s 10, the minute is 19, and the second is 10.

Draw the UML diagram for the class and then implement the class. Write a test 
program that creates two Time objects (using new Time() and new Time(5555500000)
and displays their hour, minute, and second in the format hour:minute:second.

(Hint: The first two constructors will extract the hour, minute, and second from
the elapsed time. For the no-arg constructor, the current time can be obtained 
using System.currentTimeMillis(), as shown in Listing 2.7, ShotCurrentTime.java.)
 */

/**
 *
 * @author jacobbushdiecker
 */
public class Problem10_1 {
    public static void main(String[] args) {
        //Sets a sample milliseconds to the time class
        Time time = new Time(555550000);
        
        //Create a Time class with the current time
        Time time2 = new Time();
        
        //Prints Time class with the current time
        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" +
                time2.getSecond());
    
        //Prints sample milliseconds to Time class
        System.out.println(time.getHour() + ":" + time.getMinute() + ":" +
                time.getSecond());
        
        //Changes elapsed time
        time2.setTime(8316592103L);
        
        //Prints time with different elapsed time
        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" +
                time2.getSecond());
    }
}

class Time {
    //Declare private variables
    private int mHour;
    private int mMinute;
    private int mSecond;
    private long mTime;

    //No arg constructor
    public Time() {
        mTime = System.currentTimeMillis();
    }
    
    //Arg constructor
    public Time(long time) {
        mTime = time;
    }
    
    //Arg constructor that sets all time
    public Time(int hour, int minute, int second) {
        mHour = hour;
        mMinute = minute;
        mSecond = second;
    }

    //Sets time using elapsed time
    public void setTime(long elapsedTime) {
        mTime = elapsedTime;
    }

    //Will find the hour
    public int getHour() {
        return (int)(mTime / (1000 * 60 * 60)) % 24;
    }

    //Will find the minute
    public int getMinute() {
        return (int)(mTime / (1000 * 60)) % 60;
    }

    //Will find the second
    public int getSecond() {
        return (int)(mTime / 1000) % 60;
    }

}
