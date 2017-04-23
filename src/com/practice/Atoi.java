package com.practice;

public class Atoi {

	public static void main(String[] args){
		
		System.out.println(getValue( ".1222"));
		System.out.println(getValue( "12.00"));
		System.out.println(getValue( "12.0"));
		System.out.println(getValue( "+12.0"));
		System.out.println(getValue( "+12"));
		System.out.println(getValue( "+12."));
		System.out.println(getValue( "12.1212"));
		System.out.println(getValue( "-12.1212"));
		System.out.println(getValue( "-12.1212"));
		System.out.println(getValue( "-12.1212,12"));
	}
	
	
	public static double getValue(String str){
	    
	    if(str == null || str.isEmpty())
	        return -1;
	        
	    str = str.trim();
	    boolean isNegative = false;
	    int i=0;
	    if(str.charAt(0) == '-'){
	        isNegative = true;
	        i++;
	    }
	    else if(str.charAt(0) == '+'){
	       i++; 
	    }
	    
	    double sum =0.0, decimalSum = 0.0;
	    boolean isDecimal = false;
	    double divisor = 1;
	    for(;i< str.length();i++){
	        
	       char c = str.charAt(i);
	       
	       if(c == '.' && !isDecimal){
	           isDecimal = true;
	       }else if(Character.isDigit(c) && !isDecimal){
	           sum =(sum * 10) + (c - '0');
	       }else if(Character.isDigit(c) && isDecimal){
	           decimalSum = (decimalSum * 10) + (c - '0');
	           divisor = divisor * 10;
	       }else{
	           throw new NumberFormatException("String is malformed. String:");
	       }
	         
	    }
	    
	    decimalSum = (decimalSum / divisor);
	    sum = sum + decimalSum;
	    if(isNegative){
	        sum = 0 - sum;
	    }
	        
	   return sum;
	}
}
