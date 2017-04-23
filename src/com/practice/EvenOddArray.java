package com.practice;

import java.util.Scanner;

/**
 * @author navinkumarpatil
 * 
 * 
 * 
Given an array A[], write a function that segregates even and odd numbers. The functions should put all even numbers first, and then odd numbers.

Example

Input  = {12, 34, 45, 9, 8, 90, 3}
Output = {12, 34, 8, 90, 45, 9, 3} 

 *
 */
public class EvenOddArray {

	public static void main(String args[]){

	 	int a[];
		System.out.println("Enter the length of array:");
		
		//Input Array
		
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		a= new int[arrayLength];
		for(int i =0;i <arrayLength; i ++)
		{
		 a[i] = sc.nextInt();
		}		
		
		sortArray(a);
		System.out.println("Even Odd Arrray : ");
		for(int result: a){
			System.out.println(result);
		}

	}

	public static void sortArray(int a[]){
		int left= 0;
		int right = a.length-1;
		while(left< right){
			while(a[left]%2 == 0 && left<right){ 		//While loop important than if condition
			 left++;
			}
			while((a[right]%2)-1 == 0 && left<right){   //While loop important than if condition
			 right--;
			}
			if(left<right){
			swap(a,left,right);
			}
		}
	} 

	//Swapping Logic
	public static void swap(int[] num, int i, int j) {
			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
		}
}
