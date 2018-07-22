package BitCalculate;
//Given two binary strings, return their sum (also a binary string).
public class AddBinary {
	public String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int len = Math.abs(lenA-lenB);
        //变成等长的二进制
        if(lenA<lenB)
        {
            for (int i=0;i<len;i++)
                a = 0+a;
        }
        else
        {
            for (int i=0;i<len;i++)
                b = 0+b;
        }
        
       //开始计算
        int isCarry = 0;
        String result = "";
        for(int i = a.length()-1;i>=0;i--)
        {
        	int num = a.charAt(i)-'0'+b.charAt(i)-'0'+isCarry;
        	System.out.println(num);
            if((num)==0)
            {
            	//System.out.println(i);
                isCarry = 0;
                result = 0 + result; 
            }
            else if((num)==1)
            {
            	//System.out.println(i);
                isCarry = 0;
                result = 1 + result;
            }
            else if((num)==2)
            {
            	//System.out.println(i);
                result = 0 + result;
                isCarry = 1;
            }
            else if ((num)==3)
            {
            	//System.out.println(i);
                result = 1 + result;
                isCarry = 1;
            }
        }
        if (isCarry == 1)
        {
            result = 1+result;
        }
        return result;
    }
}
