package Number;
//�������������Լ��
public class GreatestCommonDivisor {

	/**
	 * շת�����
	 * @param a
	 * @param b
	 * @return���Լ��
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
