package BigInteger;
//实现任意位数的两个数相加
public class Add {
	public String function(String A,String B)
	{
		String result="";
		int lenA = A.length();
		int lenB = B.length();
		//补齐位数
		if(lenA>lenB)
		{
			for(int i=0;i<lenA-lenB;i++)
			{
				B="0"+B;
			}
		}
		else {
			for(int i=0;i<lenB-lenA;i++)
			{
				A="0"+A;
			}
		}
		lenA = A.length();
		//从低位到高位相加，左边是高位，右边是低位
		int isCarryBit = 0;//进位
		int isOverFlow = 0;//最高位是否溢出
		int sumTemp = 0;//每一位相加临时存储值
		for(int i=lenA-1;i>=0;i--)
		{
			sumTemp = (A.charAt(i)-'0')+(B.charAt(i)-'0')+isCarryBit;
			isCarryBit=0;
			//有进位
			if(sumTemp>9)
			{
				//最高位有进位，算是溢出
				if(i==0)
				{
					isOverFlow=1;
				}
				//普通位有进位
				else
				{
					isCarryBit=1;
				}
				result = (sumTemp-10)+result;
			}
			else 
			{
				result=sumTemp+result;
			}
		}
		if(isOverFlow==1)
		{
			result=isOverFlow+result;
		}
		return result;
	}
}
