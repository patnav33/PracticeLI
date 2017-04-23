package com.leetcode;

public class RotateImage90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = new int[3][3];
		input[0][0] = 1;
		input[0][1] = 2;
		input[0][2] = 3;
		input[1][0] = 4;
		input[1][1] = 5;
		input[1][2] = 6;
		input[2][0] = 7;
		input[2][1] = 8;
		input[2][2] = 9;
		System.out.println("Before Rotation");
		for(int i = 0 ; i < input.length ;i++){
			for(int j = 0 ; j < input.length; j++ ){
				System.out.print(input[i][j]);	
			}
			System.out.println();
		}
		int[][] result = rotateInPlace(input);
		
		System.out.println("After Rotation");
		for(int i = 0 ; i < input.length ;i++){
			for(int j = 0 ; j < input.length; j++ ){
				System.out.print(result[i][j]);	
			}
			System.out.println();
		}
	}
	
	public static int[][] rotateWithExtraSpace(int[][] matrix){
		
		if(matrix == null || matrix.length == 0)
			return null;
		
		int n = matrix.length;
		int[][] temp = new int[n][n];
		for(int i = 0 ; i < n ;i++){
			for(int j = 0 ; j < n; j++ ){
				temp[j][n-i-1] = matrix[i][j];	// (0,0) -> (0,2) ,(0,1) -> (1,2)
			}
		}
		
		for(int i = 0 ; i < n ;i++){
			for(int j = 0 ; j < n; j++ ){
				matrix[i][j]= temp[i][j];
			}
		}
		return matrix;		
	}
	
	public static int[][] rotateInPlace(int[][] matrix){
		
		if(matrix == null || matrix.length == 0)
			return null;
		
	    int n = matrix.length;

	    for(int i = 0 ; i< n;i++){
	    	for(int j = i+ 1; j< n;j++){	//jth condition important
	    		int temp = matrix[i][j];
	    		matrix[i][j] = matrix[j][i];
	    		matrix[j][i] = temp;
	    	}
	    }
		
	    int mid = n / 2;
	    for(int i =0 ; i< n;i++){
	    	for(int j =0; j< mid ; j++){
	    		int temp = matrix[i][j];
	    		matrix[i][j] = matrix[i][n-j-1];
	    		matrix[i][n-j-1] = temp;
	    	}
	    }
		
		return matrix;
	}
	
	
}
