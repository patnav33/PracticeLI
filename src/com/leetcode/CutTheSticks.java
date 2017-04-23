package com.leetcode;

import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
		final int N = in.nextInt();
		
		// Add all the stick lengths to an array of size 1000 since no of elements can't be 
		// more than 1000 as per constraints. Other option would be to add it in a sorted list or map
		// but that will require O(nlogn) time complexity in most cases.
		final int[] sticks = new int[N];
		for(int i = 0; i < N; i++) {
			final int stickLen = in.nextInt();
			sticks[stickLen]++;
		}
		int[] result = cutSticks(sticks);
		for(int results: result)
			System.out.println(results);
		// Iterate over the sticks array and for each positive no of sticks, reduce the remaining sticks by that count.
//		int remainingSticks =N;
//		System.out.println(remainingSticks);
//		for(int i = 0; i <sticks.length; i++) {
//			if(sticks[i] > 0) {
//				remainingSticks -= sticks[i];
//				if(remainingSticks == 0) {
//					break;
//				}
//				System.out.println(remainingSticks);
//			}
//		}
//		
//		in.close();
	}

	static int[] cutSticks(int[] lengths) {
        int[] finalResult = new int[lengths.length];
        int count = 0;
        finalResult[count++] = lengths.length;
        int remainingSticks = lengths.length;
       for(int i = 0; i <lengths.length; i++) {
			if(lengths[i] > 0) {
				remainingSticks -= lengths[i];
				if(remainingSticks == 0) {
					break;
				}
				finalResult[count++] = remainingSticks;
			}
		}
        
        return finalResult;
    }

}
