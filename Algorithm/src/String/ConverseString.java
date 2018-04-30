package String;

import java.util.Scanner;
/**
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。
 * @author Administrator
 *
 */
public class ConverseString {
	public void function()
	{
		Scanner input = new Scanner (System.in);
		String str = new String();
		String converseStr = new String();
		str = input.nextLine();
		for(int i =str.length()-1;i>=0;i--)
		{
			converseStr+=str.charAt(i);
		}
		System.out.println(converseStr);
	}
}
