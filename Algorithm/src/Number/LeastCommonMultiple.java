package Number;
//������������С������
//���Լ������������������ͬ�������,��С���������ǿ۳�һ��������ͬ������ȫ�����,�������պ�,�����������ĳ˻��������ǵ����Լ������С������
public class LeastCommonMultiple 
{
	public int function(int a ,int b)
	{
		GreatestCommonDivisor test = new GreatestCommonDivisor();
		return a*b/test.function1(a, b);
	}
}
