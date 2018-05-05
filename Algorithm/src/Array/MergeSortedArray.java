package Array;
//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) 
	{
		//指向合并后最后一个元素的末尾
        int current = m+n-1;
        //指向两个未合并数组的末尾
        int tail1=m-1,tail2=n-1;
        while(tail1>=0&&tail2>=0)
        {
        	if(nums1[tail1]>nums2[tail2])
        	{
        		nums1[current]=nums1[tail1];
        		tail1--;
        		current--;
        	}
        	else {
				nums1[current]=nums2[tail2];
				tail2--;
				current--;
			}
        }
        //如果末尾剩下的是nums1的数值的话，current应当等于tail1
        //也就是说，不需要再继续赋值覆盖了
        //如果末尾剩下的是nums2的数值的话，需要覆盖到nums1上
        while(tail2>=0)
        {
        	nums1[current]=nums2[tail2];
        	current--;
        	tail2--;
        }
    }
}
