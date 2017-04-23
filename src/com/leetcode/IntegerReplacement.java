package com.leetcode;

/**
 * @author navinkumarpatil
 * 
Given a positive integer n and you can do operations as follow:

If n is even, replace n with n/2.
If n is odd, you can replace n with either n + 1 or n - 1.
What is the minimum number of replacements needed for n to become 1?
 
Example 1:

Input:
8

Output:
3

Explanation:
8 -> 4 -> 2 -> 1
Example 2:

Input:
7

Output:
4

Explanation:
7 -> 8 -> 4 -> 2 -> 1
or
7 -> 6 -> 3 -> 2 -> 1
 
 * 
 *
 */
public class IntegerReplacement{

    
    public static void main(String args[]){
        
        int n = 7;
        System.out.println(replacement(n)); 
        
    }
    
    public static int replacement(int n){
        
        int count = 0;
        if(n <= 0) 
            return 0;
        
        if( n == 1)
            return 1;
            
        while( n > 1){
        
         if( n % 2 != 0){
                n = n - 1;   
                count++;
           }
            n = n / 2;
            count ++;
        }
        
        return count;
    }

}