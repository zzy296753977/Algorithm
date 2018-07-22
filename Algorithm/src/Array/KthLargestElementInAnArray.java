package Array;

import java.util.Arrays;

//Find the kth largest element in an unsorted array. 
//Note that it is the kth largest element in the sorted order, not the kth distinct element.
public class KthLargestElementInAnArray {
	public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
