package com.practice;

public class Decimal2Binary {

	public static void main(String args[]) {

		int input = 12;
		String result = decimalToBinary(input);
		System.out.println(result);
	}

	public static String decimalToBinary(int input) {

		if (input <= 0) // ***** Requires to handle negative condition 
			return "0";

		String output = "";

		while (input > 0) {

			int remainder = input % 2;
 
			output = remainder + output; // Check this condition remainder comes
											// first

			input = input / 2;

		}

		return output;
	}

}