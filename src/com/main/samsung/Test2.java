package com.main.samsung;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrange(647)); 
	} 

	public static int arrange(int number) { 

	String str1 = new Integer(number).toString(); 

	char[] numbers = str1.toCharArray(); 
	Arrays.sort(numbers); 

	String str2 = new String(numbers); 
	str2 = new StringBuilder(str2).reverse().toString(); 

	int x = Integer.parseInt(str2); 

	return (x); 
	} 
	

}
