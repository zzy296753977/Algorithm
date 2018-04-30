package Array;
//Given an integer array nums, 
//find the contiguous subarray (containing at least one number)
//which has the largest sum and return its sum.
public class MaximumSubarray {
	 //ʱ�䳬��
	 public int maxSubArray(int[] nums) 
	 {
		 int len = nums.length;
		 //����ʼ��Ϊiʱ�򣬳���Ϊlen��ʱ�������sumֵ
		 int [][] sum = new int[len+1][len+1];
		 //����Ϊlen���Ӵ����ֵ
		 int [] maxSum = new int[len+1];
		 //��ʼ��
        for(int i=1;i<len+1;i++) maxSum[i]=-2147483648;
		 for(int i=1;i<len+1;i++)
		 {
			 sum[i][1]=nums[i-1];
             if(maxSum[1]<sum[i][1])maxSum[1]=sum[i][1];
		 }
		 //k��ѭ��len�ı���
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
