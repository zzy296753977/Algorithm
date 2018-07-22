package Array;

import java.util.Arrays;

//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
public class MissingNumber {
	public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        //按照每个位置上对应的数字来寻找，如果错位那肯定就是比那个位置该有的数字大
        for(;i<nums.length;i++)
        {
            if(nums[i]>i)
            {
                return nums[i]-1;
            }
        }
        i--;
        //有一种情况for循环考虑不到，就是输入的数字如0 1 2 | 0 1 2 3这样没有错位的，那就是丢失了最高位
        return nums[i]+1;
    }
}
