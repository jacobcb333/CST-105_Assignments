import java.util.*;

public class Set1Problem2_4 {
	public static void main(String[] args){
		//import scanner
		Scanner input = new Scanner(System.in);
		//Program that converts user inputted pounds into kilograms
		double kilograms;
		double pounds;
		System.out.println("Enter the weight in pounds: ");
		pounds = input.nextDouble();
		kilograms = pounds * .454;
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}
}
