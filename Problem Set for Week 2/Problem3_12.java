import java.util.*;

/*
 * (Palindrome number) Write a program that prompts the user to enter
 * a three-digit integer and determines whether it is a palindrome
 * number. A number is palindome if it reads the same from right to
 * left and from left to right. 
 */

public class Problem3_12 {
	public static void main(String[] args){
		int palindrome;
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a three-digit integer: ");
		palindrome = input.nextInt();
		
		//Convert integer palindrome to a string
		String number = Integer.toString(palindrome);
		
		//Use converted integer to compare index 0 to index 2
		if(number.charAt(0) == number.charAt(2)){
			System.out.println(palindrome + " is a palindrome");
		}
		else{
			System.out.println(palindrome + " is not a palindrome");
		}
		
	}
}
