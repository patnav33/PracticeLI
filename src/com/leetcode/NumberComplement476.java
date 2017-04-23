package com.leetcode;

/**
 * @author navin
 
 Given a positive integer, output its complement number. 
 The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
Example 1:

Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), 
and its complement is 010. So you need to output 2.
Example 2:

Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), 
and its complement is 0. So you need to output 0.
 *
 *
 */
public class NumberComplement476 {

	public static void main(String[] args) {
		
		System.out.println(findComplement(5));

	}
	
	public static int findComplement(int num){
		int mask = (Integer.highestOneBit(num) << 1) - 1;
        num = ~num;
        return num & mask;
	}
	
//	 int i = 5;
//	 System.out.println("Binary Reprsentation of "+ i + " : " + Integer.toBinaryString(i));
//	 int highestOneBit = Integer.highestOneBit(i);
//	 System.out.println("Highest one bit : " + Integer.toBinaryString(highestOneBit));
//	 int shiftBit = highestOneBit << 1;
//	 System.out.println("Shift bit : " + Integer.toBinaryString(shiftBit));
//	 int mask = shiftBit - 1;
//	 System.out.println("Mask is : " + Integer.toBinaryString(mask));
//	 System.out.println("Invert " + i + " : " + Integer.toBinaryString(~i));
//	 System.out.println("Final result : " + Integer.toBinaryString(~i & mask));

//	Binary Reprsentation of 5 : 101
//	Highest one bit : 100
//	Shift bit : 1000
//	Mask is : 111
//	Invert 5 : 11111111111111111111111111111010
//	Final result : 10
	
}
