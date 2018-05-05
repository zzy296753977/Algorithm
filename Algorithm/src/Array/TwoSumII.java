package Array;
//Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
public class TwoSumII {
	 public int[] twoSum(int[] numbers, int target) 
	 {
		 int len =numbers.length;
		 int i = 0,j=1;
		 int [] result = new int[2];
		 while(j<len)
		 {
			 if(numbers[i]+numbers[j]==target)
			 {
				 result[0]=i+1;
				 result[1]=j+1;
				 return result;
			 }
			 if(numbers[i]+numbers[j]<target)
			 {
				 j++;
			 }
			 else {
				 i++;
				 j=i+1;
			}
		 }
		 j--;
		 while(j==len-1&&i<len)
	        {
	             if(numbers[i]+numbers[j]==target)
				 {
					 result[0]=i+1;
					 result[1]=j+1;
					 return result;
				 }
	            i++;
	        }
		 return result;
	 }
}
