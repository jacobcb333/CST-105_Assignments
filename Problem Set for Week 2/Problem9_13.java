import java.util.*;

/*
 * (The Location class) Design a class named Location for locating a maximal value and its location
 * in a two-dimensional array. The class contains public data field row, column, and maxValue
 * that store the maximal value and its indices is a two-dimensional array with row and column as
 * int types and maxValue as a double type.
 * 
 * Write the following method that returns the location of the largest element in a two-dimensional
 * array:
 * 
 * public static Location locateLargest(double[][] a)
 * 
 * The return value is an instance of Location. Write a test program that prompts the user to enter
 * a two-dimensional array and displays the location of the largest element in the array.
 */

public class Problem9_13 {
	public static void main(String[] args){
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Create and initialize variables
		int row = 0;
		int column = 0;
		int counter = 0;
		
		//Takes the number of columns and rows for the size of an array
		System.out.print("Enter the number of rows and columns in the array: ");
		row = input.nextInt();
		column = input.nextInt();
		
		//creates a multidimensional array of type double with size of user inserted
		//row and column
		double[][] array = new double[row][column];
		
		//Takes the user input for the values of the array using a double for loop
		System.out.println("Enter the array: ");
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				array[i][j] = input.nextDouble();
			}
		}
		//Initiate a object of the class
		Location loc = new Location();
		//Inputs array into the object within the class locateLargest with array as the field
		loc.locateLargest(array);
	}
}


//Create a class location
class Location{
	static double maxValue = 0;
	static int row = 0;
	static int column = 0;
	
	public Location(){
	}
	
	public Location(int x, int y, double z){
		System.out.println("The location of the largest element is " + maxValue + 
				" at (" + row + ", " + column + ")");
	}
	
	public static Location locateLargest(double[][] a){
		Location loc = new Location();
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				if(a[i][j] > loc.maxValue){
					loc.row = i;
					loc.column = j;
					loc.maxValue = a[i][j];
				}
			}
		}
		//Initiates the loc1 to access the class with the row, column, and maxValue
		//Which then prompts the System.out.print with the correct inputs.
		Location loc1 = new Location(loc.row, loc.column, loc.maxValue);
		return loc1;
	}
}
