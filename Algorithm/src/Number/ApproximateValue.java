package Number;

import java.util.Scanner;
/**
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * @author Administrator
 *
 */
public class ApproximateValue {
	public void function()
	{
		Scanner input = new Scanner(System.in);
		float num = input.nextFloat();
		int approxiamateNum = (int)num;
		if(num-approxiamateNum<0.5)
		{
			num = approxiamateNum;
		}
		else
		{
			num=1+approxiamateNum;
		}
		System.out.println((int)num);
	}
}
