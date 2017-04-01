import java.util.*;

/*
 * (Find future dates) Write a program that prompts the user to enter an
 * integer for today's day of the week (Sunday is 0, Monday is 1, ...,
 * and Saturday is 6). Also prompt the user to enter the number of days
 * after today for a future day and display the future day of the week.
 */

public class Problem3_5 {
	public static void main(String[] args){
		int day;
		int elapsed;
		//initialize empty strings
		String convertToDay = "";
		String dayElapsed = "";
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter today's day: ");
		day = input.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		elapsed = input.nextInt();
		
		//Statement to denote day of the week
		switch(day){
		case 0: convertToDay = "Sunday"; break; 
		case 1: convertToDay = "Monday"; break;
		case 2: convertToDay = "Tuesday"; break;
		case 3: convertToDay = "Wednesday"; break;
		case 4: convertToDay = "Thursday"; break;
		case 5: convertToDay = "Friday"; break;
		case 6: convertToDay = "Satuday" ; break;
		}
		
		/*This statement will take days plus elapsed days
		and then take the remainder after dividing by the number
		of days in the week 
		*/
		switch((day + elapsed) % 7){
		case 0: dayElapsed = "Sunday"; break; 
		case 1: dayElapsed = "Monday"; break;
		case 2: dayElapsed = "Tuesday"; break;
		case 3: dayElapsed = "Wednesday"; break;
		case 4: dayElapsed = "Thursday"; break;
		case 5: dayElapsed = "Friday"; break;
		case 6: dayElapsed = "Satuday" ; break;
		}
		
		System.out.println("Today is " + convertToDay +
				" and the future day is " + dayElapsed);
		
	}
}
