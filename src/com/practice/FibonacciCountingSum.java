package com.practice;

public class FibonacciCountingSum{

    public static void main(String args[]){
        
        int number= 5;
        
     int result =  fibonacciCount(number);
     System.out.println(result);
     System.out.println(fibonacciCount(6));
    }
    
    public static int fibonacciCount(int input){
        int sum = 0;
        if( input < 0)
        	return -1;
        for( int i = 0 ;i< input ;i++){
        	System.out.println(fibo(i));
         sum += fibo(i);
        }
        
      return sum;
    }
    
    public static int fibo(int input){
        
        if(input == 0)
            return 0;
            
        if(input == 1)
            return 1;
        
        return ( fibo(input - 1) + fibo(input - 2));
    }
    
    public static int fiboIterative(int n){
        
        int x =0 , y= 1, z = 1;
        for( int i= 0;i < n;i++){
            x = y;
            y = z;
            z = x + y;
        }
		return x;  
    }
}