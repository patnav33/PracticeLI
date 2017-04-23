package com.practice;

public class FindRepeatedNumberFrom1To50 {
	
	public static void main(String args[]){
		
		int[] a= {1,2,3,4,5,6,7,8,8,9,10};
		int total =0;
		int max = a[a.length-1];
		int length = a.length;
		for( int i=0; i< length ;i++){
			total += a[i];
			
		}
		int total2 = (max *(max+1))/2;
		
		int result = total - total2;
		System.out.println(result);
		
	}
}
