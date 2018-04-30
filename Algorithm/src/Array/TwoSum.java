package Array;

import java.util.HashMap;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
public class TwoSum {
	//O(n)
	public int[] twoSum(int[] nums, int target)
	{
		int[] answer = new int[2];
		HashMap<Integer, Integer>map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			//HashMap key can't repeat
			map.put(nums[i], i);
		}
		for(int i=0;i<nums.length;i++)
		{
			//target becomes target - one number of sums
			int temp=target-nums[i];
			//the other sum number mustn't the same as the latter
			if(map.containsKey(temp)&&i!=map.get(temp))
			{
				return new int[] {i,map.get(temp)};
			}
		}
		return answer;
	}
	//O(n^2)
	public int[] twoSum1(int[] nums, int target)
	{
	    int [] result = new int[2];  
	    for(int i=0;i<nums.length;i++)
	      {
	          for(int j=0;j<nums.length;j++)
	          {
	              if(j!=i)
	              {
	                  if(nums[i]+nums[j]==target)
	                  {
	                      result[0]=i;
	                      result[1]=j;
	                      return result;
	                  }
	                      
	              }
	          }
	      }
	        return result;
	}
}
