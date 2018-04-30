package BitCalculate;

/**
 * 计算整数的幂指数
 * 1.当指数为负数的时候，底数不允许是0
 * 2.指数要考虑到正负之分，正数是整数相乘，负数是整数的倒数相乘
 * 3.这里使用简答能快速幂的方法：10^1101 = 10^0001*10^0100*10^1000
 * 4.通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果
 * @author ZZY
 *
 */
public class IntegerPower 
{
	//简单快速幂
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
			if(base==0)throw new RuntimeException("分母不能为0");
			exponent=-n;
		}
		//n==0
		else {
			return 1;
		}
		//sum记录当前总和，current记录不移位的指数当前应该在哪里了
		while(exponent!=0)
		{
			//这一位存在可分解的单元
			if((exponent&1)==1)
			{
				sum = sum*current;
			}
			//指数走到下一位，每循环一次都要走到下一位
			current = current * current;		
			//指数右移一位
			exponent>>=1;			
		}
		return n>0?sum:(1/sum);
	}
}
