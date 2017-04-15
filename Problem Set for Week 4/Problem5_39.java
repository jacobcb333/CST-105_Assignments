/*
(Financial application: find the sales amount) You have just started a sales job
in a department store. Your pay consists of a base salary and a commission. The 
base salary is $5,000. The scheme shown below is used to determine the commission
rate.

Sales Amount            Commission Rate
$0.01-$5,000            8 Percent
$5,000.01-$10,000       10 Percent
$10,000.01 and above    12 Percent

Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
$5000 is at 10%, and the rest is at 12%. If the slaes amount is 25,000, the commision
is 5,000*8% + 5,000 * 10% + 15,000 * 12% = 2,700.

Your goal is to earn $30,000 a year. Write a program that finds the mininum sales
you have to generate in order to make $30,000.
 */
package programming_exercises_for_week_4;

//import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem5_39 {
    public static void main(String[] args){
        //This code would allow users to enter their goal for yearly income
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter earnings goals for the year: ");
        double yearEarnings = input.nextDouble();
        System.out.print("If your goal is to earn $" + yearEarnings + " a year, " +
        "you will have to sale: $");*/
        
        
        System.out.print("If your goal is to earn $30,000 a year, you will"
                + " have to sale: $");
        double yearEarnings = 30_000;
        
        //Declare variables needed
        double sales, commission, result;
        //Initialize variables
        sales = commission = result = 0;
        
        
        do{
            result = commission = 0;
            sales += 0.01;
            
            //Sales above $10000.01
            if(sales > 10000){
                commission += (result = sales - 10000) * 0.12;
            }
            
            //Sales above $5000 but not above $10000.01
            if(sales > 5000){
                commission += (result -= result - 5000) * 0.10;
            }
            
            //Sale above $0.01 but not above $5000.01
            if(sales > 0){
                commission += result * .08;
            }
            
        }while(commission < yearEarnings);
        
        System.out.println(sales);
    }
}
