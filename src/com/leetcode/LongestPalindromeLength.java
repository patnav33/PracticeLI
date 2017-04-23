package com.leetcode;

import java.util.HashSet;

/**
 * @author navin
 * Given a String which consists of lowercase or uppercase letter find the length of the longest 
 * palindrome that can e built with those letters.
 * 
 * This is case sensitive for example "Aa" is not considered a palindrome here.Assume the length
 * of given string will not exceeds 1,010.
 * 
 * Input : "abccccdd"
 * Output : 7 ("dccaccd")
 *
 */
public class LongestPalindromeLength{
	
	public static void main(String args[]){

	String s = "abccccdd";
	int length = longestPalindrome(s);
	System.out.println(length);

	}

	public static int longestPalindrome(String s){

		if(s == null || s.length() == 0)
			return 0;

		HashSet<Character> set = new HashSet<Character>();
		int count = 0;
		for(int i = 0; i< s.length();i++){

			if(set.contains(s.charAt(i))){
				set.remove(s.charAt(i));
				count++;
			}
			else{
				set.add(s.charAt(i));
			}
		}

		if(!set.isEmpty())
			return count*2 + 1;

		return count*2;

	}

}