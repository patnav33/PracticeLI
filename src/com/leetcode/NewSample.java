package com.leetcode;

public class NewSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 630;
		int result = 0;
		while( num > 0){
			num = num % 10;
			if( num == 0 || num == 6)
				result = result + 1;
			if( num == 3 )
				result = result + 0;
			if( num == 8){
				result = result + 2;
			}
			num = num /10;
		}
		System.out.println(result);
	}

}
