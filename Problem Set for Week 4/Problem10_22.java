/*
(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new class
MyString1):
 */

/**
 *
 * @author jacobbushdiecker
 */
public class Problem10_22 {
    public static void main(String[] args){
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        char[] test = {'H', 'e', 'e', 'l', 'o'};
        
        //Prints a string with the int values
        MyString1 num = MyString1.valueOf(1324563);
        
        System.out.println(num.getChars());
        
        //Creates an s object of the class MyString1
        MyString1 s = new MyString1(chars);
        MyString1 s1 = new MyString1(test);
        
        
        //Test cases
        System.out.println(s.length()); //Shows length
        System.out.println(s.charAt(0)); //Shows char at index
        System.out.println(s.toLowerCase().getChars()); //Prints char array in lower case
        System.out.println(s.substring(0, 2).getChars());//Prints substring
        if(s.compare(s1) == 0){//Prints true or false based off compare
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}

class MyString1{
    //declares for the class to use
    char[] chars;
    
    //getter for chars
    public char[] getChars(){
        return chars;
    }
    
    //constructor that sets chars equal to the array of chars
    public MyString1(char[] chars){
        this.chars = chars;
    }
    
    //Will find the char at the given index
    public char charAt(int index){
        return chars[index];
    }
    
    //Will return the length of the array of chars
    public int length(){
        return chars.length;
    }
    
    //Will print the substring of the char of arrays
    public MyString1 substring(int begin, int end){
        char[] temp = new char[1+(end - begin)];
        for(int i = begin; i <= end; i++){
            temp[i-begin] = chars[i];
        }
        
        return new MyString1(temp);
    }
    
    //will return an instance of the class with a new char of arrays that will all be lower case
    public MyString1 toLowerCase(){
        char[] temp = new char[chars.length];
        for(int i = 0; i < chars.length; i++){
            if(chars[i] >= 'A' && chars[i] <= 'Z'){
                temp[i] = (char)(chars[i] + 32);
            }
            else{
                temp[i] = chars[i];
            }
            
        }
        return new MyString1(temp);
    }
    
    //Will determine if two strings are equal
    public boolean equals(MyString1 s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != chars[i]){
                return false;
            }
        }
        
        return true;
    }
    
    //Will print a char of arrays representing an integer
    public static MyString1 valueOf(int i){
        int length = getCount(i);
        char[] number = new char[length];
        for(int j = length -1; j >= 0; j--){
            number[j] = (char)('0' + (i % 10));
            i /= 10;
        }
        return new MyString1(number);
    }
    
    //Used to assist valueOf method
    public static int getCount(long i){
        int length = 0;
        while(i > 0){
            i /= 10;
            length++;
        }
        return length++;
    }
    
    
    public int compare(String s){
        int limit = Math.min(s.length(), length());
        
        char[] chArray = s.toCharArray();
        int i = 0;
        while(i < limit){
            char ch1 = charAt(i);
            char ch2 = chArray[i];
            if(ch1 != ch2){
                return ch1-ch2;
            }
            i++;
        }
        return length() - s.length();
    }
    
    public int compare(MyString1 s){
        return compare(new String(s.getChars()));
    }
    
    
}
