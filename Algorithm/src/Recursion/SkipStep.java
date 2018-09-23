package Recursion;
/**
 * ��һ��n��̨�ף�һ��ѡ����һ�׻���һ��ѡ�������ף����ܹ��ж�������Ծ����
 * @author Administrator
 *
 */
/**
 * �����������ô��⣬�����ߵ���n�׵�ʱ����f(n)�����߷�
 * ����׼���ߵ�n+1�׵�ʱ�������ѡ���f(n)���߷���������ѡһ��Ȼ������һ��
 * ����׼���ߵ�n+2�׵�ʱ�������ѡ���f(n+1)���߷���������ѡһ��Ȼ������һ��
 * ����f(n+2)=f(n)+f(n+1)�ȼ���f(n)=f(n-1)+f(n-2);Ҳ���Ǳ��εķѲ��ɴ�����
 * @author Administrator
 *
 */
/**
 * ����һ����ⷽ����������Ҫ�����n�׵�ʱ��ֻ�����ַ�ʽ
 * ��һ�֣���n-1����һ����������ʱ����f(n-1)�ַ���
 * �ڶ��֣���n-2��һ����������������ʱ����f(n-2)�ַ�ʽ
 * Ϊʲô�ڶ��������������һ������һ���أ���Ϊ����һ���������f(n-1)���Ѿ����ǹ���
 */
public class SkipStep {
	//�ݹ�
	public int function(int n)
	{
		if(n<=0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		if(n==2)
		{
			return 2;
		}
		return function(n-1)+function(n-2);
	}
	//�ǵݹ�
	public int climbStairs(int n) 
	{
        if(n<=0)return 0;
		if(n==1)return 1;
        if(n==2)return 2;
        else
        {
           int [] steps = new int [n+1];
        steps[1] = 1;
        steps[2] = 2;
        for(int i=3;i<=n;i++)
        {
            steps[i]=steps[i-1]+steps[i-2];
        }
        return steps[n]; 
        }
	}
}
