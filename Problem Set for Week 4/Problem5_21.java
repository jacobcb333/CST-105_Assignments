/*
(Financial application: compare loans with various interest rates) Write a program
that lets the user enter the loan amount and loan period in number of years and
displays the monthly and total payments for each interest rate starting from 5% to
8%, with an increment of 1/8.
 */
package programming_exercises_for_week_4;

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem5_21 {
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);
        double formula = 0;
        
        System.out.print("Loan Amount: ");
        double loan = input.nextInt();
        
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        
        System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");
        
        //For loop to iterate from 5% to 8%
        for(double i = 5.0; i <= 8.0; i+= 0.125){
            //formula will find monthly payment
            formula = Math.round(((loan * (i/100.0/12)) / (1 - Math.pow(1 + (i/12/100.0), (years * -12))))*100.0) / 100.0;
            //prints percent, monthly payment, and then total payment
            System.out.println(i + "%\t\t" + formula + "\t\t" + (formula * years * 12));
        }
    }
}
