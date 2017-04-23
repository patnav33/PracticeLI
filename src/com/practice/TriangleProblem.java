package com.practice;

import java.util.Arrays;

public class TriangleProblem {

	public static void main(String args[]){
        
//        int [] array = {1,2,3,4,5,6,7,8,9,10};
       int[] array =  {10, 5, 3, 7, 4, 1};
        
        getTriangleSides(array);
    }

	 public static int[] getTriangleSides(int[] array){
	        
	        int[] validSides = new int[array.length];
	         Arrays.sort(array);
	        
	        int length = array.length;
	        for(int k= length - 1; k >2 ;k--){
	            if( array[k-2] + array[k-1] > array[k] && array[k] + array[k-1] > array[k-2] && array[k-2] + array[k] > array[k-1] ){
	                validSides[0] = array[k-2];
	                validSides[1] = array[k-1];
	                validSides[2] = array[k];
	                System.out.println("a:" + validSides[0] + " b:" + validSides[1] + " c:" + validSides[2]);
	            }
	            
	        }
	        
	        return validSides;
	    }
	
}
