package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] a= {1,2,2,3,3,3};
		int[] count = removeDuplicate(a);
		for(int i : count)
			System.out.println(i);
		System.out.println(count.length);
		
		int[] count2 = RemoveUsingHashSet(a);
		for(int i : count2)
			System.out.println(i);
		System.out.println(count2.length);
	}
	
	public static int[] removeDuplicate(int[] a){
		if(a.length < 2){
				return a;
		}
		int j =0;
		int i =1;
		
		while(i < a.length){
			if(a[i] == a[j]){
				i++;
			}else{
				j++;
				a[j] = a[i];
				i++;
				
			}
			
		}
		
		int[] B = Arrays.copyOf(a, j + 1);
		 
		return B;
	}
	
	public static int[] RemoveUsingHashSet(int[] a){
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i =0 ;i < a.length;i++)
			set.add(a[i]);
		
		int[] result = new int[set.size()];
	    int i = 0;
	    for (int u : set) {
	        result[i++] = u;
	    }
	    return result;
	}

}
