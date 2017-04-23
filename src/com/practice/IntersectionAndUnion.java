package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionAndUnion {

	public static void main(String args[]) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 4, 5, 6, 7 };
		int[] resultUnion = union(a, b, a.length, b.length);
		for (int result : resultUnion)
			System.out.print(result);
		int[] resultIntersection = Intersection(a, b, a.length, b.length);
		//
		System.out.println();
		for (int result : resultIntersection)
			System.out.print(result);

		int[] num1 = { 2, 3, 4, 1 };
		int[] num2 = { 7, 5, 3, 2 };
		System.out.println();
		System.out.println("Union unsorted: ");
		List<Integer> list = findUnionIfTwoArraysUnsorted(num1, num2);
		for (int i : list)
			System.out.print(i);

	}

	public static int[] union(int[] a, int[] b, int aSize, int bSize) {

		int[] c = new int[aSize + bSize];
		int aptr = 0, bptr = 0;
		int cptr = 0;
		while (aptr < aSize && bptr < bSize) {

			if (a[aptr] == b[bptr]) {
				c[cptr++] = a[aptr];
				aptr++;
				bptr++;
			}

			else if (a[aptr] > b[bptr]) {
				c[cptr++] = b[bptr++];
			} else if (a[aptr] < b[bptr]) {
				c[cptr++] = a[aptr++];
			}

		}

		while (aptr < aSize) {
			c[cptr++] = a[aptr++];
		}

		while (bptr < bSize) {
			c[cptr++] = b[bptr++];
		}

		return c;
	}

	public static int[] Intersection(int[] a, int[] b, int aSize, int bSize) {

		int[] c = new int[aSize];
		int aptr = 0, bptr = 0;
		int cptr = 0;
		while (aptr < aSize && bptr < bSize) {

			if (a[aptr] == b[bptr]) {
				c[cptr++] = a[aptr];
				aptr++;
				bptr++;
			} else if (a[aptr] > b[bptr]) {
				bptr++;
			} else if (a[aptr] < b[bptr]) {
				aptr++;
			}

		}

		return c;
	}

	public static List<Integer> findUnionIfTwoArraysUnsorted(int[] num1, int[] num2) {

		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < num1.length; i++) {
			list.add(num1[i]);
			set.add(num1[i]);
		}

		for (int i = 0; i < num2.length; i++) {

			if (!set.contains(num2[i])) {
				list.add(num2[i]);
			}
		}
		return list;
	}

}