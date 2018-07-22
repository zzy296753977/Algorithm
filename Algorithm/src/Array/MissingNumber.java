package Array;

import java.util.Arrays;

//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
public class MissingNumber {
	public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        //����ÿ��λ���϶�Ӧ��������Ѱ�ң������λ�ǿ϶����Ǳ��Ǹ�λ�ø��е����ִ�
        for(;i<nums.length;i++)
        {
            if(nums[i]>i)
            {
                return nums[i]-1;
            }
        }
        i--;
        //��һ�����forѭ�����ǲ��������������������0 1 2 | 0 1 2 3����û�д�λ�ģ��Ǿ��Ƕ�ʧ�����λ
        return nums[i]+1;
    }
}
