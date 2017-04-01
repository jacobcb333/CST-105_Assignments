import java.util.*;

/*
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for a quadratic equation
 * ax^2 + bx + c = 0. The class contains:
 * 
 * *Private data fields a, b, and c that represent three coefficients.
 * *A constructor for the arguments for a, b, and c.
 * *Three getter methods for a, b, and c.
 * *A method named getDiscriminant() that returns the discriminant, which is b^2 - 4ac
 * *The methods named getRoot1() and getRoot2() for returning two roots of the equation
 * 
 * r_1 = (-b + Math.sqrt(Math.power(b, 2)-4 * a * c)) / 2 * a
 * r_2 = (-b - Math.sqrt(Math.power(b, 2)-4 * a * c)) / 2 * a
 * 
 * These methods are useful only if the disciminant is nonnegative. Let these methods return 0
 * if the disciminant is negative.
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test program that prompts
 * the user to enter values for a, b, and c and displays the results based on the discriminant.
 * If the discriminant is positive, display the two roots. If the discriminant is 0, display the
 * one root. Otherwise, display "The equation has no roots." See Programming Exercise 3.1 for sample
 * runs.
 */

public class Problem9_10 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter values for a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuadraticEquation q1 = new QuadraticEquation(a, b, c);
		
		//Checks if the equation has two, one, or no real roots
		if(q1.getDiscriminant() > 0){
			System.out.println("The equation has two roots. \nRoot 1 is: " + q1.getRoot1());
			System.out.println("Root 2 is: " + q1.getRoot2());
		}
		else if(q1.getDiscriminant() == 0){
			System.out.println("The equation has one root. \nRoot 1 is: " + q1.getRoot1());
		}
		else{
			System.out.println("The equation has no roots.");
		}
	}
}

//class for QuadraticEquation
class QuadraticEquation{
	private double a, b, c;
	
	QuadraticEquation(){
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	
	QuadraticEquation(double setA, double setB,double setC){
		this.a = setA;
		this.b = setB;
		this.c = setC;
	}
	
	//Use get to access private variables
	public double getA(){
		return this.a;
	}
	
	public double getB(){
		return this.b;
	}
	
	public double getC(){
		return this.c;
	}
	
	//Find discriminant
	public double getDiscriminant(){
		return Math.pow(b, 2) - (4 * a * c);
	}
	
	//Method to return root1
	public double getRoot1(){
		return (-b + Math.sqrt(Math.pow(b, 2)-4 * a * c)) / 2 * a;
	}
	
	//Method to return root2
	public double getRoot2(){
		return (-b - Math.sqrt(Math.pow(b, 2)-4 * a * c)) / 2 * a;
	}
}