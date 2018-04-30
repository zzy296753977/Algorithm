package DynamicProgramming;
import java.util.Scanner;

/**
 * 购书单问题
 * 王强今天很开心，公司发给N元的年终奖。王强决定把年终奖用于购物，他把想买的物品分为两类：主件与附件，附件是从属于某个主件的，下表就是一些主件与附件的例子：
主件	附件
电脑	打印机，扫描仪
书柜	图书
书桌	台灯，文具
工作椅	无
如果要买归类为附件的物品，必须先买该附件所属的主件。每个主件可以有 0 个、 1 个或 2 个附件。附件不再有从属于自己的附件。王强想买的东西很多，为了不超出预算，他把每件物品规定了一个重要度，分为 5 等：用整数 1 ~ 5 表示，第 5 等最重要。他还从因特网上查到了每件物品的价格（都是 10 元的整数倍）。他希望在不超过 N 元（可以等于 N 元）的前提下，使每件物品的价格与重要度的乘积的总和最大。
    设第 j 件物品的价格为 v[j] ，重要度为 w[j] ，共选中了 k 件物品，编号依次为 j 1 ， j 2 ，……， j k ，则所求的总和为：
v[j 1 ]*w[j 1 ]+v[j 2 ]*w[j 2 ]+ … +v[j k ]*w[j k ] 。（其中 * 为乘号）
    请你帮助王强设计一个满足要求的购物单。
 * @author Administrator
 *
 */
public class ShoppingList {
	//这个方法不能解决主件重复的问题
	public void function()
	{
		//输入,数组下标代表第i个商品
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();//上限金额
		int m = input.nextInt();//总共商品数
		int [] value = new int[m+1];//价格
		int [] weight = new int[m+1];//重要度
		int [] belong = new int[m+1];//属于主还是附
		for(int i=1;i<=m;i++)
		{
			value[i]=input.nextInt();
			weight[i]=input.nextInt();
			belong[i]=input.nextInt();
		}
		//动态规划求解最大值问题
		//sum的值为前i个商品放入容量为N的最大价值
		int [][]sum = new int [m+1][N+1];
		//i表示第i个商品，前i-1个商品已经计算好在j-weight[i]容量时的最大价值
		for(int i=1;i<m+1;i++)
		{
			//当容量为j的时候，填表其实是从子问题到大问题的过程，而思考应该是从大问题向子问题逆向看填表的过程
			for(int j=1;j<N+1;j++)
			{
				//主件
				if(belong[i]==0)
				{
					//如果当前的容量不足以装载第i个物品，则不装载第i个物品
					if(j<value[i])
					{
						//那么它的价值和之前i-1的最大价值是一样的
						sum[i][j]=sum[i-1][j];
					}
					//如果当前的容量足以装载第i个物品，则要考虑是装的价值大还是不装的价值大
					if(j>=value[i])
					{
						//每一个节点都是当前位置的最优解
						sum[i][j]=Math.max(sum[i-1][j],sum[i-1][j-value[i]]+value[i]*weight[i]);
					}
				}
				//附件
				if(belong[i]!=0)
				{
					//如果当前的容量不足以装载第i个物品以及他的主件,则不装
					if(j<value[belong[i]]+value[i])
					{
						//那么它的价值和之前i-1的最大价值是一样的
						sum[i][j]=sum[i-1][j];
					}
					if(j>=value[belong[i]]+value[i])
					{
						sum[i][j]=Math.max(sum[i-1][j], sum[i-1][j-(value[belong[i]]+value[i])]+value[i]*weight[i]+value[belong[i]]*weight[belong[i]]);
					}
				}
			}
		}
		System.out.println(sum[m][N]);
	}
	
	//这个问题是考虑带有依赖的0 1 背包问题
	public void function2()
	{
		//先对主件和附件进行组合处理，然后只遍历主件
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();//上限金额
		int m = input.nextInt();//总共商品数
		int [][]value = new int[m+1][3];//0 1 2代表主件、附件1、附件2，存着的数字表示价值和
		int [][]price= new int[m+1][3];//表示价格
		int p,weight,q;
		//附件的位置那一行其实都是0
		//只有主件的行才有值
		for(int i=1;i<=m;i++)
		{
			p=input.nextInt();
			weight=input.nextInt();
			q=input.nextInt();
			if(q==0)
			{
				price[i][q]=p;
				value[i][q]=p*weight;
			}
			if(q!=0&&value[q][1]==0)
			{
				price[q][1]=p;
				value[q][1]=p*weight;
			}
			if(q!=0&&value[q][1]!=0&&value[q][2]==0)
			{
				price[q][2]=p;
				value[q][2]=p*weight;
			}
		}
		//动态规划
		
		int [][]dp = new int[m+1][N+1];
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=N;j++)
			{
				//钱不够的情况
				dp[i][j] = dp[i-1][j];
				if(price[i][0]<=j)
				{
					int temp=dp[i-1][j-price[i][0]]+value[i][0];
					if(temp>dp[i][j])
					{
						dp[i][j]=temp;
					}
				}
				if(price[i][0]+price[i][1]<=j)
				{
					int temp=dp[i-1][j-(price[i][0]+price[i][1])]+value[i][0]+value[i][1];
					if(temp>dp[i][j])
					{
						dp[i][j]=temp;
					}
				}
				if(price[i][0]+price[i][2]<=j)
				{
					int temp=dp[i-1][j-(price[i][0]+price[i][2])]+value[i][0]+value[i][2];
					if(temp>dp[i][j])
					{
						dp[i][j]=temp;
					}
				}
				if(price[i][0]+price[i][1]+price[i][2]<=j)
				{
					int temp=dp[i-1][j-(price[i][0]+price[i][1]+price[i][2])]+value[i][0]+value[i][1]+value[i][2];
					if(temp>dp[i][j])
					{
						dp[i][j]=temp;
					}
				}
			}
		}
		System.out.println(dp[m][N]);
	}
	
}
