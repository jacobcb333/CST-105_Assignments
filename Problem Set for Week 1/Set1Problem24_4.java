import java.util.*;

public class Set1Problem24_4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//declares and creates a stack
		Stack stack = new Stack();
		int status = 1;
		int num = 3;
		//for loop with a nested for loop to find prime numbers
		for(int i = 2; i <= 50; ){
			for(int j = 2; j <= Math.sqrt(num); j++){
				if(num % j == 0){
					status = 0;
					break;
				}
			}
			if(status != 0){
				//each found prime number adds to the stack
				stack.push(num);
				i++;
			}
			status = 1;
			num++;
		}
		
		//Prints out the stack
		System.out.println("The first 50 prime numbers are: " + stack);
	}
}
