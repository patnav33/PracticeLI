package com.practice;

/**
 * @author navinkumarpatil
 *
 Print prime numbers for a given range using all the methods
 
 I : 5- 29
 O : 5,7,11,13,17,19,23,29
 *
 */
public class PrimeNoRange{

    public static void main(String args[]){
        
        int low = 5;
        int high = 29;
        
        for(int i =low ; i<= high ; i++){
            
          int result =  primeOrNot(i);
          if(result != 0){
              System.out.println(result);
          }
        }
        
        for(int i =low ; i<= high ; i++){
            
            int result2 =  isPrimeOrNot1(i);
            if(result2!=0){
                System.out.println(result2);
            }
          }
        
		for (int i = low; i <= high; i++) {

			boolean result3 = isPrimeOrNot2(i);
			if (result3) {
				System.out.println(result3);
			}
		}
    }
    
    
    public static int primeOrNot(int number){
        
        if( number <= 1)
            return 0;
            
        for(int i =2; i< number; i++){
            
            if(number % i == 0){
                return 0;
            }
        }
        return number;
    }
    
	public static int isPrimeOrNot1(int input) {

		for (int i = 2; 2 * i < input; i++) {
			if (input % i == 0)
				return 0;
		}

		return input;
	}

	public static boolean isPrimeOrNot2(int input) {

		if (input % 2 == 0)							//Check for even values only
			return false;
		for (int i = 3; i * i <= input; i += 2) {	//Check for only odd values
			if (input % i == 0)
				return false;
		}

		return true;
	}
    
}