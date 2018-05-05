package DynamicProgramming;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction 
 * (i.e., buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 * Note that you cannot sell a stock before you buy one.
 * @author Administrator
 *
 */
public class BestTimeToBuyAndSellStock {
	/**
	 * 一维动态规划题目
	 * 递推式dp[i]=max(dp[i-1],prices[i]-minPrice)
	 * dp[i]的含义是从第0天到第i天的价格区间内最大利润
	 * dp[i]要么和dp[i-1]的最大利润相同，也就是第i天的价格不能收到更高的利润
	 * 要么第i天的利润比之前某天的卖出价格高，从而和之前的价格减去相同的最低下的情况下，获取更大的maxProfit
	 * @param prices
	 * @return
	 */
	 public int maxProfit(int[] prices) 
	 {
		int len = prices.length;
		if(len<=1)return 0;
		int [] dp = new int[len];
		dp[0]=0;
		int minPrice = prices[0];
		int maxProfit = 0;
		for(int i=1;i<len;i++)
		{
			if(prices[i]<minPrice)
				minPrice=prices[i];
			dp[i]=Math.max(dp[i-1],prices[i]-minPrice);
			if(dp[i]>maxProfit)
				maxProfit=dp[i];
		}
		return maxProfit;
	 }
}
