package Array;

import java.util.ArrayList;
import java.util.List;

/**Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
Find all the elements of [1, n] inclusive that do not appear in this array.
Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
*/
public class FindDisappearedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		 List<Integer> disappeared = new ArrayList<>();
	        for(int i=0;i<nums.length;i++)
	        {
	            //nums的下标，所以-1，序列是1-n,没有0
	            //因此var一定大于等于0
	            int var = Math.abs(nums[i])-1;
	            //重复的数字不用进入这个操作，否则会把负数重新编程正数
	            if(nums[var]>=0)
	            {
	                nums[var] = -nums[var];
	            }
	        }
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]>0)
	            {
	                //nums[i]是正数意味着，序列中没有i+1这个数字，不然在上一轮循环就被置为负数了
	                disappeared.add(i+1);
	            }
	        }
	        return disappeared;
    }
}
