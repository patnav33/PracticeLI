package com.leetcode;

import java.util.Scanner;

public class Sample {

	public static long gcd(long x, long y) {
		if (y == 0 ) return x;
		return gcd(y, x % y);
	}
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			long a = in.nextLong(), b = in.nextLong(), x = in.nextLong(), y = in.nextLong();
			System.out.println(gcd(a,b) == gcd(x,y) ? "YES" : "NO");
		}
	}
}
