package BitCalculate;
//Given an integer, write a function to determine if it is a power of two.
public class PowerofTwo {
	//2�Ĵη��и��ص㣬�������£�ֻ��һ��λ��1
	public boolean isPowerOfTwo(int n) {
        if(n>=1)
        {
            String binary = Integer.toBinaryString(n);
            int count =0;
            for(int i=0;i<binary.length();i++)
            {
                if(binary.charAt(i)=='1')count++;
            }
            if(count==1)
                return true;
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
