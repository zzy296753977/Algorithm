package BitCalculate;
//Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
public class PowerofFour {
	//�ο�2�ķ�����4�ĺ���һ������ż����0
	//System.out.println(Integer.toBinaryString(1));���Կ���16�Ķ�����λ10000�����������λ��
	public boolean isPowerOfFour(int num) {
        String binary = Integer.toBinaryString(num);
        int count1 = 0;
        int count0=0;
        for(int i =0;i<binary.length();i++)
        {
            if(binary.charAt(i)=='1')count1++;
        }
        if(count1!=1)
            return false;
        else 
        {
            for(int i =0;i<binary.length();i++)
            {
                if(binary.charAt(i)=='0')
                    count0++;
            }
            
        }
        if (count0%2==0)
            return true;
        
        return false;
    }
}
