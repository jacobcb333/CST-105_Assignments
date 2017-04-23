/*
(Algebra: perfect square) Write a program that prompts the user to enter an integer
m and find the smalled integer n such that m * n is a perfect square. (Hint:
Store all smallest factors of m into an array list. n is the product of the factors
that appear an odd number of times in the array list For example, consider m = 90,
store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
in the array list. So, n is 10.)
 */
package Problem14;

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem11_17{
    public static void main(String[] args){
        //Create scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        
        //Create Arraylist factors of type int
        ArrayList<Integer> factors = new ArrayList<>();
        
        getFactors(m, factors);
        
        int smallestSquare = smallestSquare(factors);
        System.out.println("The smallest number n for m * n to be a perfect "
                + "square is " + smallestSquare);
        System.out.println("m * n = " + (m * smallestSquare));
    }

    private static int smallestSquare(ArrayList<Integer> factors){
        //Creates a 2d array occurences of type int using values from factors
        int[][] occurrences = copy(factors);
        
        //checks for offurces of i
        for (int i : factors){
            search(occurrences, i);
        }

        //remove duplicates and get odd sequence factors
        ArrayList<Integer> oddSequenceFactors = removeDuplicates(occurrences);
        
        //get smallest square by multiplying oddSequenceFactors
        int smallestSquare = 1;
        for (int i : oddSequenceFactors){
            smallestSquare *= i;
        }
        return smallestSquare;
    }

    private static ArrayList<Integer> removeDuplicates(int[][] m){
        //Create arraylist temp of type int
        ArrayList<Integer> temp = new ArrayList<>();
        
        //checks for duplicates
        for (int i = 0; i < m.length; i++){
            if (m[i][1] % 2 != 0){
                temp.add(m[i][0]);
            }
        }
        
        //removes duplicates
        ArrayList<Integer> duplicateRemoved = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++){
            
            if (!duplicateRemoved.contains(temp.get(i))){
                duplicateRemoved.add(temp.get(i));
            }
        }
        
        return duplicateRemoved;
    }

    private static void search(int[][] m, int number){
        for (int i = 0; i < m.length; i++){
            if (m[i][0] == number){
                m[i][1]++;
            }
        }
    }
    
    private static int[][] copy(ArrayList<Integer> factors){
        int[][] temp = new int[factors.size()][2];
        
        for (int i = 0; i < temp.length; i++){
            temp[i][0] = factors.get(i);
        }
        return temp;
    }

    private static void getFactors(int m, ArrayList<Integer> factors){
        int count = 2;
        while (count <= m){
            if (m % count == 0){
                factors.add(count);
                m /= count;
            } else{
                count++;
            }
        }
    }
}
