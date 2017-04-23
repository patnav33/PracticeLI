package com.practice;


public class PowerProblem{
 
    
    public static void main(String args[]){
        
        double x = 3.0;
//        int n = -2147483648;
        int n = 3;
        double value = pow(x,n);
        System.out.println(value);
        
    }
    
    //Logic works for positive as well as negative numbers
    //complexity is (logn n)
    
    public static double pow( double x , int n){
        
    	if(x == 0){
    		return 0;
    	}
    	
        if( n== 0)
            return 1;
        
        if( n < 0){
            x = 1.0 / x ;
            n = - n;
        }
        
       
        
        double value = pow( x , n/2);
        value *= value; 
        
        if(n %2 != 0){
            value = value * x;
        }
        
        return value;
    }
}