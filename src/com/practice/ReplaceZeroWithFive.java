package com.practice;

/**
 * @author navinkumarpatil
 * 
Replace all ‘0’ with ‘5’ in an input Integer
Given a integer as a input and replace all the ‘0’ with ‘5’ in the integer.
Examples:
    102 - 152
    1020 - 1525 
 * 
 * 
 *
 */
public class ReplaceZeroWithFive{
    
    public static void main(String args[]){
        
        int n= 1050;
        int result = convert0To5(n);
        System.out.println(result);
        
    }
    
    public static int convert0To5Rec(int num){
    
    	if (num == 0)
            return 0;
     
        // Extraxt the last digit and change it if needed
        int digit = num % 10;
        if (digit == 0)
            digit = 5;
     
        // Convert remaining digits and append the last digit
        return convert0To5Rec(num/10) * 10 + digit;
    }
    
    public static int convert0To5(int num)
    {
        if (num == 0)
           return 5;
        else return  convert0To5Rec(num);
    }

}