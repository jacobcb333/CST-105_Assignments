
public class Set1Problem1_11 {
	public static void main(String[] args){
		//first find out how many seconds are in a year
		//60 sec * 60 min * 24 hrs * 365 = 31,536,000 seconds in a year
		//then we must find out how many births a year given those seconds
		//31,536,000/7 = 4,505,142.857142857
		//find out how many deaths there are a year
		//31,536,000/13 = 2,425,846.153846154
		//finally find out how many new immigrants a year
		//31,536,000/45 = 700,800
		//we can now make the following formula to find out the total population for the next five years.
		System.out.println("The estimated population by next year is: ");
		System.out.println(312032486 + ( 1 *((60*60*24*365) / 7.0) - ((60*60*24*365) / 13.0) + ((60*60*24*365) / 45.0)));
		System.out.println("The estimated population by the second year is: ");
		System.out.println(312032486 + ( 2 *((60*60*24*365) / 7.0) - ((60*60*24*365) / 13.0) + ((60*60*24*365) / 45.0)));
		System.out.println("The estimated population by the third year is: ");
		System.out.println(312032486 + ( 3 *((60*60*24*365) / 7.0) - ((60*60*24*365) / 13.0) + ((60*60*24*365) / 45.0)));
		System.out.println("The estimated population by the fourth year is: ");
		System.out.println(312032486 + ( 4 *((60*60*24*365) / 7.0) - ((60*60*24*365) / 13.0) + ((60*60*24*365) / 45.0)));
		System.out.println("The estimated population by the fifth year is: ");
		System.out.println(312032486 + ( 5 *((60*60*24*365) / 7.0) - ((60*60*24*365) / 13.0) + ((60*60*24*365) / 45.0)));
	}
}
