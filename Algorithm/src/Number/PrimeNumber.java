package Number;


import java.util.Scanner;

/**
 * 功能:输入一个正整数，按照从小到大的顺序输出它的质因数分解（如180的质数因子为2 2 3 3 5 ）
 * 最后一个数后面也要有空格
 * 输入long类型变量
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
			//1没有质因数,每求得一个质因数，就要回到这里判断是否已经求玩质因数，如果完全分解则num会变成1
			while(num!=1)
			{
				//短除法求解质因数，若输入本身是质数，则=num这次循环解决这个问题
				for(int i = 2 ; i<=num;i++)
				{
					if(num%i==0)
					{
						num/=i;
						System.out.print(i+" ");
						break;//找到一个质因数就找下一个质因数，不能继续循环了，如果找到2，再循环可能被4、8除去
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
			//循环除数
			for(int i=2;i<=Math.sqrt(num);i++)
			{
				//把相同的质因数全部分解出来之后，扫描下一个除数
				while(num%i==0)
				{
					num/=i;
					System.out.print(i+" ");
				}
			}
			//如果剩下最后的质数，就无法参与for循环，直接跳到这一步
			if(num>1)System.out.print(num+" ");
		}
	}


}
