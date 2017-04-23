package com.practice;

/**
 * @author navinkumarpatil
 *
 
Sum of numbers in a Random String

"abc4nbn5"  -->9
"dFD$23+++12@#T1234.,/..,10" -->1279(23+12+1234+10)
"1a2b3c" --> 1+2+3= 6
"123ab!45c" --> 168
"abcdef" -->	0
"0123.4" -->(0123+4) = 127


 *
 */
public class SumOfNumbersFromRandomString {
	
public static void main(String args[]){
        
        String  s = "abc4nbn5";
        String s1 = "dFD$23+++12@#T1234.,/..,10";
        String s2 = "1a2b3c"; 
        String s3 = "123ab!-45c";
        String s4 = "abcdef";
        String s5 = "0123.4";
        long result = sumOfNumbers(s3);
        System.out.println(result);
        
        
    }
    
    public static long sumOfNumbers(String str){
    	
    	long result =0;
    	int i = 0;
    	int length = str.length();
    	boolean negative = false;
    	long temp = 0;
    	while(i < length){
    		char sign = str.charAt(i);
    		
    		if( sign == '-'){
    			negative = true;
    			i++;
    		}
    		
    		while(i < length && Character.isDigit(str.charAt(i))){
    		
    			temp = temp *10;
    			temp += str.charAt(i) - '0';
    			i++;
    		}
    		
    		if(negative){
    			temp = - temp;
    		}
    		
    		result += temp;
    		
    		//Initiliaze all the variables again
    		temp=0;
    		negative= false;
    		
    		i++;
    		
    	}
		return result;
    }
}
