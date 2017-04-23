package com.leetcode;

/**
 * @author navin
 Given a string s, find the longest palindromic substring in s. 
 You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
Example:

Input: "cbbd"

Output: "bb"

 *
 */
public class LongestPalindromicSubstring5 {

	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("babad"));
		System.out.println(longestPalindrome("cbbd"));
	}
	
	public static String longestPalindrome(String s){
		if(s.isEmpty())
			return null;
		if(s.length() == 1)
			return s;
		
		String longestPalindrome = s.substring(0,1);
		for(int i =0; i< s.length();i++){
			
			String temp = palindromeFinder(s,i,i); 
			if(temp.length() > longestPalindrome.length())
				longestPalindrome = temp;
			temp = palindromeFinder(s,i,i+1);
			if(temp.length() > longestPalindrome.length())
				longestPalindrome = temp;
		
		}
		return longestPalindrome;
	}
	
	public static String palindromeFinder(String s ,int start ,int end){
		
		while(start >= 0 && end <= s.length() - 1 && s.charAt(start) == s.charAt(end)){
			start--;
			end++;
		}
		return s.substring(start+1 ,end);
	}
}
