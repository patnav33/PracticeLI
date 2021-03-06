package com.leetcode;

/**
 * @author navin
 * 
Write an efficient algorithm that searches for a value in an m x n matrix.
 This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

For example, consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.


Time Complexity: O(m + n)



 *
 */
public class Search2DMatrixII240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}

	public static boolean searchMatrix(int[][] matrix, int target){
		
		if(matrix == null || matrix.length == 0)
			return false;
		
		int rows = matrix.length - 1;
		int cols = matrix[0].length - 1;
		
		int i = rows;
		int j = 0;
		
		while(i >= 0 && j <= cols){
			if(target < matrix[i][j]){
				i--;
			}
			else if ( target > matrix[i][j]){
				j++;
			}
			else{
				return true;
			}
		}
		
		return false;
	}
}
