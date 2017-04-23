package com.leetcode;

/**
 * @author navin
 
 Given an array of integers, every element 
 appears twice except for one. Find that single one.
 
 *
 */
public class SingleNumber136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4,5,4};
		int result = singleNumber(A,A.length);
		System.out.println(result);
	}
	
	public static int singleNumber(int[] A, int n){
		int target = A[0];
		for(int i =0;i < n; i++){
			target = target ^ A[i];
		}
		return target;
	}
}	
