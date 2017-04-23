package com.leetcode;

import java.util.HashSet;

/**
 * @author navinkumarpatil
 * 
 * Time Complexity : O(n) 
 * 
 Given an unsorted array of integers, find the length of the longest 
 consecutive elements sequence.
For example,
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
Your algorithm should run in O(n) complexity.

 *
 */
public class LongestConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  num = {100,4,200,1,3,2};
		System.out.println(longestConsecutive(num));
	}
	
	public static int longestConsecutive(int[] num){
		
		if( num.length == 0 || num.length == 1)
			return 0;
		
		HashSet<Integer> set = new HashSet<Integer>();
		int max = 1;
		for(int i : num)
			set.add(i);
		
		for(int i: num){
			int left = i - 1;
			int right = i + 1;
			int count = 1;
			
			while(set.contains(left)){
				count++;
				set.remove(left);
				left--;
			}
			
			while(set.contains(right)){
				count++;
				set.remove(right);
				left--;
			}
			max = Math.max(count,max);
		}
		
		
		return max;
	}

}
