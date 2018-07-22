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
        //当最后结尾的一串是最长的连续1的时候，currentLength是最长的，但是还没有赋值给maximum，在这里赋值
        maximum = maximum>currentLength?maximum:currentLength;
        return maximum;
    }
}
