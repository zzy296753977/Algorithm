package Recursion;
/**
 * 有一个n级台阶，一次选择上一阶或者一次选择上两阶，问总共有多少种跳跃方法
 * @author Administrator
 *
 */
/**
 * 这类题可以这么理解，当你走到第n阶的时候有f(n)种走走法
 * 当你准备走第n+1阶的时候，你可以选择从f(n)种走法种任意挑选一种然后再走一步
 * 当你准备走第n+2阶的时候，你可以选择从f(n+1)种走法中任意挑选一种然后再走一步
 * 所以f(n+2)=f(n)+f(n+1)等价于f(n)=f(n-1)+f(n-2);也就是变形的费波纳茨数列
 * @author Administrator
 *
 */
/**
 * 还有一种理解方法，当你需要到达第n阶的时候只有三种方式
 * 第一种，从n-1阶走一步上来，这时候有f(n-1)种方法
 * 第二种，从n-2阶一下走两步上来，这时候有f(n-2)种方式
 * 为什么第二种情况不能先走一步再走一步呢，因为先走一步的情况在f(n-1)中已经考虑过了
 */
public class SkipStep {
	//递归
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
	//非递归
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
