package com.practice.bloomberg;

import java.util.Scanner;

public class RemoveArbitarySpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s.length());
		System.out.println(s.trim().length());
	}

}
