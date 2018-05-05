package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//Given an array of integers, find if the array contains any duplicates.
public class ContainsDuplicate {
	 public boolean containsDuplicate(int[] nums) 
	 {
		 int len = nums.length;
		 if(len<1)return false;
		 Map<Integer,Integer>map = new HashMap<Integer, Integer>();
		 map.put(nums[0], 0);
		 for(int i=1;i<len;i++)
		 {
			 map.put(nums[i], i);	 
		 }
		 //若相等说明没有重复元素，不相等则是由重复元素，key唯一，不能重复
		 return len>map.size()?true:false;
	 }
	 
	 public boolean containsDuplicate1(int[] nums) 
	 {
		 int len = nums.length;
		 if(len<1)return false;
		 HashSet<Integer> set = new HashSet<Integer>();
		 for(int i=0;i<len;i++)
		 {
			 set.add(nums[i]);	 
		 }
		 //若相等说明没有重复元素，不相等则是由重复元素，set里面值唯一，不能重复
		 return len>set.size()?true:false;
	 }
	
}
