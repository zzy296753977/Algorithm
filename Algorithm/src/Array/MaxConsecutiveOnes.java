package Array;
//Given a binary array, find the maximum number of consecutive 1s in this array.
public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        int maximum = 0;
        int currentLength = 0;
        for(int i:nums)
        {
            if(i==1)
            {
                currentLength++;
            }
            if(i==0)
            {
                if(currentLength>maximum)
                {
                    maximum=currentLength;
                }
                currentLength=0;
            }
        }
        //������β��һ�����������1��ʱ��currentLength����ģ����ǻ�û�и�ֵ��maximum�������︳ֵ
        maximum = maximum>currentLength?maximum:currentLength;
        return maximum;
    }
}
