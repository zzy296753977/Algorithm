package Array;

import java.util.Scanner;
/**
 * 将输入的数字，0移到末尾，其他输入保持顺序不变
 * @author Administrator
 *
 */
public class PutZeroTail {
	public void funtion()
	{
		Scanner input = new Scanner(System.in);
		int len = input.nextInt();
		int []array = new int[len];
		int tail = len-1;
		for(int i=0;i<=tail;)
		{
			int temp =input.nextInt(); 
			if(temp==0)
			{
				array[tail]=temp;
				tail--;
			}
			if(temp!=0)
			{
			array[i]=temp;
				i++;
			}
		}
		for(int i=0;i<len;i++)System.out.println(array[i]);
	}

}
