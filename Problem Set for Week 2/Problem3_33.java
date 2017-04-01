import java.util.*;

/*
 * (Financial: compare costs) Suppose you shop for rice in two different
 * packages. You would like to write a program to compare the cost. The
 * program prompts the user to enter the weight and price of the each 
 * package and displays the one with the better price.
 */

public class Problem3_33 {
	public static void main(String[] args){
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//initialization of variables 
		double weight1, weight2, price1, price2;
		weight1 = weight2 = price1 = price2 = 0;
		
		System.out.print("Enter weight and price for package 1: ");
		weight1 = input.nextDouble();
		price1 = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		weight2 = input.nextDouble();
		price2 = input.nextDouble();
		
		//nested if statement ensures a logic error does not occur
		//since a division by 0 will crash the program
		if(price1 != 0 && price2 != 0){
			if((weight1 / price1) > (weight2 / price2)){
				System.out.println("Package 1 has a better price.");
			}
			else if((weight2 / price2) > (weight1 / price1)){
				System.out.println("Package 2 has a better price.");
			}
			else if((weight2 / price2) == (weight1 / price1)){
				System.out.println("Two packages have the same price.");
			}
		}
		else{
			System.out.println("You've entered an invalid weight.");
		}
	}
}
