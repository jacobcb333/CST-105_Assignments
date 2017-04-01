import java.util.*;

/*
 * (The Stock class) Following the example of the Circle class in Section 9.2, design a class
 * named Stock that contains:
 * 
 * *A string data field name symbol for the sock's symbol
 * *A string data field named name for the stock's name
 * *A double data field named previousClosingPrice that stores the stock price for the previous
 * day.
 * *A double data field named currentPrice that stores the stock price for the current time.
 * *A constructor that creates a stock with the specified symbol name.
 * *A method named getChangePercent() that returns the percentage changed from
 * previousClosingPrice to currentPrice.
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test program
 * that creates a Stock object with the stock symbol ORCL, the name Oracle Corporation, and
 * the previous closing price of 34.5. Set a new current price to 45.35 and display the price-
 * change percentage.
 */

public class Problem9_2 {
	public static void main(String[] args){
		//Creates a stock object with stock symbol ORCL
		Stock ORCL = new Stock();
		ORCL.name = "Oracle Corporation";
		ORCL.symbol = "ORCL";
		
		System.out.println("The stock name is: " + ORCL.name + ", and it's symbol is " +
				ORCL.symbol + ".");
		
		//Pushes ORCL.previousClosingPrice and ORCL.currentPrice value to the variable 
		//within the instance class
		ORCL.previousClosingPrice = 34.5;
		ORCL.currentPrice = 45.35;
		
		System.out.println("With a previous closing price of " + ORCL.previousClosingPrice +
				" and a current price of " + ORCL.currentPrice + ":");
		System.out.println("The price-change percentage is " + ORCL.getChangePercent() + ".");
		
	}
}


//Creates a class named Stock
class Stock{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(){
	}
	
	Stock(String newStock){
		name = newStock;
	}
	
	//Calculates change percentage
	double getChangePercent(){
		double result = ((previousClosingPrice - currentPrice) / currentPrice) * 100;
		if(result < 0){
			return Math.abs(((previousClosingPrice - currentPrice) / currentPrice) * 100);
		}
		else{
			return ((previousClosingPrice - currentPrice) / currentPrice) * 100;
		}
	}
}
