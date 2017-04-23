package com.main.inkling;

import java.util.AayList;
import java.util.Aays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {

	public static void main(String args[]){
		
		int a[] ={3,5,6,3,3,5};
		for(int i = 0 ;i< a.length;i++)
		printPairsUsingSet(a,6);
//		Syst
//		sol(a,6);
	}
	
	public static void printPairsUsingSet(int[] numbers, int n){ 
		
		if(numbers.length < 2){ 
			return; 
		}
		Arrays.sort(numbers);
		int counter= 0;
		Set set = new HashSet(numbers.length);
		for(int value : numbers){ 
			int target =  n - value; // if target number is not in set then add
			if(!set.contains(target)){ 
				set.add(value); 
			}else {
				counter++;
				System.out.printf("(%d, %d) %n", value, target); 
			}
		} 
	}
	
//	public static int countPairsWithDiffK(int arr[], int n, int k)
//	{
//	    int count = 0;
//	    sort(arr, arr + n);  // Sort array elements
//	 
//	    int l = 0;
//	    int r = 0;
//	    while(r < n)
//	    {
//	         if(arr[r] - arr[l] == k)
//	        {
//	              count++;
//	              l++;
//	              r++;
//	        }
//	         else if(arr[r] - arr[l] > k)
//	              l++;
//	         else // arr[r] - arr[l] < sum
//	              r++;
//	    }   
//	    return count;
//	}
	
	
//	int binarySearch(int arr[], int low, int high, int x)
//	{
//	    if (high >= low)
//	    {
//	        int mid = low + (high - low)/2;
//	        if (x == arr[mid])
//	            return mid;
//	        if (x > arr[mid])
//	            return binarySearch(arr, (mid + 1), high, x);
//	        else
//	            return binarySearch(arr, low, (mid -1), x);
//	    }
//	    return -1;
//	}
//
//	/* Returns count of pairs with difference k in arr[] of size n. */
//	int countPairsWithDiffK(int arr[], int n, int k)
//	{
//	    int count = 0, i;
//	    sort(arr, arr+n);  // Sort array elements
//
//	    /* code to remove duplicates from arr[] */
//	  
//	    // Pick a first element point
//	    for (i = 0; i < n-1; i++)
//	        if (binarySearch(arr, i+1, n-1, arr[i] + k) != -1)
//	            count++;
//
//	    return count;
//	}
// 
	public static void sol(int[] a,int sum){
		if(a == null || a.length < 2){
			return ;
		}
		
		int left = 0;
		int right = a.length - 1;
		java.util.Arrays.sort(a);
		while(left < right){
			int i = a[left];
			int j = a[right];
			if(i+j == sum){
				System.out.println("The pair is "+i+" and "+j);
				left++;
				right--;
			}else if(i+j > sum){
				right--;
			}else{
				left++;
			}
		}
		
		
		
	}
	
	

}