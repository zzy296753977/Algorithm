package Number;


import java.util.Scanner;

/**
 * ����:����һ�������������մ�С�����˳����������������ֽ⣨��180����������Ϊ2 2 3 3 5 ��
 * ���һ��������ҲҪ�пո�
 * ����long���ͱ���
 * @author Administrator
 *
 */
public class PrimeNumber {
	public void function()
	{
		Scanner input= new Scanner(System.in);
		while(input.hasNext())
		{
			long num = input.nextLong();
			//1û��������,ÿ���һ������������Ҫ�ص������ж��Ƿ��Ѿ������������������ȫ�ֽ���num����1
			while(num!=1)
			{
				//�̳�������������������뱾������������=num���ѭ������������
				for(int i = 2 ; i<=num;i++)
				{
					if(num%i==0)
					{
						num/=i;
						System.out.print(i+" ");
						break;//�ҵ�һ��������������һ�������������ܼ���ѭ���ˣ�����ҵ�2����ѭ�����ܱ�4��8��ȥ
					}
				}
			}
		}
	}
	public void function2()
	{
		Scanner input= new Scanner(System.in);
		while(input.hasNext())
		{
			long num = input.nextLong();
			//ѭ������
			for(int i=2;i<=Math.sqrt(num);i++)
			{
				//����ͬ��������ȫ���ֽ����֮��ɨ����һ������
				while(num%i==0)
				{
					num/=i;
					System.out.print(i+" ");
				}
			}
			//���ʣ���������������޷�����forѭ����ֱ��������һ��
			if(num>1)System.out.print(num+" ");
		}
	}
	//important������
	public int countPrimes(int n) {
        int count = 0;
        boolean [] flag = new boolean[n];
        for (int i=0;i<n;i++)
            flag[i]=true;
        //��Ȧ������2��ʼ����С��n��i����ȫ������
        for(int i=2;i*i<n;i++)
        {
            if(flag[i])
            {
                for(int j=i;i*j<n;j++)
                {
                    flag[i*j]=false;
                }
            }        
        }
        for(int i=2;i<n;i++)
            if(flag[i])
                count++;
        return count;
    }
}
