package com.practice.bloomberg;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = 0;
		int i = number;
		int j;
		while (i != 0) {

			j = i / 10;
			i = i % 10;
			if (i == 0)
				i = 0;
			temp = temp * 10 + i;
			i = j;
		}
		System.out.println(temp);
		if (temp == number) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}

	}

}
