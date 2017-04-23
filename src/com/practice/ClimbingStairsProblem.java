package com.practice;

/**
 * @author navinkumarpatil
 * 
 There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.


Input: n = 1
Output: 1
There is only one way to climb 1 stair

Input: n = 2
Output: 2
There are two ways: (1, 1) and (2)

Input: n = 4
Output: 5
(1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2)
 *
 */
public class ClimbingStairsProblem {

	 public static void main(String args[]){
	        
	        int n = 6;
	        int result = climbingStairs1(n);
	        System.out.println(result);
	        int result2 = countWays(3);
	        System.out.println(result2);
	 
	    }
	    
	    public static int climbingStairs1(int n){
	        
	        if(n <= 1)    
	            return n;
	        
	        int last = 1;
	        int previousOfLast =1;
	        int present = 0;
	        for( int i= 2 ; i<= n; i++){
	            
	            present = last + previousOfLast;
	            previousOfLast = last;
	            last = present;
	        }
	        return present;
	    }
	    
	    public static int climbingStairs2(int n){
	    	if(n <= 1)    
	    		return n;
			
	    	return (climbingStairs2(n-1)+climbingStairs2(n-2));  	
	    }
	    
	    public static int countWays(int s){
	       return climbingStairs2(s+1);
	    
	    }

}
