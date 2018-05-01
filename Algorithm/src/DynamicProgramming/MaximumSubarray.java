package DynamicProgramming;
//Given an integer array nums, 
//find the contiguous subarray (containing at least one number)
//which has the largest sum and return its sum.
public class MaximumSubarray {
	/**
	 * Use DP solution
	 * dp[i]表示以第i个元素结尾的子串中sum最大的值
	 * 则dp[i]=nums[i]+(dp[i-1]>0?dp[i-1]:0)
	 * 因为这个问题的子结构就是结尾元素之前sum最大的连续子串
	 * 那么考虑两种情况：
	 * （1）前面的连续子串加上第i个元素比单个第i个元素大
	 * （2）前面的连续子串加上第i个元素比单个第i个元素小
	 * 为什么选择以第i个元素结尾分割子问题：
	 * 因为任何一个子串可能在任何一个元素的位置结尾，
	 * 同一个结尾处的不同长度的子串肯定有一个最大值
	 * 最后只需要比较在不同元素位置结尾的长度各异的最大值之中的最大值则为问题的最优解
	 * @param nums
	 * @return
	 */
	 public int maxSubArray(int[] nums) 
	 {
		int [] dp = new int[nums.length];
		dp[0]=nums[0];
		int max=dp[0];
		for(int i=1;i<nums.length;i++)
		{
			dp[i]=nums[i]+(dp[i-1]>0?dp[i-1]:0);
			if(dp[i]>max)max=dp[i];
		}
		return max;
	 }
	 /**
	  * greedy
	  * curSum是记录当前最大sum的子串，一旦当前最大的子串+下一个元素小于下一个元素的时候
	  * curSum被赋值为下一个元素，相当于清空前面子串的积累
	  * 这里的情况其实就是当前面子串为负数的时候，就会拖累下一个元素的值，故而舍去
	  * 但如果curSum的值为正数，遇到一个绝对值小于curSum的负数则不会舍去
	  * 但这个加了负数之后的curSum无法变成res（最优值），但有可能在后面加了大数之后反超变成最优值
	  * 所以这种情况并不排除和舍去
	  * @param nums
	  * @return
	  */
	 public int maxSubArray1(int[] nums) 
	 {
		 int res = 0, curSum = 0;
	        for (int num : nums) {
	            curSum = Math.max(curSum + num, num);
	            res = Math.max(res, curSum);
	        }
	        return res;
	 }
}
