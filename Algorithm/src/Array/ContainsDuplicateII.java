package Array;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers and an integer k, 
//find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] 
//and the absolute difference between i and j is at most k.
public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len =nums.length;
        if(len==0)return false;
        Map<Integer,Integer >map = new HashMap<Integer, Integer>();
        map.put(nums[0],0);
        for(int i=1;i<len;i++)
        {
        	if(!map.containsKey(nums[i]))
        	map.put(nums[i], i);
        	else {
        		//若是存在，则比较距离是否小于k
				if(i-map.get(nums[i])<=k)
				{
					return true;
				}
				//若不存在，则移除之前的元素，因为之前的元素不可能找到一个重复值且距离小于k的了
				//将当前重复值加入，因为后面还有可能有重复值并且距离小于k的元素出现
				else {
					map.remove(nums[i]);
					map.put(nums[i], i);
				}
			}
        }
        return false;
    }
}
