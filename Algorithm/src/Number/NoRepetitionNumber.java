package Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ����һ��int�����������մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ�������
 * @author zzy
 *
 */
public class NoRepetitionNumber {
	public void function()
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		List<Integer> numList = new ArrayList<>();
		//����
		while(num!=0)
		{
			//ȥ��
			if(!numList.contains(num%10))
			{
			numList.add(num%10);
			System.out.print(num%10);
			}
			num/=10;
		}
		
		
	}
}
