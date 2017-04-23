package com.leetcode;

/**
 * @author navin
 * 
 * Design an alogrithm to find the maximum profit.You may complete as many transaction as you like 
 * However you may not engage in multiple transactions at the same time.( you must
 * sell the stock before you buy again).
 *
 */
public class BestTimeToBuyAndSellStock2 {

	public static void main(String args[]) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
		int[] prices2 = { 7, 6, 4, 3, 1 };
		System.out.println(maxProfit(prices2));
	}
	
	public static int maxProfit(int[] prices) {

		if (prices == null || prices.length <= 1)
			return 0;
		
		int profit = 0;
		for(int i =0 ;i <  prices.length - 1;i++){
				
			int diff = prices[i+1] - prices[i];
			if( diff > 0){
				profit +=  diff;
			}
		}
	 return profit;
	}


}
