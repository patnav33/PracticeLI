package com.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

	// Time Complexity - n(log n)
	public int findKthLargest(int[] nums, int k) {
	    Arrays.sort(nums);
	    return nums[nums.length-k];
	}
	
	
	
	//Time Complexity - n(log (k))  Space Complexity - O(k) for storing top k numbers
	public int findKthLargestUsingMinHeap(int[] num, int k){
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		for( int i : num){
			q.offer(i);
			
			if( q.size() > k){
				q.poll();	
			}	
		}
		
		return q.peek();
	}
	
		    
	    public int findKLargest(int[] num, int k){
	        if( num.length == 0 || num == null) return -1;
	        
	        if( k <0) return -1;
	        
	        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
	        for(int i : num){
	            queue.offer(i);
	        }
	        int temp = 0;
	        while( k !=0 ){
	            
	            temp = queue.peek();
	            queue.poll();
	            k--;
	        }
	        
	        return temp;
	    }

}
