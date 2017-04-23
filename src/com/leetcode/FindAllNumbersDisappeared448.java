package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author navin
 * 
 Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 
Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
 
 *
 */
public class FindAllNumbersDisappeared448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> list = findalldisappearedNumbers(nums);
		System.out.println(""+list);
				
	}

	public static List<Integer> findalldisappearedNumbers(int[] nums){
		
		 for (int i = 0; i < nums.length; i++) {
	            nums[Math.abs(nums[i]) - 1] = -(Math.abs(nums[Math.abs(nums[i]) - 1]));
	        }
	        List<Integer> arrayList = new ArrayList<>();
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] > 0) {
	                arrayList.add(i + 1);
	            }
	        }
	        return arrayList;
	}
}
