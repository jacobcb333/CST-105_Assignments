import java.util.*;

/*
 *(Stopwatch) Design a class named StopWatch. The class contains:
 *
 * *Private data fields startTime and endTime with getter methods.
 * *A no-arg constructor that initializes startTime with the current time.
 * *A method named start() that resets the startTime with the current time.
 * *A method named stop() that sets the endTime to the current time.
 * *A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test program that
 * measures the execution time of sorting 100,000 numbers using selection sort. 
 */

public class Problem9_6 {
	public static void main(String[] args){
		//Creates a scanner
		Scanner input = new Scanner(System.in);
		
		//Creates Stopwatch class object named watch
		Stopwatch watch = new Stopwatch();
		
		//Starts the watch timer from beginning of program initialization
		watch.start();
		
		//Allows the user to dictate when the timer will stop
		System.out.print("Enter anything when you want the timer to stop: ");
		String wait = input.nextLine();
		watch.stop();
		
		//Outputs the elapsed time in milliseconds
		System.out.print("The elapsed time is: " + watch.getElapsedTime() + " milliseconds.");
	}
}

class Stopwatch{
	//Initialization of variables
	private long endTime = 0;
	private long currentTime = System.nanoTime();
	private long startTime = 0; 
	
	//Use get to access private variables
	public long getEndTime(){
		return endTime;
	}
	
	public long getStartTime(){
		return startTime;
	}
	
	public Stopwatch(){
	}
	
	//Use nanoTime since more accurate than currentTimeMillis
	public void start(){
		startTime = System.nanoTime();
	}
	
	public void stop(){
		endTime = System.nanoTime();
	}
	
	//Returns elapsed time in milliseconds
	public long getElapsedTime(){
		long endTime = System.nanoTime();
		return (endTime - startTime) / 1000000;
	}
}
