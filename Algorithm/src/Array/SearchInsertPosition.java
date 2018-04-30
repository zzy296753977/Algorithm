package Array;
//Given a sorted array and a target value, return the index if the target is found. 
//If not, return the index where it would be if it were inserted in order.
public class SearchInsertPosition {
	 public int searchInsert(int[] nums, int target) 
	 {
	    for(int i=0;i<nums.length;i++)
	    {
	    	if(nums[i]==target)
	    		return i;
	    	if(i==0&&target<=nums[0])return 0;
	    	if(i>0&&nums[i-1]<=target&&nums[i]>=target)
	    		return i;
	    }
	    return nums.length;
	 }
}
