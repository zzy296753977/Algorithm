package Number;

import java.util.Scanner;

/**
 * ����һ��int�͵����������������int���������ڴ��д洢ʱ1�ĸ�����
 * @author Administrator
 *
 */
public class Binary {
	//��������Ƚϱ���
	public void function()
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count=0;
		String binaryNum = Integer.toBinaryString(num);
		//������1���ֵĸ���
		for(int i=0;i<binaryNum.length();i++)
		{
			if(binaryNum.charAt(i)=='1')count++;
		}
		System.out.println(count);
	}
	//����������ܴ����и������ڵ����
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
		//������1���ֵĸ���
		for(int i=0;i<binaryNum.length();i++)
		{
			if(binaryNum.charAt(i)=='1')count++;
		}
		System.out.println(count);
	}
	//��������Ƿǳ��õĽⷨ
	public int function3(int n)
	{
		int count = 0;
		if(n<0)
		{
			n=n&0x7FFFFFFF;
			++count;
		}
		//ֻ��ĩβλֱ��������λѭ������һ��λ��
		while(n!=0)
		{
			count+=n&1;
			n=n>>1;
		}
		return count;
	}
}
