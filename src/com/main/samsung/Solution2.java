package com.main.samsung;

import java.util.Arrays;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] a = {1,5,3,3,7};
	System.out.println(solution(a));

	}
	
	public static boolean solution(int[] A){
		
		int count = 0;
		 final int MAX_VALUE = 2;
		if (A == null || A.length == 0)
			return false;
		else
		{
			int[] arrCopy = Arrays.copyOf(A, A.length);
			Arrays.sort(arrCopy);
			for (int i = 0; i < A.length; i++){
				if (arrCopy[i] != A[i])
					count++;
			}
			if (count > MAX_VALUE)
				return false;
			else
				return true;
		}

		}
	

}
