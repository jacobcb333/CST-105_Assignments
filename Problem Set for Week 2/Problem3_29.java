import java.util.*;

/*
 * (Geometry: two circles) Write a program that prompts the user to 
 * enter the center coordinates and radii of two circles and determines
 * whether the second circle is inside the first or overlaps with the
 * first, as shown in Figure 3.10 (Hint circle2 is inside circle1 if
 * the distance between the two centers <=|r1 - r2| and circle2 overlaps
 * circle1 if the distance between the two centers <=r1 + r2. Test your
 * program to cover all cases.)
 */

public class Problem3_29 {
	public static void main(String[] args){
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//declare needed variables
		double x1, x2, y1, y2, radius1, radius2;
		
		System.out.print("Enter circle1's center x-, y-coordinates, " +
				" and radius: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		radius1 = input.nextDouble();
		
		System.out.print("Enter circle2's center x-, y-coordinates, " +
				" and radius: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		radius2 = input.nextDouble();
		
		//formula to find distance between two points in a circle
		double distance = Math.pow((x1 - x2) * (x1 - x2) +
				(y1 - y2) * (y1 - y2), 0.5);
		
		if(radius1 >= radius2 && distance <= (radius1 - radius2)){
			System.out.println("circle2 is inside circle1");
		}
		else if(distance < (radius1 + radius2)){
			System.out.println("circle2 overlaps circle1");
		}
		else{
			System.out.println("circle2 does not overlap circle1");
		}
	}
}
