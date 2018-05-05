package DynamicProgramming;
/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
 * (i.e., buy one and sell one share of the stock multiple times).
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 * @author Administrator
 */
public class BestTimeToBuyAndSellStockII {
	public int maxProfit(int[] prices) {
		 int res = 0;
	        for (int i = 0; i < prices.length - 1; ++i) {
	            if (prices[i] < prices[i + 1]) {
	                res += prices[i + 1] - prices[i];
	            }
	        }
	        return res;
    }
}
