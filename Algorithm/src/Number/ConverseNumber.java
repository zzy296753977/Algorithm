package Number;

import java.util.Scanner;
/**
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * @author Administrator
 *
 */
public class ConverseNumber {
	public void function()
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String str = new String();
		while(num!=0)
		{
			str+=num%10;
			num/=10;
		}
		System.out.println(str);
	}

}
