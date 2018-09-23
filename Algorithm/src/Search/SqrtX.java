package Search;
//Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
public class SqrtX {
	//����������
	public int mySqrt(int x) {
        if(x==0)
            return 0;
        else
        {
            int left = 1;
            int right = Integer.MAX_VALUE;
            while(true)
            {
                int mid = left+(right-left)/2;
                //����mid*mid��λ��̫������
                if(mid>x/mid)
                {
                    right=mid-1;
                }
                else
                {
                    if((mid+1)>x/(mid+1))
                        return mid;
                    left=mid+1;
                }
            }
        }
        
    }
}
