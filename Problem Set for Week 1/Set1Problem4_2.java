import java.util.*;

public class Set1Problem4_2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double point1Long, point1Lat, point2Long, point2Lat, distancePoints;
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		point1Lat = input.nextDouble();
		point1Long = input.nextDouble();
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		point2Lat = input.nextDouble();
		point2Long = input.nextDouble();
		point1Long = Math.toRadians(point1Long); 
		point1Lat = Math.toRadians(point1Lat);
		point2Long = Math.toRadians(point2Long);
		point2Lat = Math.toRadians(point2Lat);
		distancePoints = 6371.01 * Math.acos(Math.sin(point1Lat) * Math.sin(point2Lat) + Math.cos(point1Lat)
				* Math.cos(point2Lat) * Math.cos(point1Long - point2Long));
		System.out.println("The distance between the two points is " + distancePoints + " km");		
	}
}
