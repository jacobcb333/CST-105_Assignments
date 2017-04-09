/*
(Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
Hint: To Compute fib(n) without recrusion, you need to obtain fib(n-2)
and fib(n-1) first. Let f0 and f1 denote the two previous Fibonacci numbers.
The current Fibonacci number would then be f0 + f1.
 */
package programming.exercises.pkgfor.week.pkg2;

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem18_2 {
    public static void main(String[] args){
        int currentFib = 1;
        
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the index: ");
        int n = input.nextInt();
        
        
        //Multiplies the currentFib by the previous Fib * the index
        if(n > 0){
            for(int i = 1; i <= n; i++){
                currentFib = currentFib * i;
            }
        }
        
        //Prints the number
        System.out.println("At the index of " + n + " the Fibonacci number is " +
                currentFib);
    }
}
