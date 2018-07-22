package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. 
//Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.
public class KdiffPairsInAnArray {
	public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        //���pairs�������ظ�
        Map<Integer,Integer>map = new HashMap<Integer, Integer>();
        int i=0,j=1;
        int len = nums.length;
        if(len<2)return 0;
        while(j<len)
        {
            if(nums[j]-nums[i]<k)
            {
                j++;
            }
            else if(nums[j]-nums[i]==k)
            {
            	//��Ϊkֵ�̶���������ͬ��i�Ḳ��ǰһ��key��value������Ҳֻ��һ�ԣ����������ظ�
                map.put(nums[j],nums[i]);
                j++;
            }
            else
            {
                i++;
                if(i>=j)
                {
                    j++;
                }
            }
        }
        return map.size();
    }
}
