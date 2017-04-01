import java.util.*;

/*
 * Cost of shipping. A shipping company uses the following
 * function to calculate the cost (in dollars) of shipping based
 * on the weight of the package (in pounds).
 * 
 * 3.5 if 0 < w <= 1
 * 5.5 if 1 < w <= 3
 * 8.5 if 3 < w <= 10
 * 10.5 if 10 < w <= 20
 * 
 * Write a program that prompts the user to enter the weight of the
 * package and display the shipping cost. If the weight is greater
 * than 50, display a message "the package cannot be shipped."
 * 
 * Program does not display cost for weights between 20 and 50
 * will scale this as follows:
 * 13.5 if 20 < w <= 30
 * 15.5 if 30 < w <= 40
 * 17.5 if 40 < w <= 50
 */

public class Problem3_18 {
	public static void main(String[] args){
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		double weight = 0;
		double cost = 0;
		
		
		System.out.print("Enter the weight of the package: ");
		weight = input.nextDouble();
		
		//All else if statements will disallow a negative weight
		//from being entered. 
		if(weight >= 0.1 && weight <= 1){
			cost = 3.5;
		}
		else if(weight >= 0.1 && weight <= 3){
			cost = 5.5;
		}
		else if(weight >= 0.1 && weight <= 10){
			cost = 8.5;
		}
		else if(weight >= 0.1 && weight <= 20){
			cost = 10.5;
		}
		else if(weight >= 0.1 && weight <= 30){
			cost = 13.5;
		}
		else if(weight >= 0.1 && weight <= 40){
			cost = 15.5;
		}
		else if(weight >= 0.1 && weight <= 50){
			cost = 17.5;
		}
		else if(weight >= 0.1 && weight > 50){
			System.out.println("The package cannot be shipped." +
					" It is over 50 pounds.");
			System.exit(1);
		}
		else{
			System.out.println("You've entered a negative value.");
			System.exit(1);
		}
		
		System.out.println("The cost of shipping a " + weight +
				" pound package will cost " + cost + " dollars.");
	}
}
