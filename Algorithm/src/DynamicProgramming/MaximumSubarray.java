package DynamicProgramming;
//Given an integer array nums, 
//find the contiguous subarray (containing at least one number)
//which has the largest sum and return its sum.
public class MaximumSubarray {
	/**
	 * Use DP solution
	 * dp[i]��ʾ�Ե�i��Ԫ�ؽ�β���Ӵ���sum����ֵ
	 * ��dp[i]=nums[i]+(dp[i-1]>0?dp[i-1]:0)
	 * ��Ϊ���������ӽṹ���ǽ�βԪ��֮ǰsum���������Ӵ�
	 * ��ô�������������
	 * ��1��ǰ��������Ӵ����ϵ�i��Ԫ�رȵ�����i��Ԫ�ش�
	 * ��2��ǰ��������Ӵ����ϵ�i��Ԫ�رȵ�����i��Ԫ��С
	 * Ϊʲôѡ���Ե�i��Ԫ�ؽ�β�ָ������⣺
	 * ��Ϊ�κ�һ���Ӵ��������κ�һ��Ԫ�ص�λ�ý�β��
	 * ͬһ����β���Ĳ�ͬ���ȵ��Ӵ��϶���һ�����ֵ
	 * ���ֻ��Ҫ�Ƚ��ڲ�ͬԪ��λ�ý�β�ĳ��ȸ�������ֵ֮�е����ֵ��Ϊ��������Ž�
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
	  * curSum�Ǽ�¼��ǰ���sum���Ӵ���һ����ǰ�����Ӵ�+��һ��Ԫ��С����һ��Ԫ�ص�ʱ��
	  * curSum����ֵΪ��һ��Ԫ�أ��൱�����ǰ���Ӵ��Ļ���
	  * ����������ʵ���ǵ�ǰ���Ӵ�Ϊ������ʱ�򣬾ͻ�������һ��Ԫ�ص�ֵ���ʶ���ȥ
	  * �����curSum��ֵΪ����������һ������ֵС��curSum�ĸ����򲻻���ȥ
	  * ��������˸���֮���curSum�޷����res������ֵ�������п����ں�����˴���֮�󷴳��������ֵ
	  * ����������������ų�����ȥ
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
