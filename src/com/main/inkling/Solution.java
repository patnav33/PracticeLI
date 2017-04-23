package com.main.inkling;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static void main(String args[]){
		
		int a[] = {-1,1,3,3,3,2,1,0};
		int result = computeNumberOfArithmeticSlices(a);
		System.out.println(result);
		
	}
	
	public static int computeNumberOfArithmeticSlices(int[] A) {
	    int front = 0, total = 0;
	    int result = 0;
	    List list;
	    for (int back = 0; back < A.length && front < A.length; ) {
	        list = new ArrayList();
	        front = back + 2;
	        total = A[front - 1] - A[back];
	        list.add(back);
	        list.add(front - 1);
	        int i = 0;
	        boolean ok = false;
	        while (front < A.length && A[front] - A[front - 1] == total) {
	            ok = true;
	            i++;
	            list.add(front);
	            back = front;
	            front++;
	            result += i;
	            if (result > 1000000000)
	                return -1;
	        }
	        if (!ok)
	            back++;
	    }
	    return result;
	}
	
	// you can also use imports, for example:
	import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	class Solution {
	    public int solution(int[] A) {
	        // write your code in Java SE 8
	        
	    int start = 0, temp = 0;

		int count = 0;

		List list;

		for(
		int end = 0;end<A.length&&start<A.length;)
		{

			list = new ArrayList();

			start = end + 2;

			temp = A[end + 1] - A[end];

			list.add(end);

			list.add(end + 1);

			int i = 0;

			boolean status = false;

			while (start < A.length && A[start] - A[start - 1] == temp) {

				status = true;

				i++;

				list.add(start);

				end = start;

				start++;

				count += i;

			}

			if (!status)

				end++;

		}

		return count>1000000000?-1:count;
	    }
	}


}
