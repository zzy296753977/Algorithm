package Number;

import java.util.Scanner;
/**
 * д��һ�����򣬽���һ��ʮ�����Ƶ���ֵ�ַ������������ֵ��ʮ�����ַ�����
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
