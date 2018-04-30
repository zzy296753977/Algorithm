package Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * @author zzy
 *
 */
public class NoRepetitionNumber {
	public void function()
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		List<Integer> numList = new ArrayList<>();
		//逆序
		while(num!=0)
		{
			//去重
			if(!numList.contains(num%10))
			{
			numList.add(num%10);
			System.out.print(num%10);
			}
			num/=10;
		}
		
		
	}
}
