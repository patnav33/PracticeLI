package com.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author navinkumarpatil
 * 
 *         Reverse digits of an integer. Example1: x = 123, return 321 Example2:
 *         x = -123, return -321
 * 
 *         Handle the overflow condition
 *
 */
public class ReverseInteger {

	public static void main(String args[]) {

		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		int result = reverseNumber(inputNumber);
		System.out.println("The Result is :" + result);

	}

	public static int reverseNumber(int input) {

		int total = 0;
		while (input != 0) {
			total = total * 10 + input % 10;
			input = input / 10;
		}
		// Overflow handle condition
		if (total > Integer.MAX_VALUE || total < Integer.MIN_VALUE) {
			throw new InputMismatchException("This is not an integer");
		}
		return total;
	}

}
