/*
(Game: hangman) Write a hangman game that randomly generates a word and prompts
the user to guess one letter at a time, as shown in the sample run. Each letter
in the word is displayed as an asterisk. When the user makes a correct guess, 
the actual letter is then displayed. When the user finishes a word, display the 
number of misses and ask the user whether to continue to play with another word.
Declare an array to store words, as follows:
 */

import java.util.*;
import java.lang.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem7_35 {
    static String[] words = {"program", "pizza", "milestone"};
    static boolean isCorrect;
    
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        //Store randomWord
        String randomWord = getRandomWord(words);
        
        //initialize as & since this char will never be in the array words
        char guess = '&';
        
        //initalizes as true to start
        boolean play = true;
        
        //Runs a while loop while the condition of the player wanting to play is true
        while(play){
            //generates a new word each time the game is started over
            String word = getRandomWord(words);
            String hiddenWord = getHiddenWord(word);
            int wrong = 0;
            //Nested while loop to play current game
            while(!word.equals(hiddenWord)){
                System.out.print("(Guess) Enter a letter in word " + hiddenWord +
                        " > ");
                char ch = input.next().charAt(0);
                
                //
                if(!isInWord(hiddenWord, ch)){
                    hiddenWord = getGuess(word, hiddenWord, ch);
                    
                    if(!isCorrect){
                        System.out.println(ch + " is not in the word.");
                        wrong++;
                    }
                }
                else{
                        System.out.println(ch + " is already in word.");
                }
            }
            System.out.println("The word is " + word + ". You missed " + wrong + 
                    " time");
            System.out.println("Do you want to guess another word? Enter y or n >");
            char ch1 = input.next().charAt(0);
            if(ch1 == 'y'){
                play = true;
                System.out.println("Playing again.");
            }
            else{
                play = false;
                System.out.println("Exiting.");
            }
        }
        
           
    }
    
    //Generates a random word from the array words
    public static String getRandomWord(String[] words){
        Random rand = new Random();
        int index = rand.nextInt(words.length) + 0;
        return words[index];
    }
    
    //has the hidden word displayed with astericks
    public static String getHiddenWord(String word){
        String hidden = "";
        for(int i = 0; i < word.length(); i++){
            hidden += "*";
        }
        return hidden;
    }
    
    //Takes the guess and changes the value of * for the guess if correct
    public static String getGuess(String word, String hiddenWord, char ch){
        isCorrect = false;
        //StringBuilder to manipulate the string
        StringBuilder s = new StringBuilder(hiddenWord);
        for(int i = 0; i < word.length(); i ++){
            if(ch == word.charAt(i) && s.charAt(i) == '*'){
                isCorrect = true;
                s = s.deleteCharAt(i);
                s = s.insert(i, ch);
            }
        }
        return s.toString();
    }
    
    //Checks if the guess was already in the word
    public static boolean isInWord(String hiddenWord, char ch){
        for(int i = 0; i < hiddenWord.length(); i++){
            if(ch == hiddenWord.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
