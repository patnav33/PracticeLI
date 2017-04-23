package com.main.linkedin;

public class Round2 {
	
	
	/*Write a program that takes an integer and prints out all ways to multiply smaller integers that equal the original number, without repeating sets of factors. In other words, if your output contains 4 * 3, you should not print out 3 * 4 again as that would be a repeating set. Note that this is not asking for prime factorization only. Also, you can assume that the input integers are reasonable in size; correctness is more important than efficiency.


	PrintFactors(12)
	12 * 1
	6 * 2
	4 * 3
	3 * 2 * 2
	PrintFactors(32)
	32 * 1
	16 * 2
	8 * 4
	8 * 2 * 2
	4 * 4 * 2
	4 * 2 * 2 * 2
	2 * 2 * 2 * 2 * 2
	PrintFactors (96)
	96 * 1
	48 * 2
	32 * 3
	24 * 4
	24 * 2 * 2
	16 * 6
	16 * 3 * 2
	12 * 8
	12 * 4 * 2
	12 * 2 * 2 * 2
	8 * 6 * 2
	8 * 4 * 3
	8 * 3 * 2 * 2
	6 * 4 * 4
	6 * 4 * 2 * 2
	6 * 2 * 2 * 2 * 2
	4 * 4 * 3 * 2
	4 * 3 * 2 * 2 * 2
	3 * 2 * 2 * 2 * 2 * 2

	*/


	public class Solution{
	    
	    public void printFacotrsList(int dividend ,String factorString){
	        
	        for(int divisor = dividend/2; divisor>=2 ; divisor --){    // divisor = 32/2 -> 16     // 4/2 ->
	            
	            if(dividend % divisor != 0)                //  32 % 16    //32 %15 
	                continue;
	                
	            if(divisor > dividend)
	                continue;
	                
	             int quotient = dividend/ divisor;        // 32/ 16- > 2
	             
	             if( quotient<= divisor)                    //    2 <= 16            // 4<=8 
	             {
	             
	                 System.out.println(factorString+divisor+"*"+ quotient);    // ""+16*2- > 16 *2    // 8*4
	             }
	              
	              // 16
	              //15//14...8
	                              
	              
	           printFacotrsList(quotient,factorString+divisor+"*"+divisor);        // 2,16*2,16
	        }
	    
	    }
	    
	    public void printFactor(int number){
	        
	        if(number <= 1)         //Edge Case
	            return;
	        
	        System.out.println(number+"* 1 ");        // 32*1;
	        printFacotrsList(number,"");    //32,"",32
	       
	        
	    }

	}



	// 32*1 
	//16*2 -> q->2 divisor ->16 fac -line 58
	// dividend -> 2  -> exit for loop 
	//line 65
	//dividend -> 16 
	// divisor -> 8

	// input number  0 then it would not provide any factors
	//if input number is - ve number then  would not provide any factors
	// large number ->  performance 
	// if number 1  it would factorize further
	




}
