/*
(Financial application: compute the future investment value) Write a method that
computes future investment value at a given interest rate for a specified number
of years. The future investment is determined using the formula in Programming 
Exercise 2.21.

Use the following method header:

public static double futureInvestmentValue(double investmentAmount, 
    double monthlyInterestRate, int years)

For example futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.

Write a test program that prompts the user to enter the investment amount(e.g.
1000) and the interest rate(e.g. 9%) and prints a table that displays future value
for the years from 1 to 30.
 */
package programming.exercises.pkgfor.week.pkg2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem6_7 {
    public static void main(String[] args){
        //DecimalFormat will make it round to two places.
        DecimalFormat df = new DecimalFormat("#.##");
        
        //Rounds up
        df.setRoundingMode(RoundingMode.CEILING);
        
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();
        
        System.out.print("Annual interest rate: ");
        double monthlyInterestRate = input.nextDouble();
        
        //Uses \t to make a table
        System.out.println("Years\tFuture Value");
        for(int i = 1; i <= 30; i++){
            System.out.println(i + "\t" + df.format(futureInvestmentValue(investmentAmount, 
                    monthlyInterestRate, i)));
        }
    }
    
    //Uses the future investment formula from Programming Exercise 2.21. Then
    //returns the result.
    public static double futureInvestmentValue(double investmentAmount, 
        double monthlyInterestRate, int years){
        double result = 0;
        result = investmentAmount * Math.pow((1 + (monthlyInterestRate/100.0/12.0)), 
                (years * 12.0));
        return result;
    }
}
