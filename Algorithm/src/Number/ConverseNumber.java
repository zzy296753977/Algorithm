package Number;

import java.util.Scanner;
/**
 * ����һ��������������������ַ�������ʽ�������
 * ���򲻿��Ǹ���������������ֺ���0����������ʽҲ����0��������Ϊ100�������Ϊ001
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
