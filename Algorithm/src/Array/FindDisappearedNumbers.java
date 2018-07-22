package Array;

import java.util.ArrayList;
import java.util.List;

/**Given an array of integers where 1 �� a[i] �� n (n = size of array), some elements appear twice and others appear once.
Find all the elements of [1, n] inclusive that do not appear in this array.
Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
*/
public class FindDisappearedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		 List<Integer> disappeared = new ArrayList<>();
	        for(int i=0;i<nums.length;i++)
	        {
	            //nums���±꣬����-1��������1-n,û��0
	            //���varһ�����ڵ���0
	            int var = Math.abs(nums[i])-1;
	            //�ظ������ֲ��ý�����������������Ѹ������±������
	            if(nums[var]>=0)
	            {
	                nums[var] = -nums[var];
	            }
	        }
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]>0)
	            {
	                //nums[i]��������ζ�ţ�������û��i+1������֣���Ȼ����һ��ѭ���ͱ���Ϊ������
	                disappeared.add(i+1);
	            }
	        }
	        return disappeared;
    }
}
