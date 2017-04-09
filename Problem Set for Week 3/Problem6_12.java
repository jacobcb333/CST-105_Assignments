/*
(Display characters) Write a method that prints characters using the following
header:

public static void printChars(char ch1, char ch2, int numberPerLine)

This method prints the characters between ch1 and ch2 with the specified numbers
per line. Write a test program that prints ten characters per line from 1 to Z.
Characters are seperated by exactly one space.
 */
package programming.exercises.pkgfor.week.pkg2;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem6_12 {
    public static void main(String[] args){
        //Calls void method
        printChars('1', 'Z', 10);
    }
    
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int counter = 1;
        //Prints chars from ch1 to ch2
        for(char i = ch1; i <= ch2; i ++){
            System.out.print(i + " ");
            //uses a counter to determines how many chars printed to each line
            if(counter == numberPerLine){
                System.out.println();
                counter = 0;
            }
            //counter iterates for each char
            counter++;
        }
    }
}
