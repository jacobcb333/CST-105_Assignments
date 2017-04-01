import java.util.*;
public class Set1Problem4_17 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		input.nextLine();
		System.out.println("Enter a month: ");
		String month = input.nextLine();
		//Will compare string despite user entering month as lowercase or uppercase letters
		month = month.toLowerCase();
		//Compares user input to a defined string to find if the month has 31 days
		if(month.equals("jan") || month.equals("mar") || month.equals("may") || month.equals("jul") ||
				month.equals("aug") || month.equals("oct") || month.equals("dec")){
			//The month.substring(0,1).toUpperCase() + month.substring(1) will return the output
			// with the first letter capitalized in the month
			System.out.println(month.substring(0, 1).toUpperCase() + month.substring(1) + " " + year + " has 31 days");
		}
		//Compares user input to a defined string to find if the month has 30 days
		else if(month.equals("apr") || month.equals("jun") || month.equals("sep") || month.equals("nov")){

			System.out.println(month.substring(0, 1).toUpperCase() + month.substring(1) + " " + year + " has 30 days");
		}
		//This if else statement determines if the years lands on a leap year or not
		else if(month.equals("feb")){
			if ((year % 4) == 0){
				System.out.println(month.substring(0, 1).toUpperCase() + month.substring(1) + " " + year + " has 29 days");
			}
			else{
				System.out.println(month.substring(0, 1).toUpperCase() + month.substring(1) + " " + year + " has 28 days");
			}
			
		}
	}
}
