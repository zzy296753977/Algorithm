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
        		//���Ǵ��ڣ���ȽϾ����Ƿ�С��k
				if(i-map.get(nums[i])<=k)
				{
					return true;
				}
				//�������ڣ����Ƴ�֮ǰ��Ԫ�أ���Ϊ֮ǰ��Ԫ�ز������ҵ�һ���ظ�ֵ�Ҿ���С��k����
				//����ǰ�ظ�ֵ���룬��Ϊ���滹�п������ظ�ֵ���Ҿ���С��k��Ԫ�س���
				else {
					map.remove(nums[i]);
					map.put(nums[i], i);
				}
			}
        }
        return false;
    }
}
