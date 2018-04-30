package Number;
//求两个数的最小公倍数
//最大公约数就两个数的所有相同质数相乘,最小公倍数就是扣除一次所有想同的质数全部相乘,补过来刚好,所以两个数的乘积除以他们的最大公约数是最小公倍数
public class LeastCommonMultiple 
{
	public int function(int a ,int b)
	{
		GreatestCommonDivisor test = new GreatestCommonDivisor();
		return a*b/test.function1(a, b);
	}
}
