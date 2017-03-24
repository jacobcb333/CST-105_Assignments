import java.util.*;

public class Set1Problem2_5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double subtotal;
		double gratuityRate;
		double total;
		double gratuity;
		System.out.println("Enter the subtotal: ");
		subtotal = input.nextDouble();
		System.out.println("Enter the gratuity rate: ");
		gratuityRate = input.nextDouble();
		gratuity = subtotal * gratuityRate * .01;
		total = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
}
