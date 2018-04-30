package Number;

import java.util.Scanner;
/**
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。
 * @author Administrator
 *
 */
public class SexaDecimal {
	public void function()
	{
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			String hex = " ";
			hex = input.nextLine();
			System.out.println(Integer.parseInt(hex.substring(2),16));
		}
	}
}
