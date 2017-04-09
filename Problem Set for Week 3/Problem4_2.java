/*
(Geometry: great circle distance) The great circle distance is the distance
between two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the
geographical latitude and logitude of two points. The great circle distance between
the two points can be computed using the following formula:

d = radius x arccos(sin(x1) x sin(x2) + cos(x1) x cos(x2) x cos(y1-y2)

Write a program that prompts the user to enter the latitude and logitude of two
points on the earth in degrees and displays its great circle distance. The average
eart radius is 6,371.01 Km. Note that you need to convert the degrees into radians
using the Math.toRadians method since the Java trigonometric methods use radians.
The latitude and logitude degrees in the formula are for north and west. Use negative
to indicate south and east degrees. 
 */
package programming.exercises.pkgfor.week.pkg2;
import java.util.*;
/**
 *
 * @author jacobbushdiecker
 */
public class Problem4_2 {
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
	double point1Long, point1Lat, point2Long, point2Lat, distancePoints;
        
	System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
	point1Lat = input.nextDouble();
	point1Long = input.nextDouble();
        
	System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
	point2Lat = input.nextDouble();
	point2Long = input.nextDouble();
        
        //Convert degrees into radians using Math class
	point1Long = Math.toRadians(point1Long); 
	point1Lat = Math.toRadians(point1Lat);
	point2Long = Math.toRadians(point2Long);
	point2Lat = Math.toRadians(point2Lat);
        
        //formula to find the distance between two points
	distancePoints = 6371.01 * Math.acos(Math.sin(point1Lat) * Math.sin(point2Lat) + Math.cos(point1Lat)
            * Math.cos(point2Lat) * Math.cos(point1Long - point2Long));
        
        //output results
	System.out.println("The distance between the two points is " + distancePoints + " km");
    }
}