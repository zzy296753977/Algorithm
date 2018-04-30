package Number;

import java.util.Scanner;

/**
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 * @author Administrator
 *
 */
public class Binary {
	//这个方法比较暴力
	public void function()
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count=0;
		String binaryNum = Integer.toBinaryString(num);
		//遍历计1出现的个数
		for(int i=0;i<binaryNum.length();i++)
		{
			if(binaryNum.charAt(i)=='1')count++;
		}
		System.out.println(count);
	}
	//这个方法不能处理有负数存在的情况
	public void function2()
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count=0;
		String binaryNum = "";
		while(num!=0){
			binaryNum = num%2+binaryNum;
		num = num/2;
		}
		//遍历计1出现的个数
		for(int i=0;i<binaryNum.length();i++)
		{
			if(binaryNum.charAt(i)=='1')count++;
		}
		System.out.println(count);
	}
	//这个方法是非常好的解法
	public int function3(int n)
	{
		int count = 0;
		if(n<0)
		{
			n=n&0x7FFFFFFF;
			++count;
		}
		//只看末尾位直到将所有位循环遍历一遍位置
		while(n!=0)
		{
			count+=n&1;
			n=n>>1;
		}
		return count;
	}
}
