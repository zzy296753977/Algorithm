package String;

import java.util.Scanner;
/**
 * ��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ������ַ���ACSII�뷶Χ��(0~127)�����ڷ�Χ�ڵĲ���ͳ�ơ�
 * @author Administrator
 *
 */
public class CharNumCount {
	public void function()
	{
		//����
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
