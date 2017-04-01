import java.util.*;

/*
 * (Game: scissor, rock, paper) Write a program that plays the popular
 * scissor-rock-paper game. (A scissor can cut a paper, a rock can
 * knock a scissor, and a paper can wrap a rock.) The program randomly
 * generates a number 0, 1, or 2 representing scissor, rock, and paper.
 * The program prompts the user to enter a number 0, 1, or 2 and
 * displays a message indicating whether the user or the computer
 * wins, loses, or draws.
 */

public class Problem3_17 {
	public static void main(String[] args){
		//Create Scanner
		Scanner input = new Scanner(System.in);
		//Create random number generator
		Random ran = new Random(System.currentTimeMillis() * 10);
		
		String object = "";
		String object1 = "";
		//generates a random number between 0 and 2
		int random = ran.nextInt(3-0) + 0;
		int choice;
		boolean win = true;
		boolean tie = false;
		
		
		System.out.print("scissor (0), rock(1), paper(2): ");
		choice = input.nextInt();
		
		//switch statement to store the respective string
		//to it's integer match for user response
		switch(choice){
		case 0: object = "scissor"; break;
		case 1: object = "rock"; break;
		case 2: object = "paper"; break;
		}
		
		//switch statement to store the respective string
		//to it's integer match for random number
		switch(random){
		case 0: object1 = "scissor"; break;
		case 1: object1 = "rock"; break;
		case 2: object1 = "paper"; break;
		}
		
		//if user chose scissors and random is rock, paper, scissor
		if(choice == 0 && random == 1){
			win = false;
		}
		else if(choice == 0 && random == 2){
			win = true;
		}
		else if(choice == 0 && random == 0){
			win = false;
			tie = true;
		}
		//if user chose rock, and random is scissor, paper, rock
		else if(choice == 1 && random == 0){
			win = true;
		}
		else if(choice == 1 && random == 2){
			win = false;
		}
		else if(choice == 1 && random == 1){
			win = false;
			tie = true;
		}
		//if user chose paper, and random is scissor, rock
		else if(choice == 2 && random == 0){
			win = true;
		}
		else if(choice == 2 && random == 1){
			win = false;
		}
		else if(choice == 2 && random == 2){
			win = false;
			tie = true;
		}
		else{
			System.out.println("You've entered an invalid response.");
			System.exit(1);
		}
		
		/*use logic operators to avoid entering multiple outputs throughout
		*the else if statements, also look for invalid response such
		*as the user entering 3
		*/
		if(win && !tie){
			System.out.println("The computer is " + object1 + ". You are " +
					object + ". You won");
		}
		else if(!win && !tie){
			System.out.println("The computer is " + object1 + ". You are " +
					object + ". You lost");
		}
		else if(tie){
			System.out.println("The computer is " + object1 + ". You are " +
					object + " too. It is a draw");
		}
	}
}
