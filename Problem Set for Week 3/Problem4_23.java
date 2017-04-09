/*
(Financial application: payroll) Write a program that reads the following
information and prints a payroll statement:

Employee's name(e.g. Smith)
Number of hours worked in a week(e.g. 10)
Hourly pay rate(e.g 9.75)
Federal tax withholding rate(e.g. 20%)
State tax withholding rate(e.g. 9%)
 */
package programming.exercises.pkgfor.week.pkg2;
import java.util.*;
/**
 *
 * @author jacobbushdiecker
 */
public class Problem4_23 {
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        //Get required user information
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        
        System.out.print("Enter number of hours worked in a week: ");
        double numberHours = input.nextDouble();
        
        System.out.print("Enter hourly pay rate: ");
        double hourRate = input.nextDouble();
        
        System.out.print("Enter federal tax withholding rate: ");
        double fedTax = input.nextDouble();
        
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        
        //Formulas for gross pay, federal tax withholding, and state tax withholding
        //respectively
        double grossPay = numberHours * hourRate;
        double fedWith = grossPay * fedTax;
        double stateWith = grossPay * stateTax;
        
        //Output to user
        System.out.println("");
        System.out.println("Employee name: " + name);
        System.out.println("Hours worked: " + numberHours);
        System.out.println("Pay Rate: $" + hourRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("\tFederal Withholding (" + fedTax * 100 +
                "%): $" + (fedWith));
        System.out.println("\tState Withholding (" + stateTax * 100 +
                "%): $" + (stateWith));
        System.out.println("\tTotal Deduction: $" + (stateWith + fedWith));
        System.out.println("Net Pay: $" + (grossPay - fedWith - stateWith));
    }
}
