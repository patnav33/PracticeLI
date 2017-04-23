package com.practice;

/**
 * @author navinkumarpatil
 * 
 
Given an array of n integers where n > 1, nums, 
return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].
  
 *
 */
public class SelfExcludingProduct{

    public static void main(String args[]){
        
        int[] a = {2, 6, 4, 8};
        getProductArray(a,a.length);
        
    }
    
    public static void getProductArray(int[] arr, int n){
    
    int temp = 1;
    int[] prod = new int[n];
        
        for( int i= 0 ; i< n;i++){
            prod[i] = temp;
            temp = temp * arr[i];
        }
        
         temp =1;
        
        for( int i= n-1; i>=0; i--){
            prod[i] = prod[i] * temp;
            temp = temp * arr[i];
            
        }
        
        for( int i =0;i<n ;i++){
            System.out.println( prod[i]+",");
        }
    }
    
}