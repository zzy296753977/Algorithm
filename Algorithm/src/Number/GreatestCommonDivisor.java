package Number;
//求两个数的最大公约数
public class GreatestCommonDivisor {

	/**
	 * 辗转相除法
	 * @param a
	 * @param b
	 * @return最大公约数
	 */
	public int function1(int a,int b)
	{
		if(a/b==0)
		{
			int temp=a;
			a=b;
			b=temp;
		}
		while(a%b!=0)
		{
			a=a%b;
			if(a<b)
			{
				int temp=a;
				a=b;
				b=temp;
			}
		}
		return b;	
	}
}
