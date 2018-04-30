package BitCalculate;

/**
 * ������������ָ��
 * 1.��ָ��Ϊ������ʱ�򣬵�����������0
 * 2.ָ��Ҫ���ǵ�����֮�֣�������������ˣ������������ĵ������
 * 3.����ʹ�ü���ܿ����ݵķ�����10^1101 = 10^0001*10^0100*10^1000
 * 4.ͨ��&1��>>1����λ��ȡ1101��Ϊ1ʱ����λ����ĳ����۳˵����ս��
 * @author ZZY
 *
 */
public class IntegerPower 
{
	//�򵥿�����
	public double function(double base,int n)
	{
		double sum = 1 , current = base;
		int exponent;
		if(n>0)
		{
			exponent=n;
		}
		else if(n<0)
		{
			if(base==0)throw new RuntimeException("��ĸ����Ϊ0");
			exponent=-n;
		}
		//n==0
		else {
			return 1;
		}
		//sum��¼��ǰ�ܺͣ�current��¼����λ��ָ����ǰӦ����������
		while(exponent!=0)
		{
			//��һλ���ڿɷֽ�ĵ�Ԫ
			if((exponent&1)==1)
			{
				sum = sum*current;
			}
			//ָ���ߵ���һλ��ÿѭ��һ�ζ�Ҫ�ߵ���һλ
			current = current * current;		
			//ָ������һλ
			exponent>>=1;			
		}
		return n>0?sum:(1/sum);
	}
}
