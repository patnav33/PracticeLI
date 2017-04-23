package com.main.samsung;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(147));
	}
	
	public static int solution(int N){
		
		if( N <= 0 )
			return 0;
		String input = new Integer(N).toString();
		
		char[] inputArray = input.toCharArray();
		Arrays.sort(inputArray);
		
		String inputAfterSort = new String(inputArray);
		inputAfterSort = new StringBuilder(inputAfterSort).reverse().toString();
		
		int result = Integer.parseInt(inputAfterSort); 
		
		return result;
		
	}
}
