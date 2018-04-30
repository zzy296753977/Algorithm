package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backpack01 
{
	public void function()
	{
		//输入处理
				Scanner input = new Scanner(System.in);
				int total = Integer.parseInt(input.nextLine().trim());
				String a = input.nextLine();
				String b = input.nextLine();
				String []as = a.split("\\s+");
				String []bs = b.split("\\s+");
				int [] prices = new int[as.length+1];
				int [] values = new int[as.length+1];
				for(int i=1;i<=as.length;i++)
				{
					prices[i]=Integer.parseInt(as[i-1]);
					values[i]=Integer.parseInt(bs[i-1]);
				}
				//动态规划求解
				int [][]sum = new int [as.length+1][total+1];
				int maxValue;
				for(int i=1;i<=as.length;i++)
				{
					for(int j=0;j<total+1;j++)
					{
						if(j<prices[i])
						{
							sum[i][j]=sum[i-1][j];
						}
						else 
						{
							sum[i][j]=Math.max(sum[i-1][j],sum[i-1][j-prices[i]]+values[i]);
						}
					}
				}
				maxValue=sum[as.length][total];
				List<Integer> list = new ArrayList<Integer>();
				int i=as.length;
				int j=total;
				while(j>0&&i>=1)
				{
					//第i个物品没有加入背包
					if(sum[i][j]>sum[i-1][j])
					{
						list.add(i);
						j-=prices[i];
					}
					i--;
				}
				//输出顺序
				for(int k = list.size()-1;k>=0;k--)
				{
					System.out.print(list.get(k)+" ");
				}
	}
}
