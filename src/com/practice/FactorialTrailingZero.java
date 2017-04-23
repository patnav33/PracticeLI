package com.practice;

import java.util.Scanner;

public class FactorialTrailingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number whose factorial is to be found:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int iterativeResult = iterativeFactorial(number);
		System.out.println("Factorial:"+ iterativeResult); 
		int resultZeros = trailingZeros(iterativeResult,number);
		System.out.println("No of Zeros:"+ resultZeros);
	}


	public static int iterativeFactorial(int number){
		if( number > 1){
		return number*(iterativeFactorial(number - 1));
		}
		if( number == 1 || number <= 0){
		return 1;
		}
		return number;
	}
	
	public static int trailingZeros(int result,int number){
		int total = 0;
		int temp = 0;
		if( number >= 5){
//		temp = result%10; 
//		result = result/10;
			while(temp == 0){
			temp = result%10;
			result = result/10;			//Logic similar to Reverse number  just the zero condition
			 if( temp == 0){
			 total++;
			 }
			 
			
		 }
		}
		else{
			return 0;
		}
		
	 return total;
	}
}
