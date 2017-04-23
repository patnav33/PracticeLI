package com.practice;

import java.util.Random;

public class ShuffleAnArray {
	
	
	public static void main(String args[]){
		
		int a[] = {1,2,3,4,5};
		shuffle(a);
		for( int b: a){
			System.out.println(b);
		}
		
	}
	
	    public static void shuffle(int[] A) {
	    	
	    	if( A == null || A.length==0){
	    		return;
	    	}
	    	Random generator = new Random();
	    	for( int i=1; i < A.length; i++){
	    		int randomIndex = generator.nextInt(i);
	    		int temp = A[randomIndex];
	    		A[randomIndex] = A[i];
	    		A[i] = temp;
	    	}
	    }


}
