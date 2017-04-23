package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author navin
 * 
 *         Given a string, find the length of the longest substring without
 *         repeating characters.
 * 
 *         Examples:
 * 
 *         Given "abcabcbb", the answer is "abc", which the length is 3.
 * 
 *         Given "bbbbb", the answer is "b", with the length of 1.
 * 
 *         Given "pwwkew", the answer is "wke", with the length of 3. Note that
 *         the answer must be a substring, "pwke" is a subsequence and not a
 *         substring.
 *
 */
public class LengthOfLongestSubStringNonRepeat3 {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubString("abcabcbb"));
		System.out.println(lengthOfLongestSubString("bbbbb"));
		System.out.println(lengthOfLongestSubString("pwwkew"));
	}

	public static int lengthOfLongestSubString(String s) {

		if (s.isEmpty())
			return 0;

		int max = Integer.MIN_VALUE;
		int start = 0;

		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {

			if (set.contains(s.charAt(i))) {
				max = max > set.size() ? max : set.size();

				while (start < i && s.charAt(start) != s.charAt(i)) {
					set.remove(s.charAt(start));
					start++;
				}
				start++;
			} else {
				set.add(s.charAt(i));
			}
		}
		return (max > set.size() ? max : set.size());

	}

}
