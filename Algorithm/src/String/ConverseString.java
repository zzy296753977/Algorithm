package String;

import java.util.Scanner;
/**
 * д��һ�����򣬽���һ���ַ�����Ȼ��������ַ�����ת����ַ�����
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
