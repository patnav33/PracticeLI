package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PrintFactors{
    
    public static void main(String args[]){
        
        printFactors(32);
        
    }
    
    
    public static void printFactors(int numbers){
        if( numbers < 0)
            throw new IllegalArgumentException("The number is less than required");
            
        System.out.println( numbers +"* 1");
        printFactorsList(numbers , "");
        
        Set<Integer> numberList1 = new HashSet<Integer>();
        List<Integer> numberList2 = new ArrayList<Integer>();

		System.out.println(" Factors of" + numbers + " are:");
		for (int number : numberList2) {
			System.out.println(number);
		}
		
		
		// Logic for Printing the factors of a number only
		
		System.out.println("Enter the number(for factorization) :");
		Scanner sc3 = new Scanner(System.in);
		int input2 = sc3.nextInt();
		for (int i = 1; i <= (Math.sqrt(input2)); i++) {    //  2 to  sqrt n
			if ((input2 % i) == 0) {
				numberList1.add(i);
				if( input2 != (Math.sqrt(input2)) ){
					numberList1.add(input2/i);
				}
			}
		}
		
		
		for (int number : numberList1) {
			System.out.println(number);
		}
		System.out.println("End");
    }
    
    public static void printFactorsList(int dividend ,String factorString){
        
        for( int divisor = dividend/2; divisor >= 2 ; divisor --)
        {
        
            if( dividend % divisor != 0)
                   continue;
                   
            if( divisor > dividend)
                continue;
             
             int quotient = dividend / divisor;
             
             if( quotient <= divisor ){
                 System.out.println(factorString + divisor +"*"+quotient );  
             }
             printFactorsList(quotient,factorString + divisor +"*");
        
        }
        
            
    }
    
}