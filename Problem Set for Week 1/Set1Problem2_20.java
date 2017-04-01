import java.util.*;
public class Set1Problem2_20 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float interestRate;
		float balance;
		float interest;
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		balance = input.nextFloat();
		interestRate = input.nextFloat();
		interest = balance * (interestRate / 1200);
		System.out.println("The interest is " + interest);
	}
}
