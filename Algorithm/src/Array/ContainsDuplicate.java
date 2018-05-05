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
		 //�����˵��û���ظ�Ԫ�أ�������������ظ�Ԫ�أ�keyΨһ�������ظ�
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
		 //�����˵��û���ظ�Ԫ�أ�������������ظ�Ԫ�أ�set����ֵΨһ�������ظ�
		 return len>set.size()?true:false;
	 }
	
}
