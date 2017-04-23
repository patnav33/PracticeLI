package com.leetcode;

/**
 * @author navin
 * 

Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.
 *
 */
public class FindTheDifference389 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = findtheDifference("abcd","abcde");
		System.out.println("Result :"+ c);
	}
	
	public static char findtheDifference(String s ,String t){
		
		char c = 0;
		
		for(int i =0;i < s.length();i++){
			c = (char) (c ^ s.charAt(i));
		}
		
		for(int i =0;i < t.length();i++){
			c = (char) (c ^ t.charAt(i));	
		}
		
		return c;
		
	}
	
	
}
