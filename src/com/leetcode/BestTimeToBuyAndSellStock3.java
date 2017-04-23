package com.leetcode;

public class BestTimeToBuyAndSellStock3 {

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
