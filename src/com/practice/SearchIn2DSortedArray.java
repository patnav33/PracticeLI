package com.practice;

public class SearchIn2DSortedArray {
	
	
	
	public static void main(String args[]){
		
		int[][] input = new int[3][4];
		input[0][0] = 1;
		input[0][1] = 3;
		input[0][2] = 5;
		input[0][3] = 7;
		input[1][0] = 10;
		input[1][1] = 11;
		input[1][2] = 16;
		input[1][3] = 20;
		input[2][0] = 23;
		input[2][1] = 30;
		input[2][2] = 34;
		input[2][3] = 50;
		
		int target = 16;
		int[] result = SearchIn2d(input,target);
		for(int a: result)
		System.out.println(a);
		
	}
	
	public static int[] SearchIn2d(int[][] input ,int target){
		
		int rows = input.length;
		int cols = input[0].length;
		int[] result = new int[2];
		int low = 0;
		int high = rows * cols - 1 ;
		int mid;
		while(low <= high){
				mid = (low+high)/2;
				int mid_rows = mid /cols;
				int mid_cols = mid % cols;
				
				int mid_num = input[mid_rows][mid_cols];
				
				if( mid_num < target ){
					low = mid + 1;
				}
				
				else if( mid_num > target ){
					high = mid - 1;
				}
				else{
					result[0] = mid_rows;
					result[1] = mid_cols;
					return result;
				}
		}
		
		return null;
	}
}
