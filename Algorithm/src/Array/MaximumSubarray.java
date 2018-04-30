package Array;
//Given an integer array nums, 
//find the contiguous subarray (containing at least one number)
//which has the largest sum and return its sum.
public class MaximumSubarray {
	 //时间超限
	 public int maxSubArray(int[] nums) 
	 {
		 int len = nums.length;
		 //当起始点为i时候，长度为len的时候所存的sum值
		 int [][] sum = new int[len+1][len+1];
		 //长度为len的子串最大值
		 int [] maxSum = new int[len+1];
		 //初始化
        for(int i=1;i<len+1;i++) maxSum[i]=-2147483648;
		 for(int i=1;i<len+1;i++)
		 {
			 sum[i][1]=nums[i-1];
             if(maxSum[1]<sum[i][1])maxSum[1]=sum[i][1];
		 }
		 //k是循环len的变量
		 for(int k=2;k<=len;k++)
		 {
			 int i =1;
			 for(;i<=len-k+1;i++)
			 {
				 sum[i][k]=0;
				 int j = i+k-1;
				 for(int x=i;x<=j;x++)
					 sum[i][k]=sum[i][k]+nums[x-1];
				 if(sum[i][k]>maxSum[i])maxSum[i]=sum[i][k];
			 }
			
		 }
		 int result=-2147483648;
		 for(int i=1;i<=len;i++)
		 {
			 if(maxSum[i]>result)result=maxSum[i];
		 }
		 return result;
	 }
	 
}
