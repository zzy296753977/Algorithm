package Number;

import java.util.Scanner;
/**
 * д��һ�����򣬽���һ����������ֵ���������ֵ�Ľ�������ֵ�����С�������ֵ���ڵ���5,����ȡ����С��5��������ȡ����
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
