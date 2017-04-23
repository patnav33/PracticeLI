package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author navin
 *  
 *
 *
 */
public class BestMeetingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] input = new int[3][5];
		input[0][0] = 1;
		input[0][1] = 0;
		input[0][2] = 0;
		input[0][3] = 0;
		input[0][4] = 1;
		input[1][0] = 0;
		input[1][1] = 0;
		input[1][2] = 0;
		input[1][3] = 0;
		input[1][4] = 0;
		input[2][0] = 0;
		input[2][1] = 0;
		input[2][2] = 1;
		input[2][3] = 0;
		input[2][4] = 0;
		int result = minTotalDistance(input);
		System.out.println(result);
	}
	
	public static int minTotalDistance(int[][] grid){

		int m = grid.length;
		int n = grid[0].length;

		ArrayList<Integer> rows = new ArrayList<Integer>();
		ArrayList<Integer> cols = new ArrayList<Integer>();

		for(int i =0; i < m; i++){
			for(int j = 0 ; j< n; j++){
			 if( grid[i][j] == 1)	{
				rows.add(i);						// rows : 0,0,2
				cols.add(j);						// cols : 0,4,2
			  }
			}
		}

		int sum = 0;
		for(Integer i : rows)
		  sum += Math.abs(i - rows.get(rows.size()/2));		// 1) 0 - 0 -> 0 2)  0 - 0  -> 0 3) 2 - 0 -> 2 --> total 2

		Collections.sort(cols);

		for(Integer i : cols)								// 4,2,0
		 sum += Math.abs(i - cols.get(cols.size()/2));		// 1) 4 - 2 -> 2 2) 2 - 2 -> 0 3) 0 - 2 -> 2   --> total 4


		return sum;
	}
}
