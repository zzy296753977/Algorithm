package Recursion;
/**
 * 斐波那契数列
 * @author Administrator
 *
 */
public class Fibonacci {
	//递归求解
	public int function(int n)
	{
		if(n<=0||n>39)return 0;
		if(n==1)return 1;
		if(n==2)return 2;
		else{
			return function(n-1)+function(n-2);
		}
	}
	//动态规划求解
	//g2=g1+f1
	//f2=g2-f1;
	//f2=g1
	//g3=g2+f2;
	//f3=g3-f2=g2=g1+f1=f1+f2
	public int function2(int n)
	{
		if(n<=0||n>39)return 0;
		if(n==1||n==2)return 1;
		int f=0,g=1;
		while(n-->0)
		{
			g=g+f;
			f=g-f;
		}
		return f; 
	}
}
