/*
Create a rational-number calculator) Write a program similar to Listing 7.9,
Calculator.java. Instead of using integers, use rationals, as shown in Figure
13.10a. You will need to use the split method in the String class, introduced
in section 10.10.3. Replacing the SplittingStrings, to retrieve the numerator
string and denominator string, and convert strings into integers using the
Integer.parseInt method.
 */

import java.util.ArrayList;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem13_16{
    public static void main(String[] args){
        //Creates an array of strings called token
        String[] token = getTokens(args);

        if(token.length != 3 || !isValidOperator(token)){
            System.out.println("Invalid arguments.");
            System.out.println("Usage: java Chapter_13.Exercise_16 1/2 * 8/17");
            System.exit(1);
        }

        //Creates two BigRational objects
        BigRational operand1 = new BigRational(token[0]);
        BigRational operand2 = new BigRational(token[2]);

        BigRational answer = null;
        switch(args[1]){
            case "+": answer = operand1.add(operand2); break;
            case "-": answer = operand1.subtract(operand2); break;
            case "*": answer = operand1.multiply(operand2); break;
            case "/": answer = operand1.divide(operand2); break;
        }

        System.out.println(operand1 + " " + args[1] + " " + operand2 + " = " + answer);
    }

    private static boolean isValidOperator(String[] token){
        return  token[0].matches("[\\d]*[0-9]/[\\d]*[0-9]") &&
                token[1].matches("[\\-\\+\\*\\/]") &&
                token[2].matches("[\\d]*[0-9]/[\\d]*[0-9]");
    }

    private static String[] getTokens(String[] strings){
        String merged = " ";
        for(String s : strings){
            merged += " " + s;
        }

        String[] tokens = merged.split("[\\s ]");
        ArrayList<String> temp = new ArrayList<>();
        //Remove blanks
        for(String s : tokens){
            if(s.length() != 0){
                temp.add(s);
            }
        }
        return temp.toArray(new String[temp.size()]);
    }
}
