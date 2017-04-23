package com.practice;

import java.util.Scanner;

/**
 * @author navinkumarpatil
 * 
 *  Factorial Iterative and Recursive
 *
 */
public class FactorialItertiveAndRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number whose factorial is to be found:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int result = factorial(number);
		System.out.println("Factorial:"+result);
		int iterativeResult = recursiveFactorial(number);
		System.out.println("Factorial:"+ iterativeResult);
	}

	public static int factorial(int number){
		int total = 1;
		if( number <=0 || number ==1){
			return 1;
		}
		while(number > 1){
		 total *= number ;
		 number --;
		}
		return total;
	}

	public static int recursiveFactorial(int number){
		if( number > 1){
		return number*(recursiveFactorial(number - 1));
		}
		if( number == 1 || number <= 0){
		return 1;
		}
		return number;
	}
}