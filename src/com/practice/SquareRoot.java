package com.practice;

public class SquareRoot {

	 public static void main(String args[]){
	        
	        System.out.println(Sqroot(1));
	        System.out.println(Sqroot(16));
	        System.out.println("squareRoot(5): "+Sqroot(5));
			System.out.println("squareRoot(25): "+Sqroot(25));
			System.out.println("squareRoot(40): "+Sqroot(40));
	    }
	    
	    public static double Sqroot(int no){
	    
	        if( no <=0)
	            return 0;
	        
	        if( no == 1)
	            return 1;
	            
	        double high = no;
	        double low =0;
	        double precision = 0.00001;
	        double mid ,midsqr;
	        while( (high - low) > precision){
	            mid = (high + low )/2;
	            midsqr = mid * mid;
	            if( no == midsqr)
	                return mid;
	            else if( midsqr > no)
	                high = mid;
	            else if( midsqr < no)
	                low = mid;
	            
	        }
	        
	       return (low+high/2); 
	    }
}
