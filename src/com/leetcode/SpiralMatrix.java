package com.leetcode;

import java.util.ArrayList;

public class SpiralMatrix {

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
		
		ArrayList<Integer> result = spiralOrder(input);
		for(int i : result)
		 System.out.print(i);
	}
	
	public static ArrayList<Integer> spiralOrder(int[][] matrix){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if(matrix == null || matrix.length ==0)
			return result;
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		int row = 0;
		int col = 0;
		
		while( m > 0 && n > 0){
			
			if( m == 1){
				for( int i = 0; i< n; i++){
					result.add(matrix[row][col++]);
				}		
				break;
			}
			if( n ==1){
				for( int i = 0; i< m; i++){
					result.add(matrix[row++][col]);
				}		
				break;
			}
			//move right
			for(int i =0 ; i< n - 1; i++){
				result.add(matrix[row][col++]);
			}
			//move down
			for(int i =0 ; i< m - 1; i++){
				result.add(matrix[row++][col]);
			}
			//move left
			for(int i =0 ; i< n - 1; i++){
				result.add(matrix[row][col--]);
			}
			//move up
			for(int i =0 ; i< m - 1; i++){
				result.add(matrix[row--][col]);
			}
			
			row++;
			col++;
			m -= 2;
			n -= 2;
		}
		
		
		return result;
	}
	

}
