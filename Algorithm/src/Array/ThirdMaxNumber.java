package Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

//Given a non-empty array of integers, return the third maximum number in this array. 
//If it does not exist, return the maximum number. The time complexity must be in O(n).
public class ThirdMaxNumber {
	/**
	 * 首先排序
	 * 其次去重
	 * 最后如果只有不到三个数，就取最大值
	 * 若超过三个数，就循环三次，每次取最大值，然后修改最大值为int的最小值，第三次所求就是第三大的值
	 * @param nums
	 * @return
	 */
	public int thirdMax(int[] nums) {
		//排序
		Arrays.sort(nums);
		//去重
		int i=0,j=1;
		int len = nums.length;
		int duplicated = 0;
		while(j<len)
		{
			if(nums[i]==nums[j])
			{
				nums[j]=-2147483648;
				duplicated++;
				j++;
			}
			else 
			{
				i=j;
				j++;
			}
		}
	    //查找最大值
		int max = -2147483648;
		int index = 0;
		if((len-duplicated)<3)
		{
			for(int k=0;k<len;k++)
			{
				if(nums[k]>max)max = nums[k];
			}
			return max;
		}
		else {
			for(int l =0;l<3;l++)
			{
				for(int k=0;k<len;k++)
				{
					if(nums[k]>max)
						{
							max = nums[k];
							index = k;
						}
				}
				if(l<2)
				{
					nums[index]=-2147483648;
					max=-2147483648;
				}
			}
		}
		return max;

    }
	/**
	 * 利用set的非重复性
	 * 利用TreeSet的自然排序性质
	 */
	public int thirdMax2(int[] nums) 
	{
		TreeSet<Integer>set = new TreeSet<Integer>();
		for(int i : nums)
		{
			set.add(i);
		}
		if(set.size()<3)
		{
			return set.last();
		}
		else {
			Iterator<Integer> iter = set.iterator();
			for(int i = 0;i<set.size()-3;i++)
			{
				iter.next();
			}
			return iter.next();
		}
		
	}
}
