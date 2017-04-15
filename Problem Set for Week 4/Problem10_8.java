/*
(Financial: the Tax class) Programming Exercise 8.12 writes a program for computing
taxes using arrays. Design a class named Tax to contain the following instance
data fields:

1* int fillingStatus: One of the four tax-filing statuses: 0 --single filer, 1-
married filing jointly or qualifying widow(er), 2-- married filing seperately,
and 3--head of household. Use the public static constants SINGLE_FILER(0),
MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_SEPERATELY (2), HEAD_OF_
HOUSEHOLD (3) to represent the statuses. 
2* int[][] brackets: Stores the tax brackets for each filing status.
3* double[] rates: Stores the tax rates for each bracket.
4* double taxableIncome: Stores the taxable income.

Provde the getter and setter methods for each data field and the getTax() method
that returns the tax. Also provide a no-arg constructor and the constructor 
Tax(filingStatus, brackets, rates, taxableIncome).

Draw the UML diagram for the class and then implement the class. Write a test
program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
income from $50,000 to $60,000 with intervals of $1,000 for all four statuses. The
tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001 are
shown in Table 10.1.
 */

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem10_8 {
   public static void main(String[] args){
       //Tax bracket for 2009
       int[][]brackets = new int[][]{
           {8350, 33950, 82250, 171550, 372950},
           {16700, 67900, 137050, 208850, 372950},
           {8350, 33950, 68525, 104425, 186475},
           {11950, 45500, 117450, 190200, 372950}
       };
       
       //Tax bracket for 2001
       int[][]brackets2001 = new int[][]{
           {27050, 65550, 136750, 297350},
           {45200, 109250, 166500, 297350},
           {22600, 54625, 83250, 148675},
           {36250, 93650, 151650, 297350}
       };
       
       //Tax rates for 2009
       double[] rates = new double[] {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
       
       //Tax rates for 2001
       double[] rates2001 = new double[] {0.15, 0.275, 0.305, 0.355, 0.391};
       
       String s1 = "Taxable Income";
       String s2 = "Single  ";
       String s3 = "Married Joint";
       String s4 = "Married Seperate";
       String s5 = "Head of house";
       
       System.out.println("Tax Rate for 2009");
       
       //Prints Rates for 2009
       System.out.println(s1 + "\t" + s2 + "\t" + s3 + "\t" + s4 + "\t" + s5);
        for (int i = 50000; i <= 60000; i += 1000) {
            //Calls to Tax class using respective calls
            System.out.println(i + "\t" + "\t" +
                    new Tax(Tax.SINGLE_FILER,brackets,rates,i).getTax()+ "\t" + 
                            "\t" +
                    new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW,brackets,rates,i).getTax()
                    + "\t" + "\t" +
                    new Tax(Tax.MARRIED_SEPARATELY,brackets,rates,i).getTax()
                    + "\t" + "\t" + "\t" +
                    new Tax(Tax.HEAD_OF_HOUSEHOLD,brackets,rates,i).getTax()
            );
        }
        
        System.out.println("Tax Rate for 2001");
        
        //Prints Rates for 2001
        System.out.println(s1 + "\t" + s2 + "\t" + s3 + "\t" + s4 + "\t" + s5);
        for (int i = 50000; i <= 60000; i += 1000) {
            System.out.println(i + "\t" + "\t" +
                    new Tax(Tax.SINGLE_FILER,brackets2001,rates2001,i).getTax()+ "\t" + 
                            "\t" +
                    new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW,brackets2001,rates2001,i).getTax()
                    + "\t" + "\t" +
                    new Tax(Tax.MARRIED_SEPARATELY,brackets2001,rates2001,i).getTax()
                    + "\t" + "\t" + "\t" +
                    new Tax(Tax.HEAD_OF_HOUSEHOLD,brackets2001,rates2001,i).getTax()
            );
        }
   } 
}

class Tax{
    //static final int constants
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    
    //private variables which will each have getters and setters
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;
    
    //will set the filing status, bracket, rate, and taxable income
    public Tax(int filingStatus,int[][] brackets,double[] rates,double taxableIncome){
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }
    
    public int getFilingStatus(){
        return filingStatus;
    }
    
    public void setFilingStatus(int filingStatus){
        this.filingStatus = filingStatus;
    }
    
    public int[][] getBrackets(){
        return brackets;
    }
    
    public void setBrackets(int[][] brackets){
        this.brackets = brackets;
    }
    
    public double[] getRates(){
        return rates;
    }
    
    public void setRates(double [] rates){
        this.rates = rates;
    }
    
    public double getTaxableIncome(){
        return taxableIncome;
    }
    
    public void setTaxableIncome(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }
    
    //Will get the tax based off bracket and filing status
    public double getTax(){
        double tax;
        //User would qualify for lowest tax rate
        if(taxableIncome <= brackets[filingStatus][0]){
            return Math.round(taxableIncome * rates[0]);
        }
        
        tax = brackets[filingStatus][0] * rates[0];
        
        //Finds correct tax rate and bracket and gives the taxes 
        for(int i = 1; i < brackets[filingStatus].length; i++){
            if(taxableIncome > brackets[filingStatus][i]){
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i-1]
                        * rates[i]);
            }
            else{
                return Math.round(tax + (taxableIncome - brackets[filingStatus][i - 1])
                * rates[i]);
            }
        }
        return Math.round(tax + (taxableIncome - brackets[filingStatus][4] *
                rates[5]));
    }
}
