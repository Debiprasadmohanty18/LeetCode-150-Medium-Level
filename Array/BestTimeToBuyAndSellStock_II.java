/*
*/
package com.tanmay.LeetCode150Medium.Array;

public class BestTimeToBuyAndSellStock_II {

	public static void main(String[] args) {
		int[] prices = {6,5,3,2,1};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) 
	{
		int profit = 0;
		for(int i=1;i<prices.length;i++)
		{
			if(prices[i] > prices[i-1])
			{
				profit = profit + (prices[i] - prices[i-1]);
			}
		}
		return profit;
	}
}