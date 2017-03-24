import java.util.*;

public class Set1Problem4_22 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string s1: ");
		String stringOne = input.nextLine();
		System.out.println("Enter string s2: ");
		String stringTwo = input.nextLine();
		
		//This if statement will determine whether stringTwo is a substring of stringOne
		if(stringOne.toLowerCase().contains(stringTwo.toLowerCase())){
			System.out.println(stringTwo + " is a substring of " + stringOne);
		}
		else{
			System.out.println(stringTwo + " is not a substring of " + stringOne);
		}
	}
}
