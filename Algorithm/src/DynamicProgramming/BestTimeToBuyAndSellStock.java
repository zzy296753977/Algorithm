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
	 * һά��̬�滮��Ŀ
	 * ����ʽdp[i]=max(dp[i-1],prices[i]-minPrice)
	 * dp[i]�ĺ����Ǵӵ�0�쵽��i��ļ۸��������������
	 * dp[i]Ҫô��dp[i-1]�����������ͬ��Ҳ���ǵ�i��ļ۸����յ����ߵ�����
	 * Ҫô��i��������֮ǰĳ��������۸�ߣ��Ӷ���֮ǰ�ļ۸��ȥ��ͬ������µ�����£���ȡ�����maxProfit
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
