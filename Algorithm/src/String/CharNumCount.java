package String;

import java.util.Scanner;
/**
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
 * @author Administrator
 *
 */
public class CharNumCount {
	public void function()
	{
		//输入
				Scanner input = new Scanner(System.in);
				String str = new String();
				int [] count = new int[128];
				int sum=0;
				for(int i=0;i<128;i++)count[i]=0;
				str = input.nextLine();
				for(int i =0;i<str.length();i++)
				{
					if(str.charAt(i)>=0&&str.charAt(i)<=127)
					{
						if(count[str.charAt(i)]==0)
						count[str.charAt(i)]++;
					}
				}
				for(int i=0;i<128;i++)sum+=count[i];
				System.out.println(sum);
	}
}
