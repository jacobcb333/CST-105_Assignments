import java.util.*;

/*
 * (Algebra: solve 2 x 2 linear equations) A linear equation can be 
 * solved using Cramer's rule given in Progamming Exercise 1.13. Write
 * a program that prompts the user to enter a, b, c, d, e, and f and 
 * displays the result. If ad - bc is 0, report that "The equation
 * has no solution."
 */

public class Problem3_3 {
	public static void main(String[] args){
		double a, b, c, d, e, f, x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b, c, d, e, f:");
		
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		
		//determines the test condition
		if(((a * d) - (b * c)) != 0){
			//uses Cramer's rule to determine results of x and y
			x = ((e * d) - (b * f)) / ((a * d) - (b * c));
			y = ((a * f) - (e * c)) / ((a * d) - (b * c));
			System.out.println("x is " + x + " and y is " + y);
		}
		else{
			System.out.println("The equation has no solution");
		}
	}
}
