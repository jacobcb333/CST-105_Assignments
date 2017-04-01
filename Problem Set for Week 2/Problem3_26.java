import java.util.*;

/*
 * (Use the &&, ||, and ^ operators) Write a program
 * that prompts the user to enter an integer and 
 * determines whether it is divisible by 5 and 6, 
 * but not both. 
 */

public class Problem3_26 {
	public static void main(String[] args){
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//create booleans and initialize variables
		boolean and, or, not;
		and = or = not = true;
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		//will determine if a boolean is true or false
		boolean mod5 = number % 5 == 0;
		boolean mod6 = number % 6 == 0;
		
		//finds if divisible by both 5 and 6
		if(mod5 && mod6){
			and = true;
			not = false;
			or = true;
		}
		//finds if divisible by 5 or 6
		else if(mod5 || mod6){
			and = false;
			or = true;
		}
		//finds if dibily by 5 or 6 but not both
		else if(mod5 ^ mod6){
			and = false;
			or = true;
			not = true;
		}
		else{
			and = or = not = false;
		}
		
		System.out.println("Is " + number + " divisible by 5 and 6? " +
				and);
		System.out.println("Is " + number + " divisible by 5 or 6? " +
				or);
		System.out.println("Is " + number + " divisible by 5 or 6, " +
				"but not both? " + not);
	}
}
