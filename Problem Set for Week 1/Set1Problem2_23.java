import java.util.*;

public class Set1Problem2_23 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double distance;
		double fuelEfficiency;
		double pricePerGallon;
		double cost;
		System.out.println("Enter the driving distance: ");
		distance = input.nextDouble();
		System.out.println("Enter miles per gallon: ");
		fuelEfficiency = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		pricePerGallon = input.nextDouble();
		cost = ((distance / fuelEfficiency) * pricePerGallon);
		System.out.println("The cost of driving is $" + cost);
	}
}
