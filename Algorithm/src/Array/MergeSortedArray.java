package Array;
//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) 
	{
		//ָ��ϲ������һ��Ԫ�ص�ĩβ
        int current = m+n-1;
        //ָ������δ�ϲ������ĩβ
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
        //���ĩβʣ�µ���nums1����ֵ�Ļ���currentӦ������tail1
        //Ҳ����˵������Ҫ�ټ�����ֵ������
        //���ĩβʣ�µ���nums2����ֵ�Ļ�����Ҫ���ǵ�nums1��
        while(tail2>=0)
        {
        	nums1[current]=nums2[tail2];
        	current--;
        	tail2--;
        }
    }
}
