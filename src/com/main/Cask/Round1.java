package com.main.Cask;

public class Round1 {
//		
//	Given an array of integers A of size N > 1, produce an output array B of size N with B[i] = A[1]*A[2]…*A[i – 1]*A[i + 1]…*A[N], that is multiplies all elements in A except A[i] itself.
//
//			Input:   3,  2,  4,  5
//			Output: 40, 60, 30, 24
//
//
//			public class Solution{
//
//			    
//			    public int[] getproduct(int[] inputArray){
//			        
//			        
//			        int arrayLength = inputArray.length;    //4
//			        int temp = 1;                        //temp variable
//			         
//			        int prod[] = new int[arrayLength];    //
//			         
//			         for( int i =0;i< arrayLength;i++){
//			             
//			             prod[i] = temp;                // temp -1     ,temp ->3,
//			             temp = temp * inputArray[i];    // 1* 3 -> 3    
//			             
//			         }
//			         
////			         prod = 1, 3, 6, 24
//			        // prod[i] = mul(0, i)
//			         
//			         
//			         temp = 1;                //reinitialize 
//			         
//			         for( int i= n-1; i>=0;i --){
//			             
//			             prod[i] = prod[i] * temp;    // 24 *1 -> 24(3,2,4)    ... 6 *5  -> 30 
//			                 
//			             temp  = temp *inputArray[i]; // 1*5    ... 
//			         
//			         }
//			         
//			        
//			        return prod;
//			    
//			    }
//
//			}
}
