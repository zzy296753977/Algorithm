package String;

import java.util.Scanner;

public class LoingestSymmetricalSubString 
{
	public void function()
	{
		//����
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int len = str.length();
		int maxLen=0;
		//core�ǶԳ��Ӵ������ġ�left��������Ѱ����ʼ��right��������Ѱ����ʼ
		int core ;
		int left ,right;
		//����Ѱ������Ӵ�
		//�������
		//�������ĵ�ѭ��
		core=0;
		while(core!=len)
		{
			left=core-1;
			right=core+1;
			int currentLen=1;
			if(left>=0&&right<len&&str.charAt(left)!=str.charAt(right))
			{
				core++;
				continue;
			}
			while(left>=0&&right<len&&str.charAt(left)==str.charAt(right))
			{
				left--;
				right++;
				currentLen+=2;
			}
			core++;
			//��ʱ��Ҫô�����˵�ͷ�ˣ�Ҫô�ǳ��ֲ��ԳƵ�Ԫ����
			if(currentLen>maxLen)
			{
				maxLen=currentLen;
			}
		}
		
			//ż�����
			core=0;
			//�������ĵ�ѭ��
			while(core!=len)
			{
				left=core;
				right=core+1;
				int currentLen=0;
				if(left>=0&&right<len&&str.charAt(left)!=str.charAt(right))
				{
					core++;
					continue;
				}
				while(left>=0&&right<len&&str.charAt(left)==str.charAt(right))
				{
					left--;
					right++;
					currentLen+=2;
				}
				core++;
				//��ʱ��Ҫô�����˵�ͷ�ˣ�Ҫô�ǳ��ֲ��ԳƵ�Ԫ����
				if(currentLen>maxLen)
				{
					maxLen=currentLen;
				}
			}
		
		System.out.println(maxLen);
	}
}
