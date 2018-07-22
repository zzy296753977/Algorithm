package Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

//Given a non-empty array of integers, return the third maximum number in this array. 
//If it does not exist, return the maximum number. The time complexity must be in O(n).
public class ThirdMaxNumber {
	/**
	 * ��������
	 * ���ȥ��
	 * ������ֻ�в�������������ȡ���ֵ
	 * ����������������ѭ�����Σ�ÿ��ȡ���ֵ��Ȼ���޸����ֵΪint����Сֵ��������������ǵ������ֵ
	 * @param nums
	 * @return
	 */
	public int thirdMax(int[] nums) {
		//����
		Arrays.sort(nums);
		//ȥ��
		int i=0,j=1;
		int len = nums.length;
		int duplicated = 0;
		while(j<len)
		{
			if(nums[i]==nums[j])
			{
				nums[j]=-2147483648;
				duplicated++;
				j++;
			}
			else 
			{
				i=j;
				j++;
			}
		}
	    //�������ֵ
		int max = -2147483648;
		int index = 0;
		if((len-duplicated)<3)
		{
			for(int k=0;k<len;k++)
			{
				if(nums[k]>max)max = nums[k];
			}
			return max;
		}
		else {
			for(int l =0;l<3;l++)
			{
				for(int k=0;k<len;k++)
				{
					if(nums[k]>max)
						{
							max = nums[k];
							index = k;
						}
				}
				if(l<2)
				{
					nums[index]=-2147483648;
					max=-2147483648;
				}
			}
		}
		return max;

    }
	/**
	 * ����set�ķ��ظ���
	 * ����TreeSet����Ȼ��������
	 */
	public int thirdMax2(int[] nums) 
	{
		TreeSet<Integer>set = new TreeSet<Integer>();
		for(int i : nums)
		{
			set.add(i);
		}
		if(set.size()<3)
		{
			return set.last();
		}
		else {
			Iterator<Integer> iter = set.iterator();
			for(int i = 0;i<set.size()-3;i++)
			{
				iter.next();
			}
			return iter.next();
		}
		
	}
}
